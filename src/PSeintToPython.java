import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PSeintToPython extends PseintGrammarBaseListener {
    //Strings de traduccion
    String[] tradPart = new String[3]; //(0 - imports, 1 - functions, 2 - main)
    //Hashmaps de variables
    LinkedList<String> functionsTable;
    HashMap<String, HashMap<String, String>> varsTableF;
    HashMap<String, Boolean> importTable = new HashMap<>();
    //Control de tabulaciones
    int tabs = 0;
    //Bloque de codigo actual (0 - imports, 1 - functions, 2 - main)
    int currentCode = 1;
    String currFunction = "";
    public PSeintToPython() {
        tradPart[0] = "";
        tradPart[1] = "";
        tradPart[2] = "";
        //Create hash and list
        functionsTable = new LinkedList<>();
        varsTableF = new HashMap<>();
        //Set imports
        importTable.put("numpy",false);
        importTable.put("time",false);
    }

    public String printTabs(){
        String retString = "";
        for(int i = 0; i < tabs; i++){
            retString += "\t";
        }
        return retString;
    }

    public String traducirExpr(String expr){
        //TODO arreglar las expresiones regulares para evitar doble cambio y algunos machetazos
        String rExpr = expr;
        //Encapsular las cadenas para evitar su modificación
        LinkedList<String> cadenas = new LinkedList<>();
        Pattern pattern = Pattern.compile("[\\'\"](.*?)[\\'\"]");
        Matcher matcher = pattern.matcher(rExpr);
        while( matcher.find() ) {
            cadenas.add(matcher.group(1));
        }
        for(int i = 0; i< cadenas.size(); i++){
            rExpr = rExpr.replaceAll("[\\'\"]"+cadenas.get(i)+"[\\'\"]","#_str"+i+"_#");
        }
        //Operadores Aritmeticos
        rExpr = rExpr.replaceAll("\\^", "**");
        rExpr = rExpr.replaceAll("\\s(mod)\\s", "%");
        //Operadores logicos
        rExpr = rExpr.replaceAll("(v|V)(e|E)(r|R)(d|D)(a|A)(d|D)(e|E)(r|R)(o|O)", "True");
        rExpr = rExpr.replaceAll("(f|F)(a|A)(l|L)(s|S)(o|O)", "False");
        rExpr = rExpr.replaceAll("\\s(y|Y)\\s", " and ");
        rExpr = rExpr.replaceAll("&", " and ");
        rExpr = rExpr.replaceAll("\\s(o|O)\\s", " or ");
        rExpr = rExpr.replaceAll("\\|", " or ");
        //Operadores relacionales
        rExpr = rExpr.replaceAll(">=", " _geq ");
        rExpr = rExpr.replaceAll("<=", " _leq ");
        rExpr = rExpr.replaceAll("<>", " _dif ");
        rExpr = rExpr.replaceAll("=", " == ");
        //Cambio segundo
        rExpr = rExpr.replaceAll(" _geq ", ">=");
        rExpr = rExpr.replaceAll(" _leq ", "<=");
        rExpr = rExpr.replaceAll(" _dif ", "!=");
        //Tercer cambio
        String[] nstr;
        rExpr = rExpr.replace("(", "#(#");
        rExpr = rExpr.replace("[", "#[#");
        rExpr = rExpr.replace(")", "#)#");
        rExpr = rExpr.replace("]", "#]#");
        rExpr = rExpr.replace("~", "#~#");
        rExpr = rExpr.replace(" and ", "# and #");
        rExpr = rExpr.replace(" or ", "# or #");
        nstr = rExpr.split("#");
        rExpr = "";
        for (String str:nstr) {
            if(str.equals("no") || str.equals("NO") || str.equals("No") || str.equals("nO"))str = "not";
            //System.out.println(str);
            rExpr += str;
        }
        rExpr = rExpr.replaceAll("~"," not ");
        //System.out.println("Expr: "+rExpr);
        rExpr = rExpr.replaceAll("\\s(n|N)(o|O)\\s", " not ");
        rExpr = rExpr.replaceAll("\\s(n|N)(o|O)\\s", " not ");
        //Desencapsular cadenas
        for(int i = 0; i< cadenas.size(); i++){
            rExpr = rExpr.replaceAll("_str"+i+"_","\""+cadenas.get(i)+"\"");
        }
        return rExpr;
    }

    public String getDType(String dType){
        if(dType.toLowerCase().matches("numero|numerico|entero|real"))dType = "numerico";
        else if (dType.toLowerCase().matches("logico"))dType = "logico";
        else if (dType.toLowerCase().matches("cadena|texto|caracter"))dType = "caracter";
        else dType = "parametro";
        return dType;
    }
    @Override public void enterCode(PseintGrammarParser.CodeContext ctx) { }

    @Override public void exitCode(PseintGrammarParser.CodeContext ctx) {
        if(importTable.get("numpy")) tradPart[0] +=     "import numpy as np                 \n";
        if(importTable.get("time")) tradPart[0] +=      "import time                        \n";

        System.out.println("-------------------------------");
        System.out.println(tradPart[0]);
        System.out.println(tradPart[1]);
        System.out.println(tradPart[2]);
    }

    @Override public void enterFun_salg_spro(PseintGrammarParser.Fun_salg_sproContext ctx) {
        currentCode = 1;
        if(functionsTable.contains(ctx.ID().toString().toLowerCase())){
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
            System.err.printf("<%d:%d> Error semantico, la función con nombre \"" + ctx.ID().getText() + "\" ya existe.\n",line,col);
            System.exit(-1);
        }
        tradPart[1] +=    printTabs() + "def "+ctx.ID()+"("+ctx.f_params().f_args().getText()+"):        \n";
        tabs += 1;
        currFunction = ctx.ID().toString();
        varsTableF.put(currFunction, new HashMap<>());
        functionsTable.add(currFunction);

    }

    @Override public void exitFun_salg_spro(PseintGrammarParser.Fun_salg_sproContext ctx) {
        if(ctx.return_funcion() != null){
            tradPart[1] +=   printTabs() + "return "+ctx.return_funcion().ID()+"         \n";
        }
        else if(ctx.commands().getText().length() == 0){
            tradPart[1] +=  printTabs()+"pass               \n";
        }
        tabs -= 1;

        System.out.println(varsTableF.get(currFunction).toString());
        System.out.println("**");
    }

    @Override public void enterReturn_funcion(PseintGrammarParser.Return_funcionContext ctx) { }
    @Override public void exitReturn_funcion(PseintGrammarParser.Return_funcionContext ctx) { }

    @Override public void enterF_params(PseintGrammarParser.F_paramsContext ctx) {
        for(int i=0; i<ctx.f_args().ID().size(); i++){
            varsTableF.get(currFunction).put(ctx.f_args().ID(i).toString(), getDType("parametro"));
        }

    }
    @Override public void exitF_params(PseintGrammarParser.F_paramsContext ctx) {

    }

    @Override public void enterCommands(PseintGrammarParser.CommandsContext ctx) {

    }

    @Override public void exitCommands(PseintGrammarParser.CommandsContext ctx) { }

    @Override public void enterDefinicion(PseintGrammarParser.DefinicionContext ctx) {
        for(int i = 0; i<ctx.def_vars().ID().size(); i++){
            if(varsTableF.get(currFunction).containsKey(ctx.def_vars().ID(i).toString().toLowerCase()) ){
                int line = ctx.def_vars().ID(i).getSymbol().getLine();;
                int col = ctx.def_vars().ID(i).getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, la variable \"" + ctx.def_vars().ID(i).getText() + "\" no se puede redefinir.\n",line,col);
                System.exit(-1);
            }
            else if(functionsTable.contains(ctx.def_vars().ID(i).toString().toLowerCase())){
                int line = ctx.def_vars().ID(i).getSymbol().getLine();;
                int col = ctx.def_vars().ID(i).getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, \"" + ctx.def_vars().ID(i).getText() + "\" es una función y no se puede redefinir.\n",line,col);
                System.exit(-1);
            }
            varsTableF.get(currFunction).put(ctx.def_vars().ID(i).toString(), getDType(ctx.T_DATO().toString()));
        }
    }

    @Override public void exitDefinicion(PseintGrammarParser.DefinicionContext ctx) {
        System.out.println(varsTableF.get(currFunction));
    }

    @Override public void enterDimension(PseintGrammarParser.DimensionContext ctx) {
        for(int i=0; i<ctx.dim_vars().ID().size(); i++){
            if(!varsTableF.get(currFunction).containsKey(ctx.dim_vars().ID(i).toString())){
                int line = ctx.dim_vars().ID(i).getSymbol().getLine();;
                int col = ctx.dim_vars().ID(i).getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, la variable \"" + ctx.dim_vars().ID(i).getText() + "\" no existe.\n",line,col);
                System.exit(-1);
            }
            else if(varsTableF.get(currFunction).get(ctx.dim_vars().ID(i).toString()).equals("parametro")){
                int line = ctx.dim_vars().ID(i).getSymbol().getLine();;
                int col = ctx.dim_vars().ID(i).getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, la variable \"" + ctx.dim_vars().ID(i).getText() + "\" es un parámetro y no se puede redimensionar.\n",line,col);
                System.exit(-1);
            }
            //tradPart[currentCode] +=    printTabs()+ctx.dim_vars().ID(i)+" = np.empty(["+ctx.dim_vars().dim_sizes(i).getText()+"]";
            //tradPart[currentCode] +=    printTabs()+ctx.dim_vars().ID(i)+" = np.empty(["+traducirExpr(ctx.dim_vars().dim_sizes(i).getText())+"]";
            int a = ctx.dim_vars().dim_sizes(i).start.getStartIndex();
            int b = ctx.dim_vars().dim_sizes(i).stop.getStopIndex();
            Interval interval = new Interval(a,b);

            tradPart[currentCode] +=    printTabs()+ctx.dim_vars().ID(i)+" = np.empty(["+traducirExpr(ctx.dim_vars().dim_sizes(i).start.getInputStream().getText(interval))+"]";

            if (varsTableF.get(currFunction).get(ctx.dim_vars().ID(i).toString()).equals("numerico")) tradPart[currentCode] +=    "";
            else if (varsTableF.get(currFunction).get(ctx.dim_vars().ID(i).toString()).equals("logico")) tradPart[currentCode] +=    ", dtype = bool";
            else tradPart[currentCode] +=    ", dtype = object";
            tradPart[currentCode] +=    ")          \n";
        }
    }

    @Override public void exitDimension(PseintGrammarParser.DimensionContext ctx) {
        importTable.put("numpy",true);
    }

    @Override public void enterDim_vars(PseintGrammarParser.Dim_varsContext ctx) {  }

    @Override public void enterDim_sizes(PseintGrammarParser.Dim_sizesContext ctx) {  }

    @Override public void enterExpr(PseintGrammarParser.ExprContext ctx) {
        if(ctx.ID() != null){
            if(!varsTableF.get(currFunction).containsKey(ctx.ID().getText()) && !functionsTable.contains(ctx.ID().getText())){
                int line = ctx.ID().getSymbol().getLine();;
                int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, la variable \"" + ctx.ID().getText() + "\" no existe.\n",line,col);
                System.exit(-1);
            }
        }
    }

    @Override public void exitExpr(PseintGrammarParser.ExprContext ctx) {  }

    @Override public void enterAsignacion(PseintGrammarParser.AsignacionContext ctx) {
        if(!varsTableF.get(currFunction).containsKey(ctx.ID().toString()) || functionsTable.contains(ctx.ID().toString())){
            int line = ctx.ID().getSymbol().getLine();;
            int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
            System.err.printf("<%d:%d> Error semantico, la variable \"" + ctx.ID().getText() + "\" no es válida.\n",line,col);
            System.exit(-1);
        }
        tradPart[currentCode] +=    printTabs() + ctx.ID();
        if(ctx.COR_IZQ() != null){
            int a = ctx.array_pos().start.getStartIndex();
            int b = ctx.array_pos().stop.getStopIndex();
            Interval interval = new Interval(a,b);
            tradPart[currentCode] += "["+traducirExpr(ctx.array_pos().start.getInputStream().getText(interval))+"]";
        }
    }

    @Override public void exitAsignacion(PseintGrammarParser.AsignacionContext ctx) {
        int a = ctx.expr().start.getStartIndex();
        int b = ctx.expr().stop.getStopIndex();
        Interval interval = new Interval(a,b);
        tradPart[currentCode] +=    " = "+traducirExpr(ctx.expr().start.getInputStream().getText(interval))+"       \n";
    }

    @Override public void enterLeer(PseintGrammarParser.LeerContext ctx) {
        for(int i=0 ; i<ctx.ID().size(); i++){
            if(!varsTableF.get(currFunction).containsKey(ctx.ID(i).toString()) || functionsTable.contains(ctx.ID(i).toString())){
                int line = ctx.ID(i).getSymbol().getLine();;
                int col = ctx.ID(i).getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, la variable \"" + ctx.ID(i).getText() + "\" no es válida.\n",line,col);
                System.exit(-1);
            }
            tradPart[currentCode] +=    printTabs()+ctx.ID(i).toString();
            if(ctx.array_pos(i) != null){
                int a = ctx.array_pos(i).start.getStartIndex();
                int b = ctx.array_pos(i).stop.getStopIndex();
                Interval interval = new Interval(a,b);
                tradPart[currentCode] += "["+traducirExpr(ctx.array_pos(i).start.getInputStream().getText(interval))+"]";
            }
            tradPart[currentCode] +=    " = eval(input())        \n";
        }
    }

    @Override public void exitLeer(PseintGrammarParser.LeerContext ctx) { }

    @Override public void enterEscribir(PseintGrammarParser.EscribirContext ctx) {
        tradPart[currentCode] +=    printTabs()+"print( ";
        for(int i = 0; i < ctx.expr().size(); i++){
            int a = ctx.expr(i).start.getStartIndex();
            int b = ctx.expr(i).stop.getStopIndex();
            Interval interval = new Interval(a,b);

            tradPart[currentCode] +=    traducirExpr(ctx.expr(i).start.getInputStream().getText(interval)) + " , ";
        }
    }

    @Override public void exitEscribir(PseintGrammarParser.EscribirContext ctx) {
        tradPart[currentCode] +=    "sep=\"\" )         \n";
    }

    @Override public void enterSi(PseintGrammarParser.SiContext ctx) {  }

    @Override public void exitSi(PseintGrammarParser.SiContext ctx) {  }

    @Override public void enterSiparte(PseintGrammarParser.SiparteContext ctx) {
        int a = ctx.expr().start.getStartIndex();
        int b = ctx.expr().stop.getStopIndex();
        Interval interval = new Interval(a,b);
        tradPart[currentCode] +=    printTabs()+"if( "+traducirExpr(ctx.expr().start.getInputStream().getText(interval))+" ):       \n";
        tabs += 1;
    }

    @Override public void exitSiparte(PseintGrammarParser.SiparteContext ctx) {
        tabs -= 1;
    }

    @Override public void enterSino(PseintGrammarParser.SinoContext ctx) {
        tradPart[currentCode] +=    printTabs()+"else:              \n";
        tabs += 1;
    }

    @Override public void exitSino(PseintGrammarParser.SinoContext ctx) {
        tabs -= 1;
    }

    @Override public void enterSegun(PseintGrammarParser.SegunContext ctx) {
        int a = ctx.expr().start.getStartIndex();
        int b = ctx.expr().stop.getStopIndex();
        Interval interval = new Interval(a,b);

        tradPart[currentCode] +=    printTabs()+"_expr = "+traducirExpr(ctx.expr().start.getInputStream().getText(interval))+"      \n";
        if(ctx.cases().size() == 0){
            tradPart[currentCode] +=    printTabs()+"if (False):\n";
            tradPart[currentCode] +=    printTabs()+"\tpass\n";
        }
    }

    @Override public void exitSegun(PseintGrammarParser.SegunContext ctx) {

    }

    @Override public void enterCases(PseintGrammarParser.CasesContext ctx) {
        System.out.println("if ( _expr == "+ctx.expr().getText()+" ):");
        System.out.println("Index: "+ctx.expr().getRuleIndex());
        
    }

    @Override public void exitCases(PseintGrammarParser.CasesContext ctx) { }

    @Override public void enterDefcase(PseintGrammarParser.DefcaseContext ctx) { }

    @Override public void exitDefcase(PseintGrammarParser.DefcaseContext ctx) { }

    @Override public void enterMain(PseintGrammarParser.MainContext ctx) {
        currentCode = 2;
        currFunction = "main";
        varsTableF.put(currFunction, new HashMap<>());
        functionsTable.add(currFunction);
        tradPart[currentCode] +=     "def main():                     \n";
        tabs += 1;
    }

    @Override public void exitMain(PseintGrammarParser.MainContext ctx) {
        tabs -= 1;
        tradPart[currentCode] +=        "\nif __name__==\"__main__\":     \n" +
                                        "\t     main()";
    }

    @Override public void enterNum_expr(PseintGrammarParser.Num_exprContext ctx) {
        if(ctx.ID() != null){
            if(!varsTableF.get(currFunction).containsKey(ctx.ID().toString())){
                int line = ctx.ID().getSymbol().getLine();;
                int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, la variable \"" + ctx.ID().getText() + "\" no existe.\n",line,col);
                System.exit(-1);
            }
        }
    }


}
