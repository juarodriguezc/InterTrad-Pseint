import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileWriter;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors


public class PSeintToPython extends PseintGrammarBaseListener {
    //Control de salida traduccion
    boolean comments = true;
    boolean spaces = true;
    boolean pConsole = true;
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
        importTable.put("os",false);
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
        String rExpr = expr.replace("\'","\"");;
        //Encapsular las cadenas para evitar su modificación
        LinkedList<String> cadenas = new LinkedList<>();
        Pattern pattern = Pattern.compile("[\"](.*?)[\"]");
        Matcher matcher = pattern.matcher(rExpr);
        while( matcher.find() ) {
            cadenas.add(matcher.group(1));
        }
        for(int i = 0; i< cadenas.size(); i++){
            //System.out.println(cadenas.get(i));
            //rExpr = rExpr.replace("\\","\\\\");
            rExpr = rExpr.replace("\""+cadenas.get(i)+"\"","#_str"+i+"_#");
            //System.out.println(rExpr);
        }
        rExpr = rExpr.toLowerCase();
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
        rExpr = rExpr.replace("-", "#-#");
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
            //System.out.println("Save: "+cadenas.get(i));
            rExpr = rExpr.replace("_str"+i+"_","\""+cadenas.get(i)+"\"");
        }
        //System.out.println(rExpr);
        return rExpr;
    }

    public String getDType(String dType){
        if(dType.toLowerCase().matches("numero|numerico|entero|real|numeros|enteros|reales"))dType = "numerico";
        else if (dType.toLowerCase().matches("logico"))dType = "logico";
        else if (dType.toLowerCase().matches("cadena|texto|caracter|cadenas"))dType = "caracter";
        else dType = "parametro";
        return dType;
    }
    @Override public void enterCode(PseintGrammarParser.CodeContext ctx) { }

    @Override public void exitCode(PseintGrammarParser.CodeContext ctx) {
        if(importTable.get("numpy")) tradPart[0] +=     "import numpy as np                 \n";
        if(importTable.get("time")) tradPart[0] +=      "import time                        \n";
        if(importTable.get("os")){
            tradPart[0] +=        "import os            \n";
            tradPart[0] +=        "\ncls = lambda: os.system('cls' if os.name=='nt' else 'clear')  \n";
        }
        System.out.println("Traducción realizada correctamente, escribiendo archivo ...");

        if(pConsole){
            System.out.println("\n\n\n\n\n");
            System.out.println("#Mostrar traducción por consola: "+pConsole);
            System.out.println("#Agregar comentarios a la traducción: "+comments);
            System.out.println("#Agregar espaciado entre estructuras: "+spaces+"\n");
            System.out.println(tradPart[0]);
            System.out.println(tradPart[1]);
            System.out.println(tradPart[2]);
        }
        try {
            FileWriter myWriter = new FileWriter("output/output.py");
            myWriter.write(tradPart[0] + tradPart[1] + tradPart[2] );
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Error en la escritura del archivo.");
            e.printStackTrace();
        }
    }

    @Override public void enterFun_salg_spro(PseintGrammarParser.Fun_salg_sproContext ctx) {
        currentCode = 1;
        if(functionsTable.contains(ctx.ID().toString().toLowerCase())){
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
            System.err.printf("<%d:%d> Error semantico, la función con nombre \"" + ctx.ID().getText() + "\" ya existe.\n",line,col);
            System.exit(-1);
        }
        //System.out.println(ctx.ID());
        tradPart[currentCode] +=    printTabs() + "def "+ctx.ID().getText().toLowerCase()+"(";
        if(ctx.f_params() != null) tradPart[currentCode] +=    ctx.f_params().f_args().getText();
        tradPart[currentCode] +=    "):        \n";
        tabs += 1;
        currFunction = ctx.ID().toString().toLowerCase();
        varsTableF.put(currFunction, new HashMap<>());
        functionsTable.add(currFunction);

    }

    @Override public void exitFun_salg_spro(PseintGrammarParser.Fun_salg_sproContext ctx) {
        if(ctx.return_funcion() != null){
            if(!varsTableF.get(currFunction).containsKey(ctx.return_funcion().ID().getText().toLowerCase())){
                int line = ctx.return_funcion().ID().getSymbol().getLine();
                int col = ctx.return_funcion().ID().getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, la variable de retorno \"" + ctx.return_funcion().ID().getText().toLowerCase() + "\" de la función \""+ctx.ID().toString().toLowerCase()+"\" no ha sido inicializada.\n",line,col);
                System.exit(-1);
            }
            tradPart[1] +=   printTabs() + "return "+ctx.return_funcion().ID().getText().toLowerCase()+"         \n";
        }

        tabs -= 1;

        //System.out.println(varsTableF.get(currFunction).toString());
        //System.out.println("**");
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
        if(ctx.getText().length() == 0)tradPart[currentCode] +=    printTabs()+"pass \n";
    }

    @Override public void exitCommands(PseintGrammarParser.CommandsContext ctx) { }

    @Override public void enterDefinicion(PseintGrammarParser.DefinicionContext ctx) {
        //if(comments)tradPart[currentCode] +=    printTabs()+"#definicion de variables\n";
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
            varsTableF.get(currFunction).put(ctx.def_vars().ID(i).toString().toLowerCase(), getDType(ctx.T_DATO().toString()));
        }
    }

    @Override public void exitDefinicion(PseintGrammarParser.DefinicionContext ctx) {
        //System.out.println(varsTableF.get(currFunction));
    }

    @Override public void enterDimension(PseintGrammarParser.DimensionContext ctx) {
        if(comments)tradPart[currentCode] +=    printTabs()+"#dimensionamiento\n";
        for(int i=0; i<ctx.dim_vars().ID().size(); i++){
            if(!varsTableF.get(currFunction).containsKey(ctx.dim_vars().ID(i).toString().toLowerCase())){
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
            int a = ctx.dim_vars().dim_sizes(i).start.getStartIndex();
            int b = ctx.dim_vars().dim_sizes(i).stop.getStopIndex();
            Interval interval = new Interval(a,b);

            tradPart[currentCode] +=    printTabs()+ctx.dim_vars().ID(i).getText().toLowerCase()+" = np.empty([";

            //System.out.println(traducirExpr(ctx.dim_vars().dim_sizes(i).start.getInputStream().getText(interval)));

            String[] spltExpr = (traducirExpr(ctx.dim_vars().dim_sizes(i).start.getInputStream().getText(interval))).split(",");
            for (int j = 0; j<spltExpr.length; j++) {
                tradPart[currentCode] += "int("+spltExpr[j]+")";
                if(j != spltExpr.length-1)tradPart[currentCode] += ", ";
            }
            tradPart[currentCode] += "]";

            if (varsTableF.get(currFunction).get(ctx.dim_vars().ID(i).toString()).equals("numerico")) tradPart[currentCode] +=    ", dtype = object";
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
            if(!varsTableF.get(currFunction).containsKey(ctx.ID().getText().toLowerCase()) && !functionsTable.contains(ctx.ID().getText().toLowerCase())){
                int line = ctx.ID().getSymbol().getLine();;
                int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, la variable \"" + ctx.ID().getText().toLowerCase() + "\" no existe.\n",line,col);
                System.exit(-1);
            }

        }
    }

    @Override public void exitExpr(PseintGrammarParser.ExprContext ctx) {  }

    @Override public void enterAsignacion(PseintGrammarParser.AsignacionContext ctx) {
        if(!varsTableF.get(currFunction).containsKey(ctx.ID().toString().toLowerCase()) || functionsTable.contains(ctx.ID().toString().toLowerCase())){
            int line = ctx.ID().getSymbol().getLine();;
            int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
            System.err.printf("<%d:%d> Error semantico, la variable \"" + ctx.ID().getText().toLowerCase() + "\" no es válida.\n",line,col);
            System.exit(-1);
        }
        if(comments)tradPart[currentCode] +=    printTabs()+"#asignacion\n";
        tradPart[currentCode] +=    printTabs() + ctx.ID().getText().toLowerCase();
        if(ctx.COR_IZQ() != null){
            int a = ctx.array_pos().start.getStartIndex();
            int b = ctx.array_pos().stop.getStopIndex();
            Interval interval = new Interval(a,b);
            tradPart[currentCode] += "[";


            String[] spltExpr = (traducirExpr(ctx.array_pos().start.getInputStream().getText(interval))).split(",");
            for (int j = 0; j<spltExpr.length; j++) {
                tradPart[currentCode] += "int("+spltExpr[j]+")";
                if(j != spltExpr.length-1)tradPart[currentCode] += ", ";
            }
            tradPart[currentCode] += "]";

        }
    }

    @Override public void exitAsignacion(PseintGrammarParser.AsignacionContext ctx) {
        int a = ctx.expr().start.getStartIndex();
        int b = ctx.expr().stop.getStopIndex();
        Interval interval = new Interval(a,b);
        tradPart[currentCode] +=    " = "+traducirExpr(ctx.expr().start.getInputStream().getText(interval))+"       \n";
    }

    @Override public void enterLeer(PseintGrammarParser.LeerContext ctx) {
        if(comments)tradPart[currentCode] +=    printTabs()+"#leer\n";
        for(int i=0 ; i<ctx.ID().size(); i++){
            if(!varsTableF.get(currFunction).containsKey(ctx.ID(i).toString().toLowerCase()) || functionsTable.contains(ctx.ID(i).toString().toLowerCase())){
                int line = ctx.ID(i).getSymbol().getLine();;
                int col = ctx.ID(i).getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, la variable \"" + ctx.ID(i).getText().toLowerCase() + "\" no es válida.\n",line,col);
                System.exit(-1);
            }

            if(varsTableF.get(currFunction).get(ctx.ID(i).toString().toLowerCase()).equals("logico")){
                String tempId = ctx.ID(i).toString().toLowerCase();
                tradPart[currentCode] +=    printTabs()+"_temp_"+tabs+" = input() \n";
                //True case
                tradPart[currentCode] +=    printTabs()+"if ( _temp_"+tabs+" == \"True\" ): \n";
                tradPart[currentCode] +=    printTabs()+"\t"+tempId;
                if(ctx.array_pos(i) != null){
                    int a = ctx.array_pos(i).start.getStartIndex();
                    int b = ctx.array_pos(i).stop.getStopIndex();
                    Interval interval = new Interval(a,b);
                    tradPart[currentCode] += "["+traducirExpr(ctx.array_pos(i).start.getInputStream().getText(interval))+"]";
                }
                tradPart[currentCode] +=    " = True\n";
                //False case
                tradPart[currentCode] +=    printTabs()+"else: \n";
                tradPart[currentCode] +=    printTabs()+"\t"+tempId;
                if(ctx.array_pos(i) != null){
                    int a = ctx.array_pos(i).start.getStartIndex();
                    int b = ctx.array_pos(i).stop.getStopIndex();
                    Interval interval = new Interval(a,b);
                    tradPart[currentCode] += "["+traducirExpr(ctx.array_pos(i).start.getInputStream().getText(interval))+"]";
                }
                tradPart[currentCode] +=    " = False\n";
            }
            else{
                tradPart[currentCode] +=    printTabs()+ctx.ID(i).toString().toLowerCase();
                if(ctx.array_pos(i) != null){
                    int a = ctx.array_pos(i).start.getStartIndex();
                    int b = ctx.array_pos(i).stop.getStopIndex();
                    Interval interval = new Interval(a,b);
                    tradPart[currentCode] += "["+traducirExpr(ctx.array_pos(i).start.getInputStream().getText(interval))+"]";
                }
                //System.out.println("Type: "+varsTableF.get(currFunction).get(ctx.ID(i).toString().toLowerCase()));
                if(varsTableF.get(currFunction).get(ctx.ID(i).toString().toLowerCase()).equals("numerico")){
                    tradPart[currentCode] +=    " = eval(input())        \n";
                }
                else{
                    tradPart[currentCode] +=    " = input()        \n";
                }
            }
        }
    }

    @Override public void exitLeer(PseintGrammarParser.LeerContext ctx) { }

    @Override public void enterEscribir(PseintGrammarParser.EscribirContext ctx) {
        if(comments)tradPart[currentCode] +=    printTabs()+"#escribir\n";
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

    @Override public void enterSi(PseintGrammarParser.SiContext ctx) {
        if(spaces)tradPart[currentCode] +=    "\n";
        if(comments)tradPart[currentCode] +=    printTabs()+"#estructura de control si\n";
    }

    @Override public void exitSi(PseintGrammarParser.SiContext ctx) {
    }

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
        if(spaces)tradPart[currentCode] +=    "\n";
        if(comments)tradPart[currentCode] +=    printTabs()+"#estructura de control segun\n";
        int a = ctx.expr().start.getStartIndex();
        int b = ctx.expr().stop.getStopIndex();
        Interval interval = new Interval(a,b);

        tradPart[currentCode] +=    printTabs()+"_expr"+tabs+" = "+traducirExpr(ctx.expr().start.getInputStream().getText(interval))+"      \n";
        tradPart[currentCode] +=    printTabs()+"if (False):\n";
        tradPart[currentCode] +=    printTabs()+"\tpass\n";
    }

    @Override public void exitSegun(PseintGrammarParser.SegunContext ctx) {
    }

    @Override public void enterCases(PseintGrammarParser.CasesContext ctx) {
        tradPart[currentCode] +=    printTabs()+ "elif ( _expr"+tabs+" == "+ctx.expr().getText()+" ):   \n";
        tabs += 1;
    }

    @Override public void exitCases(PseintGrammarParser.CasesContext ctx) {
        tabs -= 1;
    }

    @Override public void enterDefcase(PseintGrammarParser.DefcaseContext ctx) {
        tradPart[currentCode] +=    printTabs()+ "else:   \n";
        tabs += 1;
    }

    @Override public void exitDefcase(PseintGrammarParser.DefcaseContext ctx) {
        tabs -= 1;
    }

    @Override public void enterMientras(PseintGrammarParser.MientrasContext ctx) {
        if(spaces)tradPart[currentCode] +=    "\n";
        if(comments)tradPart[currentCode] +=    printTabs()+"#estructura de control mientras\n";
        int a = ctx.expr().start.getStartIndex();
        int b = ctx.expr().stop.getStopIndex();
        Interval interval = new Interval(a,b);
        tradPart[currentCode] +=    printTabs()+ "while( "+traducirExpr(ctx.expr().start.getInputStream().getText(interval))+" ):       \n";
        tabs += 1;
    }

    @Override public void exitMientras(PseintGrammarParser.MientrasContext ctx) {
        tabs -= 1;
    }

    @Override public void enterRepetir(PseintGrammarParser.RepetirContext ctx) {
        if(spaces)tradPart[currentCode] +=    "\n";
        if(comments)tradPart[currentCode] +=    printTabs()+"#estructura de control repetir\n";
    }

    @Override public void exitRepetir(PseintGrammarParser.RepetirContext ctx) {
    }

    @Override public void enterRepcomm(PseintGrammarParser.RepcommContext ctx) {
        tradPart[currentCode] +=    printTabs()+ "while( True ):\n";
        tabs += 1;
    }

    @Override public void exitRepcomm(PseintGrammarParser.RepcommContext ctx) { }

    @Override public void enterRepcond(PseintGrammarParser.RepcondContext ctx) {
        int a = ctx.expr().start.getStartIndex();
        int b = ctx.expr().stop.getStopIndex();
        Interval interval = new Interval(a,b);
        tradPart[currentCode] +=    printTabs()+ "if( "+ traducirExpr(ctx.expr().start.getInputStream().getText(interval)) +" ):\n";
        tradPart[currentCode] +=    printTabs()+ "\t break\n";
        tabs -= 1;
    }

    @Override public void exitRepcond(PseintGrammarParser.RepcondContext ctx) { }

    @Override public void enterPara(PseintGrammarParser.ParaContext ctx) {
        if(spaces)tradPart[currentCode] +=    "\n";
        if(comments)tradPart[currentCode] +=    printTabs()+"#estructura de control para\n";
        //Expr1
        int a0 = ctx.expr(0).start.getStartIndex();
        int b0 = ctx.expr(0).stop.getStopIndex();
        Interval interval0 = new Interval(a0,b0);
        tradPart[currentCode] +=    printTabs()+ctx.ID()+" = 0 \n";
        tradPart[currentCode] +=    printTabs()+ "for "+ctx.ID().getText().toLowerCase()+" in range (";
        tradPart[currentCode] += "int("+traducirExpr(ctx.expr(0).start.getInputStream().getText(interval0))+"), ";
        //Expr2
        int a1 = ctx.expr(1).start.getStartIndex();
        int b1 = ctx.expr(1).stop.getStopIndex();
        Interval interval1 = new Interval(a1,b1);
        tradPart[currentCode] += "int("+ traducirExpr(ctx.expr(1).start.getInputStream().getText(interval1))+") + 1";
        if(ctx.parapaso() != null){
            tradPart[currentCode] += ", int("+traducirExpr(ctx.parapaso().expr().getText())+")";
        }
        tradPart[currentCode] += "):       \n";
        tabs += 1;
    }

    @Override public void exitPara(PseintGrammarParser.ParaContext ctx) {
        tabs -= 1;
        tradPart[currentCode] +=    printTabs()+ctx.ID()+" += ";
        if(ctx.parapaso() != null)tradPart[currentCode] += ctx.parapaso().expr().getText();
        else tradPart[currentCode] += 1;
        tradPart[currentCode] +=    "\n";
    }

    @Override public void enterParapaso(PseintGrammarParser.ParapasoContext ctx) { }

    @Override public void exitParapaso(PseintGrammarParser.ParapasoContext ctx) { }

    @Override public void enterBorrar(PseintGrammarParser.BorrarContext ctx) {
        importTable.put("os",true);
        tradPart[currentCode] +=    printTabs()+"cls() \n";
    }

    @Override public void exitBorrar(PseintGrammarParser.BorrarContext ctx) { }

    @Override public void enterEsperar(PseintGrammarParser.EsperarContext ctx) {
        if(ctx.tiempo() != null){
            importTable.put("time",true);
            tradPart[currentCode] +=    printTabs()+"time.sleep( "+traducirExpr(ctx.tiempo().expr().getText());
            if(ctx.tiempo().MILISEGUNDOS() != null ){
                tradPart[currentCode] += " / 1000";
            }
            tradPart[currentCode] += " )\n";
        }else{
            tradPart[currentCode] +=    printTabs()+"input()\n";
        }
    }

    @Override public void exitEsperar(PseintGrammarParser.EsperarContext ctx) { }

    @Override public void enterCall(PseintGrammarParser.CallContext ctx) {
        if(!functionsTable.contains(ctx.ID().getText().toLowerCase())){
            int line = ctx.ID().getSymbol().getLine();;
            int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
            System.err.printf("<%d:%d> Error semantico, la variable \"" + ctx.ID().getText().toLowerCase() + "\" no es una función.\n",line,col);
            System.exit(-1);
        }
        tradPart[currentCode] +=    printTabs()+ctx.ID()+"(";
        if(ctx.func_par() != null){
            if(ctx.func_par().expr().size() > 0){
                for (int i=0; i<ctx.func_par().expr().size()-1; i++){
                    int a = ctx.func_par().expr(i).start.getStartIndex();
                    int b = ctx.func_par().expr(i).stop.getStopIndex();
                    Interval interval = new Interval(a,b);
                    tradPart[currentCode] += traducirExpr(ctx.func_par().expr(i).start.getInputStream().getText(interval))+", ";
                }
                int a = ctx.func_par().expr(ctx.func_par().expr().size()-1).start.getStartIndex();
                int b = ctx.func_par().expr(ctx.func_par().expr().size()-1).stop.getStopIndex();
                Interval interval = new Interval(a,b);
                tradPart[currentCode] += traducirExpr(ctx.func_par().expr(ctx.func_par().expr().size()-1).start.getInputStream().getText(interval));
            }
        }
        tradPart[currentCode] +=    ")\n";

    }

    @Override public void exitCall(PseintGrammarParser.CallContext ctx) { }

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




}
