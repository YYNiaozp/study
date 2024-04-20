// Generated from java-escape by ANTLR 4.11.1
package cn.yottabyte.pipe.parser.grammar.import;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class commonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LP=2, RP=3, COMMA=4, ASSIGN=5, STRING=6, SINGLE_QUOTED_STRING=7, 
		INTEGER=8, FLOAT=9, TRUE=10, FALSE=11, NULL=12, ID=13, BLOCK_COMMENT=14, 
		LINE_COMMENT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "LP", "RP", "COMMA", "ASSIGN", "STRING", "SINGLE_QUOTED_STRING", 
			"OCTAL", "HEX", "DECIMAL", "DOT", "INTEGER", "FLOAT", "TRUE", "FALSE", 
			"NULL", "ID_PUNCT", "ID", "BLOCK_COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "','", "'='", null, null, null, null, "'true'", 
			"'false'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LP", "RP", "COMMA", "ASSIGN", "STRING", "SINGLE_QUOTED_STRING", 
			"INTEGER", "FLOAT", "TRUE", "FALSE", "NULL", "ID", "BLOCK_COMMENT", "LINE_COMMENT"
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


	public commonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "common.g4"; }

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
		"\u0004\u0000\u000f\u00c7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0004\u0000"+
		"+\b\u0000\u000b\u0000\f\u0000,\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005=\b"+
		"\u0005\n\u0005\f\u0005@\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006H\b\u0006\n\u0006\f\u0006K\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0004\u0007Q\b"+
		"\u0007\u000b\u0007\f\u0007R\u0001\b\u0001\b\u0001\b\u0004\bX\b\b\u000b"+
		"\b\f\bY\u0001\t\u0001\t\u0001\t\u0005\t_\b\t\n\t\f\tb\t\t\u0003\td\b\t"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bk\b\u000b"+
		"\u0001\u000b\u0003\u000bn\b\u000b\u0001\f\u0001\f\u0001\f\u0005\fs\b\f"+
		"\n\f\f\fv\t\f\u0003\fx\b\f\u0001\f\u0001\f\u0004\f|\b\f\u000b\f\f\f}\u0003"+
		"\f\u0080\b\f\u0001\f\u0001\f\u0003\f\u0084\b\f\u0001\f\u0004\f\u0087\b"+
		"\f\u000b\f\f\f\u0088\u0003\f\u008b\b\f\u0001\f\u0003\f\u008e\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00a3\b\u0010\u0001\u0011\u0003\u0011\u00a6\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00aa\b\u0011\n\u0011\f\u0011\u00ad\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00b3\b\u0012\n\u0012"+
		"\f\u0012\u00b6\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00c1\b\u0013\n\u0013\f\u0013\u00c4\t\u0013\u0001\u0013\u0001\u0013\u0003"+
		">I\u00b4\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\u0000\u0011\u0000\u0013\u0000\u0015\u0000"+
		"\u0017\b\u0019\t\u001b\n\u001d\u000b\u001f\f!\u0000#\r%\u000e\'\u000f"+
		"\u0001\u0000\u0010\u0004\u0000\t\n\r\r  \u3000\u3000\u0002\u0000\"\"\\"+
		"\\\u0002\u0000\'\'\\\\\u0001\u000007\u0002\u0000XXxx\u0003\u000009AFa"+
		"f\u0001\u000019\u0001\u000009\u0002\u0000LLll\u0002\u0000EEee\u0002\u0000"+
		"++--\u0002\u0000FFff\u0003\u0000..@@__\u0003\u0000AZ__az\u0003\u00000"+
		"9AZaz\u0002\u0000\n\n\r\r\u00da\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001*\u0001\u0000\u0000\u0000"+
		"\u00030\u0001\u0000\u0000\u0000\u00052\u0001\u0000\u0000\u0000\u00074"+
		"\u0001\u0000\u0000\u0000\t6\u0001\u0000\u0000\u0000\u000b8\u0001\u0000"+
		"\u0000\u0000\rC\u0001\u0000\u0000\u0000\u000fN\u0001\u0000\u0000\u0000"+
		"\u0011T\u0001\u0000\u0000\u0000\u0013c\u0001\u0000\u0000\u0000\u0015e"+
		"\u0001\u0000\u0000\u0000\u0017j\u0001\u0000\u0000\u0000\u0019w\u0001\u0000"+
		"\u0000\u0000\u001b\u008f\u0001\u0000\u0000\u0000\u001d\u0094\u0001\u0000"+
		"\u0000\u0000\u001f\u009a\u0001\u0000\u0000\u0000!\u00a2\u0001\u0000\u0000"+
		"\u0000#\u00a5\u0001\u0000\u0000\u0000%\u00ae\u0001\u0000\u0000\u0000\'"+
		"\u00bc\u0001\u0000\u0000\u0000)+\u0007\u0000\u0000\u0000*)\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0006\u0000\u0000\u0000"+
		"/\u0002\u0001\u0000\u0000\u000001\u0005(\u0000\u00001\u0004\u0001\u0000"+
		"\u0000\u000023\u0005)\u0000\u00003\u0006\u0001\u0000\u0000\u000045\u0005"+
		",\u0000\u00005\b\u0001\u0000\u0000\u000067\u0005=\u0000\u00007\n\u0001"+
		"\u0000\u0000\u00008>\u0005\"\u0000\u00009:\u0005\\\u0000\u0000:=\t\u0000"+
		"\u0000\u0000;=\b\u0001\u0000\u0000<9\u0001\u0000\u0000\u0000<;\u0001\u0000"+
		"\u0000\u0000=@\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"AB\u0005\"\u0000\u0000B\f\u0001\u0000\u0000\u0000CI\u0005\'\u0000\u0000"+
		"DE\u0005\\\u0000\u0000EH\t\u0000\u0000\u0000FH\b\u0002\u0000\u0000GD\u0001"+
		"\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000LM\u0005\'\u0000\u0000M\u000e\u0001\u0000"+
		"\u0000\u0000NP\u00050\u0000\u0000OQ\u0007\u0003\u0000\u0000PO\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000S\u0010\u0001\u0000\u0000\u0000TU\u00050\u0000\u0000"+
		"UW\u0007\u0004\u0000\u0000VX\u0007\u0005\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000Z\u0012\u0001\u0000\u0000\u0000[d\u00050\u0000\u0000\\`\u0007"+
		"\u0006\u0000\u0000]_\u0007\u0007\u0000\u0000^]\u0001\u0000\u0000\u0000"+
		"_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000c[\u0001\u0000"+
		"\u0000\u0000c\\\u0001\u0000\u0000\u0000d\u0014\u0001\u0000\u0000\u0000"+
		"ef\u0005.\u0000\u0000f\u0016\u0001\u0000\u0000\u0000gk\u0003\u000f\u0007"+
		"\u0000hk\u0003\u0011\b\u0000ik\u0003\u0013\t\u0000jg\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000km\u0001\u0000"+
		"\u0000\u0000ln\u0007\b\u0000\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000n\u0018\u0001\u0000\u0000\u0000ox\u00050\u0000\u0000pt\u0007"+
		"\u0006\u0000\u0000qs\u0007\u0007\u0000\u0000rq\u0001\u0000\u0000\u0000"+
		"sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wo\u0001\u0000"+
		"\u0000\u0000wp\u0001\u0000\u0000\u0000x\u007f\u0001\u0000\u0000\u0000"+
		"y{\u0003\u0015\n\u0000z|\u0007\u0007\u0000\u0000{z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u0080\u0001\u0000\u0000\u0000\u007fy\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u008a\u0001\u0000\u0000\u0000\u0081"+
		"\u0083\u0007\t\u0000\u0000\u0082\u0084\u0007\n\u0000\u0000\u0083\u0082"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086"+
		"\u0001\u0000\u0000\u0000\u0085\u0087\u0007\u0007\u0000\u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b"+
		"\u0001\u0000\u0000\u0000\u008a\u0081\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008e"+
		"\u0007\u000b\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u001a\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005t\u0000\u0000\u0090\u0091\u0005r\u0000\u0000\u0091\u0092\u0005u"+
		"\u0000\u0000\u0092\u0093\u0005e\u0000\u0000\u0093\u001c\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005f\u0000\u0000\u0095\u0096\u0005a\u0000\u0000\u0096"+
		"\u0097\u0005l\u0000\u0000\u0097\u0098\u0005s\u0000\u0000\u0098\u0099\u0005"+
		"e\u0000\u0000\u0099\u001e\u0001\u0000\u0000\u0000\u009a\u009b\u0005n\u0000"+
		"\u0000\u009b\u009c\u0005u\u0000\u0000\u009c\u009d\u0005l\u0000\u0000\u009d"+
		"\u009e\u0005l\u0000\u0000\u009e \u0001\u0000\u0000\u0000\u009f\u00a3\u0007"+
		"\f\u0000\u0000\u00a0\u00a1\u0005[\u0000\u0000\u00a1\u00a3\u0005]\u0000"+
		"\u0000\u00a2\u009f\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a3\"\u0001\u0000\u0000\u0000\u00a4\u00a6\u0007\r\u0000\u0000"+
		"\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00ab\u0001\u0000\u0000\u0000"+
		"\u00a7\u00aa\u0007\u000e\u0000\u0000\u00a8\u00aa\u0003!\u0010\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac$\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0005/\u0000\u0000\u00af\u00b0\u0005"+
		"*\u0000\u0000\u00b0\u00b4\u0001\u0000\u0000\u0000\u00b1\u00b3\t\u0000"+
		"\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005*\u0000\u0000\u00b8\u00b9\u0005/\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0006\u0012\u0001\u0000"+
		"\u00bb&\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005/\u0000\u0000\u00bd\u00be"+
		"\u0005/\u0000\u0000\u00be\u00c2\u0001\u0000\u0000\u0000\u00bf\u00c1\b"+
		"\u000f\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0006\u0013\u0001\u0000\u00c6(\u0001\u0000"+
		"\u0000\u0000\u001a\u0000,<>GIRY`cjmtw}\u007f\u0083\u0088\u008a\u008d\u00a2"+
		"\u00a5\u00a9\u00ab\u00b4\u00c2\u0002\u0006\u0000\u0000\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}