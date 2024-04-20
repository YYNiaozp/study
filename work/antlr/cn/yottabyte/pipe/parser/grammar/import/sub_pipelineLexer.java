// Generated from /Users/zhangpeng/Code/work/yotta_spl/spl_parser/src/main/java/cn/yottabyte/pipe/parser/grammar/import/sub_pipeline.g4 by ANTLR 4.10.1
package cn.yottabyte.pipe.parser.grammar.import;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sub_pipelineLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SUB_PIPELINE=1, WS=2, BLOCK_COMMENT=3, LINE_COMMENT=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PIPE", "DLB", "DRB", "LB", "RB", "STRING", "SINGLE_QUOTED_STRING", "NONE_PIPE", 
			"COMMAND_SEQNENCE", "SUB_PIPELINE", "WS", "BLOCK_COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SUB_PIPELINE", "WS", "BLOCK_COMMENT", "LINE_COMMENT"
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


	public sub_pipelineLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sub_pipeline.g4"; }

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
		"\u0004\u0000\u0004\u0084\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005,\b\u0005\n\u0005\f\u0005/\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"7\b\u0006\n\u0006\f\u0006:\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007B\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007G\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007L\b\u0007\u0001\u0007\u0001\u0007\u0004\u0007"+
		"P\b\u0007\u000b\u0007\f\u0007Q\u0001\b\u0001\b\u0001\b\u0003\bW\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t^\b\t\n\t\f\ta\t\t\u0001\t\u0001"+
		"\t\u0001\n\u0004\nf\b\n\u000b\n\f\ng\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000bp\b\u000b\n\u000b\f\u000bs\t"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f~\b\f\n\f\f\f\u0081\t\f\u0001\f\u0001"+
		"\f\u0004-8_q\u0000\r\u0001\u0000\u0003\u0000\u0005\u0000\u0007\u0000\t"+
		"\u0000\u000b\u0000\r\u0000\u000f\u0000\u0011\u0000\u0013\u0001\u0015\u0002"+
		"\u0017\u0003\u0019\u0004\u0001\u0000\u0007\u0002\u0000\"\"\\\\\u0002\u0000"+
		"\'\'\\\\\b\u0000\t\n\r\r  \"\"\'\'[]||\u3000\u3000\u0001\u0000[[\u0001"+
		"\u0000]]\u0004\u0000\t\n\r\r  \u3000\u3000\u0002\u0000\n\n\r\r\u008f\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001"+
		"\u001b\u0001\u0000\u0000\u0000\u0003\u001d\u0001\u0000\u0000\u0000\u0005"+
		" \u0001\u0000\u0000\u0000\u0007#\u0001\u0000\u0000\u0000\t%\u0001\u0000"+
		"\u0000\u0000\u000b\'\u0001\u0000\u0000\u0000\r2\u0001\u0000\u0000\u0000"+
		"\u000fO\u0001\u0000\u0000\u0000\u0011V\u0001\u0000\u0000\u0000\u0013X"+
		"\u0001\u0000\u0000\u0000\u0015e\u0001\u0000\u0000\u0000\u0017k\u0001\u0000"+
		"\u0000\u0000\u0019y\u0001\u0000\u0000\u0000\u001b\u001c\u0005|\u0000\u0000"+
		"\u001c\u0002\u0001\u0000\u0000\u0000\u001d\u001e\u0005[\u0000\u0000\u001e"+
		"\u001f\u0005[\u0000\u0000\u001f\u0004\u0001\u0000\u0000\u0000 !\u0005"+
		"]\u0000\u0000!\"\u0005]\u0000\u0000\"\u0006\u0001\u0000\u0000\u0000#$"+
		"\u0005[\u0000\u0000$\b\u0001\u0000\u0000\u0000%&\u0005]\u0000\u0000&\n"+
		"\u0001\u0000\u0000\u0000\'-\u0005\"\u0000\u0000()\u0005\\\u0000\u0000"+
		"),\t\u0000\u0000\u0000*,\b\u0000\u0000\u0000+(\u0001\u0000\u0000\u0000"+
		"+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000/-\u0001\u0000"+
		"\u0000\u000001\u0005\"\u0000\u00001\f\u0001\u0000\u0000\u000028\u0005"+
		"\'\u0000\u000034\u0005\\\u0000\u000047\t\u0000\u0000\u000057\b\u0001\u0000"+
		"\u000063\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u00007:\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009;\u0001"+
		"\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;<\u0005\'\u0000\u0000<\u000e"+
		"\u0001\u0000\u0000\u0000=P\b\u0002\u0000\u0000>A\u0005\\\u0000\u0000?"+
		"B\t\u0000\u0000\u0000@B\u0005\u0000\u0000\u0001A?\u0001\u0000\u0000\u0000"+
		"A@\u0001\u0000\u0000\u0000BP\u0001\u0000\u0000\u0000CF\u0005[\u0000\u0000"+
		"DG\b\u0003\u0000\u0000EG\u0005\u0000\u0000\u0001FD\u0001\u0000\u0000\u0000"+
		"FE\u0001\u0000\u0000\u0000GP\u0001\u0000\u0000\u0000HK\u0005]\u0000\u0000"+
		"IL\b\u0004\u0000\u0000JL\u0005\u0000\u0000\u0001KI\u0001\u0000\u0000\u0000"+
		"KJ\u0001\u0000\u0000\u0000LP\u0001\u0000\u0000\u0000MN\u0005|\u0000\u0000"+
		"NP\u0005|\u0000\u0000O=\u0001\u0000\u0000\u0000O>\u0001\u0000\u0000\u0000"+
		"OC\u0001\u0000\u0000\u0000OH\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000R\u0010\u0001\u0000\u0000\u0000SW\u0003\r\u0006\u0000TW\u0003"+
		"\u000b\u0005\u0000UW\u0003\u000f\u0007\u0000VS\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000W\u0012\u0001\u0000"+
		"\u0000\u0000X_\u0003\u0003\u0001\u0000Y^\u0003\u0013\t\u0000Z^\u0003\u0011"+
		"\b\u0000[^\u0003\u0001\u0000\u0000\\^\u0003\u0015\n\u0000]Y\u0001\u0000"+
		"\u0000\u0000]Z\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]\\\u0001"+
		"\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000bc\u0003\u0005\u0002\u0000c\u0014\u0001\u0000\u0000\u0000df\u0007"+
		"\u0005\u0000\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ij\u0006\n\u0000\u0000j\u0016\u0001\u0000\u0000\u0000kl\u0005/\u0000"+
		"\u0000lm\u0005*\u0000\u0000mq\u0001\u0000\u0000\u0000np\t\u0000\u0000"+
		"\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000tu\u0005*\u0000\u0000uv\u0005/\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wx\u0006\u000b\u0001\u0000x\u0018\u0001\u0000\u0000\u0000"+
		"yz\u0005/\u0000\u0000z{\u0005/\u0000\u0000{\u007f\u0001\u0000\u0000\u0000"+
		"|~\b\u0006\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0006\f\u0001\u0000\u0083\u001a\u0001\u0000\u0000\u0000\u0010"+
		"\u0000+-68AFKOQV]_gq\u007f\u0002\u0006\u0000\u0000\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}