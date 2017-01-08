// Generated from JavaParser.g4 by ANTLR 4.5.3

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
		RULE_program = 0, RULE_decl = 1, RULE_var_decl = 2, RULE_type = 3, RULE_array_unit = 4, 
		RULE_func_decl = 5, RULE_params = 6, RULE_class_decl = 7, RULE_parent_class = 8, 
		RULE_interface_use = 9, RULE_interface_decl = 10, RULE_method_sig = 11, 
		RULE_stmt_block = 12, RULE_stmt = 13, RULE_else_stmt = 14, RULE_expr = 15, 
		RULE_method_call = 16, RULE_array_struct = 17, RULE_args = 18;
	public static final String[] ruleNames = {
		"program", "decl", "var_decl", "type", "array_unit", "func_decl", "params", 
		"class_decl", "parent_class", "interface_use", "interface_decl", "method_sig", 
		"stmt_block", "stmt", "else_stmt", "expr", "method_call", "array_struct", 
		"args"
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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				decl();
				}
				}
				setState(41); 
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
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				func_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				class_decl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
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
			setState(49);
			type();
			setState(50);
			match(ID);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(51);
				match(COMMA);
				setState(52);
				match(ID);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
		public List<Array_unitContext> array_unit() {
			return getRuleContexts(Array_unitContext.class);
		}
		public Array_unitContext array_unit(int i) {
			return getRuleContext(Array_unitContext.class,i);
		}
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
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RES_STRING) | (1L << RES_INT) | (1L << RES_BOOLEAN) | (1L << ID))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(61);
					array_unit();
					}
					}
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==L_SQUARE );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(RES_INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(RES_BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(RES_STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				match(ID);
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

	public static class Array_unitContext extends ParserRuleContext {
		public TerminalNode L_SQUARE() { return getToken(JavaParser.L_SQUARE, 0); }
		public TerminalNode R_SQUARE() { return getToken(JavaParser.R_SQUARE, 0); }
		public Array_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArray_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArray_unit(this);
		}
	}

	public final Array_unitContext array_unit() throws RecognitionException {
		Array_unitContext _localctx = new Array_unitContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(L_SQUARE);
			setState(73);
			match(R_SQUARE);
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
		enterRule(_localctx, 10, RULE_func_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			switch (_input.LA(1)) {
			case RES_STRING:
			case RES_INT:
			case RES_BOOLEAN:
			case ID:
				{
				setState(75);
				type();
				}
				break;
			case RES_VOID:
				{
				setState(76);
				match(RES_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(79);
			match(ID);
			setState(80);
			match(L_PAREN);
			setState(82);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RES_STRING) | (1L << RES_INT) | (1L << RES_BOOLEAN) | (1L << ID))) != 0)) {
				{
				setState(81);
				params();
				}
			}

			setState(84);
			match(R_PAREN);
			setState(85);
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
		enterRule(_localctx, 12, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			type();
			setState(88);
			match(ID);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(89);
				match(COMMA);
				setState(90);
				type();
				setState(91);
				match(ID);
				}
				}
				setState(97);
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
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode L_CURL() { return getToken(JavaParser.L_CURL, 0); }
		public TerminalNode R_CURL() { return getToken(JavaParser.R_CURL, 0); }
		public Parent_classContext parent_class() {
			return getRuleContext(Parent_classContext.class,0);
		}
		public Interface_useContext interface_use() {
			return getRuleContext(Interface_useContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_class_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(RES_CLASS);
			setState(99);
			match(ID);
			setState(101);
			_la = _input.LA(1);
			if (_la==RES_EXTENDS) {
				{
				setState(100);
				parent_class();
				}
			}

			setState(104);
			_la = _input.LA(1);
			if (_la==RES_IMPLEMENTS) {
				{
				setState(103);
				interface_use();
				}
			}

			setState(106);
			match(L_CURL);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RES_VOID) | (1L << RES_STRING) | (1L << RES_INT) | (1L << RES_BOOLEAN) | (1L << ID))) != 0)) {
				{
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(107);
					var_decl();
					}
					break;
				case 2:
					{
					setState(108);
					func_decl();
					}
					break;
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
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

	public static class Parent_classContext extends ParserRuleContext {
		public TerminalNode RES_EXTENDS() { return getToken(JavaParser.RES_EXTENDS, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public Parent_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterParent_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitParent_class(this);
		}
	}

	public final Parent_classContext parent_class() throws RecognitionException {
		Parent_classContext _localctx = new Parent_classContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parent_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(RES_EXTENDS);
			setState(117);
			match(ID);
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

	public static class Interface_useContext extends ParserRuleContext {
		public TerminalNode RES_IMPLEMENTS() { return getToken(JavaParser.RES_IMPLEMENTS, 0); }
		public List<TerminalNode> ID() { return getTokens(JavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public Interface_useContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterface_use(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterface_use(this);
		}
	}

	public final Interface_useContext interface_use() throws RecognitionException {
		Interface_useContext _localctx = new Interface_useContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_interface_use);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(RES_IMPLEMENTS);
			setState(120);
			match(ID);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(121);
				match(COMMA);
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
		enterRule(_localctx, 20, RULE_interface_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(RES_INTERFACE);
			setState(129);
			match(ID);
			setState(130);
			match(L_CURL);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RES_VOID) | (1L << RES_STRING) | (1L << RES_INT) | (1L << RES_BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(131);
				method_sig();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
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
		enterRule(_localctx, 22, RULE_method_sig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			switch (_input.LA(1)) {
			case RES_STRING:
			case RES_INT:
			case RES_BOOLEAN:
			case ID:
				{
				setState(139);
				type();
				}
				break;
			case RES_VOID:
				{
				setState(140);
				match(RES_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(143);
			match(ID);
			setState(144);
			match(L_PAREN);
			setState(146);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RES_STRING) | (1L << RES_INT) | (1L << RES_BOOLEAN) | (1L << ID))) != 0)) {
				{
				setState(145);
				params();
				}
			}

			setState(148);
			match(R_PAREN);
			setState(149);
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
		enterRule(_localctx, 24, RULE_stmt_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(L_CURL);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PAREN) | (1L << L_CURL) | (1L << NOT_OP) | (1L << SUB_OP) | (1L << RES_STRING) | (1L << RES_THIS) | (1L << RES_WHILE) | (1L << RES_BREAK) | (1L << RES_READ_INT) | (1L << RES_INT) | (1L << RES_IF) | (1L << RES_NEW) | (1L << RES_READ_LINE) | (1L << RES_BOOLEAN) | (1L << RES_NULL) | (1L << RES_FOR) | (1L << RES_RETURN) | (1L << RES_PRINT) | (1L << RES_CONTINUE) | (1L << BOOL) | (1L << STRING) | (1L << INT) | (1L << ID))) != 0)) {
				{
				setState(154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(152);
					var_decl();
					}
					break;
				case 2:
					{
					setState(153);
					stmt();
					}
					break;
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
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
	public static class IfElseStmtContext extends StmtContext {
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
		public IfElseStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIfElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIfElseStmt(this);
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
	public static class VoidReturnStmtContext extends StmtContext {
		public TerminalNode RES_RETURN() { return getToken(JavaParser.RES_RETURN, 0); }
		public TerminalNode SEMI_COL() { return getToken(JavaParser.SEMI_COL, 0); }
		public VoidReturnStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVoidReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVoidReturnStmt(this);
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
	public static class NonVoidReturnStmtContext extends StmtContext {
		public TerminalNode RES_RETURN() { return getToken(JavaParser.RES_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI_COL() { return getToken(JavaParser.SEMI_COL, 0); }
		public NonVoidReturnStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNonVoidReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNonVoidReturnStmt(this);
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

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stmt);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				expr(0);
				setState(162);
				match(SEMI_COL);
				}
				break;
			case 2:
				_localctx = new IfElseStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(RES_IF);
				setState(165);
				match(L_PAREN);
				setState(166);
				expr(0);
				setState(167);
				match(R_PAREN);
				setState(168);
				stmt();
				setState(169);
				else_stmt();
				}
				break;
			case 3:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(RES_IF);
				setState(172);
				match(L_PAREN);
				setState(173);
				expr(0);
				setState(174);
				match(R_PAREN);
				setState(175);
				stmt();
				}
				break;
			case 4:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(RES_WHILE);
				setState(178);
				match(L_PAREN);
				setState(179);
				expr(0);
				setState(180);
				match(R_PAREN);
				setState(181);
				stmt();
				}
				break;
			case 5:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				match(RES_FOR);
				setState(184);
				match(L_PAREN);
				setState(186);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PAREN) | (1L << NOT_OP) | (1L << SUB_OP) | (1L << RES_THIS) | (1L << RES_READ_INT) | (1L << RES_NEW) | (1L << RES_READ_LINE) | (1L << RES_NULL) | (1L << BOOL) | (1L << STRING) | (1L << INT) | (1L << ID))) != 0)) {
					{
					setState(185);
					expr(0);
					}
				}

				setState(188);
				match(SEMI_COL);
				setState(189);
				expr(0);
				setState(190);
				match(SEMI_COL);
				setState(192);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PAREN) | (1L << NOT_OP) | (1L << SUB_OP) | (1L << RES_THIS) | (1L << RES_READ_INT) | (1L << RES_NEW) | (1L << RES_READ_LINE) | (1L << RES_NULL) | (1L << BOOL) | (1L << STRING) | (1L << INT) | (1L << ID))) != 0)) {
					{
					setState(191);
					expr(0);
					}
				}

				setState(194);
				match(R_PAREN);
				setState(195);
				stmt();
				}
				break;
			case 6:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				match(RES_BREAK);
				setState(198);
				match(SEMI_COL);
				}
				break;
			case 7:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(199);
				match(RES_CONTINUE);
				setState(200);
				match(SEMI_COL);
				}
				break;
			case 8:
				_localctx = new NonVoidReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(201);
				match(RES_RETURN);
				setState(202);
				expr(0);
				setState(203);
				match(SEMI_COL);
				}
				break;
			case 9:
				_localctx = new VoidReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(205);
				match(RES_RETURN);
				setState(206);
				match(SEMI_COL);
				}
				break;
			case 10:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(207);
				match(RES_PRINT);
				setState(208);
				match(L_PAREN);
				setState(209);
				expr(0);
				setState(210);
				match(R_PAREN);
				setState(211);
				match(SEMI_COL);
				}
				break;
			case 11:
				_localctx = new CodeBlockContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(213);
				stmt_block();
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
		enterRule(_localctx, 28, RULE_else_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(RES_ELSE);
			setState(217);
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
	public static class BoolLiteralExprContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(JavaParser.BOOL, 0); }
		public BoolLiteralExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBoolLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBoolLiteralExpr(this);
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
	public static class ObjectPropertyContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public ObjectPropertyContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterObjectProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitObjectProperty(this);
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
	public static class ArrayAccessExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Array_structContext array_struct() {
			return getRuleContext(Array_structContext.class,0);
		}
		public ArrayAccessExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArrayAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArrayAccessExpr(this);
		}
	}
	public static class StringLiteralExprContext extends ExprContext {
		public TerminalNode STRING() { return getToken(JavaParser.STRING, 0); }
		public StringLiteralExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterStringLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitStringLiteralExpr(this);
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
	public static class AssignExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AS_OP() { return getToken(JavaParser.AS_OP, 0); }
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAssignExpr(this);
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
	public static class NullLiteralExprContext extends ExprContext {
		public TerminalNode RES_NULL() { return getToken(JavaParser.RES_NULL, 0); }
		public NullLiteralExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNullLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNullLiteralExpr(this);
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
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
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
	public static class IntLiteralExprContext extends ExprContext {
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public IntLiteralExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIntLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIntLiteralExpr(this);
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
		public Array_structContext array_struct() {
			return getRuleContext(Array_structContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode RES_INT() { return getToken(JavaParser.RES_INT, 0); }
		public TerminalNode RES_BOOLEAN() { return getToken(JavaParser.RES_BOOLEAN, 0); }
		public TerminalNode RES_STRING() { return getToken(JavaParser.RES_STRING, 0); }
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
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
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

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(220);
				match(L_PAREN);
				setState(221);
				expr(0);
				setState(222);
				match(R_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new NegateExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(SUB_OP);
				setState(225);
				expr(23);
				}
				break;
			case 3:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				match(NOT_OP);
				setState(227);
				expr(22);
				}
				break;
			case 4:
				{
				_localctx = new GlobalMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				method_call();
				}
				break;
			case 5:
				{
				_localctx = new ThisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(RES_THIS);
				}
				break;
			case 6:
				{
				_localctx = new NewArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				match(RES_NEW);
				setState(231);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RES_STRING) | (1L << RES_INT) | (1L << RES_BOOLEAN) | (1L << ID))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(232);
				array_struct();
				}
				break;
			case 7:
				{
				_localctx = new ReadIntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				match(RES_READ_INT);
				setState(234);
				match(L_PAREN);
				setState(235);
				match(R_PAREN);
				}
				break;
			case 8:
				{
				_localctx = new ReadLineExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				match(RES_READ_LINE);
				setState(237);
				match(L_PAREN);
				setState(238);
				match(R_PAREN);
				}
				break;
			case 9:
				{
				_localctx = new NewObjExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				match(RES_NEW);
				setState(240);
				match(ID);
				setState(241);
				match(L_PAREN);
				setState(242);
				match(R_PAREN);
				}
				break;
			case 10:
				{
				_localctx = new VarAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				match(ID);
				}
				break;
			case 11:
				{
				_localctx = new BoolLiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				match(BOOL);
				}
				break;
			case 12:
				{
				_localctx = new StringLiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				match(STRING);
				}
				break;
			case 13:
				{
				_localctx = new IntLiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246);
				match(INT);
				}
				break;
			case 14:
				{
				_localctx = new NullLiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				match(RES_NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(279);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(251);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL_OP) | (1L << DIV_OP) | (1L << MOD_OP))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(252);
						expr(22);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(254);
						_la = _input.LA(1);
						if ( !(_la==ADD_OP || _la==SUB_OP) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(255);
						expr(21);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(256);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(257);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT_OP) | (1L << GT_OP) | (1L << LEQ_OP) | (1L << GEQ_OP))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(258);
						expr(20);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(260);
						_la = _input.LA(1);
						if ( !(_la==EQ_OP || _la==NEQ_OP) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(261);
						expr(19);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(263);
						match(AND_OP);
						setState(264);
						expr(18);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(265);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(266);
						match(OR_OP);
						setState(267);
						expr(17);
						}
						break;
					case 7:
						{
						_localctx = new AssignExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(269);
						match(AS_OP);
						setState(270);
						expr(16);
						}
						break;
					case 8:
						{
						_localctx = new ObjectPropertyContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(271);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(272);
						match(DOT);
						setState(273);
						expr(12);
						}
						break;
					case 9:
						{
						_localctx = new ArrayAccessExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(275);
						array_struct();
						}
						break;
					case 10:
						{
						_localctx = new ObjectMethodCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(276);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(277);
						match(DOT);
						setState(278);
						method_call();
						}
						break;
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Method_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode L_PAREN() { return getToken(JavaParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(JavaParser.R_PAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Array_structContext extends ParserRuleContext {
		public List<TerminalNode> L_SQUARE() { return getTokens(JavaParser.L_SQUARE); }
		public TerminalNode L_SQUARE(int i) {
			return getToken(JavaParser.L_SQUARE, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> R_SQUARE() { return getTokens(JavaParser.R_SQUARE); }
		public TerminalNode R_SQUARE(int i) {
			return getToken(JavaParser.R_SQUARE, i);
		}
		public Array_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArray_struct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArray_struct(this);
		}
	}

	public final Array_structContext array_struct() throws RecognitionException {
		Array_structContext _localctx = new Array_structContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array_struct);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(291);
					match(L_SQUARE);
					setState(292);
					expr(0);
					setState(293);
					match(R_SQUARE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(297); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 36, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			expr(0);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(300);
				match(COMMA);
				setState(301);
				expr(0);
				}
				}
				setState(306);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
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
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u0136\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\3\3\3\3\3\3\3\5\3\62\n\3"+
		"\3\4\3\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\3\5\3\5\6\5A\n\5\r\5"+
		"\16\5B\3\5\3\5\3\5\3\5\5\5I\n\5\3\6\3\6\3\6\3\7\3\7\5\7P\n\7\3\7\3\7\3"+
		"\7\5\7U\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b`\n\b\f\b\16\bc\13"+
		"\b\3\t\3\t\3\t\5\th\n\t\3\t\5\tk\n\t\3\t\3\t\3\t\7\tp\n\t\f\t\16\ts\13"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13~\n\13\f\13\16\13\u0081"+
		"\13\13\3\f\3\f\3\f\3\f\7\f\u0087\n\f\f\f\16\f\u008a\13\f\3\f\3\f\3\r\3"+
		"\r\5\r\u0090\n\r\3\r\3\r\3\r\5\r\u0095\n\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\7\16\u009d\n\16\f\16\16\16\u00a0\13\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bd\n\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00c3\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d9\n\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00fb\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u011a\n\21\f\21\16\21\u011d\13\21"+
		"\3\22\3\22\3\22\5\22\u0122\n\22\3\22\3\22\3\23\3\23\3\23\3\23\6\23\u012a"+
		"\n\23\r\23\16\23\u012b\3\24\3\24\3\24\7\24\u0131\n\24\f\24\16\24\u0134"+
		"\13\24\3\24\2\3 \25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\7\6"+
		"\2\37\37$$--\66\66\3\2\32\34\3\2\30\31\3\2\17\22\3\2\23\24\u015f\2)\3"+
		"\2\2\2\4\61\3\2\2\2\6\63\3\2\2\2\bH\3\2\2\2\nJ\3\2\2\2\fO\3\2\2\2\16Y"+
		"\3\2\2\2\20d\3\2\2\2\22v\3\2\2\2\24y\3\2\2\2\26\u0082\3\2\2\2\30\u008f"+
		"\3\2\2\2\32\u0099\3\2\2\2\34\u00d8\3\2\2\2\36\u00da\3\2\2\2 \u00fa\3\2"+
		"\2\2\"\u011e\3\2\2\2$\u0129\3\2\2\2&\u012d\3\2\2\2(*\5\4\3\2)(\3\2\2\2"+
		"*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-\62\5\6\4\2.\62\5\f\7\2/\62"+
		"\5\20\t\2\60\62\5\26\f\2\61-\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2"+
		"\2\2\62\5\3\2\2\2\63\64\5\b\5\2\649\7\66\2\2\65\66\7\f\2\2\668\7\66\2"+
		"\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<"+
		"=\7\r\2\2=\7\3\2\2\2>@\t\2\2\2?A\5\n\6\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2"+
		"BC\3\2\2\2CI\3\2\2\2DI\7$\2\2EI\7-\2\2FI\7\37\2\2GI\7\66\2\2H>\3\2\2\2"+
		"HD\3\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\t\3\2\2\2JK\7\6\2\2KL\7\7\2"+
		"\2L\13\3\2\2\2MP\5\b\5\2NP\7\36\2\2OM\3\2\2\2ON\3\2\2\2PQ\3\2\2\2QR\7"+
		"\66\2\2RT\7\b\2\2SU\5\16\b\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\t\2\2W"+
		"X\5\32\16\2X\r\3\2\2\2YZ\5\b\5\2Za\7\66\2\2[\\\7\f\2\2\\]\5\b\5\2]^\7"+
		"\66\2\2^`\3\2\2\2_[\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\17\3\2\2\2"+
		"ca\3\2\2\2de\7%\2\2eg\7\66\2\2fh\5\22\n\2gf\3\2\2\2gh\3\2\2\2hj\3\2\2"+
		"\2ik\5\24\13\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lq\7\n\2\2mp\5\6\4\2np\5\f"+
		"\7\2om\3\2\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2"+
		"\2\2tu\7\13\2\2u\21\3\2\2\2vw\7&\2\2wx\7\66\2\2x\23\3\2\2\2yz\7+\2\2z"+
		"\177\7\66\2\2{|\7\f\2\2|~\7\66\2\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\25\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7"+
		"*\2\2\u0083\u0084\7\66\2\2\u0084\u0088\7\n\2\2\u0085\u0087\5\30\r\2\u0086"+
		"\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\13\2\2\u008c"+
		"\27\3\2\2\2\u008d\u0090\5\b\5\2\u008e\u0090\7\36\2\2\u008f\u008d\3\2\2"+
		"\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\66\2\2\u0092"+
		"\u0094\7\b\2\2\u0093\u0095\5\16\b\2\u0094\u0093\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\t\2\2\u0097\u0098\7\r\2\2\u0098"+
		"\31\3\2\2\2\u0099\u009e\7\n\2\2\u009a\u009d\5\6\4\2\u009b\u009d\5\34\17"+
		"\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\7\13\2\2\u00a2\33\3\2\2\2\u00a3\u00a4\5 \21\2\u00a4\u00a5\7\r\2"+
		"\2\u00a5\u00d9\3\2\2\2\u00a6\u00a7\7\'\2\2\u00a7\u00a8\7\b\2\2\u00a8\u00a9"+
		"\5 \21\2\u00a9\u00aa\7\t\2\2\u00aa\u00ab\5\34\17\2\u00ab\u00ac\5\36\20"+
		"\2\u00ac\u00d9\3\2\2\2\u00ad\u00ae\7\'\2\2\u00ae\u00af\7\b\2\2\u00af\u00b0"+
		"\5 \21\2\u00b0\u00b1\7\t\2\2\u00b1\u00b2\5\34\17\2\u00b2\u00d9\3\2\2\2"+
		"\u00b3\u00b4\7!\2\2\u00b4\u00b5\7\b\2\2\u00b5\u00b6\5 \21\2\u00b6\u00b7"+
		"\7\t\2\2\u00b7\u00b8\5\34\17\2\u00b8\u00d9\3\2\2\2\u00b9\u00ba\7/\2\2"+
		"\u00ba\u00bc\7\b\2\2\u00bb\u00bd\5 \21\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7\r\2\2\u00bf\u00c0\5 \21\2\u00c0"+
		"\u00c2\7\r\2\2\u00c1\u00c3\5 \21\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\t\2\2\u00c5\u00c6\5\34\17\2\u00c6"+
		"\u00d9\3\2\2\2\u00c7\u00c8\7\"\2\2\u00c8\u00d9\7\r\2\2\u00c9\u00ca\7\62"+
		"\2\2\u00ca\u00d9\7\r\2\2\u00cb\u00cc\7\60\2\2\u00cc\u00cd\5 \21\2\u00cd"+
		"\u00ce\7\r\2\2\u00ce\u00d9\3\2\2\2\u00cf\u00d0\7\60\2\2\u00d0\u00d9\7"+
		"\r\2\2\u00d1\u00d2\7\61\2\2\u00d2\u00d3\7\b\2\2\u00d3\u00d4\5 \21\2\u00d4"+
		"\u00d5\7\t\2\2\u00d5\u00d6\7\r\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d9\5\32"+
		"\16\2\u00d8\u00a3\3\2\2\2\u00d8\u00a6\3\2\2\2\u00d8\u00ad\3\2\2\2\u00d8"+
		"\u00b3\3\2\2\2\u00d8\u00b9\3\2\2\2\u00d8\u00c7\3\2\2\2\u00d8\u00c9\3\2"+
		"\2\2\u00d8\u00cb\3\2\2\2\u00d8\u00cf\3\2\2\2\u00d8\u00d1\3\2\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\35\3\2\2\2\u00da\u00db\7,\2\2\u00db\u00dc\5\34\17"+
		"\2\u00dc\37\3\2\2\2\u00dd\u00de\b\21\1\2\u00de\u00df\7\b\2\2\u00df\u00e0"+
		"\5 \21\2\u00e0\u00e1\7\t\2\2\u00e1\u00fb\3\2\2\2\u00e2\u00e3\7\31\2\2"+
		"\u00e3\u00fb\5 \21\31\u00e4\u00e5\7\27\2\2\u00e5\u00fb\5 \21\30\u00e6"+
		"\u00fb\5\"\22\2\u00e7\u00fb\7 \2\2\u00e8\u00e9\7(\2\2\u00e9\u00ea\t\2"+
		"\2\2\u00ea\u00fb\5$\23\2\u00eb\u00ec\7#\2\2\u00ec\u00ed\7\b\2\2\u00ed"+
		"\u00fb\7\t\2\2\u00ee\u00ef\7)\2\2\u00ef\u00f0\7\b\2\2\u00f0\u00fb\7\t"+
		"\2\2\u00f1\u00f2\7(\2\2\u00f2\u00f3\7\66\2\2\u00f3\u00f4\7\b\2\2\u00f4"+
		"\u00fb\7\t\2\2\u00f5\u00fb\7\66\2\2\u00f6\u00fb\7\63\2\2\u00f7\u00fb\7"+
		"\64\2\2\u00f8\u00fb\7\65\2\2\u00f9\u00fb\7.\2\2\u00fa\u00dd\3\2\2\2\u00fa"+
		"\u00e2\3\2\2\2\u00fa\u00e4\3\2\2\2\u00fa\u00e6\3\2\2\2\u00fa\u00e7\3\2"+
		"\2\2\u00fa\u00e8\3\2\2\2\u00fa\u00eb\3\2\2\2\u00fa\u00ee\3\2\2\2\u00fa"+
		"\u00f1\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fa\u00f7\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u011b\3\2\2\2\u00fc"+
		"\u00fd\f\27\2\2\u00fd\u00fe\t\3\2\2\u00fe\u011a\5 \21\30\u00ff\u0100\f"+
		"\26\2\2\u0100\u0101\t\4\2\2\u0101\u011a\5 \21\27\u0102\u0103\f\25\2\2"+
		"\u0103\u0104\t\5\2\2\u0104\u011a\5 \21\26\u0105\u0106\f\24\2\2\u0106\u0107"+
		"\t\6\2\2\u0107\u011a\5 \21\25\u0108\u0109\f\23\2\2\u0109\u010a\7\25\2"+
		"\2\u010a\u011a\5 \21\24\u010b\u010c\f\22\2\2\u010c\u010d\7\26\2\2\u010d"+
		"\u011a\5 \21\23\u010e\u010f\f\21\2\2\u010f\u0110\7\35\2\2\u0110\u011a"+
		"\5 \21\22\u0111\u0112\f\r\2\2\u0112\u0113\7\16\2\2\u0113\u011a\5 \21\16"+
		"\u0114\u0115\f\20\2\2\u0115\u011a\5$\23\2\u0116\u0117\f\17\2\2\u0117\u0118"+
		"\7\16\2\2\u0118\u011a\5\"\22\2\u0119\u00fc\3\2\2\2\u0119\u00ff\3\2\2\2"+
		"\u0119\u0102\3\2\2\2\u0119\u0105\3\2\2\2\u0119\u0108\3\2\2\2\u0119\u010b"+
		"\3\2\2\2\u0119\u010e\3\2\2\2\u0119\u0111\3\2\2\2\u0119\u0114\3\2\2\2\u0119"+
		"\u0116\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c!\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7\66\2\2\u011f\u0121"+
		"\7\b\2\2\u0120\u0122\5&\24\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\7\t\2\2\u0124#\3\2\2\2\u0125\u0126\7\6\2\2"+
		"\u0126\u0127\5 \21\2\u0127\u0128\7\7\2\2\u0128\u012a\3\2\2\2\u0129\u0125"+
		"\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"%\3\2\2\2\u012d\u0132\5 \21\2\u012e\u012f\7\f\2\2\u012f\u0131\5 \21\2"+
		"\u0130\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133\'\3\2\2\2\u0134\u0132\3\2\2\2\35+\619BHOTagjoq\177\u0088"+
		"\u008f\u0094\u009c\u009e\u00bc\u00c2\u00d8\u00fa\u0119\u011b\u0121\u012b"+
		"\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}