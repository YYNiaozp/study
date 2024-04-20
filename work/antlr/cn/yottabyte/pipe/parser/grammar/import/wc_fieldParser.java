// Generated from java-escape by ANTLR 4.11.1
package cn.yottabyte.pipe.parser.grammar.import;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class wc_fieldParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WILDCARD_ID=1, LP=2, RP=3, COMMA=4, ASSIGN=5, STRING=6, SINGLE_QUOTED_STRING=7, 
		ID=8;
	public static final int
		RULE_wildcard_identifier = 0, RULE_wildcard_field = 1, RULE_wildcard_fieldlist = 2, 
		RULE_space_splitted_wildcard_fieldlist = 3, RULE_identifier = 4, RULE_field = 5, 
		RULE_field_list = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"wildcard_identifier", "wildcard_field", "wildcard_fieldlist", "space_splitted_wildcard_fieldlist", 
			"identifier", "field", "field_list"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public wc_fieldParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Wildcard_identifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(wc_fieldParser.ID, 0); }
		public TerminalNode WILDCARD_ID() { return getToken(wc_fieldParser.WILDCARD_ID, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(wc_fieldParser.SINGLE_QUOTED_STRING, 0); }
		public Wildcard_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wc_fieldListener ) ((wc_fieldListener)listener).enterWildcard_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wc_fieldListener ) ((wc_fieldListener)listener).exitWildcard_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wc_fieldVisitor ) return ((wc_fieldVisitor<? extends T>)visitor).visitWildcard_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wildcard_identifierContext wildcard_identifier() throws RecognitionException {
		Wildcard_identifierContext _localctx = new Wildcard_identifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_wildcard_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 386L) != 0) ) {
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
	public static class Wildcard_fieldContext extends ParserRuleContext {
		public Wildcard_identifierContext wildcard_identifier() {
			return getRuleContext(Wildcard_identifierContext.class,0);
		}
		public Wildcard_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wc_fieldListener ) ((wc_fieldListener)listener).enterWildcard_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wc_fieldListener ) ((wc_fieldListener)listener).exitWildcard_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wc_fieldVisitor ) return ((wc_fieldVisitor<? extends T>)visitor).visitWildcard_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wildcard_fieldContext wildcard_field() throws RecognitionException {
		Wildcard_fieldContext _localctx = new Wildcard_fieldContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_wildcard_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			wildcard_identifier();
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
	public static class Wildcard_fieldlistContext extends ParserRuleContext {
		public List<Wildcard_fieldContext> wildcard_field() {
			return getRuleContexts(Wildcard_fieldContext.class);
		}
		public Wildcard_fieldContext wildcard_field(int i) {
			return getRuleContext(Wildcard_fieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(wc_fieldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(wc_fieldParser.COMMA, i);
		}
		public Wildcard_fieldlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_fieldlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wc_fieldListener ) ((wc_fieldListener)listener).enterWildcard_fieldlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wc_fieldListener ) ((wc_fieldListener)listener).exitWildcard_fieldlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wc_fieldVisitor ) return ((wc_fieldVisitor<? extends T>)visitor).visitWildcard_fieldlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wildcard_fieldlistContext wildcard_fieldlist() throws RecognitionException {
		Wildcard_fieldlistContext _localctx = new Wildcard_fieldlistContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_wildcard_fieldlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			wildcard_field();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(19);
				match(COMMA);
				setState(20);
				wildcard_field();
				}
				}
				setState(25);
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
	public static class Space_splitted_wildcard_fieldlistContext extends ParserRuleContext {
		public List<Wildcard_fieldContext> wildcard_field() {
			return getRuleContexts(Wildcard_fieldContext.class);
		}
		public Wildcard_fieldContext wildcard_field(int i) {
			return getRuleContext(Wildcard_fieldContext.class,i);
		}
		public Space_splitted_wildcard_fieldlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space_splitted_wildcard_fieldlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wc_fieldListener ) ((wc_fieldListener)listener).enterSpace_splitted_wildcard_fieldlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wc_fieldListener ) ((wc_fieldListener)listener).exitSpace_splitted_wildcard_fieldlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wc_fieldVisitor ) return ((wc_fieldVisitor<? extends T>)visitor).visitSpace_splitted_wildcard_fieldlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Space_splitted_wildcard_fieldlistContext space_splitted_wildcard_fieldlist() throws RecognitionException {
		Space_splitted_wildcard_fieldlistContext _localctx = new Space_splitted_wildcard_fieldlistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_space_splitted_wildcard_fieldlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			wildcard_field();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 386L) != 0) {
				{
				{
				setState(27);
				wildcard_field();
				}
				}
				setState(32);
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(wc_fieldParser.ID, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(wc_fieldParser.SINGLE_QUOTED_STRING, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wc_fieldListener ) ((wc_fieldListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wc_fieldListener ) ((wc_fieldListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wc_fieldVisitor ) return ((wc_fieldVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_QUOTED_STRING || _la==ID) ) {
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
	public static class FieldContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wc_fieldListener ) ((wc_fieldListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wc_fieldListener ) ((wc_fieldListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wc_fieldVisitor ) return ((wc_fieldVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			identifier();
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
	public static class Field_listContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(wc_fieldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(wc_fieldParser.COMMA, i);
		}
		public Field_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wc_fieldListener ) ((wc_fieldListener)listener).enterField_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wc_fieldListener ) ((wc_fieldListener)listener).exitField_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wc_fieldVisitor ) return ((wc_fieldVisitor<? extends T>)visitor).visitField_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_listContext field_list() throws RecognitionException {
		Field_listContext _localctx = new Field_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			field();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(38);
				match(COMMA);
				setState(39);
				field();
				}
				}
				setState(44);
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

	public static final String _serializedATN =
		"\u0004\u0001\b.\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0016"+
		"\b\u0002\n\u0002\f\u0002\u0019\t\u0002\u0001\u0003\u0001\u0003\u0005\u0003"+
		"\u001d\b\u0003\n\u0003\f\u0003 \t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006)\b"+
		"\u0006\n\u0006\f\u0006,\t\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002"+
		"\u0004\u0006\b\n\f\u0000\u0002\u0002\u0000\u0001\u0001\u0007\b\u0001\u0000"+
		"\u0007\b)\u0000\u000e\u0001\u0000\u0000\u0000\u0002\u0010\u0001\u0000"+
		"\u0000\u0000\u0004\u0012\u0001\u0000\u0000\u0000\u0006\u001a\u0001\u0000"+
		"\u0000\u0000\b!\u0001\u0000\u0000\u0000\n#\u0001\u0000\u0000\u0000\f%"+
		"\u0001\u0000\u0000\u0000\u000e\u000f\u0007\u0000\u0000\u0000\u000f\u0001"+
		"\u0001\u0000\u0000\u0000\u0010\u0011\u0003\u0000\u0000\u0000\u0011\u0003"+
		"\u0001\u0000\u0000\u0000\u0012\u0017\u0003\u0002\u0001\u0000\u0013\u0014"+
		"\u0005\u0004\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0013"+
		"\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0015"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0005"+
		"\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001e"+
		"\u0003\u0002\u0001\u0000\u001b\u001d\u0003\u0002\u0001\u0000\u001c\u001b"+
		"\u0001\u0000\u0000\u0000\u001d \u0001\u0000\u0000\u0000\u001e\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u0007\u0001"+
		"\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000!\"\u0007\u0001\u0000"+
		"\u0000\"\t\u0001\u0000\u0000\u0000#$\u0003\b\u0004\u0000$\u000b\u0001"+
		"\u0000\u0000\u0000%*\u0003\n\u0005\u0000&\'\u0005\u0004\u0000\u0000\'"+
		")\u0003\n\u0005\u0000(&\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000"+
		"*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+\r\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000\u0003\u0017\u001e*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}