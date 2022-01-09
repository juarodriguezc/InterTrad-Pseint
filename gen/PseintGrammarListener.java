// Generated from C:/Users/juans/Desktop/Lenguajes de programacion/InterTrad/grammar\PseintGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PseintGrammarParser}.
 */
public interface PseintGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(PseintGrammarParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(PseintGrammarParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#fun_salg_spro}.
	 * @param ctx the parse tree
	 */
	void enterFun_salg_spro(PseintGrammarParser.Fun_salg_sproContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#fun_salg_spro}.
	 * @param ctx the parse tree
	 */
	void exitFun_salg_spro(PseintGrammarParser.Fun_salg_sproContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#return_funcion}.
	 * @param ctx the parse tree
	 */
	void enterReturn_funcion(PseintGrammarParser.Return_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#return_funcion}.
	 * @param ctx the parse tree
	 */
	void exitReturn_funcion(PseintGrammarParser.Return_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#f_params}.
	 * @param ctx the parse tree
	 */
	void enterF_params(PseintGrammarParser.F_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#f_params}.
	 * @param ctx the parse tree
	 */
	void exitF_params(PseintGrammarParser.F_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#f_args}.
	 * @param ctx the parse tree
	 */
	void enterF_args(PseintGrammarParser.F_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#f_args}.
	 * @param ctx the parse tree
	 */
	void exitF_args(PseintGrammarParser.F_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(PseintGrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(PseintGrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(PseintGrammarParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(PseintGrammarParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(PseintGrammarParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(PseintGrammarParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#definicion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion(PseintGrammarParser.DefinicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#definicion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion(PseintGrammarParser.DefinicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#def_vars}.
	 * @param ctx the parse tree
	 */
	void enterDef_vars(PseintGrammarParser.Def_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#def_vars}.
	 * @param ctx the parse tree
	 */
	void exitDef_vars(PseintGrammarParser.Def_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(PseintGrammarParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(PseintGrammarParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#dim_vars}.
	 * @param ctx the parse tree
	 */
	void enterDim_vars(PseintGrammarParser.Dim_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#dim_vars}.
	 * @param ctx the parse tree
	 */
	void exitDim_vars(PseintGrammarParser.Dim_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#dim_sizes}.
	 * @param ctx the parse tree
	 */
	void enterDim_sizes(PseintGrammarParser.Dim_sizesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#dim_sizes}.
	 * @param ctx the parse tree
	 */
	void exitDim_sizes(PseintGrammarParser.Dim_sizesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#num_expr}.
	 * @param ctx the parse tree
	 */
	void enterNum_expr(PseintGrammarParser.Num_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#num_expr}.
	 * @param ctx the parse tree
	 */
	void exitNum_expr(PseintGrammarParser.Num_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#oper_num}.
	 * @param ctx the parse tree
	 */
	void enterOper_num(PseintGrammarParser.Oper_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#oper_num}.
	 * @param ctx the parse tree
	 */
	void exitOper_num(PseintGrammarParser.Oper_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(PseintGrammarParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(PseintGrammarParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PseintGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PseintGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#oper_dos}.
	 * @param ctx the parse tree
	 */
	void enterOper_dos(PseintGrammarParser.Oper_dosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#oper_dos}.
	 * @param ctx the parse tree
	 */
	void exitOper_dos(PseintGrammarParser.Oper_dosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#oper_uni}.
	 * @param ctx the parse tree
	 */
	void enterOper_uni(PseintGrammarParser.Oper_uniContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#oper_uni}.
	 * @param ctx the parse tree
	 */
	void exitOper_uni(PseintGrammarParser.Oper_uniContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#array_pos}.
	 * @param ctx the parse tree
	 */
	void enterArray_pos(PseintGrammarParser.Array_posContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#array_pos}.
	 * @param ctx the parse tree
	 */
	void exitArray_pos(PseintGrammarParser.Array_posContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#func_par}.
	 * @param ctx the parse tree
	 */
	void enterFunc_par(PseintGrammarParser.Func_parContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#func_par}.
	 * @param ctx the parse tree
	 */
	void exitFunc_par(PseintGrammarParser.Func_parContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#leer}.
	 * @param ctx the parse tree
	 */
	void enterLeer(PseintGrammarParser.LeerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#leer}.
	 * @param ctx the parse tree
	 */
	void exitLeer(PseintGrammarParser.LeerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#escribir}.
	 * @param ctx the parse tree
	 */
	void enterEscribir(PseintGrammarParser.EscribirContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#escribir}.
	 * @param ctx the parse tree
	 */
	void exitEscribir(PseintGrammarParser.EscribirContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(PseintGrammarParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(PseintGrammarParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#segun}.
	 * @param ctx the parse tree
	 */
	void enterSegun(PseintGrammarParser.SegunContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#segun}.
	 * @param ctx the parse tree
	 */
	void exitSegun(PseintGrammarParser.SegunContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(PseintGrammarParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(PseintGrammarParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#repetir}.
	 * @param ctx the parse tree
	 */
	void enterRepetir(PseintGrammarParser.RepetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#repetir}.
	 * @param ctx the parse tree
	 */
	void exitRepetir(PseintGrammarParser.RepetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(PseintGrammarParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(PseintGrammarParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#borrar}.
	 * @param ctx the parse tree
	 */
	void enterBorrar(PseintGrammarParser.BorrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#borrar}.
	 * @param ctx the parse tree
	 */
	void exitBorrar(PseintGrammarParser.BorrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#esperar}.
	 * @param ctx the parse tree
	 */
	void enterEsperar(PseintGrammarParser.EsperarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#esperar}.
	 * @param ctx the parse tree
	 */
	void exitEsperar(PseintGrammarParser.EsperarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#tiempo}.
	 * @param ctx the parse tree
	 */
	void enterTiempo(PseintGrammarParser.TiempoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#tiempo}.
	 * @param ctx the parse tree
	 */
	void exitTiempo(PseintGrammarParser.TiempoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#tecla}.
	 * @param ctx the parse tree
	 */
	void enterTecla(PseintGrammarParser.TeclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#tecla}.
	 * @param ctx the parse tree
	 */
	void exitTecla(PseintGrammarParser.TeclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseintGrammarParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(PseintGrammarParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseintGrammarParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(PseintGrammarParser.CallContext ctx);
}