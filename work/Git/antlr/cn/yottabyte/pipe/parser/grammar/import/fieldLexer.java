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
public class fieldLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, LP=2, RP=3, COMMA=4, ASSIGN=5, STRING=6, SINGLE_QUOTED_STRING=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID_PUNCT", "ID", "LP", "RP", "COMMA", "ASSIGN", "STRING", "SINGLE_QUOTED_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "','", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "LP", "RP", "COMMA", "ASSIGN", "STRING", "SINGLE_QUOTED_STRING"
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


	public fieldLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "field.g4"; }

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
		"\u0004\u0000\u0007>\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0015\b\u0000"+
		"\u0001\u0001\u0003\u0001\u0018\b\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"\u001c\b\u0001\n\u0001\f\u0001\u001f\t\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006-\b\u0006\n\u0006"+
		"\f\u00060\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u00078\b\u0007\n\u0007\f\u0007;\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0002.9\u0000\b\u0001\u0000\u0003\u0001\u0005\u0002"+
		"\u0007\u0003\t\u0004\u000b\u0005\r\u0006\u000f\u0007\u0001\u0000\u0005"+
		"\u0003\u0000..@@__\u0003\u0000AZ__az\u0003\u000009AZaz\u0002\u0000\"\""+
		"\\\\\u0002\u0000\'\'\\\\C\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0001\u0014\u0001\u0000"+
		"\u0000\u0000\u0003\u0017\u0001\u0000\u0000\u0000\u0005 \u0001\u0000\u0000"+
		"\u0000\u0007\"\u0001\u0000\u0000\u0000\t$\u0001\u0000\u0000\u0000\u000b"+
		"&\u0001\u0000\u0000\u0000\r(\u0001\u0000\u0000\u0000\u000f3\u0001\u0000"+
		"\u0000\u0000\u0011\u0015\u0007\u0000\u0000\u0000\u0012\u0013\u0005[\u0000"+
		"\u0000\u0013\u0015\u0005]\u0000\u0000\u0014\u0011\u0001\u0000\u0000\u0000"+
		"\u0014\u0012\u0001\u0000\u0000\u0000\u0015\u0002\u0001\u0000\u0000\u0000"+
		"\u0016\u0018\u0007\u0001\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000"+
		"\u0018\u001d\u0001\u0000\u0000\u0000\u0019\u001c\u0007\u0002\u0000\u0000"+
		"\u001a\u001c\u0003\u0001\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000"+
		"\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000"+
		"\u001e\u0004\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		" !\u0005(\u0000\u0000!\u0006\u0001\u0000\u0000\u0000\"#\u0005)\u0000\u0000"+
		"#\b\u0001\u0000\u0000\u0000$%\u0005,\u0000\u0000%\n\u0001\u0000\u0000"+
		"\u0000&\'\u0005=\u0000\u0000\'\f\u0001\u0000\u0000\u0000(.\u0005\"\u0000"+
		"\u0000)*\u0005\\\u0000\u0000*-\t\u0000\u0000\u0000+-\b\u0003\u0000\u0000"+
		",)\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/1\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000012\u0005\"\u0000\u00002\u000e\u0001"+
		"\u0000\u0000\u000039\u0005\'\u0000\u000045\u0005\\\u0000\u000058\t\u0000"+
		"\u0000\u000068\b\u0004\u0000\u000074\u0001\u0000\u0000\u000076\u0001\u0000"+
		"\u0000\u00008;\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		"<=\u0005\'\u0000\u0000=\u0010\u0001\u0000\u0000\u0000\t\u0000\u0014\u0017"+
		"\u001b\u001d,.79\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}