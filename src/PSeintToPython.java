import org.antlr.v4.runtime.RuleContext;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;

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
        String rExpr = expr;
        //Operadores Aritmeticos
        rExpr = rExpr.replaceAll("\\^", "**");
        rExpr = rExpr.replaceAll("mod", "%");
        //Operadores logicos
        rExpr = rExpr.replaceAll("(v|V)(e|E)(r|R)(d|D)(a|A)(d|D)(e|E)(r|R)(o|O)", "True");
        rExpr = rExpr.replaceAll("(f|F)(a|A)(l|L)(s|S)(o|O)", "False");
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
            tradPart[currentCode] +=    printTabs()+ctx.dim_vars().ID(i)+" = np.empty(["+traducirExpr(ctx.dim_vars().dim_sizes(i).getText())+"]";
            //Reemplazar simbolos
            String temp = ctx.dim_vars().dim_sizes(i).getText();





            System.out.println("Temp: "+temp);
            if (varsTableF.get(currFunction).get(ctx.dim_vars().ID(i).toString()).equals("numerico")) tradPart[currentCode] +=    "";
            else if (varsTableF.get(currFunction).get(ctx.dim_vars().ID(i).toString()).equals("logico")) tradPart[currentCode] +=    ", dtype = bool";
            else tradPart[currentCode] +=    ", dtype = object";
            tradPart[currentCode] +=    ")          \n";
        }
    }

    @Override public void exitDimension(PseintGrammarParser.DimensionContext ctx) {
        importTable.put("numpy",true);
    }

    @Override public void enterExpr(PseintGrammarParser.ExprContext ctx) {
    }

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
        tradPart[currentCode] +=     "\nif __name__==\"__main__\":     \n" +
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
            System.out.println(ctx.ID().toString());
        }

    }
}
