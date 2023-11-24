// Generated from C:/Users/mello/IdeaProjects/Doomb/src/main/java/org/Grammar/Doomb.g4 by ANTLR 4.13.1
package org.AntlrAutoGen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DoombParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DoombVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DoombParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DoombParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#declare_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block(DoombParser.Declare_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#main_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_block(DoombParser.Main_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#exec_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_block(DoombParser.Exec_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(DoombParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(DoombParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(DoombParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(DoombParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(DoombParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(DoombParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#function_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_params(DoombParser.Function_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DoombParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_statement(DoombParser.Jump_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(DoombParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#math_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr(DoombParser.Math_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(DoombParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#relational_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_op(DoombParser.Relational_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#bool_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_op(DoombParser.Bool_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(DoombParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#comparation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparation(DoombParser.ComparationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(DoombParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DoombParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(DoombParser.While_statementContext ctx);
}