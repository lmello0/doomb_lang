// Generated from C:/Users/mello/IdeaProjects/Doomb/src/main/java/org/Grammar/Doomb.g4 by ANTLR 4.13.1
package org.AntlrAutoGen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DoombParser}.
 */
public interface DoombListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DoombParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DoombParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DoombParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#declare_block}.
	 *
	 * @param ctx the parse tree
	 * @return
	 */
	String enterDeclare_block(DoombParser.Declare_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block(DoombParser.Declare_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#main_block}.
	 *
	 * @param ctx the parse tree
	 * @return
	 */
	String enterMain_block(DoombParser.Main_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#main_block}.
	 * @param ctx the parse tree
	 */
	void exitMain_block(DoombParser.Main_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#exec_block}.
	 *
	 * @param ctx the parse tree
	 * @return
	 */
	String enterExec_block(DoombParser.Exec_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#exec_block}.
	 * @param ctx the parse tree
	 */
	void exitExec_block(DoombParser.Exec_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#string}.
	 *
	 * @param ctx the parse tree
	 * @return
	 */
	String enterString(DoombParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(DoombParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#variable}.
	 *
	 * @param ctx the parse tree
	 * @return
	 */
	String enterVariable(DoombParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(DoombParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#variable_declaration}.
	 *
	 * @param ctx the parse tree
	 * @return
	 */
	String enterVariable_declaration(DoombParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(DoombParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#function_declaration}.
	 *
	 * @param ctx the parse tree
	 * @return
	 */
	String enterFunction_declaration(DoombParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(DoombParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#function_call}.
	 *
	 * @param ctx the parse tree
	 * @return
	 */
	String enterFunction_call(DoombParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(DoombParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#parameter_list}.
	 *
	 * @param ctx the parse tree
	 * @return
	 */
	String enterParameter_list(DoombParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(DoombParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#function_params}.
	 *
	 * @param ctx the parse tree
	 * @return
	 */
	String enterFunction_params(DoombParser.Function_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#function_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_params(DoombParser.Function_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#statement}.
	 *
	 * @param ctx the parse tree
	 * @return
	 */
	String enterStatement(DoombParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DoombParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#jump_statement}.
	 *
	 * @param ctx the parse tree
	 * @return
	 */
	String enterJump_statement(DoombParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(DoombParser.Jump_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#expr}.
	 *
	 * @param ctx the parse tree
	 * @return
	 */
	String enterExpr(DoombParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DoombParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#math_expr}.
	 *
	 * @param ctx the parse tree
	 * @return
	 */
	String enterMath_expr(DoombParser.Math_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#math_expr}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr(DoombParser.Math_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#value}.
	 *
	 * @param ctx the parse tree
	 * @return
	 */
	String enterValue(DoombParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DoombParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#relational_op}.
	 * @param ctx the parse tree
	 */
	void enterRelational_op(DoombParser.Relational_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#relational_op}.
	 * @param ctx the parse tree
	 */
	void exitRelational_op(DoombParser.Relational_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#bool_op}.
	 * @param ctx the parse tree
	 */
	void enterBool_op(DoombParser.Bool_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#bool_op}.
	 * @param ctx the parse tree
	 */
	void exitBool_op(DoombParser.Bool_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#if_statement}.
	 *
	 * @param ctx the parse tree
	 * @return
	 */
	String enterIf_statement(DoombParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(DoombParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#comparation}.
	 *
	 * @param ctx the parse tree
	 * @return
	 */
	String enterComparation(DoombParser.ComparationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#comparation}.
	 * @param ctx the parse tree
	 */
	void exitComparation(DoombParser.ComparationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#for_statement}.
	 *
	 * @param ctx the parse tree
	 * @return
	 */
	String enterFor_statement(DoombParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(DoombParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#while_statement}.
	 *
	 * @param ctx the parse tree
	 * @return
	 */
	String enterWhile_statement(DoombParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(DoombParser.While_statementContext ctx);
}