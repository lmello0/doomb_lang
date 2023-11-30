// Generated from C:/Users/mello/IdeaProjects/Doomb/src/main/java/org/Grammar/Doomb.g4 by ANTLR 4.13.1
package org.AntlrAutoGen;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

/**
 * This class provides an empty implementation of {@link DoombListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
@SuppressWarnings("CheckReturnValue")
public class DoombBaseListener implements DoombListener {

	private final List<Map<String, String>> functionList = new ArrayList<>();

	private boolean isKeyboardCalled = false;

	private boolean inForStatement = false;

	private final List<String> javaCode = new ArrayList<>();

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProgram(DoombParser.ProgramContext ctx) {
		javaCode.add("import java.util.*;");

		javaCode.add("public class Out {");

		if (ctx.declare_block() != null) {
			javaCode.add(enterDeclare_block(ctx.declare_block()));
		}

		javaCode.add(enterMain_block(ctx.main_block()));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(DoombParser.ProgramContext ctx) {
		javaCode.add("}");

        javaCode.replaceAll(s -> s.replace("'", "\""));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterDeclare_block(DoombParser.Declare_blockContext ctx) {
		StringBuilder builder = new StringBuilder();

		for(DoombParser.Function_declarationContext function : ctx.function_declaration()) {
			builder.append(enterFunction_declaration(function));
		}

		for(DoombParser.Variable_declarationContext variable : ctx.variable_declaration()) {
			builder.append(enterVariable_declaration(variable)).append(ctx.DEL().get(0));
		}

		return builder.toString();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclare_block(DoombParser.Declare_blockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterMain_block(DoombParser.Main_blockContext ctx) {
		return "public static void main(String[] args)" + enterExec_block(ctx.exec_block());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMain_block(DoombParser.Main_blockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterExec_block(DoombParser.Exec_blockContext ctx) {
		StringBuilder builder = new StringBuilder(ctx.OPEN_CBRACKET() + "");

		for (DoombParser.StatementContext statement : ctx.statement()) {
			builder.append(enterStatement(statement));
		}

		builder.append(ctx.CLOSE_CBRACKET());

		return builder.toString();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExec_block(DoombParser.Exec_blockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterString(DoombParser.StringContext ctx) {
        return ctx.getText().replace("||", "+");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitString(DoombParser.StringContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterVariable(DoombParser.VariableContext ctx) {
		if (ctx.ID() != null) {
			return ctx.ID().toString();
		}

		if (ctx.NUMBER_DEF() != null) {
			return ctx.NUMBER_DEF().toString();
		}

		if (ctx.INT_DEF() != null) {
			return ctx.INT_DEF().toString();
		}

		if (ctx.DOUBLE_DEF() != null) {
			return ctx.DOUBLE_DEF().toString();
		}

		if (ctx.BOOLEAN_DEF() != null) {
			return ctx.BOOLEAN_DEF().toString();
		}

		return enterString(ctx.string());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariable(DoombParser.VariableContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterVariable_declaration(DoombParser.Variable_declarationContext ctx) {
		StringBuilder builder;
		if (inForStatement) {
			builder = new StringBuilder();
		} else {
			builder = new StringBuilder("public static ");
		}

		String type = parseType(ctx.TYPE().toString());

		for (TerminalNode id : ctx.ID()) {
			switch (type) {
				case "int":
					builder.append(type).append(" ").append(id.getText()).append(ctx.ASSIGN_OP()).append(ctx.INT_DEF());
					break;
				case "double":
				case "number":
					builder.append(type).append(" ").append(id.getText()).append(ctx.ASSIGN_OP()).append(ctx.DOUBLE_DEF());
					break;
				case "String":
					builder.append(type).append(" ").append(id.getText()).append(ctx.ASSIGN_OP()).append(enterString(ctx.string()));
					break;
				case "boolean":
					builder.append(type).append(" ").append(id.getText()).append(ctx.ASSIGN_OP()).append(ctx.BOOLEAN_DEF());
					break;
			}
		}

		return builder.toString();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariable_declaration(DoombParser.Variable_declarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterFunction_declaration(DoombParser.Function_declarationContext ctx) {
		String type = parseType(ctx.TYPE().toString());
		StringBuilder function = new StringBuilder("public static " + type + " " + ctx.ID() + "(");

		HashMap<String, String> functionData = new HashMap<>();
		functionData.put(ctx.ID().toString(), type);

		functionList.add(functionData);

		function.append(enterParameter_list(ctx.parameter_list()));

		function.append(") ").append(ctx.OPEN_CBRACKET());

		for (DoombParser.StatementContext statement : ctx.statement()) {
			function.append(enterStatement(statement));
		}

		function.append(ctx.CLOSE_CBRACKET());

		return function.toString();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunction_declaration(DoombParser.Function_declarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterFunction_call(DoombParser.Function_callContext ctx) {
		String funcAssign = "{{variable}}=";

        for (Map<String, String> function : functionList) {
            if (function.get(ctx.ID().toString()) != null) {
                return funcAssign + ctx.ID().toString() + "(" + enterFunction_params(ctx.function_params()) + ");";
            }
        }

		if (ctx.ID().toString().equals("putStr")) {
			return "System.out.println(" + enterFunction_params(ctx.function_params()) + ");";
		}

		if (ctx.ID().toString().equals("readKeyboard")) {
			if (!isKeyboardCalled) {
				isKeyboardCalled = true;

				return
						"Scanner keyboard = new Scanner(System.in);"
						+ funcAssign
						+ parseReadKeyboard(enterFunction_params(ctx.function_params()));
			}

			return funcAssign + parseReadKeyboard(enterFunction_params(ctx.function_params()));
		}

		return ctx.ID().toString() + "(" + enterFunction_params(ctx.function_params()) + ");";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunction_call(DoombParser.Function_callContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterParameter_list(DoombParser.Parameter_listContext ctx) {
		StringBuilder builder = new StringBuilder();

		int paramLength = ctx.ID().size();
		for (int i = 0; i < paramLength; i++) {
			if (i != paramLength-1) {
				builder.append(ctx.TYPE().get(i))
					.append(" ")
					.append(ctx.ID().get(i))
					.append(", ");

				continue;
			}

			builder
					.append(ctx.TYPE().get(i))
					.append(" ")
					.append(ctx.ID().get(i));
		}

		return builder.toString();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParameter_list(DoombParser.Parameter_listContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterFunction_params(DoombParser.Function_paramsContext ctx) {
		StringBuilder builder = new StringBuilder();

		if (!ctx.variable().isEmpty()) {
			int count = ctx.variable().size();
			for (int i = 0; i < count; i++) {
				builder.append(enterVariable(ctx.variable().get(i)));

				if (i != count-1) {
					builder.append(", ");
				}
			}

			return builder.toString();
		}

		int count = ctx.TYPE().size();
		for(int i = 0; i < count; i++) {
			builder.append(parseType(ctx.TYPE().get(i).toString()));

			if (i != count-1) {
				builder.append(", ");
			}
		}

		return builder.toString();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunction_params(DoombParser.Function_paramsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterStatement(DoombParser.StatementContext ctx) {
		if (ctx.jump_statement() != null) {
			return enterJump_statement(ctx.jump_statement());
		}

		if (ctx.if_statement() != null) {
			return enterIf_statement(ctx.if_statement());
		}

		if (ctx.while_statement() != null) {
			return enterWhile_statement(ctx.while_statement());
		}

		if (ctx.for_statement() != null) {
			return enterFor_statement(ctx.for_statement());
		}

		return enterExpr(ctx.expr());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement(DoombParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterJump_statement(DoombParser.Jump_statementContext ctx) {
		if (ctx.RETURN() != null) {
			boolean isExpr = ctx.expr() != null;

			if (isExpr) {
				return "return " + ctx.expr().getText() + ";";
			}

			return "return " + ctx.string().getText() + ";";
		}

		if (ctx.BREAK() != null) {
			return "break;";
		}

		return "continue;";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitJump_statement(DoombParser.Jump_statementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterExpr(DoombParser.ExprContext ctx) {
		if (ctx.ASSIGN_OP() != null) {
			StringBuilder builder = new StringBuilder();

			String assignOp = ctx.ID() + "" + ctx.ASSIGN_OP();

			if (ctx.function_call() != null) {
				builder.append(enterFunction_call(ctx.function_call()));
			}

			if (ctx.variable() != null) {
				builder.append(enterVariable(ctx.variable()));
			}

			if (ctx.math_expr() != null) {
				builder.append(enterMath_expr(ctx.math_expr()));
			}

			if (ctx.expr() != null) {
				builder.append(enterExpr(ctx.expr()));
			}

			if (builder.toString().contains("{{variable}}=")) {
				return builder.toString().replace("{{variable}}=", assignOp);
			}

			return assignOp + builder + ctx.DEL();
		}

		if (ctx.getText().startsWith("(")) {
			return "(" + enterExpr(ctx.expr()) + ")";
		}

		if (ctx.getText().startsWith("!")) {
			return "!" + enterExpr(ctx.expr());
		}

		if (ctx.math_expr() != null) {
			return enterMath_expr(ctx.math_expr());
		}

		return enterFunction_call(ctx.function_call());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpr(DoombParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterMath_expr(DoombParser.Math_exprContext ctx) {
		StringBuilder builder = new StringBuilder();

		if (ctx.getText().startsWith("+") || ctx.getText().startsWith("-")) {
			return enterValue(ctx.value());
		}

		if (ctx.getText().endsWith("--") || ctx.getText().endsWith("++")) {
			return enterValue(ctx.value()) + ctx.ADD_OP().get(0) + ctx.ADD_OP().get(1);
		}

		if (ctx.MULT_OP() != null) {
			builder
					.append(enterMath_expr(ctx.math_expr(0)))
					.append(ctx.MULT_OP())
					.append(enterMath_expr(ctx.math_expr(1)));

			return builder.toString();
		}

		if (!ctx.ADD_OP().isEmpty()) {
			builder
					.append(enterMath_expr(ctx.math_expr(0)))
					.append(ctx.ADD_OP().get(0))
					.append(enterMath_expr(ctx.math_expr(1)));

			return builder.toString();
		}

		if (ctx.value() != null) {
			return enterValue(ctx.value());
		}

		return builder.toString();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMath_expr(DoombParser.Math_exprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterValue(DoombParser.ValueContext ctx) {
		if (ctx.ID() != null) return ctx.ID().toString();

		if (ctx.INT_DEF() != null) return ctx.INT_DEF().toString();

		if (ctx.DOUBLE_DEF() != null) return ctx.DOUBLE_DEF().toString();

		if (ctx.NUMBER_DEF() != null) return ctx.NUMBER_DEF().toString();

		return "(" + enterMath_expr(ctx.math_expr()) + ")";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitValue(DoombParser.ValueContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterRelational_op(DoombParser.Relational_opContext ctx) {
		if (ctx.NOT_EQUAL_OP() != null) {
			return ctx.NOT_EQUAL_OP().toString();
		}

		if (ctx.EQUAL() != null) {
			return ctx.EQUAL().toString();
		}

		if (ctx.GT_OP() != null) {
			return ctx.GT_OP().toString();
		}

		if (ctx.GT_EQUAL_OP() != null) {
			return ctx.GT_EQUAL_OP().toString();
		}

		if (ctx.LT_OP() != null) {
			return ctx.LT_OP().toString();
		}

		return ctx.LT_EQUAL_OP().toString();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRelational_op(DoombParser.Relational_opContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterBool_op(DoombParser.Bool_opContext ctx) {
        if (ctx.BOOL_OPERATOR().toString().equals("and")) {
            return "&&";
        }

        return "||";
    }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBool_op(DoombParser.Bool_opContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterIf_statement(DoombParser.If_statementContext ctx) {
		StringBuilder builder = new StringBuilder(ctx.IF() + "" + ctx.OPEN_PAREN());

		builder
				.append(enterComparation(ctx.comparation()))
				.append(ctx.CLOSE_PAREN());

		for (int i = 0; i < ctx.exec_block().size(); i++) {
			builder.append(enterExec_block(ctx.exec_block().get(i)));
		}

		return builder.toString();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public void exitIf_statement(DoombParser.If_statementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterComparation(DoombParser.ComparationContext ctx) {
		StringBuilder builder = new StringBuilder();

		int count = ctx.getChildCount();
		for (int i = 0; i < count; i++) {
			ParseTree child = ctx.getChild(i);

			if (ctx.bool_op() != null && i >= 3) {
				if (i == 3) {
					builder.append(enterBool_op((DoombParser.Bool_opContext) child));
				} else {
					builder.append(enterComparation((DoombParser.ComparationContext) child));
				}
			} else if (child instanceof DoombParser.VariableContext) {
				builder.append(enterVariable((DoombParser.VariableContext) child));
			} else if (child instanceof DoombParser.ExprContext) {
				builder.append(enterExpr((DoombParser.ExprContext) child));
			} else if (child instanceof DoombParser.Relational_opContext) {
				builder.append(enterRelational_op((DoombParser.Relational_opContext) child));
			}
		}

		return builder.toString();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitComparation(DoombParser.ComparationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterFor_statement(DoombParser.For_statementContext ctx) {
		inForStatement = true;

		String s = "" + ctx.FOR() + ctx.OPEN_PAREN() + enterVariable_declaration(ctx.variable_declaration()) + ctx.DEL().get(0) + enterComparation(ctx.comparation()) + ctx.DEL().get(0) + enterExpr(ctx.expr()) + ctx.CLOSE_PAREN() + enterExec_block(ctx.exec_block());

		inForStatement = false;

		return s;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFor_statement(DoombParser.For_statementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *
	 * @return
	 */
	@Override public String enterWhile_statement(DoombParser.While_statementContext ctx) {
		return "" + ctx.WHILE() + ctx.OPEN_PAREN() + enterExpr(ctx.expr()) + ctx.CLOSE_PAREN() + enterExec_block(ctx.exec_block());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWhile_statement(DoombParser.While_statementContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }

	public String getJavaCode() {
		StringBuilder builder = new StringBuilder();

		for (String str : javaCode) {
			builder.append(str);
		}

		return builder.toString();
	}

	private String parseType(String rawType) {
		return rawType.equals("string") ? "String" : rawType.equals("number") ? "double" : rawType;
	}

	private String parseReadKeyboard(String type) {
		StringBuilder builder = new StringBuilder();

		switch (type) {
			case "number":
			case "double":
				builder.append("keyboard.nextDouble();");
				break;
			case "int":
				builder.append("keyboard.nextInt();");
				break;
			case "string":
				builder.append("keyboard.nextLine();");
				break;
		}

		return builder.toString();
	}
}