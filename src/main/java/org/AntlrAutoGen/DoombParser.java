// Generated from C:/Users/mello/IdeaProjects/Doomb/src/main/java/org/Grammar/Doomb.g4 by ANTLR 4.13.1
package org.AntlrAutoGen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DoombParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DECLARE=1, MAIN=2, IF=3, ELSE=4, CONTINUE=5, BREAK=6, RETURN=7, FOR=8, 
		WHILE=9, DOUBLE_COLON=10, COLON=11, RIGHT_ARROW=12, EXCLAMATION=13, ADD_OP=14, 
		MULT_OP=15, NOT_EQUAL_OP=16, EQUAL=17, GT_OP=18, GT_EQUAL_OP=19, LT_OP=20, 
		LT_EQUAL_OP=21, ASSIGN_OP=22, BOOL_OPERATOR=23, CONCAT_OP=24, INT_DEF=25, 
		DOUBLE_DEF=26, NUMBER_DEF=27, STRING_DEF=28, BOOLEAN_DEF=29, TYPE=30, 
		ID=31, WHITESPACE=32, DEL=33, OPEN_CBRACKET=34, CLOSE_CBRACKET=35, OPEN_PAREN=36, 
		CLOSE_PAREN=37, COMMA=38;
	public static final int
		RULE_program = 0, RULE_declare_block = 1, RULE_main_block = 2, RULE_exec_block = 3, 
		RULE_string = 4, RULE_variable = 5, RULE_variable_declaration = 6, RULE_function_declaration = 7, 
		RULE_function_call = 8, RULE_parameter_list = 9, RULE_function_params = 10, 
		RULE_statement = 11, RULE_jump_statement = 12, RULE_expr = 13, RULE_math_expr = 14, 
		RULE_value = 15, RULE_relational_op = 16, RULE_bool_op = 17, RULE_if_statement = 18, 
		RULE_comparation = 19, RULE_for_statement = 20, RULE_while_statement = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declare_block", "main_block", "exec_block", "string", "variable", 
			"variable_declaration", "function_declaration", "function_call", "parameter_list", 
			"function_params", "statement", "jump_statement", "expr", "math_expr", 
			"value", "relational_op", "bool_op", "if_statement", "comparation", "for_statement", 
			"while_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'declare'", "'main'", "'if'", "'else'", "'continue'", "'break'", 
			"'return'", "'for'", "'while'", "'::'", "':'", "'->'", "'!'", null, null, 
			"'!='", "'=='", "'>'", "'>='", "'<'", "'<='", "'='", null, "'||'", null, 
			null, null, null, null, null, null, null, "';'", "'{'", "'}'", "'('", 
			"')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DECLARE", "MAIN", "IF", "ELSE", "CONTINUE", "BREAK", "RETURN", 
			"FOR", "WHILE", "DOUBLE_COLON", "COLON", "RIGHT_ARROW", "EXCLAMATION", 
			"ADD_OP", "MULT_OP", "NOT_EQUAL_OP", "EQUAL", "GT_OP", "GT_EQUAL_OP", 
			"LT_OP", "LT_EQUAL_OP", "ASSIGN_OP", "BOOL_OPERATOR", "CONCAT_OP", "INT_DEF", 
			"DOUBLE_DEF", "NUMBER_DEF", "STRING_DEF", "BOOLEAN_DEF", "TYPE", "ID", 
			"WHITESPACE", "DEL", "OPEN_CBRACKET", "CLOSE_CBRACKET", "OPEN_PAREN", 
			"CLOSE_PAREN", "COMMA"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Doomb.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DoombParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Main_blockContext main_block() {
			return getRuleContext(Main_blockContext.class,0);
		}
		public Declare_blockContext declare_block() {
			return getRuleContext(Declare_blockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(44);
				declare_block();
				}
			}

			setState(47);
			main_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_blockContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(DoombParser.DECLARE, 0); }
		public TerminalNode OPEN_CBRACKET() { return getToken(DoombParser.OPEN_CBRACKET, 0); }
		public TerminalNode CLOSE_CBRACKET() { return getToken(DoombParser.CLOSE_CBRACKET, 0); }
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public Declare_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterDeclare_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitDeclare_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitDeclare_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_blockContext declare_block() throws RecognitionException {
		Declare_blockContext _localctx = new Declare_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declare_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(DECLARE);
			setState(50);
			match(OPEN_CBRACKET);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(51);
					variable_declaration();
					}
					break;
				case 2:
					{
					setState(52);
					function_declaration();
					}
					break;
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(CLOSE_CBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Main_blockContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(DoombParser.MAIN, 0); }
		public Exec_blockContext exec_block() {
			return getRuleContext(Exec_blockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DoombParser.EOF, 0); }
		public Main_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterMain_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitMain_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitMain_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_blockContext main_block() throws RecognitionException {
		Main_blockContext _localctx = new Main_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(MAIN);
			setState(61);
			exec_block();
			setState(62);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exec_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_CBRACKET() { return getToken(DoombParser.OPEN_CBRACKET, 0); }
		public TerminalNode CLOSE_CBRACKET() { return getToken(DoombParser.CLOSE_CBRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Exec_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exec_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterExec_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitExec_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitExec_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exec_blockContext exec_block() throws RecognitionException {
		Exec_blockContext _localctx = new Exec_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exec_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(OPEN_CBRACKET);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				statement();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 71101866984L) != 0) );
			setState(70);
			match(CLOSE_CBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> STRING_DEF() { return getTokens(DoombParser.STRING_DEF); }
		public TerminalNode STRING_DEF(int i) {
			return getToken(DoombParser.STRING_DEF, i);
		}
		public List<TerminalNode> CONCAT_OP() { return getTokens(DoombParser.CONCAT_OP); }
		public TerminalNode CONCAT_OP(int i) {
			return getToken(DoombParser.CONCAT_OP, i);
		}
		public List<TerminalNode> ID() { return getTokens(DoombParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DoombParser.ID, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(STRING_DEF);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONCAT_OP) {
				{
				{
				setState(73);
				match(CONCAT_OP);
				setState(74);
				_la = _input.LA(1);
				if ( !(_la==STRING_DEF || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DoombParser.ID, 0); }
		public TerminalNode NUMBER_DEF() { return getToken(DoombParser.NUMBER_DEF, 0); }
		public TerminalNode INT_DEF() { return getToken(DoombParser.INT_DEF, 0); }
		public TerminalNode DOUBLE_DEF() { return getToken(DoombParser.DOUBLE_DEF, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode BOOLEAN_DEF() { return getToken(DoombParser.BOOLEAN_DEF, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(ID);
				}
				break;
			case NUMBER_DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(NUMBER_DEF);
				}
				break;
			case INT_DEF:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(INT_DEF);
				}
				break;
			case DOUBLE_DEF:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				match(DOUBLE_DEF);
				}
				break;
			case STRING_DEF:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				string();
				}
				break;
			case BOOLEAN_DEF:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				match(BOOLEAN_DEF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DoombParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DoombParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(DoombParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(DoombParser.TYPE, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(DoombParser.ASSIGN_OP, 0); }
		public TerminalNode DEL() { return getToken(DoombParser.DEL, 0); }
		public TerminalNode INT_DEF() { return getToken(DoombParser.INT_DEF, 0); }
		public TerminalNode DOUBLE_DEF() { return getToken(DoombParser.DOUBLE_DEF, 0); }
		public TerminalNode NUMBER_DEF() { return getToken(DoombParser.NUMBER_DEF, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
			setState(89);
			match(COLON);
			setState(90);
			match(TYPE);
			setState(91);
			match(ASSIGN_OP);
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(92);
				match(ID);
				}
				break;
			case INT_DEF:
				{
				setState(93);
				match(INT_DEF);
				}
				break;
			case DOUBLE_DEF:
				{
				setState(94);
				match(DOUBLE_DEF);
				}
				break;
			case NUMBER_DEF:
				{
				setState(95);
				match(NUMBER_DEF);
				}
				break;
			case STRING_DEF:
				{
				setState(96);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(99);
			match(DEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DoombParser.ID, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(DoombParser.DOUBLE_COLON, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(DoombParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(DoombParser.TYPE, 0); }
		public TerminalNode OPEN_CBRACKET() { return getToken(DoombParser.OPEN_CBRACKET, 0); }
		public TerminalNode CLOSE_CBRACKET() { return getToken(DoombParser.CLOSE_CBRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ID);
			setState(102);
			match(DOUBLE_COLON);
			setState(103);
			parameter_list();
			setState(104);
			match(COLON);
			setState(105);
			match(TYPE);
			setState(106);
			match(OPEN_CBRACKET);
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				statement();
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 71101866984L) != 0) );
			setState(112);
			match(CLOSE_CBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DoombParser.ID, 0); }
		public TerminalNode RIGHT_ARROW() { return getToken(DoombParser.RIGHT_ARROW, 0); }
		public Function_paramsContext function_params() {
			return getRuleContext(Function_paramsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ID);
			setState(115);
			match(RIGHT_ARROW);
			setState(116);
			function_params();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_listContext extends ParserRuleContext {
		public List<TerminalNode> TYPE() { return getTokens(DoombParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(DoombParser.TYPE, i);
		}
		public List<TerminalNode> ID() { return getTokens(DoombParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DoombParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DoombParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DoombParser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(118);
				match(TYPE);
				setState(119);
				match(ID);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(120);
					match(COMMA);
					setState(121);
					match(TYPE);
					setState(122);
					match(ID);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_paramsContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DoombParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DoombParser.COMMA, i);
		}
		public Function_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterFunction_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitFunction_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitFunction_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_paramsContext function_params() throws RecognitionException {
		Function_paramsContext _localctx = new Function_paramsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3187671040L) != 0)) {
				{
				setState(130);
				variable();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(131);
					match(COMMA);
					setState(132);
					variable();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATION:
			case ADD_OP:
			case INT_DEF:
			case DOUBLE_DEF:
			case NUMBER_DEF:
			case ID:
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				expr();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				if_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				for_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				while_statement();
				}
				break;
			case CONTINUE:
			case BREAK:
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				jump_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Jump_statementContext extends ParserRuleContext {
		public TerminalNode DEL() { return getToken(DoombParser.DEL, 0); }
		public TerminalNode CONTINUE() { return getToken(DoombParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(DoombParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(DoombParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitJump_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitJump_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jump_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				{
				setState(147);
				match(CONTINUE);
				}
				break;
			case BREAK:
				{
				setState(148);
				match(BREAK);
				}
				break;
			case RETURN:
				{
				setState(149);
				match(RETURN);
				setState(152);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EXCLAMATION:
				case ADD_OP:
				case INT_DEF:
				case DOUBLE_DEF:
				case NUMBER_DEF:
				case ID:
				case OPEN_PAREN:
					{
					setState(150);
					expr();
					}
					break;
				case STRING_DEF:
					{
					setState(151);
					string();
					}
					break;
				case DEL:
					break;
				default:
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(156);
			match(DEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode DEL() { return getToken(DoombParser.DEL, 0); }
		public TerminalNode ID() { return getToken(DoombParser.ID, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(DoombParser.ASSIGN_OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(DoombParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(DoombParser.CLOSE_PAREN, 0); }
		public TerminalNode EXCLAMATION() { return getToken(DoombParser.EXCLAMATION, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(158);
					match(ID);
					setState(159);
					match(ASSIGN_OP);
					setState(160);
					expr();
					}
					break;
				case 2:
					{
					setState(161);
					match(ID);
					setState(162);
					match(ASSIGN_OP);
					setState(163);
					math_expr(0);
					}
					break;
				case 3:
					{
					setState(164);
					match(ID);
					setState(165);
					match(ASSIGN_OP);
					setState(166);
					variable();
					}
					break;
				case 4:
					{
					setState(167);
					match(ID);
					setState(168);
					match(ASSIGN_OP);
					setState(169);
					function_call();
					}
					break;
				case 5:
					{
					setState(170);
					function_call();
					}
					break;
				}
				setState(173);
				match(DEL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(OPEN_PAREN);
				setState(176);
				expr();
				setState(177);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(EXCLAMATION);
				setState(180);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				math_expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Math_exprContext extends ParserRuleContext {
		public TerminalNode ADD_OP() { return getToken(DoombParser.ADD_OP, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public TerminalNode MULT_OP() { return getToken(DoombParser.MULT_OP, 0); }
		public Math_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterMath_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitMath_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitMath_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_exprContext math_expr() throws RecognitionException {
		return math_expr(0);
	}

	private Math_exprContext math_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_exprContext _localctx = new Math_exprContext(_ctx, _parentState);
		Math_exprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_math_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD_OP:
				{
				setState(185);
				match(ADD_OP);
				setState(186);
				value();
				}
				break;
			case INT_DEF:
			case DOUBLE_DEF:
			case NUMBER_DEF:
			case ID:
			case OPEN_PAREN:
				{
				setState(187);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new Math_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
						setState(190);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(191);
						match(MULT_OP);
						setState(192);
						math_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new Math_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
						setState(193);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(194);
						match(ADD_OP);
						setState(195);
						math_expr(3);
						}
						break;
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DoombParser.ID, 0); }
		public TerminalNode INT_DEF() { return getToken(DoombParser.INT_DEF, 0); }
		public TerminalNode DOUBLE_DEF() { return getToken(DoombParser.DOUBLE_DEF, 0); }
		public TerminalNode NUMBER_DEF() { return getToken(DoombParser.NUMBER_DEF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(DoombParser.OPEN_PAREN, 0); }
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(DoombParser.CLOSE_PAREN, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(ID);
				}
				break;
			case INT_DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(INT_DEF);
				}
				break;
			case DOUBLE_DEF:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(DOUBLE_DEF);
				}
				break;
			case NUMBER_DEF:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				match(NUMBER_DEF);
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
				match(OPEN_PAREN);
				setState(206);
				math_expr(0);
				setState(207);
				match(CLOSE_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Relational_opContext extends ParserRuleContext {
		public TerminalNode NOT_EQUAL_OP() { return getToken(DoombParser.NOT_EQUAL_OP, 0); }
		public TerminalNode EQUAL() { return getToken(DoombParser.EQUAL, 0); }
		public TerminalNode GT_OP() { return getToken(DoombParser.GT_OP, 0); }
		public TerminalNode GT_EQUAL_OP() { return getToken(DoombParser.GT_EQUAL_OP, 0); }
		public TerminalNode LT_OP() { return getToken(DoombParser.LT_OP, 0); }
		public TerminalNode LT_EQUAL_OP() { return getToken(DoombParser.LT_EQUAL_OP, 0); }
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterRelational_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitRelational_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitRelational_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4128768L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_opContext extends ParserRuleContext {
		public TerminalNode BOOL_OPERATOR() { return getToken(DoombParser.BOOL_OPERATOR, 0); }
		public Bool_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterBool_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitBool_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitBool_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_opContext bool_op() throws RecognitionException {
		Bool_opContext _localctx = new Bool_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bool_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(BOOL_OPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(DoombParser.IF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(DoombParser.OPEN_PAREN, 0); }
		public ComparationContext comparation() {
			return getRuleContext(ComparationContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(DoombParser.CLOSE_PAREN, 0); }
		public List<Exec_blockContext> exec_block() {
			return getRuleContexts(Exec_blockContext.class);
		}
		public Exec_blockContext exec_block(int i) {
			return getRuleContext(Exec_blockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DoombParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(IF);
			setState(216);
			match(OPEN_PAREN);
			setState(217);
			comparation();
			setState(218);
			match(CLOSE_PAREN);
			setState(219);
			exec_block();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(220);
				match(ELSE);
				setState(221);
				exec_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparationContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<Relational_opContext> relational_op() {
			return getRuleContexts(Relational_opContext.class);
		}
		public Relational_opContext relational_op(int i) {
			return getRuleContext(Relational_opContext.class,i);
		}
		public Bool_opContext bool_op() {
			return getRuleContext(Bool_opContext.class,0);
		}
		public ComparationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterComparation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitComparation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitComparation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparationContext comparation() throws RecognitionException {
		ComparationContext _localctx = new ComparationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comparation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			variable();
			setState(225);
			relational_op();
			setState(226);
			variable();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOL_OPERATOR) {
				{
				setState(227);
				bool_op();
				setState(228);
				variable();
				setState(229);
				relational_op();
				setState(230);
				variable();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DoombParser.FOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(DoombParser.OPEN_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> DEL() { return getTokens(DoombParser.DEL); }
		public TerminalNode DEL(int i) {
			return getToken(DoombParser.DEL, i);
		}
		public ComparationContext comparation() {
			return getRuleContext(ComparationContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(DoombParser.CLOSE_PAREN, 0); }
		public Exec_blockContext exec_block() {
			return getRuleContext(Exec_blockContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(FOR);
			setState(235);
			match(OPEN_PAREN);
			setState(236);
			expr();
			setState(237);
			match(DEL);
			setState(238);
			comparation();
			setState(239);
			match(DEL);
			setState(240);
			expr();
			setState(241);
			match(CLOSE_PAREN);
			setState(242);
			exec_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(DoombParser.WHILE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(DoombParser.OPEN_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(DoombParser.CLOSE_PAREN, 0); }
		public Exec_blockContext exec_block() {
			return getRuleContext(Exec_blockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DoombListener ) ((DoombListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DoombVisitor ) return ((DoombVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(WHILE);
			setState(245);
			match(OPEN_PAREN);
			setState(246);
			expr();
			setState(247);
			match(CLOSE_PAREN);
			setState(248);
			exec_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return math_expr_sempred((Math_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean math_expr_sempred(Math_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u00fb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0003\u0000.\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00016\b\u0001\n\u0001\f\u0001"+
		"9\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0004\u0003C\b\u0003\u000b\u0003"+
		"\f\u0003D\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004L\b\u0004\n\u0004\f\u0004O\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005W\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006b\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007m\b\u0007\u000b\u0007\f\u0007n\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t|\b\t\n\t\f\t\u007f\t\t\u0003\t\u0081\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0086\b\n\n\n\f\n\u0089\t\n\u0003\n\u008b\b"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0092\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0099\b"+
		"\f\u0003\f\u009b\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00ac\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00b7\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00bd\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00c5\b\u000e\n\u000e\f\u000e"+
		"\u00c8\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d2\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00df\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00e9\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0001\u001c\u0016\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*\u0000\u0002\u0002\u0000\u001c\u001c\u001f\u001f\u0001\u0000\u0010"+
		"\u0015\u010f\u0000-\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000"+
		"\u0004<\u0001\u0000\u0000\u0000\u0006@\u0001\u0000\u0000\u0000\bH\u0001"+
		"\u0000\u0000\u0000\nV\u0001\u0000\u0000\u0000\fX\u0001\u0000\u0000\u0000"+
		"\u000ee\u0001\u0000\u0000\u0000\u0010r\u0001\u0000\u0000\u0000\u0012\u0080"+
		"\u0001\u0000\u0000\u0000\u0014\u008a\u0001\u0000\u0000\u0000\u0016\u0091"+
		"\u0001\u0000\u0000\u0000\u0018\u009a\u0001\u0000\u0000\u0000\u001a\u00b6"+
		"\u0001\u0000\u0000\u0000\u001c\u00bc\u0001\u0000\u0000\u0000\u001e\u00d1"+
		"\u0001\u0000\u0000\u0000 \u00d3\u0001\u0000\u0000\u0000\"\u00d5\u0001"+
		"\u0000\u0000\u0000$\u00d7\u0001\u0000\u0000\u0000&\u00e0\u0001\u0000\u0000"+
		"\u0000(\u00ea\u0001\u0000\u0000\u0000*\u00f4\u0001\u0000\u0000\u0000,"+
		".\u0003\u0002\u0001\u0000-,\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/0\u0003\u0004\u0002\u00000\u0001\u0001"+
		"\u0000\u0000\u000012\u0005\u0001\u0000\u000027\u0005\"\u0000\u000036\u0003"+
		"\f\u0006\u000046\u0003\u000e\u0007\u000053\u0001\u0000\u0000\u000054\u0001"+
		"\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u0000:;\u0005#\u0000\u0000;\u0003\u0001\u0000\u0000\u0000<=\u0005\u0002"+
		"\u0000\u0000=>\u0003\u0006\u0003\u0000>?\u0005\u0000\u0000\u0001?\u0005"+
		"\u0001\u0000\u0000\u0000@B\u0005\"\u0000\u0000AC\u0003\u0016\u000b\u0000"+
		"BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0005#\u0000"+
		"\u0000G\u0007\u0001\u0000\u0000\u0000HM\u0005\u001c\u0000\u0000IJ\u0005"+
		"\u0018\u0000\u0000JL\u0007\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000N\t\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PW\u0005\u001f"+
		"\u0000\u0000QW\u0005\u001b\u0000\u0000RW\u0005\u0019\u0000\u0000SW\u0005"+
		"\u001a\u0000\u0000TW\u0003\b\u0004\u0000UW\u0005\u001d\u0000\u0000VP\u0001"+
		"\u0000\u0000\u0000VQ\u0001\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000"+
		"VS\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000"+
		"\u0000W\u000b\u0001\u0000\u0000\u0000XY\u0005\u001f\u0000\u0000YZ\u0005"+
		"\u000b\u0000\u0000Z[\u0005\u001e\u0000\u0000[a\u0005\u0016\u0000\u0000"+
		"\\b\u0005\u001f\u0000\u0000]b\u0005\u0019\u0000\u0000^b\u0005\u001a\u0000"+
		"\u0000_b\u0005\u001b\u0000\u0000`b\u0003\b\u0004\u0000a\\\u0001\u0000"+
		"\u0000\u0000a]\u0001\u0000\u0000\u0000a^\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"cd\u0005!\u0000\u0000d\r\u0001\u0000\u0000\u0000ef\u0005\u001f\u0000\u0000"+
		"fg\u0005\n\u0000\u0000gh\u0003\u0012\t\u0000hi\u0005\u000b\u0000\u0000"+
		"ij\u0005\u001e\u0000\u0000jl\u0005\"\u0000\u0000km\u0003\u0016\u000b\u0000"+
		"lk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0005#\u0000"+
		"\u0000q\u000f\u0001\u0000\u0000\u0000rs\u0005\u001f\u0000\u0000st\u0005"+
		"\f\u0000\u0000tu\u0003\u0014\n\u0000u\u0011\u0001\u0000\u0000\u0000vw"+
		"\u0005\u001e\u0000\u0000w}\u0005\u001f\u0000\u0000xy\u0005&\u0000\u0000"+
		"yz\u0005\u001e\u0000\u0000z|\u0005\u001f\u0000\u0000{x\u0001\u0000\u0000"+
		"\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u0080v\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u0013\u0001\u0000\u0000\u0000\u0082\u0087\u0003\n\u0005\u0000\u0083"+
		"\u0084\u0005&\u0000\u0000\u0084\u0086\u0003\n\u0005\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008b"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u0082"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0015"+
		"\u0001\u0000\u0000\u0000\u008c\u0092\u0003\u001a\r\u0000\u008d\u0092\u0003"+
		"$\u0012\u0000\u008e\u0092\u0003(\u0014\u0000\u008f\u0092\u0003*\u0015"+
		"\u0000\u0090\u0092\u0003\u0018\f\u0000\u0091\u008c\u0001\u0000\u0000\u0000"+
		"\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u008e\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0017\u0001\u0000\u0000\u0000\u0093\u009b\u0005\u0005\u0000\u0000"+
		"\u0094\u009b\u0005\u0006\u0000\u0000\u0095\u0098\u0005\u0007\u0000\u0000"+
		"\u0096\u0099\u0003\u001a\r\u0000\u0097\u0099\u0003\b\u0004\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a"+
		"\u0093\u0001\u0000\u0000\u0000\u009a\u0094\u0001\u0000\u0000\u0000\u009a"+
		"\u0095\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005!\u0000\u0000\u009d\u0019\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005\u001f\u0000\u0000\u009f\u00a0\u0005\u0016\u0000\u0000\u00a0\u00ac"+
		"\u0003\u001a\r\u0000\u00a1\u00a2\u0005\u001f\u0000\u0000\u00a2\u00a3\u0005"+
		"\u0016\u0000\u0000\u00a3\u00ac\u0003\u001c\u000e\u0000\u00a4\u00a5\u0005"+
		"\u001f\u0000\u0000\u00a5\u00a6\u0005\u0016\u0000\u0000\u00a6\u00ac\u0003"+
		"\n\u0005\u0000\u00a7\u00a8\u0005\u001f\u0000\u0000\u00a8\u00a9\u0005\u0016"+
		"\u0000\u0000\u00a9\u00ac\u0003\u0010\b\u0000\u00aa\u00ac\u0003\u0010\b"+
		"\u0000\u00ab\u009e\u0001\u0000\u0000\u0000\u00ab\u00a1\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a4\u0001\u0000\u0000\u0000\u00ab\u00a7\u0001\u0000\u0000"+
		"\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0005!\u0000\u0000\u00ae\u00b7\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005$\u0000\u0000\u00b0\u00b1\u0003\u001a\r\u0000\u00b1"+
		"\u00b2\u0005%\u0000\u0000\u00b2\u00b7\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0005\r\u0000\u0000\u00b4\u00b7\u0003\u001a\r\u0000\u00b5\u00b7\u0003"+
		"\u001c\u000e\u0000\u00b6\u00ab\u0001\u0000\u0000\u0000\u00b6\u00af\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b7\u001b\u0001\u0000\u0000\u0000\u00b8\u00b9\u0006"+
		"\u000e\uffff\uffff\u0000\u00b9\u00ba\u0005\u000e\u0000\u0000\u00ba\u00bd"+
		"\u0003\u001e\u000f\u0000\u00bb\u00bd\u0003\u001e\u000f\u0000\u00bc\u00b8"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u00c6"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\n\u0003\u0000\u0000\u00bf\u00c0\u0005"+
		"\u000f\u0000\u0000\u00c0\u00c5\u0003\u001c\u000e\u0004\u00c1\u00c2\n\u0002"+
		"\u0000\u0000\u00c2\u00c3\u0005\u000e\u0000\u0000\u00c3\u00c5\u0003\u001c"+
		"\u000e\u0003\u00c4\u00be\u0001\u0000\u0000\u0000\u00c4\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u001d\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00d2\u0005\u001f"+
		"\u0000\u0000\u00ca\u00d2\u0005\u0019\u0000\u0000\u00cb\u00d2\u0005\u001a"+
		"\u0000\u0000\u00cc\u00d2\u0005\u001b\u0000\u0000\u00cd\u00ce\u0005$\u0000"+
		"\u0000\u00ce\u00cf\u0003\u001c\u000e\u0000\u00cf\u00d0\u0005%\u0000\u0000"+
		"\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00c9\u0001\u0000\u0000\u0000"+
		"\u00d1\u00ca\u0001\u0000\u0000\u0000\u00d1\u00cb\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cc\u0001\u0000\u0000\u0000\u00d1\u00cd\u0001\u0000\u0000\u0000"+
		"\u00d2\u001f\u0001\u0000\u0000\u0000\u00d3\u00d4\u0007\u0001\u0000\u0000"+
		"\u00d4!\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0017\u0000\u0000\u00d6"+
		"#\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u0003\u0000\u0000\u00d8\u00d9"+
		"\u0005$\u0000\u0000\u00d9\u00da\u0003&\u0013\u0000\u00da\u00db\u0005%"+
		"\u0000\u0000\u00db\u00de\u0003\u0006\u0003\u0000\u00dc\u00dd\u0005\u0004"+
		"\u0000\u0000\u00dd\u00df\u0003\u0006\u0003\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df%\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0003\n\u0005\u0000\u00e1\u00e2\u0003 \u0010\u0000"+
		"\u00e2\u00e8\u0003\n\u0005\u0000\u00e3\u00e4\u0003\"\u0011\u0000\u00e4"+
		"\u00e5\u0003\n\u0005\u0000\u00e5\u00e6\u0003 \u0010\u0000\u00e6\u00e7"+
		"\u0003\n\u0005\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\'\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0005\b\u0000\u0000\u00eb\u00ec\u0005$\u0000"+
		"\u0000\u00ec\u00ed\u0003\u001a\r\u0000\u00ed\u00ee\u0005!\u0000\u0000"+
		"\u00ee\u00ef\u0003&\u0013\u0000\u00ef\u00f0\u0005!\u0000\u0000\u00f0\u00f1"+
		"\u0003\u001a\r\u0000\u00f1\u00f2\u0005%\u0000\u0000\u00f2\u00f3\u0003"+
		"\u0006\u0003\u0000\u00f3)\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\t"+
		"\u0000\u0000\u00f5\u00f6\u0005$\u0000\u0000\u00f6\u00f7\u0003\u001a\r"+
		"\u0000\u00f7\u00f8\u0005%\u0000\u0000\u00f8\u00f9\u0003\u0006\u0003\u0000"+
		"\u00f9+\u0001\u0000\u0000\u0000\u0017-57DMVan}\u0080\u0087\u008a\u0091"+
		"\u0098\u009a\u00ab\u00b6\u00bc\u00c4\u00c6\u00d1\u00de\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}