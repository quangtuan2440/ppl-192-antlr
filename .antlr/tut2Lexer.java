// Generated from /home/tuanduong/Documents/192/PPL/test/tut2.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tut2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, KEY_RETURN=3, INTLIT=4, FLOATLIT=5, ID=6, LB=7, RB=8, 
		LRB=9, RRB=10, LP=11, RP=12, ADD=13, SUB=14, MUL=15, DIV=16, EQ=17, CM=18, 
		SM=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LOWERCASE", "UPPERCASE", "NUMBER", "INT", "FLOAT", "KEY_RETURN", "INTLIT", 
		"FLOATLIT", "ID", "LB", "RB", "LRB", "RRB", "LP", "RP", "ADD", "SUB", 
		"MUL", "DIV", "EQ", "CM", "SM", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'float'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "FLOAT", "KEY_RETURN", "INTLIT", "FLOATLIT", "ID", "LB", 
		"RB", "LRB", "RRB", "LP", "RP", "ADD", "SUB", "MUL", "DIV", "EQ", "CM", 
		"SM", "WS"
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


	public tut2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tut2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0081\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\6\bJ\n\b\r\b\16\bK\3\t\6\tO\n\t\r\t\16\tP\3\t\3"+
		"\t\6\tU\n\t\r\t\16\tV\3\n\3\n\3\n\7\n\\\n\n\f\n\16\n_\13\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\6\30|\n\30\r\30\16"+
		"\30}\3\30\3\30\2\2\31\3\2\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27"+
		"\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\3\2\6\3\2c|"+
		"\3\2C\\\3\2\62;\5\2\13\f\17\17\"\"\2\u0083\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\13;\3\2"+
		"\2\2\rA\3\2\2\2\17I\3\2\2\2\21N\3\2\2\2\23X\3\2\2\2\25`\3\2\2\2\27b\3"+
		"\2\2\2\31d\3\2\2\2\33f\3\2\2\2\35h\3\2\2\2\37j\3\2\2\2!l\3\2\2\2#n\3\2"+
		"\2\2%p\3\2\2\2\'r\3\2\2\2)t\3\2\2\2+v\3\2\2\2-x\3\2\2\2/{\3\2\2\2\61\62"+
		"\t\2\2\2\62\4\3\2\2\2\63\64\t\3\2\2\64\6\3\2\2\2\65\66\t\4\2\2\66\b\3"+
		"\2\2\2\678\7k\2\289\7p\2\29:\7v\2\2:\n\3\2\2\2;<\7h\2\2<=\7n\2\2=>\7q"+
		"\2\2>?\7c\2\2?@\7v\2\2@\f\3\2\2\2AB\7t\2\2BC\7g\2\2CD\7v\2\2DE\7w\2\2"+
		"EF\7t\2\2FG\7p\2\2G\16\3\2\2\2HJ\5\7\4\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2"+
		"KL\3\2\2\2L\20\3\2\2\2MO\5\7\4\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2"+
		"\2QR\3\2\2\2RT\7\60\2\2SU\5\7\4\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2"+
		"\2\2W\22\3\2\2\2X]\5\3\2\2Y\\\5\3\2\2Z\\\5\5\3\2[Y\3\2\2\2[Z\3\2\2\2\\"+
		"_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\24\3\2\2\2_]\3\2\2\2`a\7}\2\2a\26\3\2\2"+
		"\2bc\7\177\2\2c\30\3\2\2\2de\7]\2\2e\32\3\2\2\2fg\7_\2\2g\34\3\2\2\2h"+
		"i\7*\2\2i\36\3\2\2\2jk\7+\2\2k \3\2\2\2lm\7-\2\2m\"\3\2\2\2no\7/\2\2o"+
		"$\3\2\2\2pq\7,\2\2q&\3\2\2\2rs\7\61\2\2s(\3\2\2\2tu\7?\2\2u*\3\2\2\2v"+
		"w\7.\2\2w,\3\2\2\2xy\7=\2\2y.\3\2\2\2z|\t\5\2\2{z\3\2\2\2|}\3\2\2\2}{"+
		"\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\b\30\2\2\u0080\60\3\2\2\2\t"+
		"\2KPV[]}\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}