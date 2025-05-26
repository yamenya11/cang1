// Generated from HTMLParser.g4 by ANTLR 4.10.1
package antlr.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, COMPONENT=2, FROM=3, EXPORT=4, CLASS=5, FOR=6, WHILE=7, SWITCH=8, 
		CASE=9, DEFAULT=10, INTERFACE=11, LET=12, CONST=13, IN=14, IF=15, ELSE=16, 
		AT=17, PROVIDEDIN=18, SELECTOR=19, TEMPLATEURL=20, STYLEURLS=21, ANY=22, 
		NUMBER=23, CONSTRUCTOR=24, NGONINIT=25, THIS=26, ARRAY=27, PRIVATE=28, 
		PUBLIC=29, PROTECTED=30, EXPORTAS=31, INJECTABLE=32, INPUT=33, OUTPUT=34, 
		NEW=35, IMPLEMENTS=36, EXTENDS=37, ONINIT=38, OPEN_CURLY=39, CLOSE_CURLY=40, 
		OPEN_SQUARE=41, CLOSE_SQUARE=42, OPEN_PAREN=43, CLOSE_PAREN=44, COLON=45, 
		COMMA=46, SEMICOLON=47, EQUALS=48, LESS_THAN=49, GREATER_THAN=50, STAR=51, 
		DIVIDE=52, MOD=53, PLUS=54, MINUS=55, DOT=56, OR_OPERATOR=57, NOT_EQUAL=58, 
		STRICT_NOT_EQUAL=59, ARROW=60, STRING=61, IDENTIFIER=62, INTEGER=63, LINE_COMMENT=64, 
		BLOCK_COMMENT=65, WS=66, CLOSE_TAG=67, OPEN_HTML_TAG=68, CLOSE_HTML_TAG=69, 
		SELF_CLOSING_HTML_TAG=70, ATTRIBUTE=71, NG_FOR=72, NG_IF=73, EVENT_BINDING=74, 
		PROPERTY_BINDING=75, DOUBLE_CURLY_OPEN=76, DOUBLE_CURLY_CLOSE=77, HTML_COMMENT=78, 
		TEXT=79, BOOLEAN=80, AND=81, OR=82, NOT=83;
	public static final int
		RULE_htmlDocument = 0, RULE_htmlElements = 1, RULE_htmlElement = 2, RULE_htmlAngularElement = 3, 
		RULE_htmlAngularExpression = 4, RULE_htmlContent = 5, RULE_htmlAttribute = 6, 
		RULE_htmlChardata = 7, RULE_htmlMisc = 8, RULE_htmlComment = 9, RULE_expression = 10, 
		RULE_primaryExpression = 11, RULE_functionCall = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "htmlElements", "htmlElement", "htmlAngularElement", 
			"htmlAngularExpression", "htmlContent", "htmlAttribute", "htmlChardata", 
			"htmlMisc", "htmlComment", "expression", "primaryExpression", "functionCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'@Component'", "'from'", "'export'", "'class'", "'for'", 
			"'while'", "'switch'", "'case'", "'default'", "'interface'", "'let'", 
			null, "'in'", "'if'", "'else'", "'@'", "'providedIn'", "'selector'", 
			"'templateUrl'", "'styleUrls'", "'any'", "'number'", "'constructor'", 
			"'ngOnInit'", "'this'", "'array'", "'private'", "'public'", "'protected'", 
			"'exportAs'", "'@Injectable'", "'@Input'", "'@Output'", "'new'", "'implements'", 
			"'extends'", "'OnInit'", "'{'", "'}'", "'['", "']'", "'('", "')'", "':'", 
			"','", "';'", "'='", "'<'", "'>'", "'*'", "'/'", "'%'", "'+'", "'-'", 
			"'.'", "'|'", "'!='", "'!=='", "'=>'", null, null, null, null, null, 
			null, "'</'", null, null, null, null, "'*ngFor'", "'*ngIf'", null, null, 
			"'{{'", "'}}'", null, null, null, "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "COMPONENT", "FROM", "EXPORT", "CLASS", "FOR", "WHILE", 
			"SWITCH", "CASE", "DEFAULT", "INTERFACE", "LET", "CONST", "IN", "IF", 
			"ELSE", "AT", "PROVIDEDIN", "SELECTOR", "TEMPLATEURL", "STYLEURLS", "ANY", 
			"NUMBER", "CONSTRUCTOR", "NGONINIT", "THIS", "ARRAY", "PRIVATE", "PUBLIC", 
			"PROTECTED", "EXPORTAS", "INJECTABLE", "INPUT", "OUTPUT", "NEW", "IMPLEMENTS", 
			"EXTENDS", "ONINIT", "OPEN_CURLY", "CLOSE_CURLY", "OPEN_SQUARE", "CLOSE_SQUARE", 
			"OPEN_PAREN", "CLOSE_PAREN", "COLON", "COMMA", "SEMICOLON", "EQUALS", 
			"LESS_THAN", "GREATER_THAN", "STAR", "DIVIDE", "MOD", "PLUS", "MINUS", 
			"DOT", "OR_OPERATOR", "NOT_EQUAL", "STRICT_NOT_EQUAL", "ARROW", "STRING", 
			"IDENTIFIER", "INTEGER", "LINE_COMMENT", "BLOCK_COMMENT", "WS", "CLOSE_TAG", 
			"OPEN_HTML_TAG", "CLOSE_HTML_TAG", "SELF_CLOSING_HTML_TAG", "ATTRIBUTE", 
			"NG_FOR", "NG_IF", "EVENT_BINDING", "PROPERTY_BINDING", "DOUBLE_CURLY_OPEN", 
			"DOUBLE_CURLY_CLOSE", "HTML_COMMENT", "TEXT", "BOOLEAN", "AND", "OR", 
			"NOT"
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
	public String getGrammarFileName() { return "HTMLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class HtmlDocumentContext extends ParserRuleContext {
		public List<HtmlElementsContext> htmlElements() {
			return getRuleContexts(HtmlElementsContext.class);
		}
		public HtmlElementsContext htmlElements(int i) {
			return getRuleContext(HtmlElementsContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (WS - 66)) | (1L << (OPEN_HTML_TAG - 66)) | (1L << (NG_FOR - 66)) | (1L << (NG_IF - 66)) | (1L << (DOUBLE_CURLY_OPEN - 66)) | (1L << (HTML_COMMENT - 66)))) != 0)) {
				{
				{
				setState(26);
				htmlElements();
				}
				}
				setState(31);
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

	public static class HtmlElementsContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public List<HtmlMiscContext> htmlMisc() {
			return getRuleContexts(HtmlMiscContext.class);
		}
		public HtmlMiscContext htmlMisc(int i) {
			return getRuleContext(HtmlMiscContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==HTML_COMMENT) {
				{
				{
				setState(32);
				htmlMisc();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			htmlElement();
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(39);
					htmlMisc();
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode OPEN_HTML_TAG() { return getToken(HTMLParser.OPEN_HTML_TAG, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> CLOSE_HTML_TAG() { return getTokens(HTMLParser.CLOSE_HTML_TAG); }
		public TerminalNode CLOSE_HTML_TAG(int i) {
			return getToken(HTMLParser.CLOSE_HTML_TAG, i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode SELF_CLOSING_HTML_TAG() { return getToken(HTMLParser.SELF_CLOSING_HTML_TAG, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlAngularElementContext htmlAngularElement() {
			return getRuleContext(HtmlAngularElementContext.class,0);
		}
		public HtmlAngularExpressionContext htmlAngularExpression() {
			return getRuleContext(HtmlAngularExpressionContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_HTML_TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(OPEN_HTML_TAG);
				setState(46);
				match(IDENTIFIER);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (IDENTIFIER - 62)) | (1L << (EVENT_BINDING - 62)) | (1L << (PROPERTY_BINDING - 62)))) != 0)) {
					{
					{
					setState(47);
					htmlAttribute();
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLOSE_HTML_TAG:
					{
					setState(53);
					match(CLOSE_HTML_TAG);
					setState(54);
					htmlContent();
					setState(55);
					match(CLOSE_HTML_TAG);
					setState(56);
					match(IDENTIFIER);
					}
					break;
				case SELF_CLOSING_HTML_TAG:
					{
					setState(58);
					match(SELF_CLOSING_HTML_TAG);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NG_FOR:
			case NG_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				htmlAngularElement();
				}
				break;
			case DOUBLE_CURLY_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				htmlAngularExpression();
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

	public static class HtmlAngularElementContext extends ParserRuleContext {
		public TerminalNode NG_FOR() { return getToken(HTMLParser.NG_FOR, 0); }
		public TerminalNode EQUALS() { return getToken(HTMLParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(HTMLParser.STRING, 0); }
		public TerminalNode NG_IF() { return getToken(HTMLParser.NG_IF, 0); }
		public HtmlAngularElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAngularElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlAngularElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlAngularElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlAngularElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAngularElementContext htmlAngularElement() throws RecognitionException {
		HtmlAngularElementContext _localctx = new HtmlAngularElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlAngularElement);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NG_FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(NG_FOR);
				setState(66);
				match(EQUALS);
				setState(67);
				match(STRING);
				}
				break;
			case NG_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(NG_IF);
				setState(69);
				match(EQUALS);
				setState(70);
				match(STRING);
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

	public static class HtmlAngularExpressionContext extends ParserRuleContext {
		public TerminalNode DOUBLE_CURLY_OPEN() { return getToken(HTMLParser.DOUBLE_CURLY_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOUBLE_CURLY_CLOSE() { return getToken(HTMLParser.DOUBLE_CURLY_CLOSE, 0); }
		public HtmlAngularExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAngularExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlAngularExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlAngularExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlAngularExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAngularExpressionContext htmlAngularExpression() throws RecognitionException {
		HtmlAngularExpressionContext _localctx = new HtmlAngularExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlAngularExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(DOUBLE_CURLY_OPEN);
			setState(74);
			expression(0);
			setState(75);
			match(DOUBLE_CURLY_CLOSE);
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

	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlChardataContext> htmlChardata() {
			return getRuleContexts(HtmlChardataContext.class);
		}
		public HtmlChardataContext htmlChardata(int i) {
			return getRuleContext(HtmlChardataContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<HtmlAngularExpressionContext> htmlAngularExpression() {
			return getRuleContexts(HtmlAngularExpressionContext.class);
		}
		public HtmlAngularExpressionContext htmlAngularExpression(int i) {
			return getRuleContext(HtmlAngularExpressionContext.class,i);
		}
		public List<HtmlCommentContext> htmlComment() {
			return getRuleContexts(HtmlCommentContext.class);
		}
		public HtmlCommentContext htmlComment(int i) {
			return getRuleContext(HtmlCommentContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==TEXT) {
				{
				setState(77);
				htmlChardata();
				}
			}

			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (OPEN_HTML_TAG - 68)) | (1L << (NG_FOR - 68)) | (1L << (NG_IF - 68)) | (1L << (DOUBLE_CURLY_OPEN - 68)) | (1L << (HTML_COMMENT - 68)))) != 0)) {
				{
				{
				setState(83);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(80);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(81);
					htmlAngularExpression();
					}
					break;
				case 3:
					{
					setState(82);
					htmlComment();
					}
					break;
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==TEXT) {
					{
					setState(85);
					htmlChardata();
					}
				}

				}
				}
				setState(92);
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

	public static class HtmlAttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(HTMLParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(HTMLParser.STRING, 0); }
		public TerminalNode EVENT_BINDING() { return getToken(HTMLParser.EVENT_BINDING, 0); }
		public TerminalNode PROPERTY_BINDING() { return getToken(HTMLParser.PROPERTY_BINDING, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlAttribute);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(IDENTIFIER);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(94);
					match(EQUALS);
					setState(95);
					match(STRING);
					}
				}

				}
				break;
			case EVENT_BINDING:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(EVENT_BINDING);
				setState(99);
				match(EQUALS);
				setState(100);
				match(STRING);
				}
				break;
			case PROPERTY_BINDING:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(PROPERTY_BINDING);
				setState(102);
				match(EQUALS);
				setState(103);
				match(STRING);
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

	public static class HtmlChardataContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(HTMLParser.TEXT, 0); }
		public TerminalNode WS() { return getToken(HTMLParser.WS, 0); }
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !(_la==WS || _la==TEXT) ) {
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

	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public TerminalNode WS() { return getToken(HTMLParser.WS, 0); }
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_htmlMisc);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				htmlComment();
				}
				break;
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(WS);
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

	public static class HtmlCommentContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(HTMLParser.HTML_COMMENT, 0); }
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_htmlComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(HTML_COMMENT);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(HTMLParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(HTMLParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(HTMLParser.BOOLEAN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(HTMLParser.OPEN_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(HTMLParser.CLOSE_PAREN, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(HTMLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HTMLParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(HTMLParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(HTMLParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(HTMLParser.MOD, 0); }
		public TerminalNode AND() { return getToken(HTMLParser.AND, 0); }
		public TerminalNode OR() { return getToken(HTMLParser.OR, 0); }
		public TerminalNode NOT() { return getToken(HTMLParser.NOT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(115);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(116);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(117);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(118);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				setState(119);
				functionCall();
				}
				break;
			case 6:
				{
				setState(120);
				match(OPEN_PAREN);
				setState(121);
				expression(0);
				setState(122);
				match(CLOSE_PAREN);
				}
				break;
			case 7:
				{
				setState(124);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(127);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(128);
						match(PLUS);
						setState(129);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(130);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(131);
						match(MINUS);
						setState(132);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(133);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(134);
						match(STAR);
						setState(135);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(136);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(137);
						match(DIVIDE);
						setState(138);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(139);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(140);
						match(MOD);
						setState(141);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(142);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(143);
						match(AND);
						setState(144);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(145);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(146);
						match(OR);
						setState(147);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(149);
						match(NOT);
						setState(150);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(HTMLParser.THIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(HTMLParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(HTMLParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(HTMLParser.BOOLEAN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_primaryExpression);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(THIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(NUMBER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				match(BOOLEAN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				functionCall();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(HTMLParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(HTMLParser.CLOSE_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(IDENTIFIER);
			setState(165);
			match(OPEN_PAREN);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (NUMBER - 23)) | (1L << (THIS - 23)) | (1L << (OPEN_PAREN - 23)) | (1L << (STRING - 23)) | (1L << (IDENTIFIER - 23)) | (1L << (BOOLEAN - 23)))) != 0)) {
				{
				setState(166);
				expression(0);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(167);
					match(COMMA);
					setState(168);
					expression(0);
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(176);
			match(CLOSE_PAREN);
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
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001S\u00b3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000\u001f"+
		"\t\u0000\u0001\u0001\u0005\u0001\"\b\u0001\n\u0001\f\u0001%\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001)\b\u0001\n\u0001\f\u0001,\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u00021\b\u0002\n\u0002\f\u00024\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002<\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002@\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003H\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0003\u0005O\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005T\b\u0005\u0001\u0005\u0003\u0005W\b\u0005\u0005\u0005Y\b"+
		"\u0005\n\u0005\f\u0005\\\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006a\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006i\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0003\bo\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n~\b"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0098\b\n\n"+
		"\n\f\n\u009b\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00a3\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00aa\b\f\n\f\f\f\u00ad\t\f\u0003\f\u00af\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0000\u0001\u0014\r\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u0000\u0001\u0002\u0000BBOO\u00cb\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0004?\u0001"+
		"\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000"+
		"\u0000\nN\u0001\u0000\u0000\u0000\fh\u0001\u0000\u0000\u0000\u000ej\u0001"+
		"\u0000\u0000\u0000\u0010n\u0001\u0000\u0000\u0000\u0012p\u0001\u0000\u0000"+
		"\u0000\u0014}\u0001\u0000\u0000\u0000\u0016\u00a2\u0001\u0000\u0000\u0000"+
		"\u0018\u00a4\u0001\u0000\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000"+
		"\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000"+
		"\u001e\u0001\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		" \"\u0003\u0010\b\u0000! \u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000"+
		"\u0000\u0000%#\u0001\u0000\u0000\u0000&*\u0003\u0004\u0002\u0000\')\u0003"+
		"\u0010\b\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*("+
		"\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+\u0003\u0001\u0000"+
		"\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0005D\u0000\u0000.2\u0005>\u0000"+
		"\u0000/1\u0003\f\u0006\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u00003;\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000056\u0005E\u0000\u000067\u0003\n"+
		"\u0005\u000078\u0005E\u0000\u000089\u0005>\u0000\u00009<\u0001\u0000\u0000"+
		"\u0000:<\u0005F\u0000\u0000;5\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000"+
		"\u0000<@\u0001\u0000\u0000\u0000=@\u0003\u0006\u0003\u0000>@\u0003\b\u0004"+
		"\u0000?-\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000"+
		"\u0000\u0000@\u0005\u0001\u0000\u0000\u0000AB\u0005H\u0000\u0000BC\u0005"+
		"0\u0000\u0000CH\u0005=\u0000\u0000DE\u0005I\u0000\u0000EF\u00050\u0000"+
		"\u0000FH\u0005=\u0000\u0000GA\u0001\u0000\u0000\u0000GD\u0001\u0000\u0000"+
		"\u0000H\u0007\u0001\u0000\u0000\u0000IJ\u0005L\u0000\u0000JK\u0003\u0014"+
		"\n\u0000KL\u0005M\u0000\u0000L\t\u0001\u0000\u0000\u0000MO\u0003\u000e"+
		"\u0007\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OZ\u0001"+
		"\u0000\u0000\u0000PT\u0003\u0004\u0002\u0000QT\u0003\b\u0004\u0000RT\u0003"+
		"\u0012\t\u0000SP\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000SR\u0001"+
		"\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000UW\u0003\u000e\u0007\u0000"+
		"VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000"+
		"\u0000XS\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u000b\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000]`\u0005>\u0000\u0000^_\u00050\u0000\u0000"+
		"_a\u0005=\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ai\u0001\u0000\u0000\u0000bc\u0005J\u0000\u0000cd\u00050\u0000\u0000d"+
		"i\u0005=\u0000\u0000ef\u0005K\u0000\u0000fg\u00050\u0000\u0000gi\u0005"+
		"=\u0000\u0000h]\u0001\u0000\u0000\u0000hb\u0001\u0000\u0000\u0000he\u0001"+
		"\u0000\u0000\u0000i\r\u0001\u0000\u0000\u0000jk\u0007\u0000\u0000\u0000"+
		"k\u000f\u0001\u0000\u0000\u0000lo\u0003\u0012\t\u0000mo\u0005B\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\u0011\u0001\u0000"+
		"\u0000\u0000pq\u0005N\u0000\u0000q\u0013\u0001\u0000\u0000\u0000rs\u0006"+
		"\n\uffff\uffff\u0000s~\u0005>\u0000\u0000t~\u0005=\u0000\u0000u~\u0005"+
		"\u0017\u0000\u0000v~\u0005P\u0000\u0000w~\u0003\u0018\f\u0000xy\u0005"+
		"+\u0000\u0000yz\u0003\u0014\n\u0000z{\u0005,\u0000\u0000{~\u0001\u0000"+
		"\u0000\u0000|~\u0003\u0016\u000b\u0000}r\u0001\u0000\u0000\u0000}t\u0001"+
		"\u0000\u0000\u0000}u\u0001\u0000\u0000\u0000}v\u0001\u0000\u0000\u0000"+
		"}w\u0001\u0000\u0000\u0000}x\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000"+
		"\u0000~\u0099\u0001\u0000\u0000\u0000\u007f\u0080\n\n\u0000\u0000\u0080"+
		"\u0081\u00056\u0000\u0000\u0081\u0098\u0003\u0014\n\u000b\u0082\u0083"+
		"\n\t\u0000\u0000\u0083\u0084\u00057\u0000\u0000\u0084\u0098\u0003\u0014"+
		"\n\n\u0085\u0086\n\b\u0000\u0000\u0086\u0087\u00053\u0000\u0000\u0087"+
		"\u0098\u0003\u0014\n\t\u0088\u0089\n\u0007\u0000\u0000\u0089\u008a\u0005"+
		"4\u0000\u0000\u008a\u0098\u0003\u0014\n\b\u008b\u008c\n\u0006\u0000\u0000"+
		"\u008c\u008d\u00055\u0000\u0000\u008d\u0098\u0003\u0014\n\u0007\u008e"+
		"\u008f\n\u0005\u0000\u0000\u008f\u0090\u0005Q\u0000\u0000\u0090\u0098"+
		"\u0003\u0014\n\u0006\u0091\u0092\n\u0004\u0000\u0000\u0092\u0093\u0005"+
		"R\u0000\u0000\u0093\u0098\u0003\u0014\n\u0005\u0094\u0095\n\u0003\u0000"+
		"\u0000\u0095\u0096\u0005S\u0000\u0000\u0096\u0098\u0003\u0014\n\u0004"+
		"\u0097\u007f\u0001\u0000\u0000\u0000\u0097\u0082\u0001\u0000\u0000\u0000"+
		"\u0097\u0085\u0001\u0000\u0000\u0000\u0097\u0088\u0001\u0000\u0000\u0000"+
		"\u0097\u008b\u0001\u0000\u0000\u0000\u0097\u008e\u0001\u0000\u0000\u0000"+
		"\u0097\u0091\u0001\u0000\u0000\u0000\u0097\u0094\u0001\u0000\u0000\u0000"+
		"\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0015\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u00a3\u0005\u001a\u0000\u0000"+
		"\u009d\u00a3\u0005>\u0000\u0000\u009e\u00a3\u0005=\u0000\u0000\u009f\u00a3"+
		"\u0005\u0017\u0000\u0000\u00a0\u00a3\u0005P\u0000\u0000\u00a1\u00a3\u0003"+
		"\u0018\f\u0000\u00a2\u009c\u0001\u0000\u0000\u0000\u00a2\u009d\u0001\u0000"+
		"\u0000\u0000\u00a2\u009e\u0001\u0000\u0000\u0000\u00a2\u009f\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u0017\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005>\u0000"+
		"\u0000\u00a5\u00ae\u0005+\u0000\u0000\u00a6\u00ab\u0003\u0014\n\u0000"+
		"\u00a7\u00a8\u0005.\u0000\u0000\u00a8\u00aa\u0003\u0014\n\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac"+
		"\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae"+
		"\u00a6\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005,\u0000\u0000\u00b1\u0019"+
		"\u0001\u0000\u0000\u0000\u0014\u001d#*2;?GNSVZ`hn}\u0097\u0099\u00a2\u00ab"+
		"\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}