// Generated from C:/Users/juans/Desktop/Lenguajes de programacion/InterTrad/grammar\PseintGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PseintGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PseintGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(PseintGrammarParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#fun_salg_spro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_salg_spro(PseintGrammarParser.Fun_salg_sproContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#return_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_funcion(PseintGrammarParser.Return_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#f_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_params(PseintGrammarParser.F_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#f_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_args(PseintGrammarParser.F_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(PseintGrammarParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(PseintGrammarParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(PseintGrammarParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#definicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion(PseintGrammarParser.DefinicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#def_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_vars(PseintGrammarParser.Def_varsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension(PseintGrammarParser.DimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#dim_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim_vars(PseintGrammarParser.Dim_varsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#dim_sizes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim_sizes(PseintGrammarParser.Dim_sizesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#num_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_expr(PseintGrammarParser.Num_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#oper_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper_num(PseintGrammarParser.Oper_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(PseintGrammarParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PseintGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#oper_dos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper_dos(PseintGrammarParser.Oper_dosContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#oper_uni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper_uni(PseintGrammarParser.Oper_uniContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#array_pos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_pos(PseintGrammarParser.Array_posContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#func_par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_par(PseintGrammarParser.Func_parContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(PseintGrammarParser.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#escribir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscribir(PseintGrammarParser.EscribirContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(PseintGrammarParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#segun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegun(PseintGrammarParser.SegunContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(PseintGrammarParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#repetir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetir(PseintGrammarParser.RepetirContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(PseintGrammarParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#borrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorrar(PseintGrammarParser.BorrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#esperar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsperar(PseintGrammarParser.EsperarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#tiempo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiempo(PseintGrammarParser.TiempoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#tecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTecla(PseintGrammarParser.TeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseintGrammarParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(PseintGrammarParser.CallContext ctx);
}