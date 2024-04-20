// Generated from /Users/zhangpeng/Code/work/yotta_spl_2/spl_parser/src/main/java/cn/yottabyte/pipe/parser/grammar/LookupGrammar.g4 by ANTLR 4.10.1
package cn.yottabyte.pipe.parser.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LookupGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LOOKUP=1, ON=2, MATCH_TYPE=3, MATCH_TYPE_WILDCARD=4, MATCH_TYPE_CIDR=5, 
		CASE_SENSITIVE_MATCH=6, TRUE=7, FALSE=8, AS=9, WS=10, LP=11, RP=12, COMMA=13, 
		ASSIGN=14, STRING=15, SINGLE_QUOTED_STRING=16, INTEGER=17, FLOAT=18, NULL=19, 
		ID=20, BLOCK_COMMENT=21, LINE_COMMENT=22, FORMAT=23, FILENAME=24;
	public static final int
		RULE_bool_literal = 0, RULE_lookup_command = 1, RULE_match_params = 2, 
		RULE_field_equal_list = 3, RULE_field_equal = 4, RULE_match_type_params = 5, 
		RULE_rename_field_list = 6, RULE_rename_field = 7, RULE_as_field_clause = 8, 
		RULE_lookup_option = 9, RULE_string_literal = 10, RULE_int_literal = 11, 
		RULE_number_literal = 12, RULE_number_list = 13, RULE_null_literal = 14, 
		RULE_identifier = 15, RULE_field = 16, RULE_field_list = 17, RULE_file_name = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"bool_literal", "lookup_command", "match_params", "field_equal_list", 
			"field_equal", "match_type_params", "rename_field_list", "rename_field", 
			"as_field_clause", "lookup_option", "string_literal", "int_literal", 
			"number_literal", "number_list", "null_literal", "identifier", "field", 
			"field_list", "file_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'lookup'", "'on'", null, "'wildcard'", "'cidr'", null, "'true'", 
			"'false'", "'as'", null, "'('", "')'", "','", "'='", null, null, null, 
			null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LOOKUP", "ON", "MATCH_TYPE", "MATCH_TYPE_WILDCARD", "MATCH_TYPE_CIDR", 
			"CASE_SENSITIVE_MATCH", "TRUE", "FALSE", "AS", "WS", "LP", "RP", "COMMA", 
			"ASSIGN", "STRING", "SINGLE_QUOTED_STRING", "INTEGER", "FLOAT", "NULL", 
			"ID", "BLOCK_COMMENT", "LINE_COMMENT", "FORMAT", "FILENAME"
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
	public String getGrammarFileName() { return "LookupGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LookupGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(LookupGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LookupGrammarParser.FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).exitBool_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LookupGrammarVisitor ) return ((LookupGrammarVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class Lookup_commandContext extends ParserRuleContext {
		public TerminalNode LOOKUP() { return getToken(LookupGrammarParser.LOOKUP, 0); }
		public Rename_field_listContext rename_field_list() {
			return getRuleContext(Rename_field_listContext.class,0);
		}
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public TerminalNode ON() { return getToken(LookupGrammarParser.ON, 0); }
		public Field_equal_listContext field_equal_list() {
			return getRuleContext(Field_equal_listContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LookupGrammarParser.EOF, 0); }
		public List<Match_paramsContext> match_params() {
			return getRuleContexts(Match_paramsContext.class);
		}
		public Match_paramsContext match_params(int i) {
			return getRuleContext(Match_paramsContext.class,i);
		}
		public List<Lookup_optionContext> lookup_option() {
			return getRuleContexts(Lookup_optionContext.class);
		}
		public Lookup_optionContext lookup_option(int i) {
			return getRuleContext(Lookup_optionContext.class,i);
		}
		public Lookup_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lookup_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).enterLookup_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).exitLookup_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LookupGrammarVisitor ) return ((LookupGrammarVisitor<? extends T>)visitor).visitLookup_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lookup_commandContext lookup_command() throws RecognitionException {
		Lookup_commandContext _localctx = new Lookup_commandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lookup_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(LOOKUP);
			setState(41);
			rename_field_list();
			setState(42);
			file_name();
			setState(43);
			match(ON);
			setState(44);
			field_equal_list();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MATCH_TYPE || _la==CASE_SENSITIVE_MATCH) {
				{
				{
				setState(45);
				match_params();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FORMAT) {
				{
				{
				setState(51);
				lookup_option();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(EOF);
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

	public static class Match_paramsContext extends ParserRuleContext {
		public TerminalNode CASE_SENSITIVE_MATCH() { return getToken(LookupGrammarParser.CASE_SENSITIVE_MATCH, 0); }
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public TerminalNode MATCH_TYPE() { return getToken(LookupGrammarParser.MATCH_TYPE, 0); }
		public List<Match_type_paramsContext> match_type_params() {
			return getRuleContexts(Match_type_paramsContext.class);
		}
		public Match_type_paramsContext match_type_params(int i) {
			return getRuleContext(Match_type_paramsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LookupGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LookupGrammarParser.COMMA, i);
		}
		public Match_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).enterMatch_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).exitMatch_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LookupGrammarVisitor ) return ((LookupGrammarVisitor<? extends T>)visitor).visitMatch_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_paramsContext match_params() throws RecognitionException {
		Match_paramsContext _localctx = new Match_paramsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_match_params);
		int _la;
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE_SENSITIVE_MATCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(CASE_SENSITIVE_MATCH);
				setState(60);
				bool_literal();
				}
				break;
			case MATCH_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(MATCH_TYPE);
				setState(62);
				match_type_params();
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(63);
					match(COMMA);
					setState(64);
					match_type_params();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Field_equal_listContext extends ParserRuleContext {
		public List<Field_equalContext> field_equal() {
			return getRuleContexts(Field_equalContext.class);
		}
		public Field_equalContext field_equal(int i) {
			return getRuleContext(Field_equalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LookupGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LookupGrammarParser.COMMA, i);
		}
		public Field_equal_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_equal_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).enterField_equal_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).exitField_equal_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LookupGrammarVisitor ) return ((LookupGrammarVisitor<? extends T>)visitor).visitField_equal_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_equal_listContext field_equal_list() throws RecognitionException {
		Field_equal_listContext _localctx = new Field_equal_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field_equal_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			field_equal();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(73);
				match(COMMA);
				setState(74);
				field_equal();
				}
				}
				setState(79);
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

	public static class Field_equalContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(LookupGrammarParser.ASSIGN, 0); }
		public Field_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).enterField_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).exitField_equal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LookupGrammarVisitor ) return ((LookupGrammarVisitor<? extends T>)visitor).visitField_equal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_equalContext field_equal() throws RecognitionException {
		Field_equalContext _localctx = new Field_equalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			field();
			setState(81);
			match(ASSIGN);
			setState(82);
			field();
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

	public static class Match_type_paramsContext extends ParserRuleContext {
		public TerminalNode MATCH_TYPE_WILDCARD() { return getToken(LookupGrammarParser.MATCH_TYPE_WILDCARD, 0); }
		public TerminalNode LP() { return getToken(LookupGrammarParser.LP, 0); }
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public TerminalNode RP() { return getToken(LookupGrammarParser.RP, 0); }
		public TerminalNode MATCH_TYPE_CIDR() { return getToken(LookupGrammarParser.MATCH_TYPE_CIDR, 0); }
		public Match_type_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_type_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).enterMatch_type_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).exitMatch_type_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LookupGrammarVisitor ) return ((LookupGrammarVisitor<? extends T>)visitor).visitMatch_type_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_type_paramsContext match_type_params() throws RecognitionException {
		Match_type_paramsContext _localctx = new Match_type_paramsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_match_type_params);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MATCH_TYPE_WILDCARD:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(MATCH_TYPE_WILDCARD);
				setState(85);
				match(LP);
				setState(86);
				field_list();
				setState(87);
				match(RP);
				}
				break;
			case MATCH_TYPE_CIDR:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(MATCH_TYPE_CIDR);
				setState(90);
				match(LP);
				setState(91);
				field_list();
				setState(92);
				match(RP);
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

	public static class Rename_field_listContext extends ParserRuleContext {
		public List<Rename_fieldContext> rename_field() {
			return getRuleContexts(Rename_fieldContext.class);
		}
		public Rename_fieldContext rename_field(int i) {
			return getRuleContext(Rename_fieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LookupGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LookupGrammarParser.COMMA, i);
		}
		public Rename_field_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename_field_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).enterRename_field_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).exitRename_field_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LookupGrammarVisitor ) return ((LookupGrammarVisitor<? extends T>)visitor).visitRename_field_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rename_field_listContext rename_field_list() throws RecognitionException {
		Rename_field_listContext _localctx = new Rename_field_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rename_field_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			rename_field();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(97);
				match(COMMA);
				setState(98);
				rename_field();
				}
				}
				setState(103);
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

	public static class Rename_fieldContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public As_field_clauseContext as_field_clause() {
			return getRuleContext(As_field_clauseContext.class,0);
		}
		public Rename_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).enterRename_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).exitRename_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LookupGrammarVisitor ) return ((LookupGrammarVisitor<? extends T>)visitor).visitRename_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rename_fieldContext rename_field() throws RecognitionException {
		Rename_fieldContext _localctx = new Rename_fieldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rename_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			field();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(105);
				as_field_clause();
				}
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

	public static class As_field_clauseContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(LookupGrammarParser.AS, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public As_field_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_field_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).enterAs_field_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).exitAs_field_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LookupGrammarVisitor ) return ((LookupGrammarVisitor<? extends T>)visitor).visitAs_field_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final As_field_clauseContext as_field_clause() throws RecognitionException {
		As_field_clauseContext _localctx = new As_field_clauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_as_field_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(AS);
			setState(109);
			field();
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

	public static class Lookup_optionContext extends ParserRuleContext {
		public TerminalNode FORMAT() { return getToken(LookupGrammarParser.FORMAT, 0); }
		public TerminalNode STRING() { return getToken(LookupGrammarParser.STRING, 0); }
		public Lookup_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lookup_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).enterLookup_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).exitLookup_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LookupGrammarVisitor ) return ((LookupGrammarVisitor<? extends T>)visitor).visitLookup_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lookup_optionContext lookup_option() throws RecognitionException {
		Lookup_optionContext _localctx = new Lookup_optionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lookup_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(FORMAT);
			setState(112);
			match(STRING);
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

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LookupGrammarParser.ID, 0); }
		public TerminalNode STRING() { return getToken(LookupGrammarParser.STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LookupGrammarVisitor ) return ((LookupGrammarVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
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

	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(LookupGrammarParser.INTEGER, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).exitInt_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LookupGrammarVisitor ) return ((LookupGrammarVisitor<? extends T>)visitor).visitInt_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_int_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(INTEGER);
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

	public static class Number_literalContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(LookupGrammarParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(LookupGrammarParser.FLOAT, 0); }
		public Number_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).enterNumber_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).exitNumber_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LookupGrammarVisitor ) return ((LookupGrammarVisitor<? extends T>)visitor).visitNumber_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_literalContext number_literal() throws RecognitionException {
		Number_literalContext _localctx = new Number_literalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_number_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
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

	public static class Number_listContext extends ParserRuleContext {
		public List<Number_literalContext> number_literal() {
			return getRuleContexts(Number_literalContext.class);
		}
		public Number_literalContext number_literal(int i) {
			return getRuleContext(Number_literalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LookupGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LookupGrammarParser.COMMA, i);
		}
		public Number_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).enterNumber_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).exitNumber_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LookupGrammarVisitor ) return ((LookupGrammarVisitor<? extends T>)visitor).visitNumber_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_listContext number_list() throws RecognitionException {
		Number_listContext _localctx = new Number_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			number_literal();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(121);
				match(COMMA);
				setState(122);
				number_literal();
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

	public static class Null_literalContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(LookupGrammarParser.NULL, 0); }
		public Null_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).enterNull_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).exitNull_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LookupGrammarVisitor ) return ((LookupGrammarVisitor<? extends T>)visitor).visitNull_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_literalContext null_literal() throws RecognitionException {
		Null_literalContext _localctx = new Null_literalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_null_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(NULL);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LookupGrammarParser.ID, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(LookupGrammarParser.SINGLE_QUOTED_STRING, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LookupGrammarVisitor ) return ((LookupGrammarVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
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
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LookupGrammarVisitor ) return ((LookupGrammarVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
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

	public static class Field_listContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LookupGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LookupGrammarParser.COMMA, i);
		}
		public Field_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).enterField_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).exitField_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LookupGrammarVisitor ) return ((LookupGrammarVisitor<? extends T>)visitor).visitField_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_listContext field_list() throws RecognitionException {
		Field_listContext _localctx = new Field_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_field_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			field();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(135);
				match(COMMA);
				setState(136);
				field();
				}
				}
				setState(141);
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

	public static class File_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LookupGrammarParser.ID, 0); }
		public TerminalNode FILENAME() { return getToken(LookupGrammarParser.FILENAME, 0); }
		public TerminalNode STRING() { return getToken(LookupGrammarParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(LookupGrammarParser.INTEGER, 0); }
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).enterFile_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookupGrammarListener ) ((LookupGrammarListener)listener).exitFile_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LookupGrammarVisitor ) return ((LookupGrammarVisitor<? extends T>)visitor).visitFile_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_file_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INTEGER) | (1L << ID) | (1L << FILENAME))) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u0091\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001/\b\u0001\n\u0001\f\u00012\t"+
		"\u0001\u0001\u0001\u0005\u00015\b\u0001\n\u0001\f\u00018\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002B\b\u0002\n\u0002\f\u0002E\t\u0002\u0003"+
		"\u0002G\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003L\b\u0003"+
		"\n\u0003\f\u0003O\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005_\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006d\b\u0006\n\u0006\f\u0006"+
		"g\t\u0006\u0001\u0007\u0001\u0007\u0003\u0007k\b\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r|\b\r\n\r\f\r\u007f\t"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u008a\b\u0011\n\u0011"+
		"\f\u0011\u008d\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0000"+
		"\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$\u0000\u0005\u0001\u0000\u0007\b\u0002\u0000\u000f"+
		"\u000f\u0014\u0014\u0001\u0000\u0011\u0012\u0002\u0000\u0010\u0010\u0014"+
		"\u0014\u0004\u0000\u000f\u000f\u0011\u0011\u0014\u0014\u0018\u0018\u0087"+
		"\u0000&\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004F"+
		"\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000\bP\u0001\u0000"+
		"\u0000\u0000\n^\u0001\u0000\u0000\u0000\f`\u0001\u0000\u0000\u0000\u000e"+
		"h\u0001\u0000\u0000\u0000\u0010l\u0001\u0000\u0000\u0000\u0012o\u0001"+
		"\u0000\u0000\u0000\u0014r\u0001\u0000\u0000\u0000\u0016t\u0001\u0000\u0000"+
		"\u0000\u0018v\u0001\u0000\u0000\u0000\u001ax\u0001\u0000\u0000\u0000\u001c"+
		"\u0080\u0001\u0000\u0000\u0000\u001e\u0082\u0001\u0000\u0000\u0000 \u0084"+
		"\u0001\u0000\u0000\u0000\"\u0086\u0001\u0000\u0000\u0000$\u008e\u0001"+
		"\u0000\u0000\u0000&\'\u0007\u0000\u0000\u0000\'\u0001\u0001\u0000\u0000"+
		"\u0000()\u0005\u0001\u0000\u0000)*\u0003\f\u0006\u0000*+\u0003$\u0012"+
		"\u0000+,\u0005\u0002\u0000\u0000,0\u0003\u0006\u0003\u0000-/\u0003\u0004"+
		"\u0002\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u000016\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000035\u0003\u0012\t\u000043\u0001\u0000\u0000\u0000"+
		"58\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000079\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\u0000"+
		"\u0000\u0001:\u0003\u0001\u0000\u0000\u0000;<\u0005\u0006\u0000\u0000"+
		"<G\u0003\u0000\u0000\u0000=>\u0005\u0003\u0000\u0000>C\u0003\n\u0005\u0000"+
		"?@\u0005\r\u0000\u0000@B\u0003\n\u0005\u0000A?\u0001\u0000\u0000\u0000"+
		"BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000F;\u0001\u0000"+
		"\u0000\u0000F=\u0001\u0000\u0000\u0000G\u0005\u0001\u0000\u0000\u0000"+
		"HM\u0003\b\u0004\u0000IJ\u0005\r\u0000\u0000JL\u0003\b\u0004\u0000KI\u0001"+
		"\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000N\u0007\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000PQ\u0003 \u0010\u0000QR\u0005\u000e\u0000\u0000RS\u0003 \u0010"+
		"\u0000S\t\u0001\u0000\u0000\u0000TU\u0005\u0004\u0000\u0000UV\u0005\u000b"+
		"\u0000\u0000VW\u0003\"\u0011\u0000WX\u0005\f\u0000\u0000X_\u0001\u0000"+
		"\u0000\u0000YZ\u0005\u0005\u0000\u0000Z[\u0005\u000b\u0000\u0000[\\\u0003"+
		"\"\u0011\u0000\\]\u0005\f\u0000\u0000]_\u0001\u0000\u0000\u0000^T\u0001"+
		"\u0000\u0000\u0000^Y\u0001\u0000\u0000\u0000_\u000b\u0001\u0000\u0000"+
		"\u0000`e\u0003\u000e\u0007\u0000ab\u0005\r\u0000\u0000bd\u0003\u000e\u0007"+
		"\u0000ca\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000f\r\u0001\u0000\u0000\u0000ge\u0001"+
		"\u0000\u0000\u0000hj\u0003 \u0010\u0000ik\u0003\u0010\b\u0000ji\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\u000f\u0001\u0000\u0000"+
		"\u0000lm\u0005\t\u0000\u0000mn\u0003 \u0010\u0000n\u0011\u0001\u0000\u0000"+
		"\u0000op\u0005\u0017\u0000\u0000pq\u0005\u000f\u0000\u0000q\u0013\u0001"+
		"\u0000\u0000\u0000rs\u0007\u0001\u0000\u0000s\u0015\u0001\u0000\u0000"+
		"\u0000tu\u0005\u0011\u0000\u0000u\u0017\u0001\u0000\u0000\u0000vw\u0007"+
		"\u0002\u0000\u0000w\u0019\u0001\u0000\u0000\u0000x}\u0003\u0018\f\u0000"+
		"yz\u0005\r\u0000\u0000z|\u0003\u0018\f\u0000{y\u0001\u0000\u0000\u0000"+
		"|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u001b\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\u0013\u0000\u0000\u0081\u001d\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0007\u0003\u0000\u0000\u0083\u001f\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0003\u001e\u000f\u0000\u0085!\u0001\u0000\u0000\u0000\u0086"+
		"\u008b\u0003 \u0010\u0000\u0087\u0088\u0005\r\u0000\u0000\u0088\u008a"+
		"\u0003 \u0010\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008d\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c#\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0007\u0004\u0000\u0000\u008f%\u0001\u0000\u0000"+
		"\u0000\n06CFM^ej}\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}