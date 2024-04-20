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
public class wc_fieldLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WILDCARD_ID=1, LP=2, RP=3, COMMA=4, ASSIGN=5, STRING=6, SINGLE_QUOTED_STRING=7, 
		ID=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WILDCARD_ID", "LP", "RP", "COMMA", "ASSIGN", "STRING", "SINGLE_QUOTED_STRING", 
			"ID_PUNCT", "ID"
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
			null, "WILDCARD_ID", "LP", "RP", "COMMA", "ASSIGN", "STRING", "SINGLE_QUOTED_STRING", 
			"ID"
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


	public wc_fieldLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "wc_field.g4"; }

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
		"\u0004\u0000\bL\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0003\u0000\u0015\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001b\b\u0000\n"+
		"\u0000\f\u0000\u001e\t\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005,\b\u0005\n\u0005\f\u0005/\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u00067\b\u0006\n\u0006\f\u0006:\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007A\b\u0007\u0001"+
		"\b\u0003\bD\b\b\u0001\b\u0001\b\u0005\bH\b\b\n\b\f\bK\t\b\u0002-8\u0000"+
		"\t\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\u0000\u0011\b\u0001\u0000\u0007\u0004\u0000**AZ__az\u0005"+
		"\u0000..09@Z__az\u0002\u0000\"\"\\\\\u0002\u0000\'\'\\\\\u0003\u0000."+
		".@@__\u0003\u0000AZ__az\u0003\u000009AZazT\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0001\u0014\u0001\u0000\u0000\u0000\u0003"+
		"\u001f\u0001\u0000\u0000\u0000\u0005!\u0001\u0000\u0000\u0000\u0007#\u0001"+
		"\u0000\u0000\u0000\t%\u0001\u0000\u0000\u0000\u000b\'\u0001\u0000\u0000"+
		"\u0000\r2\u0001\u0000\u0000\u0000\u000f@\u0001\u0000\u0000\u0000\u0011"+
		"C\u0001\u0000\u0000\u0000\u0013\u0015\u0007\u0000\u0000\u0000\u0014\u0013"+
		"\u0001\u0000\u0000\u0000\u0015\u001c\u0001\u0000\u0000\u0000\u0016\u001b"+
		"\u0007\u0001\u0000\u0000\u0017\u0018\u0005[\u0000\u0000\u0018\u001b\u0005"+
		"]\u0000\u0000\u0019\u001b\u0005*\u0000\u0000\u001a\u0016\u0001\u0000\u0000"+
		"\u0000\u001a\u0017\u0001\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000"+
		"\u0000\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u0002\u0001\u0000\u0000"+
		"\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f \u0005(\u0000\u0000 "+
		"\u0004\u0001\u0000\u0000\u0000!\"\u0005)\u0000\u0000\"\u0006\u0001\u0000"+
		"\u0000\u0000#$\u0005,\u0000\u0000$\b\u0001\u0000\u0000\u0000%&\u0005="+
		"\u0000\u0000&\n\u0001\u0000\u0000\u0000\'-\u0005\"\u0000\u0000()\u0005"+
		"\\\u0000\u0000),\t\u0000\u0000\u0000*,\b\u0002\u0000\u0000+(\u0001\u0000"+
		"\u0000\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u000001\u0005\"\u0000\u00001\f\u0001\u0000\u0000"+
		"\u000028\u0005\'\u0000\u000034\u0005\\\u0000\u000047\t\u0000\u0000\u0000"+
		"57\b\u0003\u0000\u000063\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u0000"+
		"7:\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u00009;\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;<\u0005\'\u0000"+
		"\u0000<\u000e\u0001\u0000\u0000\u0000=A\u0007\u0004\u0000\u0000>?\u0005"+
		"[\u0000\u0000?A\u0005]\u0000\u0000@=\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000A\u0010\u0001\u0000\u0000\u0000BD\u0007\u0005\u0000\u0000"+
		"CB\u0001\u0000\u0000\u0000DI\u0001\u0000\u0000\u0000EH\u0007\u0006\u0000"+
		"\u0000FH\u0003\u000f\u0007\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000"+
		"\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000J\u0012\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000\f\u0000\u0014\u001a\u001c+-68@CGI\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}