package com.antlr;// Generated from C:/Users/Arta/IdeaProjects/FirstHomework/src\FirstHomework.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FirstHomeworkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FirstHomeworkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FirstHomeworkParser#progr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgr(FirstHomeworkParser.ProgrContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirstHomeworkParser#series}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeries(FirstHomeworkParser.SeriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirstHomeworkParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(FirstHomeworkParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirstHomeworkParser#input_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_stmt(FirstHomeworkParser.Input_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirstHomeworkParser#output_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_stmt(FirstHomeworkParser.Output_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirstHomeworkParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(FirstHomeworkParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirstHomeworkParser#cond_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_stmt(FirstHomeworkParser.Cond_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirstHomeworkParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(FirstHomeworkParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirstHomeworkParser#compar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompar(FirstHomeworkParser.ComparContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirstHomeworkParser#compareor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareor(FirstHomeworkParser.CompareorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirstHomeworkParser#compareand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareand(FirstHomeworkParser.CompareandContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirstHomeworkParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(FirstHomeworkParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirstHomeworkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FirstHomeworkParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirstHomeworkParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(FirstHomeworkParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirstHomeworkParser#elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem(FirstHomeworkParser.ElemContext ctx);
}