// Generated from JavaScanner.g4 by ANTLR 4.5.3

    package compiler.grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaScanner extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS_", "BLOCK_COMMENT", "LINE_COMMENT", "L_SQUARE", "R_SQUARE", "L_PAREN", 
		"R_PAREN", "L_CURL", "R_CURL", "COMMA", "SEMI_COL", "DOT", "LT_OP", "GT_OP", 
		"LEQ_OP", "GEQ_OP", "EQ_OP", "NEQ_OP", "AND_OP", "OR_OP", "NOT_OP", "ADD_OP", 
		"SUB_OP", "MUL_OP", "DIV_OP", "MOD_OP", "AS_OP", "RES_VOID", "RES_STRING", 
		"RES_THIS", "RES_WHILE", "RES_BREAK", "RES_READ_INT", "RES_INT", "RES_CLASS", 
		"RES_EXTENDS", "RES_IF", "RES_NEW", "RES_READ_LINE", "RES_INTERFACE", 
		"RES_IMPLEMENTS", "RES_ELSE", "RES_BOOLEAN", "RES_NULL", "RES_FOR", "RES_RETURN", 
		"RES_PRINT", "RES_CONTINUE", "BOOL", "STRING", "INT", "ID", "ESC", "ALLOWED_CHARS", 
		"DIGIT", "ALL_LETTERS"
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


	public JavaScanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaScanner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\66\u0188\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\7\3|\n\3\f\3\16\3\177\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\7\4\u008a\n\4\f\4\16\4\u008d\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$"+
		"\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\5\62\u015a\n\62\3\63\3\63\3\63\7\63\u015f\n\63\f\63\16\63\u0162\13"+
		"\63\3\63\3\63\3\64\6\64\u0167\n\64\r\64\16\64\u0168\3\65\3\65\5\65\u016d"+
		"\n\65\3\65\3\65\3\65\7\65\u0172\n\65\f\65\16\65\u0175\13\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0181\n\66\3\67\3\67\38"+
		"\38\39\39\4}\u008b\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\2m\2o\2q\2\3\2\5\4\2\13\f\"\"\6\2\"#%(*]_\u0080\4\2C\\c"+
		"|\u0191\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3s\3\2\2\2\5"+
		"w\3\2\2\2\7\u0085\3\2\2\2\t\u0092\3\2\2\2\13\u0094\3\2\2\2\r\u0096\3\2"+
		"\2\2\17\u0098\3\2\2\2\21\u009a\3\2\2\2\23\u009c\3\2\2\2\25\u009e\3\2\2"+
		"\2\27\u00a0\3\2\2\2\31\u00a2\3\2\2\2\33\u00a4\3\2\2\2\35\u00a6\3\2\2\2"+
		"\37\u00a8\3\2\2\2!\u00ab\3\2\2\2#\u00ae\3\2\2\2%\u00b1\3\2\2\2\'\u00b4"+
		"\3\2\2\2)\u00b7\3\2\2\2+\u00ba\3\2\2\2-\u00bc\3\2\2\2/\u00be\3\2\2\2\61"+
		"\u00c0\3\2\2\2\63\u00c2\3\2\2\2\65\u00c4\3\2\2\2\67\u00c6\3\2\2\29\u00c8"+
		"\3\2\2\2;\u00cd\3\2\2\2=\u00d4\3\2\2\2?\u00d9\3\2\2\2A\u00df\3\2\2\2C"+
		"\u00e5\3\2\2\2E\u00ed\3\2\2\2G\u00f1\3\2\2\2I\u00f7\3\2\2\2K\u00ff\3\2"+
		"\2\2M\u0102\3\2\2\2O\u0106\3\2\2\2Q\u010f\3\2\2\2S\u0119\3\2\2\2U\u0124"+
		"\3\2\2\2W\u0129\3\2\2\2Y\u0131\3\2\2\2[\u0136\3\2\2\2]\u013a\3\2\2\2_"+
		"\u0141\3\2\2\2a\u0147\3\2\2\2c\u0159\3\2\2\2e\u015b\3\2\2\2g\u0166\3\2"+
		"\2\2i\u016c\3\2\2\2k\u0180\3\2\2\2m\u0182\3\2\2\2o\u0184\3\2\2\2q\u0186"+
		"\3\2\2\2st\t\2\2\2tu\3\2\2\2uv\b\2\2\2v\4\3\2\2\2wx\7\61\2\2xy\7,\2\2"+
		"y}\3\2\2\2z|\13\2\2\2{z\3\2\2\2|\177\3\2\2\2}~\3\2\2\2}{\3\2\2\2~\u0080"+
		"\3\2\2\2\177}\3\2\2\2\u0080\u0081\7,\2\2\u0081\u0082\7\61\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0084\b\3\2\2\u0084\6\3\2\2\2\u0085\u0086\7\61\2\2\u0086"+
		"\u0087\7\61\2\2\u0087\u008b\3\2\2\2\u0088\u008a\13\2\2\2\u0089\u0088\3"+
		"\2\2\2\u008a\u008d\3\2\2\2\u008b\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\f\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\b\4\2\2\u0091\b\3\2\2\2\u0092\u0093\7]\2\2\u0093\n\3"+
		"\2\2\2\u0094\u0095\7_\2\2\u0095\f\3\2\2\2\u0096\u0097\7*\2\2\u0097\16"+
		"\3\2\2\2\u0098\u0099\7+\2\2\u0099\20\3\2\2\2\u009a\u009b\7}\2\2\u009b"+
		"\22\3\2\2\2\u009c\u009d\7\177\2\2\u009d\24\3\2\2\2\u009e\u009f\7.\2\2"+
		"\u009f\26\3\2\2\2\u00a0\u00a1\7=\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7\60"+
		"\2\2\u00a3\32\3\2\2\2\u00a4\u00a5\7>\2\2\u00a5\34\3\2\2\2\u00a6\u00a7"+
		"\7@\2\2\u00a7\36\3\2\2\2\u00a8\u00a9\7>\2\2\u00a9\u00aa\7?\2\2\u00aa "+
		"\3\2\2\2\u00ab\u00ac\7@\2\2\u00ac\u00ad\7?\2\2\u00ad\"\3\2\2\2\u00ae\u00af"+
		"\7?\2\2\u00af\u00b0\7?\2\2\u00b0$\3\2\2\2\u00b1\u00b2\7#\2\2\u00b2\u00b3"+
		"\7?\2\2\u00b3&\3\2\2\2\u00b4\u00b5\7(\2\2\u00b5\u00b6\7(\2\2\u00b6(\3"+
		"\2\2\2\u00b7\u00b8\7~\2\2\u00b8\u00b9\7~\2\2\u00b9*\3\2\2\2\u00ba\u00bb"+
		"\7#\2\2\u00bb,\3\2\2\2\u00bc\u00bd\7-\2\2\u00bd.\3\2\2\2\u00be\u00bf\7"+
		"/\2\2\u00bf\60\3\2\2\2\u00c0\u00c1\7,\2\2\u00c1\62\3\2\2\2\u00c2\u00c3"+
		"\7\61\2\2\u00c3\64\3\2\2\2\u00c4\u00c5\7\'\2\2\u00c5\66\3\2\2\2\u00c6"+
		"\u00c7\7?\2\2\u00c78\3\2\2\2\u00c8\u00c9\7x\2\2\u00c9\u00ca\7q\2\2\u00ca"+
		"\u00cb\7k\2\2\u00cb\u00cc\7f\2\2\u00cc:\3\2\2\2\u00cd\u00ce\7U\2\2\u00ce"+
		"\u00cf\7v\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7p\2\2"+
		"\u00d2\u00d3\7i\2\2\u00d3<\3\2\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7j\2"+
		"\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7u\2\2\u00d8>\3\2\2\2\u00d9\u00da\7"+
		"y\2\2\u00da\u00db\7j\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de"+
		"\7g\2\2\u00de@\3\2\2\2\u00df\u00e0\7d\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2"+
		"\7g\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7m\2\2\u00e4B\3\2\2\2\u00e5\u00e6"+
		"\7t\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7f\2\2\u00e9"+
		"\u00ea\7K\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7v\2\2\u00ecD\3\2\2\2\u00ed"+
		"\u00ee\7k\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7v\2\2\u00f0F\3\2\2\2\u00f1"+
		"\u00f2\7e\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7u\2\2"+
		"\u00f5\u00f6\7u\2\2\u00f6H\3\2\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7z\2"+
		"\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd"+
		"\7f\2\2\u00fd\u00fe\7u\2\2\u00feJ\3\2\2\2\u00ff\u0100\7k\2\2\u0100\u0101"+
		"\7h\2\2\u0101L\3\2\2\2\u0102\u0103\7p\2\2\u0103\u0104\7g\2\2\u0104\u0105"+
		"\7y\2\2\u0105N\3\2\2\2\u0106\u0107\7t\2\2\u0107\u0108\7g\2\2\u0108\u0109"+
		"\7c\2\2\u0109\u010a\7f\2\2\u010a\u010b\7N\2\2\u010b\u010c\7k\2\2\u010c"+
		"\u010d\7p\2\2\u010d\u010e\7g\2\2\u010eP\3\2\2\2\u010f\u0110\7k\2\2\u0110"+
		"\u0111\7p\2\2\u0111\u0112\7v\2\2\u0112\u0113\7g\2\2\u0113\u0114\7t\2\2"+
		"\u0114\u0115\7h\2\2\u0115\u0116\7c\2\2\u0116\u0117\7e\2\2\u0117\u0118"+
		"\7g\2\2\u0118R\3\2\2\2\u0119\u011a\7k\2\2\u011a\u011b\7o\2\2\u011b\u011c"+
		"\7r\2\2\u011c\u011d\7n\2\2\u011d\u011e\7g\2\2\u011e\u011f\7o\2\2\u011f"+
		"\u0120\7g\2\2\u0120\u0121\7p\2\2\u0121\u0122\7v\2\2\u0122\u0123\7u\2\2"+
		"\u0123T\3\2\2\2\u0124\u0125\7g\2\2\u0125\u0126\7n\2\2\u0126\u0127\7u\2"+
		"\2\u0127\u0128\7g\2\2\u0128V\3\2\2\2\u0129\u012a\7d\2\2\u012a\u012b\7"+
		"q\2\2\u012b\u012c\7q\2\2\u012c\u012d\7n\2\2\u012d\u012e\7g\2\2\u012e\u012f"+
		"\7c\2\2\u012f\u0130\7p\2\2\u0130X\3\2\2\2\u0131\u0132\7p\2\2\u0132\u0133"+
		"\7w\2\2\u0133\u0134\7n\2\2\u0134\u0135\7n\2\2\u0135Z\3\2\2\2\u0136\u0137"+
		"\7h\2\2\u0137\u0138\7q\2\2\u0138\u0139\7t\2\2\u0139\\\3\2\2\2\u013a\u013b"+
		"\7t\2\2\u013b\u013c\7g\2\2\u013c\u013d\7v\2\2\u013d\u013e\7w\2\2\u013e"+
		"\u013f\7t\2\2\u013f\u0140\7p\2\2\u0140^\3\2\2\2\u0141\u0142\7r\2\2\u0142"+
		"\u0143\7t\2\2\u0143\u0144\7k\2\2\u0144\u0145\7p\2\2\u0145\u0146\7v\2\2"+
		"\u0146`\3\2\2\2\u0147\u0148\7e\2\2\u0148\u0149\7q\2\2\u0149\u014a\7p\2"+
		"\2\u014a\u014b\7v\2\2\u014b\u014c\7k\2\2\u014c\u014d\7p\2\2\u014d\u014e"+
		"\7w\2\2\u014e\u014f\7g\2\2\u014fb\3\2\2\2\u0150\u0151\7v\2\2\u0151\u0152"+
		"\7t\2\2\u0152\u0153\7w\2\2\u0153\u015a\7g\2\2\u0154\u0155\7h\2\2\u0155"+
		"\u0156\7c\2\2\u0156\u0157\7n\2\2\u0157\u0158\7u\2\2\u0158\u015a\7g\2\2"+
		"\u0159\u0150\3\2\2\2\u0159\u0154\3\2\2\2\u015ad\3\2\2\2\u015b\u0160\7"+
		"$\2\2\u015c\u015f\5k\66\2\u015d\u015f\5m\67\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7$\2\2\u0164"+
		"f\3\2\2\2\u0165\u0167\5o8\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169h\3\2\2\2\u016a\u016d\5q9\2\u016b"+
		"\u016d\7a\2\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d\u0173\3\2"+
		"\2\2\u016e\u0172\5q9\2\u016f\u0172\5o8\2\u0170\u0172\7a\2\2\u0171\u016e"+
		"\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174j\3\2\2\2\u0175\u0173\3\2\2\2"+
		"\u0176\u0177\7^\2\2\u0177\u0181\7p\2\2\u0178\u0179\7^\2\2\u0179\u0181"+
		"\7v\2\2\u017a\u017b\7^\2\2\u017b\u0181\7^\2\2\u017c\u017d\7^\2\2\u017d"+
		"\u0181\7$\2\2\u017e\u017f\7^\2\2\u017f\u0181\7)\2\2\u0180\u0176\3\2\2"+
		"\2\u0180\u0178\3\2\2\2\u0180\u017a\3\2\2\2\u0180\u017c\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0181l\3\2\2\2\u0182\u0183\t\3\2\2\u0183n\3\2\2\2\u0184\u0185"+
		"\4\62;\2\u0185p\3\2\2\2\u0186\u0187\t\4\2\2\u0187r\3\2\2\2\r\2}\u008b"+
		"\u0159\u015e\u0160\u0168\u016c\u0171\u0173\u0180\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}