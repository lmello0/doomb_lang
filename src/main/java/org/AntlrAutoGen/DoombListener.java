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
	 * @param ctx the parse tree
	 */
	void enterDeclare_block(DoombParser.Declare_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block(DoombParser.Declare_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#main_block}.
	 * @param ctx the parse tree
	 */
	void enterMain_block(DoombParser.Main_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#main_block}.
	 * @param ctx the parse tree
	 */
	void exitMain_block(DoombParser.Main_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#exec_block}.
	 * @param ctx the parse tree
	 */
	void enterExec_block(DoombParser.Exec_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#exec_block}.
	 * @param ctx the parse tree
	 */
	void exitExec_block(DoombParser.Exec_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DoombParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DoombParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(DoombParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(DoombParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(DoombParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(DoombParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(DoombParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(DoombParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(DoombParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(DoombParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(DoombParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(DoombParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(DoombParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(DoombParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(DoombParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(DoombParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#function_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_params(DoombParser.Function_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#function_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_params(DoombParser.Function_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DoombParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DoombParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(DoombParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(DoombParser.Jump_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DoombParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DoombParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#math_expr}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr(DoombParser.Math_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#math_expr}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr(DoombParser.Math_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DoombParser.ValueContext ctx);
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
	 * @param ctx the parse tree
	 */
	void enterIf_statement(DoombParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(DoombParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#comparation}.
	 * @param ctx the parse tree
	 */
	void enterComparation(DoombParser.ComparationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#comparation}.
	 * @param ctx the parse tree
	 */
	void exitComparation(DoombParser.ComparationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(DoombParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(DoombParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoombParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(DoombParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoombParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(DoombParser.While_statementContext ctx);
}