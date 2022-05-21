package com.antlr;// Generated from C:/Users/Arta/IdeaProjects/FirstHomework/src\FirstHomework.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FirstHomeworkParser}.
 */
public interface FirstHomeworkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FirstHomeworkParser#progr}.
	 * @param ctx the parse tree
	 */
	void enterProgr(FirstHomeworkParser.ProgrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstHomeworkParser#progr}.
	 * @param ctx the parse tree
	 */
	void exitProgr(FirstHomeworkParser.ProgrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirstHomeworkParser#series}.
	 * @param ctx the parse tree
	 */
	void enterSeries(FirstHomeworkParser.SeriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstHomeworkParser#series}.
	 * @param ctx the parse tree
	 */
	void exitSeries(FirstHomeworkParser.SeriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirstHomeworkParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(FirstHomeworkParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstHomeworkParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(FirstHomeworkParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirstHomeworkParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInput_stmt(FirstHomeworkParser.Input_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstHomeworkParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInput_stmt(FirstHomeworkParser.Input_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirstHomeworkParser#output_stmt}.
	 * @param ctx the parse tree
	 */
	void enterOutput_stmt(FirstHomeworkParser.Output_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstHomeworkParser#output_stmt}.
	 * @param ctx the parse tree
	 */
	void exitOutput_stmt(FirstHomeworkParser.Output_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirstHomeworkParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(FirstHomeworkParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstHomeworkParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(FirstHomeworkParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirstHomeworkParser#cond_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCond_stmt(FirstHomeworkParser.Cond_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstHomeworkParser#cond_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCond_stmt(FirstHomeworkParser.Cond_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirstHomeworkParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(FirstHomeworkParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstHomeworkParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(FirstHomeworkParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirstHomeworkParser#compar}.
	 * @param ctx the parse tree
	 */
	void enterCompar(FirstHomeworkParser.ComparContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstHomeworkParser#compar}.
	 * @param ctx the parse tree
	 */
	void exitCompar(FirstHomeworkParser.ComparContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirstHomeworkParser#compareor}.
	 * @param ctx the parse tree
	 */
	void enterCompareor(FirstHomeworkParser.CompareorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstHomeworkParser#compareor}.
	 * @param ctx the parse tree
	 */
	void exitCompareor(FirstHomeworkParser.CompareorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirstHomeworkParser#compareand}.
	 * @param ctx the parse tree
	 */
	void enterCompareand(FirstHomeworkParser.CompareandContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstHomeworkParser#compareand}.
	 * @param ctx the parse tree
	 */
	void exitCompareand(FirstHomeworkParser.CompareandContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirstHomeworkParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(FirstHomeworkParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstHomeworkParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(FirstHomeworkParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirstHomeworkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FirstHomeworkParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstHomeworkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FirstHomeworkParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirstHomeworkParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(FirstHomeworkParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstHomeworkParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(FirstHomeworkParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirstHomeworkParser#elem}.
	 * @param ctx the parse tree
	 */
	void enterElem(FirstHomeworkParser.ElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstHomeworkParser#elem}.
	 * @param ctx the parse tree
	 */
	void exitElem(FirstHomeworkParser.ElemContext ctx);
}