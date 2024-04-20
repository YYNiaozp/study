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
public class file_nameLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FILENAME=1, ID=2, LP=3, RP=4, COMMA=5, ASSIGN=6, STRING=7, SINGLE_QUOTED_STRING=8, 
		INTEGER=9, FLOAT=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FILENAME", "ID_PUNCT", "ID", "LP", "RP", "COMMA", "ASSIGN", "STRING", 
			"SINGLE_QUOTED_STRING", "OCTAL", "HEX", "DECIMAL", "DOT", "INTEGER", 
			"FLOAT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "','", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FILENAME", "ID", "LP", "RP", "COMMA", "ASSIGN", "STRING", "SINGLE_QUOTED_STRING", 
			"INTEGER", "FLOAT"
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


	public file_nameLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "file_name.g4"; }

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
		"\u0004\u0000\n\u0099\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0004\u0000(\b\u0000\u000b\u0000\f\u0000)\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0002\u0003\u0002"+
		"2\b\u0002\u0001\u0002\u0001\u0002\u0005\u00026\b\u0002\n\u0002\f\u0002"+
		"9\t\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007G\b\u0007\n\u0007\f\u0007J\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bR\b\b\n\b\f\bU\t\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0004\t[\b\t\u000b\t\f\t\\\u0001\n\u0001"+
		"\n\u0001\n\u0004\nb\b\n\u000b\n\f\nc\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000bi\b\u000b\n\u000b\f\u000bl\t\u000b\u0003\u000bn\b\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\ru\b\r\u0001\r\u0003\rx\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e}\b\u000e\n\u000e\f\u000e\u0080"+
		"\t\u000e\u0003\u000e\u0082\b\u000e\u0001\u000e\u0001\u000e\u0004\u000e"+
		"\u0086\b\u000e\u000b\u000e\f\u000e\u0087\u0003\u000e\u008a\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u008e\b\u000e\u0001\u000e\u0004\u000e\u0091"+
		"\b\u000e\u000b\u000e\f\u000e\u0092\u0003\u000e\u0095\b\u000e\u0001\u000e"+
		"\u0003\u000e\u0098\b\u000e\u0002HS\u0000\u000f\u0001\u0001\u0003\u0000"+
		"\u0005\u0002\u0007\u0003\t\u0004\u000b\u0005\r\u0006\u000f\u0007\u0011"+
		"\b\u0013\u0000\u0015\u0000\u0017\u0000\u0019\u0000\u001b\t\u001d\n\u0001"+
		"\u0000\u000f\u0003\u0000--//\u4e00\u8000\u9fa5\u0003\u0000..@@__\u0003"+
		"\u0000AZ__az\u0003\u000009AZaz\u0002\u0000\"\"\\\\\u0002\u0000\'\'\\\\"+
		"\u0001\u000007\u0002\u0000XXxx\u0003\u000009AFaf\u0001\u000019\u0001\u0000"+
		"09\u0002\u0000LLll\u0002\u0000EEee\u0002\u0000++--\u0002\u0000FFff\u00b0"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\'\u0001"+
		"\u0000\u0000\u0000\u0003.\u0001\u0000\u0000\u0000\u00051\u0001\u0000\u0000"+
		"\u0000\u0007:\u0001\u0000\u0000\u0000\t<\u0001\u0000\u0000\u0000\u000b"+
		">\u0001\u0000\u0000\u0000\r@\u0001\u0000\u0000\u0000\u000fB\u0001\u0000"+
		"\u0000\u0000\u0011M\u0001\u0000\u0000\u0000\u0013X\u0001\u0000\u0000\u0000"+
		"\u0015^\u0001\u0000\u0000\u0000\u0017m\u0001\u0000\u0000\u0000\u0019o"+
		"\u0001\u0000\u0000\u0000\u001bt\u0001\u0000\u0000\u0000\u001d\u0081\u0001"+
		"\u0000\u0000\u0000\u001f(\u0003\u0005\u0002\u0000 (\u0003\u001b\r\u0000"+
		"!(\u0003\u001d\u000e\u0000\"(\u0003\u0003\u0001\u0000#(\u0003\u001b\r"+
		"\u0000$(\u0007\u0000\u0000\u0000%&\u0005\\\u0000\u0000&(\t\u0000\u0000"+
		"\u0000\'\u001f\u0001\u0000\u0000\u0000\' \u0001\u0000\u0000\u0000\'!\u0001"+
		"\u0000\u0000\u0000\'\"\u0001\u0000\u0000\u0000\'#\u0001\u0000\u0000\u0000"+
		"\'$\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0002\u0001"+
		"\u0000\u0000\u0000+/\u0007\u0001\u0000\u0000,-\u0005[\u0000\u0000-/\u0005"+
		"]\u0000\u0000.+\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/\u0004"+
		"\u0001\u0000\u0000\u000002\u0007\u0002\u0000\u000010\u0001\u0000\u0000"+
		"\u000027\u0001\u0000\u0000\u000036\u0007\u0003\u0000\u000046\u0003\u0003"+
		"\u0001\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u000069\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"8\u0006\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0005(\u0000"+
		"\u0000;\b\u0001\u0000\u0000\u0000<=\u0005)\u0000\u0000=\n\u0001\u0000"+
		"\u0000\u0000>?\u0005,\u0000\u0000?\f\u0001\u0000\u0000\u0000@A\u0005="+
		"\u0000\u0000A\u000e\u0001\u0000\u0000\u0000BH\u0005\"\u0000\u0000CD\u0005"+
		"\\\u0000\u0000DG\t\u0000\u0000\u0000EG\b\u0004\u0000\u0000FC\u0001\u0000"+
		"\u0000\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000KL\u0005\"\u0000\u0000L\u0010\u0001\u0000\u0000"+
		"\u0000MS\u0005\'\u0000\u0000NO\u0005\\\u0000\u0000OR\t\u0000\u0000\u0000"+
		"PR\b\u0005\u0000\u0000QN\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000"+
		"RU\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000"+
		"\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0005\'\u0000"+
		"\u0000W\u0012\u0001\u0000\u0000\u0000XZ\u00050\u0000\u0000Y[\u0007\u0006"+
		"\u0000\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u0014\u0001\u0000\u0000"+
		"\u0000^_\u00050\u0000\u0000_a\u0007\u0007\u0000\u0000`b\u0007\b\u0000"+
		"\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000d\u0016\u0001\u0000\u0000\u0000"+
		"en\u00050\u0000\u0000fj\u0007\t\u0000\u0000gi\u0007\n\u0000\u0000hg\u0001"+
		"\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000me\u0001\u0000\u0000\u0000mf\u0001\u0000\u0000\u0000n\u0018\u0001"+
		"\u0000\u0000\u0000op\u0005.\u0000\u0000p\u001a\u0001\u0000\u0000\u0000"+
		"qu\u0003\u0013\t\u0000ru\u0003\u0015\n\u0000su\u0003\u0017\u000b\u0000"+
		"tq\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000"+
		"\u0000uw\u0001\u0000\u0000\u0000vx\u0007\u000b\u0000\u0000wv\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000x\u001c\u0001\u0000\u0000\u0000"+
		"y\u0082\u00050\u0000\u0000z~\u0007\t\u0000\u0000{}\u0007\n\u0000\u0000"+
		"|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0081y\u0001\u0000\u0000\u0000\u0081"+
		"z\u0001\u0000\u0000\u0000\u0082\u0089\u0001\u0000\u0000\u0000\u0083\u0085"+
		"\u0003\u0019\f\u0000\u0084\u0086\u0007\n\u0000\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001"+
		"\u0000\u0000\u0000\u0089\u0083\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u0094\u0001\u0000\u0000\u0000\u008b\u008d\u0007"+
		"\f\u0000\u0000\u008c\u008e\u0007\r\u0000\u0000\u008d\u008c\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000"+
		"\u0000\u0000\u008f\u0091\u0007\n\u0000\u0000\u0090\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000"+
		"\u0000\u0094\u008b\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0098\u0007\u000e\u0000"+
		"\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u001e\u0001\u0000\u0000\u0000\u0019\u0000\').157FHQS\\cj"+
		"mtw~\u0081\u0087\u0089\u008d\u0092\u0094\u0097\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}