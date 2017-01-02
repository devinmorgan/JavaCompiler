// Generated from src/compiler/grammar/JavaParser.g4 by ANTLR 4.5.3

    package compiler.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS_=1, BLOCK_COMMENT=2, LINE_COMMENT=3, L_SQUARE=4, R_SQUARE=5, L_PAREN=6, 
		R_PAREN=7, L_CURL=8, R_CURL=9, COMMA=10, SEMI_COL=11, DOT=12, LT_OP=13, 
		GT_OP=14, LEQ_OP=15, GEQ_OP=16, EQ_OP=17, NEQ_OP=18, AND_OP=19, OR_OP=20, 
		NOT_OP=21, ADD_OP=22, SUB_OP=23, MUL_OP=24, DIV_OP=25, MOD_OP=26, AS_OP=27, 
		RES_VOID=28, RES_STRING=29, RES_THIS=30, RES_WHILE=31, RES_BREAK=32, RES_READ_INT=33, 
		RES_INT=34, RES_CLASS=35, RES_EXTENDS=36, RES_IF=37, RES_NEW=38, RES_READ_LINE=39, 
		RES_INTERFACE=40, RES_IMPLEMENTS=41, RES_ELSE=42, RES_BOOLEAN=43, RES_NULL=44, 
		RES_FOR=45, RES_RETURN=46, RES_PRINT=47, RES_CONTINUE=48, BOOL=49, STRING=50, 
		INT=51, ID=52;
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_var_decl = 2, RULE_type = 3, RULE_func_decl = 4, 
		RULE_params = 5, RULE_class_decl = 6, RULE_interface_decl = 7, RULE_method_sig = 8, 
		RULE_stmt_block = 9, RULE_stmt = 10, RULE_else_stmt = 11, RULE_expr = 12, 
		RULE_args = 13, RULE_literal = 14;
	public static final String[] ruleNames = {
		"program", "decl", "var_decl", "type", "func_decl", "params", "class_decl", 
		"interface_decl", "method_sig", "stmt_block", "stmt", "else_stmt", "expr", 
		"args", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'['", "']'", "'('", "')'", "'{'", "'}'", "','", 
		"';'", "'.'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", 
		"'!'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'void'", "'String'", 
		"'this'", "'while'", "'break'", "'readInt'", "'int'", "'class'", "'extends'", 
		"'if'", "'new'", "'readLine'", "'interface'", "'implements'", "'else'", 
		"'boolean'", "'null'", "'for'", "'return'", "'print'", "'continue'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS_", "BLOCK_COMMENT", "LINE_COMMENT", "L_SQUARE", "R_SQUARE", 
		"L_PAREN", "R_PAREN", "L_CURL", "R_CURL", "COMMA", "SEMI_COL", "DOT", 
		"LT_OP", "GT_OP", "LEQ_OP", "GEQ_OP", "EQ_OP", "NEQ_OP", "AND_OP", "OR_OP", 
		"NOT_OP", "ADD_OP", "SUB_OP", "MUL_OP", "DIV_OP", "MOD_OP", "AS_OP", "RES_VOID", 
		"RES_STRING", "RES_THIS", "RES_WHILE", "RES_BREAK", "RES_READ_INT", "RES_INT", 
		"RES_CLASS", "RES_EXTENDS", "RES_IF", "RES_NEW", "RES_READ_LINE", "RES_INTERFACE", 
		"RES_IMPLEMENTS", "RES_ELSE", "RES_BOOLEAN", "RES_NULL", "RES_FOR", "RES_RETURN", 
		"RES_PRINT", "RES_CONTINUE", "BOOL", "STRING", "INT", "ID"
	};
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
	public String getGrammarFileName() { return "JavaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				decl();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RES_VOID) | (1L << RES_STRING) | (1L << RES_INT) | (1L << RES_CLASS) | (1L << RES_INTERFACE) | (1L << RES_BOOLEAN) | (1L << ID))) != 0) );
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

	public static class DeclContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public Class_declContext class_decl() {
			return getRuleContext(Class_declContext.class,0);
		}
		public Interface_declContext interface_decl() {
			return getRuleContext(Interface_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				func_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				class_decl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				interface_decl();
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

	public static class Var_declContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(JavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaParser.ID, i);
		}
		public TerminalNode SEMI_COL() { return getToken(JavaParser.SEMI_COL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			type(0);
			setState(42);
			match(ID);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(43);
				match(COMMA);
				setState(44);
				match(ID);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(SEMI_COL);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode RES_INT() { return getToken(JavaParser.RES_INT, 0); }
		public TerminalNode RES_BOOLEAN() { return getToken(JavaParser.RES_BOOLEAN, 0); }
		public TerminalNode RES_STRING() { return getToken(JavaParser.RES_STRING, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode L_SQUARE() { return getToken(JavaParser.L_SQUARE, 0); }
		public TerminalNode R_SQUARE() { return getToken(JavaParser.R_SQUARE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			switch (_input.LA(1)) {
			case RES_INT:
				{
				setState(53);
				match(RES_INT);
				}
				break;
			case RES_BOOLEAN:
				{
				setState(54);
				match(RES_BOOLEAN);
				}
				break;
			case RES_STRING:
				{
				setState(55);
				match(RES_STRING);
				}
				break;
			case ID:
				{
				setState(56);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(59);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(60);
					match(L_SQUARE);
					setState(61);
					match(R_SQUARE);
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class Func_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode L_PAREN() { return getToken(JavaParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(JavaParser.R_PAREN, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RES_VOID() { return getToken(JavaParser.RES_VOID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFunc_decl(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			switch (_input.LA(1)) {
			case RES_STRING:
			case RES_INT:
			case RES_BOOLEAN:
			case ID:
				{
				setState(67);
				type(0);
				}
				break;
			case RES_VOID:
				{
				setState(68);
				match(RES_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(71);
			match(ID);
			setState(72);
			match(L_PAREN);
			setState(74);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RES_STRING) | (1L << RES_INT) | (1L << RES_BOOLEAN) | (1L << ID))) != 0)) {
				{
				setState(73);
				params();
				}
			}

			setState(76);
			match(R_PAREN);
			setState(77);
			stmt_block();
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

	public static class ParamsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(JavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			type(0);
			setState(80);
			match(ID);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(81);
				match(COMMA);
				setState(82);
				type(0);
				setState(83);
				match(ID);
				}
				}
				setState(89);
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

	public static class Class_declContext extends ParserRuleContext {
		public TerminalNode RES_CLASS() { return getToken(JavaParser.RES_CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(JavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaParser.ID, i);
		}
		public TerminalNode L_CURL() { return getToken(JavaParser.L_CURL, 0); }
		public TerminalNode R_CURL() { return getToken(JavaParser.R_CURL, 0); }
		public TerminalNode RES_EXTENDS() { return getToken(JavaParser.RES_EXTENDS, 0); }
		public TerminalNode RES_IMPLEMENTS() { return getToken(JavaParser.RES_IMPLEMENTS, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<Func_declContext> func_decl() {
			return getRuleContexts(Func_declContext.class);
		}
		public Func_declContext func_decl(int i) {
			return getRuleContext(Func_declContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public Class_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClass_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClass_decl(this);
		}
	}

	public final Class_declContext class_decl() throws RecognitionException {
		Class_declContext _localctx = new Class_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_class_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(RES_CLASS);
			setState(91);
			match(ID);
			setState(94);
			_la = _input.LA(1);
			if (_la==RES_EXTENDS) {
				{
				setState(92);
				match(RES_EXTENDS);
				setState(93);
				match(ID);
				}
			}

			setState(105);
			_la = _input.LA(1);
			if (_la==RES_IMPLEMENTS) {
				{
				setState(96);
				match(RES_IMPLEMENTS);
				setState(97);
				match(ID);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(98);
					match(COMMA);
					setState(99);
					match(ID);
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(107);
			match(L_CURL);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RES_VOID) | (1L << RES_STRING) | (1L << RES_INT) | (1L << RES_BOOLEAN) | (1L << ID))) != 0)) {
				{
				setState(110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(108);
					var_decl();
					}
					break;
				case 2:
					{
					setState(109);
					func_decl();
					}
					break;
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(R_CURL);
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

	public static class Interface_declContext extends ParserRuleContext {
		public TerminalNode RES_INTERFACE() { return getToken(JavaParser.RES_INTERFACE, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode L_CURL() { return getToken(JavaParser.L_CURL, 0); }
		public TerminalNode R_CURL() { return getToken(JavaParser.R_CURL, 0); }
		public List<Method_sigContext> method_sig() {
			return getRuleContexts(Method_sigContext.class);
		}
		public Method_sigContext method_sig(int i) {
			return getRuleContext(Method_sigContext.class,i);
		}
		public Interface_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterface_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterface_decl(this);
		}
	}

	public final Interface_declContext interface_decl() throws RecognitionException {
		Interface_declContext _localctx = new Interface_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_interface_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(RES_INTERFACE);
			setState(118);
			match(ID);
			setState(119);
			match(L_CURL);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RES_VOID) | (1L << RES_STRING) | (1L << RES_INT) | (1L << RES_BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(120);
				method_sig();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(R_CURL);
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

	public static class Method_sigContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode L_PAREN() { return getToken(JavaParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(JavaParser.R_PAREN, 0); }
		public TerminalNode SEMI_COL() { return getToken(JavaParser.SEMI_COL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RES_VOID() { return getToken(JavaParser.RES_VOID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Method_sigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_sig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethod_sig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethod_sig(this);
		}
	}

	public final Method_sigContext method_sig() throws RecognitionException {
		Method_sigContext _localctx = new Method_sigContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_method_sig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			switch (_input.LA(1)) {
			case RES_STRING:
			case RES_INT:
			case RES_BOOLEAN:
			case ID:
				{
				setState(128);
				type(0);
				}
				break;
			case RES_VOID:
				{
				setState(129);
				match(RES_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(132);
			match(ID);
			setState(133);
			match(L_PAREN);
			setState(135);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RES_STRING) | (1L << RES_INT) | (1L << RES_BOOLEAN) | (1L << ID))) != 0)) {
				{
				setState(134);
				params();
				}
			}

			setState(137);
			match(R_PAREN);
			setState(138);
			match(SEMI_COL);
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

	public static class Stmt_blockContext extends ParserRuleContext {
		public TerminalNode L_CURL() { return getToken(JavaParser.L_CURL, 0); }
		public TerminalNode R_CURL() { return getToken(JavaParser.R_CURL, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterStmt_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitStmt_block(this);
		}
	}

	public final Stmt_blockContext stmt_block() throws RecognitionException {
		Stmt_blockContext _localctx = new Stmt_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmt_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(L_CURL);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PAREN) | (1L << L_CURL) | (1L << NOT_OP) | (1L << SUB_OP) | (1L << RES_STRING) | (1L << RES_THIS) | (1L << RES_WHILE) | (1L << RES_BREAK) | (1L << RES_READ_INT) | (1L << RES_INT) | (1L << RES_IF) | (1L << RES_NEW) | (1L << RES_READ_LINE) | (1L << RES_BOOLEAN) | (1L << RES_NULL) | (1L << RES_FOR) | (1L << RES_RETURN) | (1L << RES_PRINT) | (1L << RES_CONTINUE) | (1L << BOOL) | (1L << STRING) | (1L << INT) | (1L << ID))) != 0)) {
				{
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(141);
					var_decl();
					}
					break;
				case 2:
					{
					setState(142);
					stmt();
					}
					break;
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(R_CURL);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContinueStmtContext extends StmtContext {
		public TerminalNode RES_CONTINUE() { return getToken(JavaParser.RES_CONTINUE, 0); }
		public TerminalNode SEMI_COL() { return getToken(JavaParser.SEMI_COL, 0); }
		public ContinueStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitContinueStmt(this);
		}
	}
	public static class IfStmtContext extends StmtContext {
		public TerminalNode RES_IF() { return getToken(JavaParser.RES_IF, 0); }
		public TerminalNode L_PAREN() { return getToken(JavaParser.L_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(JavaParser.R_PAREN, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Else_stmtContext else_stmt() {
			return getRuleContext(Else_stmtContext.class,0);
		}
		public IfStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIfStmt(this);
		}
	}
	public static class PrintStmtContext extends StmtContext {
		public TerminalNode RES_PRINT() { return getToken(JavaParser.RES_PRINT, 0); }
		public TerminalNode L_PAREN() { return getToken(JavaParser.L_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(JavaParser.R_PAREN, 0); }
		public TerminalNode SEMI_COL() { return getToken(JavaParser.SEMI_COL, 0); }
		public PrintStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPrintStmt(this);
		}
	}
	public static class ExprStmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI_COL() { return getToken(JavaParser.SEMI_COL, 0); }
		public ExprStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExprStmt(this);
		}
	}
	public static class WhileStmtContext extends StmtContext {
		public TerminalNode RES_WHILE() { return getToken(JavaParser.RES_WHILE, 0); }
		public TerminalNode L_PAREN() { return getToken(JavaParser.L_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(JavaParser.R_PAREN, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitWhileStmt(this);
		}
	}
	public static class BreakStmtContext extends StmtContext {
		public TerminalNode RES_BREAK() { return getToken(JavaParser.RES_BREAK, 0); }
		public TerminalNode SEMI_COL() { return getToken(JavaParser.SEMI_COL, 0); }
		public BreakStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBreakStmt(this);
		}
	}
	public static class CodeBlockContext extends StmtContext {
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public CodeBlockContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCodeBlock(this);
		}
	}
	public static class ForStmtContext extends StmtContext {
		public TerminalNode RES_FOR() { return getToken(JavaParser.RES_FOR, 0); }
		public TerminalNode L_PAREN() { return getToken(JavaParser.L_PAREN, 0); }
		public List<TerminalNode> SEMI_COL() { return getTokens(JavaParser.SEMI_COL); }
		public TerminalNode SEMI_COL(int i) {
			return getToken(JavaParser.SEMI_COL, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode R_PAREN() { return getToken(JavaParser.R_PAREN, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ForStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitForStmt(this);
		}
	}
	public static class ReturnStmtContext extends StmtContext {
		public TerminalNode RES_RETURN() { return getToken(JavaParser.RES_RETURN, 0); }
		public TerminalNode SEMI_COL() { return getToken(JavaParser.SEMI_COL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitReturnStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		int _la;
		try {
			setState(197);
			switch (_input.LA(1)) {
			case L_PAREN:
			case NOT_OP:
			case SUB_OP:
			case RES_THIS:
			case RES_READ_INT:
			case RES_NEW:
			case RES_READ_LINE:
			case RES_NULL:
			case BOOL:
			case STRING:
			case INT:
			case ID:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				expr(0);
				setState(151);
				match(SEMI_COL);
				}
				break;
			case RES_IF:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(RES_IF);
				setState(154);
				match(L_PAREN);
				setState(155);
				expr(0);
				setState(156);
				match(R_PAREN);
				setState(157);
				stmt();
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(158);
					else_stmt();
					}
					break;
				}
				}
				break;
			case RES_WHILE:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(RES_WHILE);
				setState(162);
				match(L_PAREN);
				setState(163);
				expr(0);
				setState(164);
				match(R_PAREN);
				setState(165);
				stmt();
				}
				break;
			case RES_FOR:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(RES_FOR);
				setState(168);
				match(L_PAREN);
				setState(170);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PAREN) | (1L << NOT_OP) | (1L << SUB_OP) | (1L << RES_THIS) | (1L << RES_READ_INT) | (1L << RES_NEW) | (1L << RES_READ_LINE) | (1L << RES_NULL) | (1L << BOOL) | (1L << STRING) | (1L << INT) | (1L << ID))) != 0)) {
					{
					setState(169);
					expr(0);
					}
				}

				setState(172);
				match(SEMI_COL);
				setState(173);
				expr(0);
				setState(174);
				match(SEMI_COL);
				setState(176);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PAREN) | (1L << NOT_OP) | (1L << SUB_OP) | (1L << RES_THIS) | (1L << RES_READ_INT) | (1L << RES_NEW) | (1L << RES_READ_LINE) | (1L << RES_NULL) | (1L << BOOL) | (1L << STRING) | (1L << INT) | (1L << ID))) != 0)) {
					{
					setState(175);
					expr(0);
					}
				}

				setState(178);
				match(R_PAREN);
				setState(179);
				stmt();
				}
				break;
			case RES_BREAK:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				match(RES_BREAK);
				setState(182);
				match(SEMI_COL);
				}
				break;
			case RES_CONTINUE:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				match(RES_CONTINUE);
				setState(184);
				match(SEMI_COL);
				}
				break;
			case RES_RETURN:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
				match(RES_RETURN);
				setState(187);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PAREN) | (1L << NOT_OP) | (1L << SUB_OP) | (1L << RES_THIS) | (1L << RES_READ_INT) | (1L << RES_NEW) | (1L << RES_READ_LINE) | (1L << RES_NULL) | (1L << BOOL) | (1L << STRING) | (1L << INT) | (1L << ID))) != 0)) {
					{
					setState(186);
					expr(0);
					}
				}

				setState(189);
				match(SEMI_COL);
				}
				break;
			case RES_PRINT:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(190);
				match(RES_PRINT);
				setState(191);
				match(L_PAREN);
				setState(192);
				expr(0);
				setState(193);
				match(R_PAREN);
				setState(194);
				match(SEMI_COL);
				}
				break;
			case L_CURL:
				_localctx = new CodeBlockContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(196);
				stmt_block();
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

	public static class Else_stmtContext extends ParserRuleContext {
		public TerminalNode RES_ELSE() { return getToken(JavaParser.RES_ELSE, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElse_stmt(this);
		}
	}

	public final Else_stmtContext else_stmt() throws RecognitionException {
		Else_stmtContext _localctx = new Else_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_else_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(RES_ELSE);
			setState(200);
			stmt();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND_OP() { return getToken(JavaParser.AND_OP, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAndExpr(this);
		}
	}
	public static class ReadLineExprContext extends ExprContext {
		public TerminalNode RES_READ_LINE() { return getToken(JavaParser.RES_READ_LINE, 0); }
		public TerminalNode L_PAREN() { return getToken(JavaParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(JavaParser.R_PAREN, 0); }
		public ReadLineExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterReadLineExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitReadLineExpr(this);
		}
	}
	public static class VarAccessExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public VarAccessExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVarAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVarAccessExpr(this);
		}
	}
	public static class ParenthExprContext extends ExprContext {
		public TerminalNode L_PAREN() { return getToken(JavaParser.L_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(JavaParser.R_PAREN, 0); }
		public ParenthExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterParenthExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitParenthExpr(this);
		}
	}
	public static class NewObjExprContext extends ExprContext {
		public TerminalNode RES_NEW() { return getToken(JavaParser.RES_NEW, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode L_PAREN() { return getToken(JavaParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(JavaParser.R_PAREN, 0); }
		public NewObjExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNewObjExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNewObjExpr(this);
		}
	}
	public static class PropAccessExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public PropAccessExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPropAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPropAccessExpr(this);
		}
	}
	public static class RelationalExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT_OP() { return getToken(JavaParser.LT_OP, 0); }
		public TerminalNode GT_OP() { return getToken(JavaParser.GT_OP, 0); }
		public TerminalNode LEQ_OP() { return getToken(JavaParser.LEQ_OP, 0); }
		public TerminalNode GEQ_OP() { return getToken(JavaParser.GEQ_OP, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitRelationalExpr(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR_OP() { return getToken(JavaParser.OR_OP, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOrExpr(this);
		}
	}
	public static class NegateExprContext extends ExprContext {
		public TerminalNode SUB_OP() { return getToken(JavaParser.SUB_OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNegateExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNegateExpr(this);
		}
	}
	public static class PropAssignExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode AS_OP() { return getToken(JavaParser.AS_OP, 0); }
		public PropAssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPropAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPropAssignExpr(this);
		}
	}
	public static class ReadIntExprContext extends ExprContext {
		public TerminalNode RES_READ_INT() { return getToken(JavaParser.RES_READ_INT, 0); }
		public TerminalNode L_PAREN() { return getToken(JavaParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(JavaParser.R_PAREN, 0); }
		public ReadIntExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterReadIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitReadIntExpr(this);
		}
	}
	public static class MultiplicativeExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL_OP() { return getToken(JavaParser.MUL_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(JavaParser.DIV_OP, 0); }
		public TerminalNode MOD_OP() { return getToken(JavaParser.MOD_OP, 0); }
		public MultiplicativeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMultiplicativeExpr(this);
		}
	}
	public static class ObjectMethodCallContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode L_PAREN() { return getToken(JavaParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(JavaParser.R_PAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ObjectMethodCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterObjectMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitObjectMethodCall(this);
		}
	}
	public static class EqualityExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ_OP() { return getToken(JavaParser.EQ_OP, 0); }
		public TerminalNode NEQ_OP() { return getToken(JavaParser.NEQ_OP, 0); }
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEqualityExpr(this);
		}
	}
	public static class AdditiveExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD_OP() { return getToken(JavaParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(JavaParser.SUB_OP, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAdditiveExpr(this);
		}
	}
	public static class NewArrayExprContext extends ExprContext {
		public TerminalNode RES_NEW() { return getToken(JavaParser.RES_NEW, 0); }
		public TerminalNode L_SQUARE() { return getToken(JavaParser.L_SQUARE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_SQUARE() { return getToken(JavaParser.R_SQUARE, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NewArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNewArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNewArrayExpr(this);
		}
	}
	public static class GlobalMethodCallContext extends ExprContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode L_PAREN() { return getToken(JavaParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(JavaParser.R_PAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public GlobalMethodCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterGlobalMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitGlobalMethodCall(this);
		}
	}
	public static class LiteralExprContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLiteralExpr(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT_OP() { return getToken(JavaParser.NOT_OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNotExpr(this);
		}
	}
	public static class ArrayAssignExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode L_SQUARE() { return getToken(JavaParser.L_SQUARE, 0); }
		public TerminalNode R_SQUARE() { return getToken(JavaParser.R_SQUARE, 0); }
		public TerminalNode AS_OP() { return getToken(JavaParser.AS_OP, 0); }
		public ArrayAssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArrayAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArrayAssignExpr(this);
		}
	}
	public static class VarAssignExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode AS_OP() { return getToken(JavaParser.AS_OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarAssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVarAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVarAssignExpr(this);
		}
	}
	public static class ThisExprContext extends ExprContext {
		public TerminalNode RES_THIS() { return getToken(JavaParser.RES_THIS, 0); }
		public ThisExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterThisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitThisExpr(this);
		}
	}
	public static class ArrayAccessStmtContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode L_SQUARE() { return getToken(JavaParser.L_SQUARE, 0); }
		public TerminalNode R_SQUARE() { return getToken(JavaParser.R_SQUARE, 0); }
		public ArrayAccessStmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArrayAccessStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArrayAccessStmt(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(203);
				match(L_PAREN);
				setState(204);
				expr(0);
				setState(205);
				match(R_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new NegateExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(SUB_OP);
				setState(208);
				expr(22);
				}
				break;
			case 3:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(NOT_OP);
				setState(210);
				expr(21);
				}
				break;
			case 4:
				{
				_localctx = new VarAssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(ID);
				setState(212);
				match(AS_OP);
				setState(213);
				expr(14);
				}
				break;
			case 5:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				literal();
				}
				break;
			case 6:
				{
				_localctx = new VarAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new ThisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				match(RES_THIS);
				}
				break;
			case 8:
				{
				_localctx = new GlobalMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(ID);
				setState(218);
				match(L_PAREN);
				setState(220);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PAREN) | (1L << NOT_OP) | (1L << SUB_OP) | (1L << RES_THIS) | (1L << RES_READ_INT) | (1L << RES_NEW) | (1L << RES_READ_LINE) | (1L << RES_NULL) | (1L << BOOL) | (1L << STRING) | (1L << INT) | (1L << ID))) != 0)) {
					{
					setState(219);
					args();
					}
				}

				setState(222);
				match(R_PAREN);
				}
				break;
			case 9:
				{
				_localctx = new ReadIntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(RES_READ_INT);
				setState(224);
				match(L_PAREN);
				setState(225);
				match(R_PAREN);
				}
				break;
			case 10:
				{
				_localctx = new ReadLineExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				match(RES_READ_LINE);
				setState(227);
				match(L_PAREN);
				setState(228);
				match(R_PAREN);
				}
				break;
			case 11:
				{
				_localctx = new NewObjExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(RES_NEW);
				setState(230);
				match(ID);
				setState(231);
				match(L_PAREN);
				setState(232);
				match(R_PAREN);
				}
				break;
			case 12:
				{
				_localctx = new NewArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				match(RES_NEW);
				setState(236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(234);
					match(ID);
					}
					break;
				case 2:
					{
					setState(235);
					type(0);
					}
					break;
				}
				setState(238);
				match(L_SQUARE);
				setState(239);
				expr(0);
				setState(240);
				match(R_SQUARE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(290);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(245);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL_OP) | (1L << DIV_OP) | (1L << MOD_OP))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(246);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(248);
						_la = _input.LA(1);
						if ( !(_la==ADD_OP || _la==SUB_OP) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(249);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(251);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT_OP) | (1L << GT_OP) | (1L << LEQ_OP) | (1L << GEQ_OP))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(252);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(254);
						_la = _input.LA(1);
						if ( !(_la==EQ_OP || _la==NEQ_OP) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(255);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(256);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(257);
						match(AND_OP);
						setState(258);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(260);
						match(OR_OP);
						setState(261);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new PropAssignExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(263);
						match(DOT);
						setState(264);
						match(ID);
						setState(265);
						match(AS_OP);
						setState(266);
						expr(14);
						}
						break;
					case 8:
						{
						_localctx = new ArrayAssignExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(267);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(268);
						match(L_SQUARE);
						setState(269);
						expr(0);
						setState(270);
						match(R_SQUARE);
						setState(271);
						match(AS_OP);
						setState(272);
						expr(13);
						}
						break;
					case 9:
						{
						_localctx = new PropAccessExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(275);
						match(DOT);
						setState(276);
						match(ID);
						}
						break;
					case 10:
						{
						_localctx = new ArrayAccessStmtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(277);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(278);
						match(L_SQUARE);
						setState(279);
						expr(0);
						setState(280);
						match(R_SQUARE);
						}
						break;
					case 11:
						{
						_localctx = new ObjectMethodCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(282);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(283);
						match(DOT);
						setState(284);
						match(ID);
						setState(285);
						match(L_PAREN);
						setState(287);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PAREN) | (1L << NOT_OP) | (1L << SUB_OP) | (1L << RES_THIS) | (1L << RES_READ_INT) | (1L << RES_NEW) | (1L << RES_READ_LINE) | (1L << RES_NULL) | (1L << BOOL) | (1L << STRING) | (1L << INT) | (1L << ID))) != 0)) {
							{
							setState(286);
							args();
							}
						}

						setState(289);
						match(R_PAREN);
						}
						break;
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			expr(0);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(296);
				match(COMMA);
				setState(297);
				expr(0);
				}
				}
				setState(302);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(JavaParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(JavaParser.STRING, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode RES_NULL() { return getToken(JavaParser.RES_NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RES_NULL) | (1L << BOOL) | (1L << STRING) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u0134\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2"+
		"\16\2#\3\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63"+
		"\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5<\n\5\3\5\3\5\3\5\7\5A\n\5\f\5\16"+
		"\5D\13\5\3\6\3\6\5\6H\n\6\3\6\3\6\3\6\5\6M\n\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\b\3\b\3\b\3\b\5\ba\n\b\3\b\3\b"+
		"\3\b\3\b\7\bg\n\b\f\b\16\bj\13\b\5\bl\n\b\3\b\3\b\3\b\7\bq\n\b\f\b\16"+
		"\bt\13\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t|\n\t\f\t\16\t\177\13\t\3\t\3\t\3"+
		"\n\3\n\5\n\u0085\n\n\3\n\3\n\3\n\5\n\u008a\n\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\7\13\u0092\n\13\f\13\16\13\u0095\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00a2\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00ad\n\f\3\f\3\f\3\f\3\f\5\f\u00b3\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00be\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c8\n\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00df\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ef\n\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00f5\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0122\n\16\3\16\7\16\u0125\n\16\f"+
		"\16\16\16\u0128\13\16\3\17\3\17\3\17\7\17\u012d\n\17\f\17\16\17\u0130"+
		"\13\17\3\20\3\20\3\20\2\4\b\32\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\7\3\2\32\34\3\2\30\31\3\2\17\22\3\2\23\24\4\2..\63\65\u0160\2!\3"+
		"\2\2\2\4)\3\2\2\2\6+\3\2\2\2\b;\3\2\2\2\nG\3\2\2\2\fQ\3\2\2\2\16\\\3\2"+
		"\2\2\20w\3\2\2\2\22\u0084\3\2\2\2\24\u008e\3\2\2\2\26\u00c7\3\2\2\2\30"+
		"\u00c9\3\2\2\2\32\u00f4\3\2\2\2\34\u0129\3\2\2\2\36\u0131\3\2\2\2 \"\5"+
		"\4\3\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%*\5\6\4\2&"+
		"*\5\n\6\2\'*\5\16\b\2(*\5\20\t\2)%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2"+
		"\2\2*\5\3\2\2\2+,\5\b\5\2,\61\7\66\2\2-.\7\f\2\2.\60\7\66\2\2/-\3\2\2"+
		"\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2"+
		"\64\65\7\r\2\2\65\7\3\2\2\2\66\67\b\5\1\2\67<\7$\2\28<\7-\2\29<\7\37\2"+
		"\2:<\7\66\2\2;\66\3\2\2\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<B\3\2\2\2=>\f"+
		"\3\2\2>?\7\6\2\2?A\7\7\2\2@=\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\t"+
		"\3\2\2\2DB\3\2\2\2EH\5\b\5\2FH\7\36\2\2GE\3\2\2\2GF\3\2\2\2HI\3\2\2\2"+
		"IJ\7\66\2\2JL\7\b\2\2KM\5\f\7\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\t\2"+
		"\2OP\5\24\13\2P\13\3\2\2\2QR\5\b\5\2RY\7\66\2\2ST\7\f\2\2TU\5\b\5\2UV"+
		"\7\66\2\2VX\3\2\2\2WS\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\r\3\2\2\2"+
		"[Y\3\2\2\2\\]\7%\2\2]`\7\66\2\2^_\7&\2\2_a\7\66\2\2`^\3\2\2\2`a\3\2\2"+
		"\2ak\3\2\2\2bc\7+\2\2ch\7\66\2\2de\7\f\2\2eg\7\66\2\2fd\3\2\2\2gj\3\2"+
		"\2\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2kb\3\2\2\2kl\3\2\2\2lm\3\2"+
		"\2\2mr\7\n\2\2nq\5\6\4\2oq\5\n\6\2pn\3\2\2\2po\3\2\2\2qt\3\2\2\2rp\3\2"+
		"\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\13\2\2v\17\3\2\2\2wx\7*\2\2xy\7"+
		"\66\2\2y}\7\n\2\2z|\5\22\n\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2"+
		"\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\13\2\2\u0081\21\3\2\2\2\u0082"+
		"\u0085\5\b\5\2\u0083\u0085\7\36\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\66\2\2\u0087\u0089\7\b\2\2\u0088"+
		"\u008a\5\f\7\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008c\7\t\2\2\u008c\u008d\7\r\2\2\u008d\23\3\2\2\2\u008e\u0093"+
		"\7\n\2\2\u008f\u0092\5\6\4\2\u0090\u0092\5\26\f\2\u0091\u008f\3\2\2\2"+
		"\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\13\2\2"+
		"\u0097\25\3\2\2\2\u0098\u0099\5\32\16\2\u0099\u009a\7\r\2\2\u009a\u00c8"+
		"\3\2\2\2\u009b\u009c\7\'\2\2\u009c\u009d\7\b\2\2\u009d\u009e\5\32\16\2"+
		"\u009e\u009f\7\t\2\2\u009f\u00a1\5\26\f\2\u00a0\u00a2\5\30\r\2\u00a1\u00a0"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00c8\3\2\2\2\u00a3\u00a4\7!\2\2\u00a4"+
		"\u00a5\7\b\2\2\u00a5\u00a6\5\32\16\2\u00a6\u00a7\7\t\2\2\u00a7\u00a8\5"+
		"\26\f\2\u00a8\u00c8\3\2\2\2\u00a9\u00aa\7/\2\2\u00aa\u00ac\7\b\2\2\u00ab"+
		"\u00ad\5\32\16\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3"+
		"\2\2\2\u00ae\u00af\7\r\2\2\u00af\u00b0\5\32\16\2\u00b0\u00b2\7\r\2\2\u00b1"+
		"\u00b3\5\32\16\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3"+
		"\2\2\2\u00b4\u00b5\7\t\2\2\u00b5\u00b6\5\26\f\2\u00b6\u00c8\3\2\2\2\u00b7"+
		"\u00b8\7\"\2\2\u00b8\u00c8\7\r\2\2\u00b9\u00ba\7\62\2\2\u00ba\u00c8\7"+
		"\r\2\2\u00bb\u00bd\7\60\2\2\u00bc\u00be\5\32\16\2\u00bd\u00bc\3\2\2\2"+
		"\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c8\7\r\2\2\u00c0\u00c1"+
		"\7\61\2\2\u00c1\u00c2\7\b\2\2\u00c2\u00c3\5\32\16\2\u00c3\u00c4\7\t\2"+
		"\2\u00c4\u00c5\7\r\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c8\5\24\13\2\u00c7"+
		"\u0098\3\2\2\2\u00c7\u009b\3\2\2\2\u00c7\u00a3\3\2\2\2\u00c7\u00a9\3\2"+
		"\2\2\u00c7\u00b7\3\2\2\2\u00c7\u00b9\3\2\2\2\u00c7\u00bb\3\2\2\2\u00c7"+
		"\u00c0\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\27\3\2\2\2\u00c9\u00ca\7,\2\2"+
		"\u00ca\u00cb\5\26\f\2\u00cb\31\3\2\2\2\u00cc\u00cd\b\16\1\2\u00cd\u00ce"+
		"\7\b\2\2\u00ce\u00cf\5\32\16\2\u00cf\u00d0\7\t\2\2\u00d0\u00f5\3\2\2\2"+
		"\u00d1\u00d2\7\31\2\2\u00d2\u00f5\5\32\16\30\u00d3\u00d4\7\27\2\2\u00d4"+
		"\u00f5\5\32\16\27\u00d5\u00d6\7\66\2\2\u00d6\u00d7\7\35\2\2\u00d7\u00f5"+
		"\5\32\16\20\u00d8\u00f5\5\36\20\2\u00d9\u00f5\7\66\2\2\u00da\u00f5\7 "+
		"\2\2\u00db\u00dc\7\66\2\2\u00dc\u00de\7\b\2\2\u00dd\u00df\5\34\17\2\u00de"+
		"\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00f5\7\t"+
		"\2\2\u00e1\u00e2\7#\2\2\u00e2\u00e3\7\b\2\2\u00e3\u00f5\7\t\2\2\u00e4"+
		"\u00e5\7)\2\2\u00e5\u00e6\7\b\2\2\u00e6\u00f5\7\t\2\2\u00e7\u00e8\7(\2"+
		"\2\u00e8\u00e9\7\66\2\2\u00e9\u00ea\7\b\2\2\u00ea\u00f5\7\t\2\2\u00eb"+
		"\u00ee\7(\2\2\u00ec\u00ef\7\66\2\2\u00ed\u00ef\5\b\5\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7\6\2\2\u00f1"+
		"\u00f2\5\32\16\2\u00f2\u00f3\7\7\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00cc\3"+
		"\2\2\2\u00f4\u00d1\3\2\2\2\u00f4\u00d3\3\2\2\2\u00f4\u00d5\3\2\2\2\u00f4"+
		"\u00d8\3\2\2\2\u00f4\u00d9\3\2\2\2\u00f4\u00da\3\2\2\2\u00f4\u00db\3\2"+
		"\2\2\u00f4\u00e1\3\2\2\2\u00f4\u00e4\3\2\2\2\u00f4\u00e7\3\2\2\2\u00f4"+
		"\u00eb\3\2\2\2\u00f5\u0126\3\2\2\2\u00f6\u00f7\f\26\2\2\u00f7\u00f8\t"+
		"\2\2\2\u00f8\u0125\5\32\16\27\u00f9\u00fa\f\25\2\2\u00fa\u00fb\t\3\2\2"+
		"\u00fb\u0125\5\32\16\26\u00fc\u00fd\f\24\2\2\u00fd\u00fe\t\4\2\2\u00fe"+
		"\u0125\5\32\16\25\u00ff\u0100\f\23\2\2\u0100\u0101\t\5\2\2\u0101\u0125"+
		"\5\32\16\24\u0102\u0103\f\22\2\2\u0103\u0104\7\25\2\2\u0104\u0125\5\32"+
		"\16\23\u0105\u0106\f\21\2\2\u0106\u0107\7\26\2\2\u0107\u0125\5\32\16\22"+
		"\u0108\u0109\f\17\2\2\u0109\u010a\7\16\2\2\u010a\u010b\7\66\2\2\u010b"+
		"\u010c\7\35\2\2\u010c\u0125\5\32\16\20\u010d\u010e\f\16\2\2\u010e\u010f"+
		"\7\6\2\2\u010f\u0110\5\32\16\2\u0110\u0111\7\7\2\2\u0111\u0112\7\35\2"+
		"\2\u0112\u0113\5\32\16\17\u0113\u0125\3\2\2\2\u0114\u0115\f\13\2\2\u0115"+
		"\u0116\7\16\2\2\u0116\u0125\7\66\2\2\u0117\u0118\f\n\2\2\u0118\u0119\7"+
		"\6\2\2\u0119\u011a\5\32\16\2\u011a\u011b\7\7\2\2\u011b\u0125\3\2\2\2\u011c"+
		"\u011d\f\7\2\2\u011d\u011e\7\16\2\2\u011e\u011f\7\66\2\2\u011f\u0121\7"+
		"\b\2\2\u0120\u0122\5\34\17\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0125\7\t\2\2\u0124\u00f6\3\2\2\2\u0124\u00f9\3\2"+
		"\2\2\u0124\u00fc\3\2\2\2\u0124\u00ff\3\2\2\2\u0124\u0102\3\2\2\2\u0124"+
		"\u0105\3\2\2\2\u0124\u0108\3\2\2\2\u0124\u010d\3\2\2\2\u0124\u0114\3\2"+
		"\2\2\u0124\u0117\3\2\2\2\u0124\u011c\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\33\3\2\2\2\u0128\u0126\3\2\2"+
		"\2\u0129\u012e\5\32\16\2\u012a\u012b\7\f\2\2\u012b\u012d\5\32\16\2\u012c"+
		"\u012a\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\35\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\t\6\2\2\u0132\37"+
		"\3\2\2\2 #)\61;BGLY`hkpr}\u0084\u0089\u0091\u0093\u00a1\u00ac\u00b2\u00bd"+
		"\u00c7\u00de\u00ee\u00f4\u0121\u0124\u0126\u012e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}