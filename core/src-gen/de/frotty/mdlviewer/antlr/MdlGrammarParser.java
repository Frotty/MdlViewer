// Generated from C:\Users\Frotty\Documents\GitHub\MdlViewer\core\parserspec\MdlGrammar.g4 by ANTLR 4.5
package de.frotty.mdlviewer.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MdlGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, CURLY_BRACKET_OPEN=106, 
		CURLY_BRACKET_CLOSE=107, BRACKET_OPEN=108, BRACKET_CLOSE=109, COMMA=110, 
		INT=111, FLOAT=112, STRING=113, NL=114, WS=115, LINE_COMMENT=116;
	public static final int
		RULE_mdlfile = 0, RULE_versionNote = 1, RULE_modelStructure = 2, RULE_sequencesBlock = 3, 
		RULE_animationBlock = 4, RULE_globalSequenceBlock = 5, RULE_textureBlock = 6, 
		RULE_bitmapDef = 7, RULE_materialBlock = 8, RULE_materialDef = 9, RULE_layerDef = 10, 
		RULE_alphaDef = 11, RULE_textureAnimBlock = 12, RULE_tvertexAnimDef = 13, 
		RULE_geosetBlock = 14, RULE_verticesDef = 15, RULE_normalsDef = 16, RULE_tverticesDef = 17, 
		RULE_vertexGroupDef = 18, RULE_facesDef = 19, RULE_trianglesDef = 20, 
		RULE_groupsDef = 21, RULE_twoFTuple = 22, RULE_threeFTuple = 23, RULE_fourFTuple = 24, 
		RULE_geosetAnim = 25, RULE_boneDef = 26, RULE_lightDef = 27, RULE_pivotDef = 28;
	public static final String[] ruleNames = {
		"mdlfile", "versionNote", "modelStructure", "sequencesBlock", "animationBlock", 
		"globalSequenceBlock", "textureBlock", "bitmapDef", "materialBlock", "materialDef", 
		"layerDef", "alphaDef", "textureAnimBlock", "tvertexAnimDef", "geosetBlock", 
		"verticesDef", "normalsDef", "tverticesDef", "vertexGroupDef", "facesDef", 
		"trianglesDef", "groupsDef", "twoFTuple", "threeFTuple", "fourFTuple", 
		"geosetAnim", "boneDef", "lightDef", "pivotDef"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Version'", "'FormatVersion'", "'Model'", "'NumGeosets'", "'NumGeosetAnims'", 
		"'NumHelpers'", "'NumLights'", "'NumBones'", "'NumAttachments'", "'NumParticleEmitters'", 
		"'NumParticleEmitters2'", "'NumRibbonEmitters'", "'NumEvents'", "'BlendTime'", 
		"'MinimumExtent'", "'MaximumExtent'", "'BoundsRadius'", "'Sequences'", 
		"'Anim'", "'Interval'", "'NonLooping'", "'MoveSpeeed'", "'Rarity'", "'GlobalSequences'", 
		"'Duration'", "'Textures'", "'Bitmap'", "'Image'", "'ReplaceableId'", 
		"'WrapWidth'", "'WrapHeight'", "'Materials'", "'Material'", "'ConstantColor'", 
		"'SortPrimsFarZ'", "'FullResolution'", "'PriorityPlane'", "'Layer'", "'FilterMode'", 
		"'None'", "'Transparent'", "'Blend'", "'Additive'", "'AddAlpha'", "'Modulate'", 
		"'Modulate2x'", "'Unshaded'", "'SphereEnvMap'", "'TwoSided'", "'Unfogged'", 
		"'NoDepthTest'", "'NoDepthSet'", "'static'", "'TextureID'", "'TVertexAnimId'", 
		"'CoordId'", "'Alpha'", "'DontInterp'", "':'", "'TexturesAnims'", "'TVertexAnim'", 
		"'Translation'", "'Rotation'", "'Scaling'", "'Geoset'", "'MaterialID'", 
		"'SelectionGroup'", "'Unselectable'", "'Vertices'", "'Normals'", "'TVertices'", 
		"'VertexGroup'", "'Faces'", "'Triangles'", "'Groups'", "'Matrices'", "'GeosetAnim'", 
		"'DropShadow'", "'Color'", "'GeosetId'", "'Bone'", "'ObjectId'", "'Parent'", 
		"'BillboardedLockZ'", "'BillboardedLockY'", "'BillboardedLockX'", "'Billboarded'", 
		"'CameraAnchored'", "'DontInherit'", "'Multiple'", "'GeosetAnimId'", "'Hermite'", 
		"'InTan'", "'OutTan'", "'Visibility'", "'Light'", "'Omnidirectional'", 
		"'Directional'", "'Ambient'", "'AtennuationStart'", "'AtennuationEnd'", 
		"'Intensity'", "'AmbIntensity'", "'AmbColor'", "'PivotPoints'", "'{'", 
		"'}'", "'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "CURLY_BRACKET_OPEN", 
		"CURLY_BRACKET_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", "COMMA", "INT", 
		"FLOAT", "STRING", "NL", "WS", "LINE_COMMENT"
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

	@Override
	public String getGrammarFileName() { return "MdlGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MdlGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MdlfileContext extends ParserRuleContext {
		public VersionNoteContext versionNote() {
			return getRuleContext(VersionNoteContext.class,0);
		}
		public ModelStructureContext modelStructure() {
			return getRuleContext(ModelStructureContext.class,0);
		}
		public SequencesBlockContext sequencesBlock() {
			return getRuleContext(SequencesBlockContext.class,0);
		}
		public TextureBlockContext textureBlock() {
			return getRuleContext(TextureBlockContext.class,0);
		}
		public MaterialBlockContext materialBlock() {
			return getRuleContext(MaterialBlockContext.class,0);
		}
		public GlobalSequenceBlockContext globalSequenceBlock() {
			return getRuleContext(GlobalSequenceBlockContext.class,0);
		}
		public TextureAnimBlockContext textureAnimBlock() {
			return getRuleContext(TextureAnimBlockContext.class,0);
		}
		public List<GeosetBlockContext> geosetBlock() {
			return getRuleContexts(GeosetBlockContext.class);
		}
		public GeosetBlockContext geosetBlock(int i) {
			return getRuleContext(GeosetBlockContext.class,i);
		}
		public List<GeosetAnimContext> geosetAnim() {
			return getRuleContexts(GeosetAnimContext.class);
		}
		public GeosetAnimContext geosetAnim(int i) {
			return getRuleContext(GeosetAnimContext.class,i);
		}
		public List<BoneDefContext> boneDef() {
			return getRuleContexts(BoneDefContext.class);
		}
		public BoneDefContext boneDef(int i) {
			return getRuleContext(BoneDefContext.class,i);
		}
		public List<LightDefContext> lightDef() {
			return getRuleContexts(LightDefContext.class);
		}
		public LightDefContext lightDef(int i) {
			return getRuleContext(LightDefContext.class,i);
		}
		public PivotDefContext pivotDef() {
			return getRuleContext(PivotDefContext.class,0);
		}
		public MdlfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mdlfile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitMdlfile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MdlfileContext mdlfile() throws RecognitionException {
		MdlfileContext _localctx = new MdlfileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mdlfile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(58);
			versionNote();
			}
			{
			setState(59);
			modelStructure();
			}
			{
			setState(60);
			sequencesBlock();
			}
			setState(62);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(61);
				globalSequenceBlock();
				}
			}

			{
			setState(64);
			textureBlock();
			}
			{
			setState(65);
			materialBlock();
			}
			setState(67);
			_la = _input.LA(1);
			if (_la==T__59) {
				{
				setState(66);
				textureAnimBlock();
				}
			}

			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__64) {
				{
				{
				setState(69);
				geosetBlock();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__76) {
				{
				{
				setState(75);
				geosetAnim();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__80) {
				{
				{
				setState(81);
				boneDef();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__95) {
				{
				{
				setState(87);
				lightDef();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			_la = _input.LA(1);
			if (_la==T__104) {
				{
				setState(93);
				pivotDef();
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

	public static class VersionNoteContext extends ParserRuleContext {
		public Token formatVersion;
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode COMMA() { return getToken(MdlGrammarParser.COMMA, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public TerminalNode INT() { return getToken(MdlGrammarParser.INT, 0); }
		public VersionNoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionNote; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitVersionNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionNoteContext versionNote() throws RecognitionException {
		VersionNoteContext _localctx = new VersionNoteContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_versionNote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__0);
			setState(97);
			match(CURLY_BRACKET_OPEN);
			setState(98);
			match(T__1);
			setState(99);
			((VersionNoteContext)_localctx).formatVersion = match(INT);
			setState(100);
			match(COMMA);
			setState(101);
			match(CURLY_BRACKET_CLOSE);
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

	public static class ModelStructureContext extends ParserRuleContext {
		public Token modelName;
		public Token geosetCount;
		public Token geosetAnimCount;
		public Token helperCount;
		public Token lightCount;
		public Token boneCount;
		public Token attachmentCount;
		public Token emitters1Count;
		public Token emitters2Count;
		public Token ribbonEmittersCount;
		public Token eventCount;
		public Token blendTime;
		public ThreeFTupleContext minExtend;
		public ThreeFTupleContext maxExtend;
		public Token boundsRadius;
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public TerminalNode STRING() { return getToken(MdlGrammarParser.STRING, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public List<TerminalNode> INT() { return getTokens(MdlGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MdlGrammarParser.INT, i);
		}
		public List<ThreeFTupleContext> threeFTuple() {
			return getRuleContexts(ThreeFTupleContext.class);
		}
		public ThreeFTupleContext threeFTuple(int i) {
			return getRuleContext(ThreeFTupleContext.class,i);
		}
		public TerminalNode FLOAT() { return getToken(MdlGrammarParser.FLOAT, 0); }
		public ModelStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelStructure; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitModelStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelStructureContext modelStructure() throws RecognitionException {
		ModelStructureContext _localctx = new ModelStructureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modelStructure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__2);
			setState(104);
			((ModelStructureContext)_localctx).modelName = match(STRING);
			setState(105);
			match(CURLY_BRACKET_OPEN);
			setState(109);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(106);
				match(T__3);
				setState(107);
				((ModelStructureContext)_localctx).geosetCount = match(INT);
				setState(108);
				match(COMMA);
				}
			}

			setState(114);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(111);
				match(T__4);
				setState(112);
				((ModelStructureContext)_localctx).geosetAnimCount = match(INT);
				setState(113);
				match(COMMA);
				}
			}

			setState(119);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(116);
				match(T__5);
				setState(117);
				((ModelStructureContext)_localctx).helperCount = match(INT);
				setState(118);
				match(COMMA);
				}
			}

			setState(124);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(121);
				match(T__6);
				setState(122);
				((ModelStructureContext)_localctx).lightCount = match(INT);
				setState(123);
				match(COMMA);
				}
			}

			setState(129);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(126);
				match(T__7);
				setState(127);
				((ModelStructureContext)_localctx).boneCount = match(INT);
				setState(128);
				match(COMMA);
				}
			}

			setState(134);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(131);
				match(T__8);
				setState(132);
				((ModelStructureContext)_localctx).attachmentCount = match(INT);
				setState(133);
				match(COMMA);
				}
			}

			setState(139);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(136);
				match(T__9);
				setState(137);
				((ModelStructureContext)_localctx).emitters1Count = match(INT);
				setState(138);
				match(COMMA);
				}
			}

			setState(144);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(141);
				match(T__10);
				setState(142);
				((ModelStructureContext)_localctx).emitters2Count = match(INT);
				setState(143);
				match(COMMA);
				}
			}

			setState(149);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(146);
				match(T__11);
				setState(147);
				((ModelStructureContext)_localctx).ribbonEmittersCount = match(INT);
				setState(148);
				match(COMMA);
				}
			}

			setState(154);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(151);
				match(T__12);
				setState(152);
				((ModelStructureContext)_localctx).eventCount = match(INT);
				setState(153);
				match(COMMA);
				}
			}

			{
			setState(156);
			match(T__13);
			setState(157);
			((ModelStructureContext)_localctx).blendTime = match(INT);
			setState(158);
			match(COMMA);
			}
			setState(164);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(160);
				match(T__14);
				setState(161);
				((ModelStructureContext)_localctx).minExtend = threeFTuple();
				setState(162);
				match(COMMA);
				}
			}

			setState(170);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(166);
				match(T__15);
				setState(167);
				((ModelStructureContext)_localctx).maxExtend = threeFTuple();
				setState(168);
				match(COMMA);
				}
			}

			setState(175);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(172);
				match(T__16);
				setState(173);
				((ModelStructureContext)_localctx).boundsRadius = match(FLOAT);
				setState(174);
				match(COMMA);
				}
			}

			setState(177);
			match(CURLY_BRACKET_CLOSE);
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

	public static class SequencesBlockContext extends ParserRuleContext {
		public Token sequenceCount;
		public AnimationBlockContext animationBlock;
		public List<AnimationBlockContext> animations = new ArrayList<AnimationBlockContext>();
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public TerminalNode INT() { return getToken(MdlGrammarParser.INT, 0); }
		public List<AnimationBlockContext> animationBlock() {
			return getRuleContexts(AnimationBlockContext.class);
		}
		public AnimationBlockContext animationBlock(int i) {
			return getRuleContext(AnimationBlockContext.class,i);
		}
		public SequencesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequencesBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitSequencesBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequencesBlockContext sequencesBlock() throws RecognitionException {
		SequencesBlockContext _localctx = new SequencesBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sequencesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__17);
			setState(180);
			((SequencesBlockContext)_localctx).sequenceCount = match(INT);
			setState(181);
			match(CURLY_BRACKET_OPEN);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(182);
				((SequencesBlockContext)_localctx).animationBlock = animationBlock();
				((SequencesBlockContext)_localctx).animations.add(((SequencesBlockContext)_localctx).animationBlock);
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(CURLY_BRACKET_CLOSE);
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

	public static class AnimationBlockContext extends ParserRuleContext {
		public Token animName;
		public Token intervalx;
		public Token intervaly;
		public Token moveSpeed;
		public Token rarity;
		public ThreeFTupleContext minExtend;
		public ThreeFTupleContext maxExtend;
		public Token boundsRadius;
		public List<TerminalNode> CURLY_BRACKET_OPEN() { return getTokens(MdlGrammarParser.CURLY_BRACKET_OPEN); }
		public TerminalNode CURLY_BRACKET_OPEN(int i) {
			return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, i);
		}
		public List<TerminalNode> CURLY_BRACKET_CLOSE() { return getTokens(MdlGrammarParser.CURLY_BRACKET_CLOSE); }
		public TerminalNode CURLY_BRACKET_CLOSE(int i) {
			return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public TerminalNode STRING() { return getToken(MdlGrammarParser.STRING, 0); }
		public List<TerminalNode> INT() { return getTokens(MdlGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MdlGrammarParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(MdlGrammarParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(MdlGrammarParser.FLOAT, i);
		}
		public List<ThreeFTupleContext> threeFTuple() {
			return getRuleContexts(ThreeFTupleContext.class);
		}
		public ThreeFTupleContext threeFTuple(int i) {
			return getRuleContext(ThreeFTupleContext.class,i);
		}
		public AnimationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animationBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitAnimationBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimationBlockContext animationBlock() throws RecognitionException {
		AnimationBlockContext _localctx = new AnimationBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_animationBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__18);
			setState(192);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(191);
				((AnimationBlockContext)_localctx).animName = match(STRING);
				}
			}

			setState(194);
			match(CURLY_BRACKET_OPEN);
			setState(202);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(195);
				match(T__19);
				setState(196);
				match(CURLY_BRACKET_OPEN);
				setState(197);
				((AnimationBlockContext)_localctx).intervalx = match(INT);
				setState(198);
				match(COMMA);
				setState(199);
				((AnimationBlockContext)_localctx).intervaly = match(INT);
				setState(200);
				match(CURLY_BRACKET_CLOSE);
				setState(201);
				match(COMMA);
				}
			}

			setState(206);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(204);
				match(T__20);
				setState(205);
				match(COMMA);
				}
			}

			setState(211);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(208);
				match(T__21);
				setState(209);
				((AnimationBlockContext)_localctx).moveSpeed = match(FLOAT);
				setState(210);
				match(COMMA);
				}
			}

			setState(216);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(213);
				match(T__22);
				setState(214);
				((AnimationBlockContext)_localctx).rarity = match(FLOAT);
				setState(215);
				match(COMMA);
				}
			}

			setState(222);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(218);
				match(T__14);
				setState(219);
				((AnimationBlockContext)_localctx).minExtend = threeFTuple();
				setState(220);
				match(COMMA);
				}
			}

			setState(228);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(224);
				match(T__15);
				setState(225);
				((AnimationBlockContext)_localctx).maxExtend = threeFTuple();
				setState(226);
				match(COMMA);
				}
			}

			setState(233);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(230);
				match(T__16);
				setState(231);
				((AnimationBlockContext)_localctx).boundsRadius = match(FLOAT);
				setState(232);
				match(COMMA);
				}
			}

			setState(235);
			match(CURLY_BRACKET_CLOSE);
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

	public static class GlobalSequenceBlockContext extends ParserRuleContext {
		public Token INT;
		public List<Token> durations = new ArrayList<Token>();
		public List<TerminalNode> INT() { return getTokens(MdlGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MdlGrammarParser.INT, i);
		}
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public GlobalSequenceBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalSequenceBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitGlobalSequenceBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalSequenceBlockContext globalSequenceBlock() throws RecognitionException {
		GlobalSequenceBlockContext _localctx = new GlobalSequenceBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_globalSequenceBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__23);
			setState(238);
			match(INT);
			setState(239);
			match(CURLY_BRACKET_OPEN);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(240);
				match(T__24);
				setState(241);
				((GlobalSequenceBlockContext)_localctx).INT = match(INT);
				((GlobalSequenceBlockContext)_localctx).durations.add(((GlobalSequenceBlockContext)_localctx).INT);
				setState(242);
				match(COMMA);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(CURLY_BRACKET_CLOSE);
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

	public static class TextureBlockContext extends ParserRuleContext {
		public Token textureId;
		public BitmapDefContext bitmapDef;
		public List<BitmapDefContext> bitmaps = new ArrayList<BitmapDefContext>();
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public TerminalNode INT() { return getToken(MdlGrammarParser.INT, 0); }
		public List<BitmapDefContext> bitmapDef() {
			return getRuleContexts(BitmapDefContext.class);
		}
		public BitmapDefContext bitmapDef(int i) {
			return getRuleContext(BitmapDefContext.class,i);
		}
		public TextureBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textureBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitTextureBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextureBlockContext textureBlock() throws RecognitionException {
		TextureBlockContext _localctx = new TextureBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_textureBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__25);
			setState(251);
			((TextureBlockContext)_localctx).textureId = match(INT);
			setState(252);
			match(CURLY_BRACKET_OPEN);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(253);
				((TextureBlockContext)_localctx).bitmapDef = bitmapDef();
				((TextureBlockContext)_localctx).bitmaps.add(((TextureBlockContext)_localctx).bitmapDef);
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			match(CURLY_BRACKET_CLOSE);
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

	public static class BitmapDefContext extends ParserRuleContext {
		public Token imagePath;
		public Token replaceableId;
		public Token wrapWidth;
		public Token wrapHeight;
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public TerminalNode STRING() { return getToken(MdlGrammarParser.STRING, 0); }
		public TerminalNode INT() { return getToken(MdlGrammarParser.INT, 0); }
		public BitmapDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitmapDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitBitmapDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitmapDefContext bitmapDef() throws RecognitionException {
		BitmapDefContext _localctx = new BitmapDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bitmapDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__26);
			setState(262);
			match(CURLY_BRACKET_OPEN);
			setState(263);
			match(T__27);
			setState(264);
			((BitmapDefContext)_localctx).imagePath = match(STRING);
			setState(265);
			match(COMMA);
			setState(269);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(266);
				match(T__28);
				setState(267);
				((BitmapDefContext)_localctx).replaceableId = match(INT);
				setState(268);
				match(COMMA);
				}
			}

			setState(273);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(271);
				((BitmapDefContext)_localctx).wrapWidth = match(T__29);
				setState(272);
				match(COMMA);
				}
			}

			setState(277);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(275);
				((BitmapDefContext)_localctx).wrapHeight = match(T__30);
				setState(276);
				match(COMMA);
				}
			}

			setState(279);
			match(CURLY_BRACKET_CLOSE);
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

	public static class MaterialBlockContext extends ParserRuleContext {
		public MaterialDefContext materialDef;
		public List<MaterialDefContext> materials = new ArrayList<MaterialDefContext>();
		public TerminalNode INT() { return getToken(MdlGrammarParser.INT, 0); }
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public List<MaterialDefContext> materialDef() {
			return getRuleContexts(MaterialDefContext.class);
		}
		public MaterialDefContext materialDef(int i) {
			return getRuleContext(MaterialDefContext.class,i);
		}
		public MaterialBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materialBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitMaterialBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaterialBlockContext materialBlock() throws RecognitionException {
		MaterialBlockContext _localctx = new MaterialBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_materialBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__31);
			setState(282);
			match(INT);
			setState(283);
			match(CURLY_BRACKET_OPEN);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32) {
				{
				{
				setState(284);
				((MaterialBlockContext)_localctx).materialDef = materialDef();
				((MaterialBlockContext)_localctx).materials.add(((MaterialBlockContext)_localctx).materialDef);
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			match(CURLY_BRACKET_CLOSE);
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

	public static class MaterialDefContext extends ParserRuleContext {
		public LayerDefContext layerDef;
		public List<LayerDefContext> layers = new ArrayList<LayerDefContext>();
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public TerminalNode INT() { return getToken(MdlGrammarParser.INT, 0); }
		public List<LayerDefContext> layerDef() {
			return getRuleContexts(LayerDefContext.class);
		}
		public LayerDefContext layerDef(int i) {
			return getRuleContext(LayerDefContext.class,i);
		}
		public MaterialDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materialDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitMaterialDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaterialDefContext materialDef() throws RecognitionException {
		MaterialDefContext _localctx = new MaterialDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_materialDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__32);
			setState(293);
			match(CURLY_BRACKET_OPEN);
			setState(296);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(294);
				match(T__33);
				setState(295);
				match(COMMA);
				}
			}

			setState(300);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(298);
				match(T__34);
				setState(299);
				match(COMMA);
				}
			}

			setState(304);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(302);
				match(T__35);
				setState(303);
				match(COMMA);
				}
			}

			setState(309);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(306);
				match(T__36);
				setState(307);
				match(INT);
				setState(308);
				match(COMMA);
				}
			}

			setState(312); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(311);
				((MaterialDefContext)_localctx).layerDef = layerDef();
				((MaterialDefContext)_localctx).layers.add(((MaterialDefContext)_localctx).layerDef);
				}
				}
				setState(314); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__37 );
			setState(316);
			match(CURLY_BRACKET_CLOSE);
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

	public static class LayerDefContext extends ParserRuleContext {
		public Token textureId;
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public List<TerminalNode> INT() { return getTokens(MdlGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MdlGrammarParser.INT, i);
		}
		public AlphaDefContext alphaDef() {
			return getRuleContext(AlphaDefContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(MdlGrammarParser.FLOAT, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(MdlGrammarParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(MdlGrammarParser.BRACKET_CLOSE, 0); }
		public LayerDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layerDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitLayerDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayerDefContext layerDef() throws RecognitionException {
		LayerDefContext _localctx = new LayerDefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_layerDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(T__37);
			setState(319);
			match(CURLY_BRACKET_OPEN);
			setState(320);
			match(T__38);
			setState(321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(322);
			match(COMMA);
			setState(325);
			_la = _input.LA(1);
			if (_la==T__46) {
				{
				setState(323);
				match(T__46);
				setState(324);
				match(COMMA);
				}
			}

			setState(329);
			_la = _input.LA(1);
			if (_la==T__47) {
				{
				setState(327);
				match(T__47);
				setState(328);
				match(COMMA);
				}
			}

			setState(333);
			_la = _input.LA(1);
			if (_la==T__48) {
				{
				setState(331);
				match(T__48);
				setState(332);
				match(COMMA);
				}
			}

			setState(337);
			_la = _input.LA(1);
			if (_la==T__49) {
				{
				setState(335);
				match(T__49);
				setState(336);
				match(COMMA);
				}
			}

			setState(341);
			_la = _input.LA(1);
			if (_la==T__50) {
				{
				setState(339);
				match(T__50);
				setState(340);
				match(COMMA);
				}
			}

			setState(345);
			_la = _input.LA(1);
			if (_la==T__51) {
				{
				setState(343);
				match(T__51);
				setState(344);
				match(COMMA);
				}
			}

			{
			setState(347);
			match(T__52);
			setState(354);
			switch (_input.LA(1)) {
			case T__53:
				{
				setState(348);
				match(T__53);
				setState(349);
				((LayerDefContext)_localctx).textureId = match(INT);
				}
				break;
			case BRACKET_OPEN:
				{
				setState(350);
				match(BRACKET_OPEN);
				setState(351);
				match(T__53);
				setState(352);
				match(INT);
				setState(353);
				match(BRACKET_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(356);
			match(COMMA);
			}
			setState(361);
			_la = _input.LA(1);
			if (_la==T__54) {
				{
				setState(358);
				match(T__54);
				setState(359);
				match(INT);
				setState(360);
				match(COMMA);
				}
			}

			setState(366);
			_la = _input.LA(1);
			if (_la==T__55) {
				{
				setState(363);
				match(T__55);
				setState(364);
				match(INT);
				setState(365);
				match(COMMA);
				}
			}

			setState(379);
			switch (_input.LA(1)) {
			case T__52:
				{
				{
				setState(368);
				match(T__52);
				setState(370);
				_la = _input.LA(1);
				if (_la==BRACKET_OPEN) {
					{
					setState(369);
					match(BRACKET_OPEN);
					}
				}

				setState(372);
				match(T__56);
				setState(373);
				match(FLOAT);
				setState(375);
				_la = _input.LA(1);
				if (_la==BRACKET_CLOSE) {
					{
					setState(374);
					match(BRACKET_CLOSE);
					}
				}

				setState(377);
				match(COMMA);
				}
				}
				break;
			case T__56:
				{
				setState(378);
				alphaDef();
				}
				break;
			case CURLY_BRACKET_CLOSE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(381);
			match(CURLY_BRACKET_CLOSE);
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

	public static class AlphaDefContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(MdlGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MdlGrammarParser.INT, i);
		}
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(MdlGrammarParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(MdlGrammarParser.FLOAT, i);
		}
		public AlphaDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphaDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitAlphaDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphaDefContext alphaDef() throws RecognitionException {
		AlphaDefContext _localctx = new AlphaDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_alphaDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(T__56);
			setState(384);
			match(INT);
			setState(385);
			match(CURLY_BRACKET_OPEN);
			setState(388);
			_la = _input.LA(1);
			if (_la==T__57) {
				{
				setState(386);
				match(T__57);
				setState(387);
				match(COMMA);
				}
			}

			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(390);
				match(INT);
				setState(391);
				match(T__58);
				setState(392);
				match(FLOAT);
				setState(393);
				match(COMMA);
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
			match(CURLY_BRACKET_CLOSE);
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

	public static class TextureAnimBlockContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MdlGrammarParser.INT, 0); }
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public List<TvertexAnimDefContext> tvertexAnimDef() {
			return getRuleContexts(TvertexAnimDefContext.class);
		}
		public TvertexAnimDefContext tvertexAnimDef(int i) {
			return getRuleContext(TvertexAnimDefContext.class,i);
		}
		public TextureAnimBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textureAnimBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitTextureAnimBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextureAnimBlockContext textureAnimBlock() throws RecognitionException {
		TextureAnimBlockContext _localctx = new TextureAnimBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_textureAnimBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(T__59);
			setState(402);
			match(INT);
			setState(403);
			match(CURLY_BRACKET_OPEN);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__60) {
				{
				{
				setState(404);
				tvertexAnimDef();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410);
			match(CURLY_BRACKET_CLOSE);
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

	public static class TvertexAnimDefContext extends ParserRuleContext {
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public List<ThreeFTupleContext> threeFTuple() {
			return getRuleContexts(ThreeFTupleContext.class);
		}
		public ThreeFTupleContext threeFTuple(int i) {
			return getRuleContext(ThreeFTupleContext.class,i);
		}
		public FourFTupleContext fourFTuple() {
			return getRuleContext(FourFTupleContext.class,0);
		}
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public TvertexAnimDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tvertexAnimDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitTvertexAnimDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TvertexAnimDefContext tvertexAnimDef() throws RecognitionException {
		TvertexAnimDefContext _localctx = new TvertexAnimDefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tvertexAnimDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(T__60);
			setState(413);
			match(CURLY_BRACKET_OPEN);
			setState(414);
			match(BRACKET_OPEN);
			setState(415);
			match(T__61);
			setState(416);
			threeFTuple();
			setState(417);
			match(BRACKET_CLOSE);
			setState(418);
			match(BRACKET_OPEN);
			setState(419);
			match(T__62);
			setState(420);
			fourFTuple();
			setState(421);
			match(BRACKET_CLOSE);
			setState(422);
			match(BRACKET_OPEN);
			setState(423);
			match(T__63);
			setState(424);
			threeFTuple();
			setState(425);
			match(BRACKET_CLOSE);
			setState(426);
			match(CURLY_BRACKET_CLOSE);
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

	public static class GeosetBlockContext extends ParserRuleContext {
		public Token materialId;
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public VerticesDefContext verticesDef() {
			return getRuleContext(VerticesDefContext.class,0);
		}
		public VertexGroupDefContext vertexGroupDef() {
			return getRuleContext(VertexGroupDefContext.class,0);
		}
		public FacesDefContext facesDef() {
			return getRuleContext(FacesDefContext.class,0);
		}
		public GroupsDefContext groupsDef() {
			return getRuleContext(GroupsDefContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public List<TerminalNode> INT() { return getTokens(MdlGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MdlGrammarParser.INT, i);
		}
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public NormalsDefContext normalsDef() {
			return getRuleContext(NormalsDefContext.class,0);
		}
		public TverticesDefContext tverticesDef() {
			return getRuleContext(TverticesDefContext.class,0);
		}
		public List<ThreeFTupleContext> threeFTuple() {
			return getRuleContexts(ThreeFTupleContext.class);
		}
		public ThreeFTupleContext threeFTuple(int i) {
			return getRuleContext(ThreeFTupleContext.class,i);
		}
		public TerminalNode FLOAT() { return getToken(MdlGrammarParser.FLOAT, 0); }
		public List<AnimationBlockContext> animationBlock() {
			return getRuleContexts(AnimationBlockContext.class);
		}
		public AnimationBlockContext animationBlock(int i) {
			return getRuleContext(AnimationBlockContext.class,i);
		}
		public GeosetBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geosetBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitGeosetBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeosetBlockContext geosetBlock() throws RecognitionException {
		GeosetBlockContext _localctx = new GeosetBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_geosetBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(T__64);
			setState(429);
			match(CURLY_BRACKET_OPEN);
			setState(430);
			verticesDef();
			setState(432);
			_la = _input.LA(1);
			if (_la==T__69) {
				{
				setState(431);
				normalsDef();
				}
			}

			setState(435);
			_la = _input.LA(1);
			if (_la==T__70) {
				{
				setState(434);
				tverticesDef();
				}
			}

			setState(437);
			vertexGroupDef();
			setState(438);
			facesDef();
			setState(439);
			groupsDef();
			setState(444);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(440);
				match(T__14);
				setState(441);
				threeFTuple();
				setState(442);
				match(COMMA);
				}
			}

			setState(450);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(446);
				match(T__15);
				setState(447);
				threeFTuple();
				setState(448);
				match(COMMA);
				}
			}

			setState(455);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(452);
				match(T__16);
				setState(453);
				match(FLOAT);
				setState(454);
				match(COMMA);
				}
			}

			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(457);
				animationBlock();
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
			match(T__65);
			setState(464);
			((GeosetBlockContext)_localctx).materialId = match(INT);
			setState(465);
			match(COMMA);
			setState(466);
			match(T__66);
			setState(467);
			match(INT);
			setState(468);
			match(COMMA);
			setState(471);
			_la = _input.LA(1);
			if (_la==T__67) {
				{
				setState(469);
				match(T__67);
				setState(470);
				match(COMMA);
				}
			}

			setState(473);
			match(CURLY_BRACKET_CLOSE);
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

	public static class VerticesDefContext extends ParserRuleContext {
		public Token vertexCount;
		public ThreeFTupleContext threeFTuple;
		public List<ThreeFTupleContext> vertexPos = new ArrayList<ThreeFTupleContext>();
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public TerminalNode INT() { return getToken(MdlGrammarParser.INT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public List<ThreeFTupleContext> threeFTuple() {
			return getRuleContexts(ThreeFTupleContext.class);
		}
		public ThreeFTupleContext threeFTuple(int i) {
			return getRuleContext(ThreeFTupleContext.class,i);
		}
		public VerticesDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verticesDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitVerticesDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerticesDefContext verticesDef() throws RecognitionException {
		VerticesDefContext _localctx = new VerticesDefContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_verticesDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(T__68);
			setState(476);
			((VerticesDefContext)_localctx).vertexCount = match(INT);
			setState(477);
			match(CURLY_BRACKET_OPEN);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CURLY_BRACKET_OPEN) {
				{
				{
				setState(478);
				((VerticesDefContext)_localctx).threeFTuple = threeFTuple();
				((VerticesDefContext)_localctx).vertexPos.add(((VerticesDefContext)_localctx).threeFTuple);
				setState(479);
				match(COMMA);
				}
				}
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(486);
			match(CURLY_BRACKET_CLOSE);
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

	public static class NormalsDefContext extends ParserRuleContext {
		public ThreeFTupleContext threeFTuple;
		public List<ThreeFTupleContext> normals = new ArrayList<ThreeFTupleContext>();
		public TerminalNode INT() { return getToken(MdlGrammarParser.INT, 0); }
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public List<ThreeFTupleContext> threeFTuple() {
			return getRuleContexts(ThreeFTupleContext.class);
		}
		public ThreeFTupleContext threeFTuple(int i) {
			return getRuleContext(ThreeFTupleContext.class,i);
		}
		public NormalsDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalsDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitNormalsDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalsDefContext normalsDef() throws RecognitionException {
		NormalsDefContext _localctx = new NormalsDefContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_normalsDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(T__69);
			setState(489);
			match(INT);
			setState(490);
			match(CURLY_BRACKET_OPEN);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CURLY_BRACKET_OPEN) {
				{
				{
				setState(491);
				((NormalsDefContext)_localctx).threeFTuple = threeFTuple();
				((NormalsDefContext)_localctx).normals.add(((NormalsDefContext)_localctx).threeFTuple);
				setState(492);
				match(COMMA);
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499);
			match(CURLY_BRACKET_CLOSE);
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

	public static class TverticesDefContext extends ParserRuleContext {
		public Token tvertCount;
		public TwoFTupleContext twoFTuple;
		public List<TwoFTupleContext> textureCoords = new ArrayList<TwoFTupleContext>();
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public TerminalNode INT() { return getToken(MdlGrammarParser.INT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public List<TwoFTupleContext> twoFTuple() {
			return getRuleContexts(TwoFTupleContext.class);
		}
		public TwoFTupleContext twoFTuple(int i) {
			return getRuleContext(TwoFTupleContext.class,i);
		}
		public TverticesDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tverticesDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitTverticesDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TverticesDefContext tverticesDef() throws RecognitionException {
		TverticesDefContext _localctx = new TverticesDefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tverticesDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(T__70);
			setState(502);
			((TverticesDefContext)_localctx).tvertCount = match(INT);
			setState(503);
			match(CURLY_BRACKET_OPEN);
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CURLY_BRACKET_OPEN) {
				{
				{
				setState(504);
				((TverticesDefContext)_localctx).twoFTuple = twoFTuple();
				((TverticesDefContext)_localctx).textureCoords.add(((TverticesDefContext)_localctx).twoFTuple);
				setState(505);
				match(COMMA);
				}
				}
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(512);
			match(CURLY_BRACKET_CLOSE);
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

	public static class VertexGroupDefContext extends ParserRuleContext {
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public List<TerminalNode> INT() { return getTokens(MdlGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MdlGrammarParser.INT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public VertexGroupDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertexGroupDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitVertexGroupDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VertexGroupDefContext vertexGroupDef() throws RecognitionException {
		VertexGroupDefContext _localctx = new VertexGroupDefContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_vertexGroupDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(T__71);
			setState(515);
			match(CURLY_BRACKET_OPEN);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(516);
				match(INT);
				setState(517);
				match(COMMA);
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(523);
			match(CURLY_BRACKET_CLOSE);
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

	public static class FacesDefContext extends ParserRuleContext {
		public Token facesCount;
		public TrianglesDefContext triangle;
		public List<TerminalNode> INT() { return getTokens(MdlGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MdlGrammarParser.INT, i);
		}
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public List<TrianglesDefContext> trianglesDef() {
			return getRuleContexts(TrianglesDefContext.class);
		}
		public TrianglesDefContext trianglesDef(int i) {
			return getRuleContext(TrianglesDefContext.class,i);
		}
		public FacesDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facesDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitFacesDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FacesDefContext facesDef() throws RecognitionException {
		FacesDefContext _localctx = new FacesDefContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_facesDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(T__72);
			setState(526);
			match(INT);
			setState(527);
			((FacesDefContext)_localctx).facesCount = match(INT);
			setState(528);
			match(CURLY_BRACKET_OPEN);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__73) {
				{
				{
				setState(529);
				((FacesDefContext)_localctx).triangle = trianglesDef();
				}
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(535);
			match(CURLY_BRACKET_CLOSE);
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

	public static class TrianglesDefContext extends ParserRuleContext {
		public Token INT;
		public List<Token> tris = new ArrayList<Token>();
		public Token lastTri;
		public List<TerminalNode> CURLY_BRACKET_OPEN() { return getTokens(MdlGrammarParser.CURLY_BRACKET_OPEN); }
		public TerminalNode CURLY_BRACKET_OPEN(int i) {
			return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, i);
		}
		public List<TerminalNode> CURLY_BRACKET_CLOSE() { return getTokens(MdlGrammarParser.CURLY_BRACKET_CLOSE); }
		public TerminalNode CURLY_BRACKET_CLOSE(int i) {
			return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public List<TerminalNode> INT() { return getTokens(MdlGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MdlGrammarParser.INT, i);
		}
		public TrianglesDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trianglesDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitTrianglesDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrianglesDefContext trianglesDef() throws RecognitionException {
		TrianglesDefContext _localctx = new TrianglesDefContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_trianglesDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(T__73);
			setState(538);
			match(CURLY_BRACKET_OPEN);
			setState(539);
			match(CURLY_BRACKET_OPEN);
			setState(544);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(540);
					((TrianglesDefContext)_localctx).INT = match(INT);
					((TrianglesDefContext)_localctx).tris.add(((TrianglesDefContext)_localctx).INT);
					setState(541);
					match(COMMA);
					}
					} 
				}
				setState(546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(547);
			((TrianglesDefContext)_localctx).lastTri = match(INT);
			setState(548);
			match(CURLY_BRACKET_CLOSE);
			setState(549);
			match(COMMA);
			setState(550);
			match(CURLY_BRACKET_CLOSE);
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

	public static class GroupsDefContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(MdlGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MdlGrammarParser.INT, i);
		}
		public List<TerminalNode> CURLY_BRACKET_OPEN() { return getTokens(MdlGrammarParser.CURLY_BRACKET_OPEN); }
		public TerminalNode CURLY_BRACKET_OPEN(int i) {
			return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, i);
		}
		public List<TerminalNode> CURLY_BRACKET_CLOSE() { return getTokens(MdlGrammarParser.CURLY_BRACKET_CLOSE); }
		public TerminalNode CURLY_BRACKET_CLOSE(int i) {
			return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public GroupsDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupsDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitGroupsDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupsDefContext groupsDef() throws RecognitionException {
		GroupsDefContext _localctx = new GroupsDefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_groupsDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(T__74);
			setState(553);
			match(INT);
			setState(554);
			match(INT);
			setState(555);
			match(CURLY_BRACKET_OPEN);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__75) {
				{
				{
				setState(556);
				match(T__75);
				setState(557);
				match(CURLY_BRACKET_OPEN);
				setState(558);
				match(INT);
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INT) {
					{
					{
					setState(559);
					match(INT);
					setState(560);
					match(COMMA);
					}
					}
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(566);
				match(CURLY_BRACKET_CLOSE);
				setState(567);
				match(COMMA);
				}
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(573);
			match(CURLY_BRACKET_CLOSE);
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

	public static class TwoFTupleContext extends ParserRuleContext {
		public Token x;
		public Token y;
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode COMMA() { return getToken(MdlGrammarParser.COMMA, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public List<TerminalNode> FLOAT() { return getTokens(MdlGrammarParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(MdlGrammarParser.FLOAT, i);
		}
		public TwoFTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoFTuple; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitTwoFTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TwoFTupleContext twoFTuple() throws RecognitionException {
		TwoFTupleContext _localctx = new TwoFTupleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_twoFTuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(CURLY_BRACKET_OPEN);
			setState(576);
			((TwoFTupleContext)_localctx).x = match(FLOAT);
			setState(577);
			match(COMMA);
			setState(578);
			((TwoFTupleContext)_localctx).y = match(FLOAT);
			setState(579);
			match(CURLY_BRACKET_CLOSE);
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

	public static class ThreeFTupleContext extends ParserRuleContext {
		public Token x;
		public Token y;
		public Token z;
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public List<TerminalNode> FLOAT() { return getTokens(MdlGrammarParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(MdlGrammarParser.FLOAT, i);
		}
		public ThreeFTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_threeFTuple; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitThreeFTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThreeFTupleContext threeFTuple() throws RecognitionException {
		ThreeFTupleContext _localctx = new ThreeFTupleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_threeFTuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(CURLY_BRACKET_OPEN);
			setState(582);
			((ThreeFTupleContext)_localctx).x = match(FLOAT);
			setState(583);
			match(COMMA);
			setState(584);
			((ThreeFTupleContext)_localctx).y = match(FLOAT);
			setState(585);
			match(COMMA);
			setState(586);
			((ThreeFTupleContext)_localctx).z = match(FLOAT);
			setState(587);
			match(CURLY_BRACKET_CLOSE);
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

	public static class FourFTupleContext extends ParserRuleContext {
		public Token v;
		public Token w;
		public Token x;
		public Token y;
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public List<TerminalNode> FLOAT() { return getTokens(MdlGrammarParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(MdlGrammarParser.FLOAT, i);
		}
		public FourFTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fourFTuple; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitFourFTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FourFTupleContext fourFTuple() throws RecognitionException {
		FourFTupleContext _localctx = new FourFTupleContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fourFTuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(CURLY_BRACKET_OPEN);
			setState(590);
			((FourFTupleContext)_localctx).v = match(FLOAT);
			setState(591);
			match(COMMA);
			setState(592);
			((FourFTupleContext)_localctx).w = match(FLOAT);
			setState(593);
			match(COMMA);
			setState(594);
			((FourFTupleContext)_localctx).x = match(FLOAT);
			setState(595);
			match(COMMA);
			setState(596);
			((FourFTupleContext)_localctx).y = match(FLOAT);
			setState(597);
			match(CURLY_BRACKET_CLOSE);
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

	public static class GeosetAnimContext extends ParserRuleContext {
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(MdlGrammarParser.BRACKET_OPEN, 0); }
		public TerminalNode FLOAT() { return getToken(MdlGrammarParser.FLOAT, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(MdlGrammarParser.BRACKET_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public TerminalNode INT() { return getToken(MdlGrammarParser.INT, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public ThreeFTupleContext threeFTuple() {
			return getRuleContext(ThreeFTupleContext.class,0);
		}
		public GeosetAnimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geosetAnim; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitGeosetAnim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeosetAnimContext geosetAnim() throws RecognitionException {
		GeosetAnimContext _localctx = new GeosetAnimContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_geosetAnim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(T__76);
			setState(600);
			match(CURLY_BRACKET_OPEN);
			setState(603);
			_la = _input.LA(1);
			if (_la==T__77) {
				{
				setState(601);
				match(T__77);
				setState(602);
				match(COMMA);
				}
			}

			setState(605);
			match(T__52);
			setState(606);
			match(BRACKET_OPEN);
			setState(607);
			match(T__56);
			setState(608);
			match(FLOAT);
			setState(609);
			match(BRACKET_CLOSE);
			setState(610);
			match(COMMA);
			setState(618);
			_la = _input.LA(1);
			if (_la==T__52) {
				{
				setState(611);
				match(T__52);
				setState(612);
				match(BRACKET_OPEN);
				setState(613);
				match(T__78);
				setState(614);
				threeFTuple();
				setState(615);
				match(BRACKET_CLOSE);
				setState(616);
				match(COMMA);
				}
			}

			setState(620);
			match(T__79);
			setState(621);
			match(INT);
			setState(622);
			match(COMMA);
			setState(623);
			match(CURLY_BRACKET_CLOSE);
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

	public static class BoneDefContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MdlGrammarParser.STRING, 0); }
		public List<TerminalNode> CURLY_BRACKET_OPEN() { return getTokens(MdlGrammarParser.CURLY_BRACKET_OPEN); }
		public TerminalNode CURLY_BRACKET_OPEN(int i) {
			return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, i);
		}
		public List<TerminalNode> INT() { return getTokens(MdlGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MdlGrammarParser.INT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public List<TerminalNode> CURLY_BRACKET_CLOSE() { return getTokens(MdlGrammarParser.CURLY_BRACKET_CLOSE); }
		public TerminalNode CURLY_BRACKET_CLOSE(int i) {
			return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, i);
		}
		public List<ThreeFTupleContext> threeFTuple() {
			return getRuleContexts(ThreeFTupleContext.class);
		}
		public ThreeFTupleContext threeFTuple(int i) {
			return getRuleContext(ThreeFTupleContext.class,i);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(MdlGrammarParser.BRACKET_CLOSE); }
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(MdlGrammarParser.BRACKET_CLOSE, i);
		}
		public TerminalNode FLOAT() { return getToken(MdlGrammarParser.FLOAT, 0); }
		public List<FourFTupleContext> fourFTuple() {
			return getRuleContexts(FourFTupleContext.class);
		}
		public FourFTupleContext fourFTuple(int i) {
			return getRuleContext(FourFTupleContext.class,i);
		}
		public BoneDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boneDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitBoneDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoneDefContext boneDef() throws RecognitionException {
		BoneDefContext _localctx = new BoneDefContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_boneDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(T__80);
			setState(626);
			match(STRING);
			setState(627);
			match(CURLY_BRACKET_OPEN);
			setState(628);
			match(T__81);
			setState(629);
			match(INT);
			setState(630);
			match(COMMA);
			setState(634);
			_la = _input.LA(1);
			if (_la==T__82) {
				{
				setState(631);
				match(T__82);
				setState(632);
				match(INT);
				setState(633);
				match(COMMA);
				}
			}

			setState(638);
			_la = _input.LA(1);
			if (_la==T__83) {
				{
				setState(636);
				match(T__83);
				setState(637);
				match(COMMA);
				}
			}

			setState(642);
			_la = _input.LA(1);
			if (_la==T__84) {
				{
				setState(640);
				match(T__84);
				setState(641);
				match(COMMA);
				}
			}

			setState(646);
			_la = _input.LA(1);
			if (_la==T__85) {
				{
				setState(644);
				match(T__85);
				setState(645);
				match(COMMA);
				}
			}

			setState(650);
			_la = _input.LA(1);
			if (_la==T__86) {
				{
				setState(648);
				match(T__86);
				setState(649);
				match(COMMA);
				}
			}

			setState(654);
			_la = _input.LA(1);
			if (_la==T__87) {
				{
				setState(652);
				match(T__87);
				setState(653);
				match(COMMA);
				}
			}

			setState(661);
			_la = _input.LA(1);
			if (_la==T__88) {
				{
				setState(656);
				match(T__88);
				setState(657);
				match(CURLY_BRACKET_OPEN);
				setState(658);
				_la = _input.LA(1);
				if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (T__61 - 62)) | (1L << (T__62 - 62)) | (1L << (T__63 - 62)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(659);
				match(CURLY_BRACKET_CLOSE);
				setState(660);
				match(COMMA);
				}
			}

			setState(663);
			match(T__79);
			setState(664);
			_la = _input.LA(1);
			if ( !(_la==T__89 || _la==INT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(665);
			match(COMMA);
			setState(666);
			match(T__90);
			setState(667);
			_la = _input.LA(1);
			if ( !(_la==T__39 || _la==INT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(668);
			match(COMMA);
			setState(693);
			_la = _input.LA(1);
			if (_la==T__61) {
				{
				setState(669);
				match(T__61);
				setState(670);
				match(INT);
				setState(671);
				match(CURLY_BRACKET_OPEN);
				setState(674);
				_la = _input.LA(1);
				if (_la==T__91) {
					{
					setState(672);
					match(T__91);
					setState(673);
					match(COMMA);
					}
				}

				setState(687); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(676);
					match(INT);
					setState(677);
					match(T__58);
					setState(678);
					threeFTuple();
					setState(679);
					match(COMMA);
					setState(680);
					match(T__92);
					setState(681);
					threeFTuple();
					setState(682);
					match(COMMA);
					setState(683);
					match(T__93);
					setState(684);
					threeFTuple();
					setState(685);
					match(COMMA);
					}
					}
					setState(689); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(691);
				match(CURLY_BRACKET_CLOSE);
				}
			}

			setState(719);
			_la = _input.LA(1);
			if (_la==T__62) {
				{
				setState(695);
				match(T__62);
				setState(696);
				match(INT);
				setState(697);
				match(CURLY_BRACKET_OPEN);
				setState(700);
				_la = _input.LA(1);
				if (_la==T__91) {
					{
					setState(698);
					match(T__91);
					setState(699);
					match(COMMA);
					}
				}

				setState(713); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(702);
					match(INT);
					setState(703);
					match(T__58);
					setState(704);
					fourFTuple();
					setState(705);
					match(COMMA);
					setState(706);
					match(T__92);
					setState(707);
					fourFTuple();
					setState(708);
					match(COMMA);
					setState(709);
					match(T__93);
					setState(710);
					fourFTuple();
					setState(711);
					match(COMMA);
					}
					}
					setState(715); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(717);
				match(CURLY_BRACKET_CLOSE);
				}
			}

			setState(727);
			_la = _input.LA(1);
			if (_la==T__63) {
				{
				setState(721);
				match(T__63);
				setState(722);
				match(CURLY_BRACKET_OPEN);
				setState(723);
				threeFTuple();
				setState(724);
				match(BRACKET_CLOSE);
				setState(725);
				match(CURLY_BRACKET_CLOSE);
				}
			}

			setState(734);
			_la = _input.LA(1);
			if (_la==T__94) {
				{
				setState(729);
				match(T__94);
				setState(730);
				match(CURLY_BRACKET_OPEN);
				setState(731);
				match(FLOAT);
				setState(732);
				match(BRACKET_CLOSE);
				setState(733);
				match(CURLY_BRACKET_CLOSE);
				}
			}

			setState(736);
			match(CURLY_BRACKET_CLOSE);
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

	public static class LightDefContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MdlGrammarParser.STRING, 0); }
		public List<TerminalNode> CURLY_BRACKET_OPEN() { return getTokens(MdlGrammarParser.CURLY_BRACKET_OPEN); }
		public TerminalNode CURLY_BRACKET_OPEN(int i) {
			return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, i);
		}
		public List<TerminalNode> INT() { return getTokens(MdlGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MdlGrammarParser.INT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(MdlGrammarParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(MdlGrammarParser.FLOAT, i);
		}
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(MdlGrammarParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(MdlGrammarParser.BRACKET_OPEN, i);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(MdlGrammarParser.BRACKET_CLOSE); }
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(MdlGrammarParser.BRACKET_CLOSE, i);
		}
		public List<ThreeFTupleContext> threeFTuple() {
			return getRuleContexts(ThreeFTupleContext.class);
		}
		public ThreeFTupleContext threeFTuple(int i) {
			return getRuleContext(ThreeFTupleContext.class,i);
		}
		public FourFTupleContext fourFTuple() {
			return getRuleContext(FourFTupleContext.class,0);
		}
		public List<TerminalNode> CURLY_BRACKET_CLOSE() { return getTokens(MdlGrammarParser.CURLY_BRACKET_CLOSE); }
		public TerminalNode CURLY_BRACKET_CLOSE(int i) {
			return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, i);
		}
		public LightDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lightDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitLightDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LightDefContext lightDef() throws RecognitionException {
		LightDefContext _localctx = new LightDefContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_lightDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(T__95);
			setState(739);
			match(STRING);
			setState(740);
			match(CURLY_BRACKET_OPEN);
			setState(741);
			match(T__81);
			setState(742);
			match(INT);
			setState(743);
			match(COMMA);
			setState(744);
			match(T__82);
			setState(745);
			match(INT);
			setState(746);
			match(COMMA);
			setState(749);
			_la = _input.LA(1);
			if (_la==T__83) {
				{
				setState(747);
				match(T__83);
				setState(748);
				match(COMMA);
				}
			}

			setState(753);
			_la = _input.LA(1);
			if (_la==T__84) {
				{
				setState(751);
				match(T__84);
				setState(752);
				match(COMMA);
				}
			}

			setState(757);
			_la = _input.LA(1);
			if (_la==T__85) {
				{
				setState(755);
				match(T__85);
				setState(756);
				match(COMMA);
				}
			}

			setState(761);
			_la = _input.LA(1);
			if (_la==T__86) {
				{
				setState(759);
				match(T__86);
				setState(760);
				match(COMMA);
				}
			}

			setState(765);
			_la = _input.LA(1);
			if (_la==T__87) {
				{
				setState(763);
				match(T__87);
				setState(764);
				match(COMMA);
				}
			}

			setState(772);
			_la = _input.LA(1);
			if (_la==T__88) {
				{
				setState(767);
				match(T__88);
				setState(768);
				match(CURLY_BRACKET_OPEN);
				setState(769);
				_la = _input.LA(1);
				if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (T__61 - 62)) | (1L << (T__62 - 62)) | (1L << (T__63 - 62)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(770);
				match(CURLY_BRACKET_CLOSE);
				setState(771);
				match(COMMA);
				}
			}

			setState(774);
			_la = _input.LA(1);
			if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (T__96 - 97)) | (1L << (T__97 - 97)) | (1L << (T__98 - 97)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(775);
			match(T__52);
			setState(776);
			match(T__99);
			setState(777);
			match(FLOAT);
			setState(778);
			match(COMMA);
			setState(779);
			match(T__52);
			setState(780);
			match(T__100);
			setState(781);
			match(FLOAT);
			setState(782);
			match(COMMA);
			setState(783);
			match(T__52);
			setState(784);
			match(BRACKET_OPEN);
			setState(785);
			match(T__101);
			setState(786);
			match(FLOAT);
			setState(787);
			match(BRACKET_CLOSE);
			setState(788);
			match(COMMA);
			setState(789);
			match(T__52);
			setState(790);
			match(BRACKET_OPEN);
			setState(791);
			match(T__78);
			setState(792);
			threeFTuple();
			setState(793);
			match(BRACKET_CLOSE);
			setState(794);
			match(COMMA);
			setState(795);
			match(T__52);
			setState(796);
			match(BRACKET_OPEN);
			setState(797);
			match(T__102);
			setState(798);
			match(FLOAT);
			setState(799);
			match(BRACKET_CLOSE);
			setState(800);
			match(COMMA);
			setState(801);
			match(T__52);
			setState(802);
			match(BRACKET_OPEN);
			setState(803);
			match(T__103);
			setState(804);
			threeFTuple();
			setState(805);
			match(FLOAT);
			setState(806);
			match(BRACKET_CLOSE);
			setState(807);
			match(COMMA);
			setState(808);
			match(BRACKET_OPEN);
			setState(809);
			match(T__94);
			setState(810);
			match(FLOAT);
			setState(811);
			match(BRACKET_CLOSE);
			setState(812);
			match(COMMA);
			setState(813);
			match(BRACKET_OPEN);
			setState(814);
			match(T__61);
			setState(815);
			threeFTuple();
			setState(816);
			match(BRACKET_CLOSE);
			setState(817);
			match(COMMA);
			setState(818);
			match(BRACKET_OPEN);
			setState(819);
			match(T__62);
			setState(820);
			fourFTuple();
			setState(821);
			match(BRACKET_CLOSE);
			setState(822);
			match(COMMA);
			setState(823);
			match(BRACKET_OPEN);
			setState(824);
			match(T__63);
			setState(825);
			threeFTuple();
			setState(826);
			match(BRACKET_CLOSE);
			setState(827);
			match(COMMA);
			setState(828);
			match(CURLY_BRACKET_CLOSE);
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

	public static class PivotDefContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MdlGrammarParser.INT, 0); }
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(MdlGrammarParser.CURLY_BRACKET_OPEN, 0); }
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(MdlGrammarParser.CURLY_BRACKET_CLOSE, 0); }
		public List<ThreeFTupleContext> threeFTuple() {
			return getRuleContexts(ThreeFTupleContext.class);
		}
		public ThreeFTupleContext threeFTuple(int i) {
			return getRuleContext(ThreeFTupleContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MdlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MdlGrammarParser.COMMA, i);
		}
		public PivotDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlGrammarVisitor ) return ((MdlGrammarVisitor<? extends T>)visitor).visitPivotDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotDefContext pivotDef() throws RecognitionException {
		PivotDefContext _localctx = new PivotDefContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pivotDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(T__104);
			setState(831);
			match(INT);
			setState(832);
			match(CURLY_BRACKET_OPEN);
			setState(836); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(833);
				threeFTuple();
				setState(834);
				match(COMMA);
				}
				}
				setState(838); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CURLY_BRACKET_OPEN );
			setState(840);
			match(CURLY_BRACKET_CLOSE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3v\u034d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\5\2"+
		"A\n\2\3\2\3\2\3\2\5\2F\n\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\7\2O\n\2\f"+
		"\2\16\2R\13\2\3\2\7\2U\n\2\f\2\16\2X\13\2\3\2\7\2[\n\2\f\2\16\2^\13\2"+
		"\3\2\5\2a\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"p\n\4\3\4\3\4\3\4\5\4u\n\4\3\4\3\4\3\4\5\4z\n\4\3\4\3\4\3\4\5\4\177\n"+
		"\4\3\4\3\4\3\4\5\4\u0084\n\4\3\4\3\4\3\4\5\4\u0089\n\4\3\4\3\4\3\4\5\4"+
		"\u008e\n\4\3\4\3\4\3\4\5\4\u0093\n\4\3\4\3\4\3\4\5\4\u0098\n\4\3\4\3\4"+
		"\3\4\5\4\u009d\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a7\n\4\3\4\3"+
		"\4\3\4\3\4\5\4\u00ad\n\4\3\4\3\4\3\4\5\4\u00b2\n\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\7\5\u00ba\n\5\f\5\16\5\u00bd\13\5\3\5\3\5\3\6\3\6\5\6\u00c3\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00cd\n\6\3\6\3\6\5\6\u00d1\n\6\3\6"+
		"\3\6\3\6\5\6\u00d6\n\6\3\6\3\6\3\6\5\6\u00db\n\6\3\6\3\6\3\6\3\6\5\6\u00e1"+
		"\n\6\3\6\3\6\3\6\3\6\5\6\u00e7\n\6\3\6\3\6\3\6\5\6\u00ec\n\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7\u00f6\n\7\f\7\16\7\u00f9\13\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\7\b\u0101\n\b\f\b\16\b\u0104\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0110\n\t\3\t\3\t\5\t\u0114\n\t\3\t\3\t\5\t\u0118\n"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0120\n\n\f\n\16\n\u0123\13\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\5\13\u012b\n\13\3\13\3\13\5\13\u012f\n\13\3\13\3\13"+
		"\5\13\u0133\n\13\3\13\3\13\3\13\5\13\u0138\n\13\3\13\6\13\u013b\n\13\r"+
		"\13\16\13\u013c\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0148\n\f\3"+
		"\f\3\f\5\f\u014c\n\f\3\f\3\f\5\f\u0150\n\f\3\f\3\f\5\f\u0154\n\f\3\f\3"+
		"\f\5\f\u0158\n\f\3\f\3\f\5\f\u015c\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u0165\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u016c\n\f\3\f\3\f\3\f\5\f\u0171\n\f"+
		"\3\f\3\f\5\f\u0175\n\f\3\f\3\f\3\f\5\f\u017a\n\f\3\f\3\f\5\f\u017e\n\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u0187\n\r\3\r\3\r\3\r\3\r\7\r\u018d\n"+
		"\r\f\r\16\r\u0190\13\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u0198\n\16\f\16"+
		"\16\16\u019b\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u01b3"+
		"\n\20\3\20\5\20\u01b6\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01bf"+
		"\n\20\3\20\3\20\3\20\3\20\5\20\u01c5\n\20\3\20\3\20\3\20\5\20\u01ca\n"+
		"\20\3\20\7\20\u01cd\n\20\f\20\16\20\u01d0\13\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u01da\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u01e4\n\21\f\21\16\21\u01e7\13\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u01f1\n\22\f\22\16\22\u01f4\13\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u01fe\n\23\f\23\16\23\u0201\13\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\7\24\u0209\n\24\f\24\16\24\u020c\13\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u0215\n\25\f\25\16\25\u0218\13\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\7\26\u0221\n\26\f\26\16\26\u0224\13"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\7\27\u0234\n\27\f\27\16\27\u0237\13\27\3\27\3\27\7\27\u023b\n\27\f"+
		"\27\16\27\u023e\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u025e\n\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u026d\n\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u027d\n\34"+
		"\3\34\3\34\5\34\u0281\n\34\3\34\3\34\5\34\u0285\n\34\3\34\3\34\5\34\u0289"+
		"\n\34\3\34\3\34\5\34\u028d\n\34\3\34\3\34\5\34\u0291\n\34\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u0298\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u02a5\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\6\34\u02b2\n\34\r\34\16\34\u02b3\3\34\3\34\5\34\u02b8"+
		"\n\34\3\34\3\34\3\34\3\34\3\34\5\34\u02bf\n\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\6\34\u02cc\n\34\r\34\16\34\u02cd\3\34\3"+
		"\34\5\34\u02d2\n\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u02da\n\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u02e1\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u02f0\n\35\3\35\3\35\5\35\u02f4\n"+
		"\35\3\35\3\35\5\35\u02f8\n\35\3\35\3\35\5\35\u02fc\n\35\3\35\3\35\5\35"+
		"\u0300\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u0307\n\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\6\36\u0347\n\36\r\36\16\36\u0348\3\36\3\36\3\36\2\2\37\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\7\3\2*"+
		"\60\3\2@B\4\2\\\\qq\4\2**qq\3\2ce\u038e\2<\3\2\2\2\4b\3\2\2\2\6i\3\2\2"+
		"\2\b\u00b5\3\2\2\2\n\u00c0\3\2\2\2\f\u00ef\3\2\2\2\16\u00fc\3\2\2\2\20"+
		"\u0107\3\2\2\2\22\u011b\3\2\2\2\24\u0126\3\2\2\2\26\u0140\3\2\2\2\30\u0181"+
		"\3\2\2\2\32\u0193\3\2\2\2\34\u019e\3\2\2\2\36\u01ae\3\2\2\2 \u01dd\3\2"+
		"\2\2\"\u01ea\3\2\2\2$\u01f7\3\2\2\2&\u0204\3\2\2\2(\u020f\3\2\2\2*\u021b"+
		"\3\2\2\2,\u022a\3\2\2\2.\u0241\3\2\2\2\60\u0247\3\2\2\2\62\u024f\3\2\2"+
		"\2\64\u0259\3\2\2\2\66\u0273\3\2\2\28\u02e4\3\2\2\2:\u0340\3\2\2\2<=\5"+
		"\4\3\2=>\5\6\4\2>@\5\b\5\2?A\5\f\7\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\5"+
		"\16\b\2CE\5\22\n\2DF\5\32\16\2ED\3\2\2\2EF\3\2\2\2FJ\3\2\2\2GI\5\36\20"+
		"\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KP\3\2\2\2LJ\3\2\2\2MO\5\64"+
		"\33\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QV\3\2\2\2RP\3\2\2\2SU\5"+
		"\66\34\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\\\3\2\2\2XV\3\2\2\2"+
		"Y[\58\35\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2^\\\3\2"+
		"\2\2_a\5:\36\2`_\3\2\2\2`a\3\2\2\2a\3\3\2\2\2bc\7\3\2\2cd\7l\2\2de\7\4"+
		"\2\2ef\7q\2\2fg\7p\2\2gh\7m\2\2h\5\3\2\2\2ij\7\5\2\2jk\7s\2\2ko\7l\2\2"+
		"lm\7\6\2\2mn\7q\2\2np\7p\2\2ol\3\2\2\2op\3\2\2\2pt\3\2\2\2qr\7\7\2\2r"+
		"s\7q\2\2su\7p\2\2tq\3\2\2\2tu\3\2\2\2uy\3\2\2\2vw\7\b\2\2wx\7q\2\2xz\7"+
		"p\2\2yv\3\2\2\2yz\3\2\2\2z~\3\2\2\2{|\7\t\2\2|}\7q\2\2}\177\7p\2\2~{\3"+
		"\2\2\2~\177\3\2\2\2\177\u0083\3\2\2\2\u0080\u0081\7\n\2\2\u0081\u0082"+
		"\7q\2\2\u0082\u0084\7p\2\2\u0083\u0080\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0088\3\2\2\2\u0085\u0086\7\13\2\2\u0086\u0087\7q\2\2\u0087\u0089\7p"+
		"\2\2\u0088\u0085\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008d\3\2\2\2\u008a"+
		"\u008b\7\f\2\2\u008b\u008c\7q\2\2\u008c\u008e\7p\2\2\u008d\u008a\3\2\2"+
		"\2\u008d\u008e\3\2\2\2\u008e\u0092\3\2\2\2\u008f\u0090\7\r\2\2\u0090\u0091"+
		"\7q\2\2\u0091\u0093\7p\2\2\u0092\u008f\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0097\3\2\2\2\u0094\u0095\7\16\2\2\u0095\u0096\7q\2\2\u0096\u0098\7p"+
		"\2\2\u0097\u0094\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009c\3\2\2\2\u0099"+
		"\u009a\7\17\2\2\u009a\u009b\7q\2\2\u009b\u009d\7p\2\2\u009c\u0099\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\20\2\2\u009f"+
		"\u00a0\7q\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a6\3\2\2\2\u00a2\u00a3\7\21"+
		"\2\2\u00a3\u00a4\5\60\31\2\u00a4\u00a5\7p\2\2\u00a5\u00a7\3\2\2\2\u00a6"+
		"\u00a2\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ac\3\2\2\2\u00a8\u00a9\7\22"+
		"\2\2\u00a9\u00aa\5\60\31\2\u00aa\u00ab\7p\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00a8\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b1\3\2\2\2\u00ae\u00af\7\23"+
		"\2\2\u00af\u00b0\7r\2\2\u00b0\u00b2\7p\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7m\2\2\u00b4\7\3\2\2\2\u00b5"+
		"\u00b6\7\24\2\2\u00b6\u00b7\7q\2\2\u00b7\u00bb\7l\2\2\u00b8\u00ba\5\n"+
		"\6\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7m"+
		"\2\2\u00bf\t\3\2\2\2\u00c0\u00c2\7\25\2\2\u00c1\u00c3\7s\2\2\u00c2\u00c1"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00cc\7l\2\2\u00c5"+
		"\u00c6\7\26\2\2\u00c6\u00c7\7l\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7p\2"+
		"\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7m\2\2\u00cb\u00cd\7p\2\2\u00cc\u00c5"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cf\7\27\2\2"+
		"\u00cf\u00d1\7p\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d5"+
		"\3\2\2\2\u00d2\u00d3\7\30\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d6\7p\2\2\u00d5"+
		"\u00d2\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00da\3\2\2\2\u00d7\u00d8\7\31"+
		"\2\2\u00d8\u00d9\7r\2\2\u00d9\u00db\7p\2\2\u00da\u00d7\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00e0\3\2\2\2\u00dc\u00dd\7\21\2\2\u00dd\u00de\5\60\31"+
		"\2\u00de\u00df\7p\2\2\u00df\u00e1\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00e6\3\2\2\2\u00e2\u00e3\7\22\2\2\u00e3\u00e4\5\60\31"+
		"\2\u00e4\u00e5\7p\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00eb\3\2\2\2\u00e8\u00e9\7\23\2\2\u00e9\u00ea\7r\2\2\u00ea"+
		"\u00ec\7p\2\2\u00eb\u00e8\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ee\7m\2\2\u00ee\13\3\2\2\2\u00ef\u00f0\7\32\2\2\u00f0\u00f1"+
		"\7q\2\2\u00f1\u00f7\7l\2\2\u00f2\u00f3\7\33\2\2\u00f3\u00f4\7q\2\2\u00f4"+
		"\u00f6\7p\2\2\u00f5\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fb\7m\2\2\u00fb\r\3\2\2\2\u00fc\u00fd\7\34\2\2\u00fd\u00fe\7q\2\2"+
		"\u00fe\u0102\7l\2\2\u00ff\u0101\5\20\t\2\u0100\u00ff\3\2\2\2\u0101\u0104"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0106\7m\2\2\u0106\17\3\2\2\2\u0107\u0108\7\35\2"+
		"\2\u0108\u0109\7l\2\2\u0109\u010a\7\36\2\2\u010a\u010b\7s\2\2\u010b\u010f"+
		"\7p\2\2\u010c\u010d\7\37\2\2\u010d\u010e\7q\2\2\u010e\u0110\7p\2\2\u010f"+
		"\u010c\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u0112\7 "+
		"\2\2\u0112\u0114\7p\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0117\3\2\2\2\u0115\u0116\7!\2\2\u0116\u0118\7p\2\2\u0117\u0115\3\2\2"+
		"\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7m\2\2\u011a\21"+
		"\3\2\2\2\u011b\u011c\7\"\2\2\u011c\u011d\7q\2\2\u011d\u0121\7l\2\2\u011e"+
		"\u0120\5\24\13\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3"+
		"\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0125\7m\2\2\u0125\23\3\2\2\2\u0126\u0127\7#\2\2\u0127\u012a\7l\2\2\u0128"+
		"\u0129\7$\2\2\u0129\u012b\7p\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2"+
		"\2\u012b\u012e\3\2\2\2\u012c\u012d\7%\2\2\u012d\u012f\7p\2\2\u012e\u012c"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u0131\7&\2\2\u0131"+
		"\u0133\7p\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0137\3\2"+
		"\2\2\u0134\u0135\7\'\2\2\u0135\u0136\7q\2\2\u0136\u0138\7p\2\2\u0137\u0134"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u013b\5\26\f\2"+
		"\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\7m\2\2\u013f\25\3\2\2\2\u0140"+
		"\u0141\7(\2\2\u0141\u0142\7l\2\2\u0142\u0143\7)\2\2\u0143\u0144\t\2\2"+
		"\2\u0144\u0147\7p\2\2\u0145\u0146\7\61\2\2\u0146\u0148\7p\2\2\u0147\u0145"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u014a\7\62\2\2"+
		"\u014a\u014c\7p\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014f"+
		"\3\2\2\2\u014d\u014e\7\63\2\2\u014e\u0150\7p\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u0152\7\64\2\2\u0152\u0154\7"+
		"p\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0157\3\2\2\2\u0155"+
		"\u0156\7\65\2\2\u0156\u0158\7p\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u015b\3\2\2\2\u0159\u015a\7\66\2\2\u015a\u015c\7p\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0164\7\67"+
		"\2\2\u015e\u015f\78\2\2\u015f\u0165\7q\2\2\u0160\u0161\7n\2\2\u0161\u0162"+
		"\78\2\2\u0162\u0163\7q\2\2\u0163\u0165\7o\2\2\u0164\u015e\3\2\2\2\u0164"+
		"\u0160\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\7p\2\2\u0167\u016b\3\2"+
		"\2\2\u0168\u0169\79\2\2\u0169\u016a\7q\2\2\u016a\u016c\7p\2\2\u016b\u0168"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0170\3\2\2\2\u016d\u016e\7:\2\2\u016e"+
		"\u016f\7q\2\2\u016f\u0171\7p\2\2\u0170\u016d\3\2\2\2\u0170\u0171\3\2\2"+
		"\2\u0171\u017d\3\2\2\2\u0172\u0174\7\67\2\2\u0173\u0175\7n\2\2\u0174\u0173"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\7;\2\2\u0177"+
		"\u0179\7r\2\2\u0178\u017a\7o\2\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2"+
		"\2\u017a\u017b\3\2\2\2\u017b\u017e\7p\2\2\u017c\u017e\5\30\r\2\u017d\u0172"+
		"\3\2\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0180\7m\2\2\u0180\27\3\2\2\2\u0181\u0182\7;\2\2\u0182\u0183\7q\2\2\u0183"+
		"\u0186\7l\2\2\u0184\u0185\7<\2\2\u0185\u0187\7p\2\2\u0186\u0184\3\2\2"+
		"\2\u0186\u0187\3\2\2\2\u0187\u018e\3\2\2\2\u0188\u0189\7q\2\2\u0189\u018a"+
		"\7=\2\2\u018a\u018b\7r\2\2\u018b\u018d\7p\2\2\u018c\u0188\3\2\2\2\u018d"+
		"\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2"+
		"\2\2\u0190\u018e\3\2\2\2\u0191\u0192\7m\2\2\u0192\31\3\2\2\2\u0193\u0194"+
		"\7>\2\2\u0194\u0195\7q\2\2\u0195\u0199\7l\2\2\u0196\u0198\5\34\17\2\u0197"+
		"\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2"+
		"\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\7m\2\2\u019d"+
		"\33\3\2\2\2\u019e\u019f\7?\2\2\u019f\u01a0\7l\2\2\u01a0\u01a1\7n\2\2\u01a1"+
		"\u01a2\7@\2\2\u01a2\u01a3\5\60\31\2\u01a3\u01a4\7o\2\2\u01a4\u01a5\7n"+
		"\2\2\u01a5\u01a6\7A\2\2\u01a6\u01a7\5\62\32\2\u01a7\u01a8\7o\2\2\u01a8"+
		"\u01a9\7n\2\2\u01a9\u01aa\7B\2\2\u01aa\u01ab\5\60\31\2\u01ab\u01ac\7o"+
		"\2\2\u01ac\u01ad\7m\2\2\u01ad\35\3\2\2\2\u01ae\u01af\7C\2\2\u01af\u01b0"+
		"\7l\2\2\u01b0\u01b2\5 \21\2\u01b1\u01b3\5\"\22\2\u01b2\u01b1\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b6\5$\23\2\u01b5\u01b4\3\2"+
		"\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\5&\24\2\u01b8"+
		"\u01b9\5(\25\2\u01b9\u01be\5,\27\2\u01ba\u01bb\7\21\2\2\u01bb\u01bc\5"+
		"\60\31\2\u01bc\u01bd\7p\2\2\u01bd\u01bf\3\2\2\2\u01be\u01ba\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c4\3\2\2\2\u01c0\u01c1\7\22\2\2\u01c1\u01c2\5"+
		"\60\31\2\u01c2\u01c3\7p\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c0\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c9\3\2\2\2\u01c6\u01c7\7\23\2\2\u01c7\u01c8\7"+
		"r\2\2\u01c8\u01ca\7p\2\2\u01c9\u01c6\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u01ce\3\2\2\2\u01cb\u01cd\5\n\6\2\u01cc\u01cb\3\2\2\2\u01cd\u01d0\3\2"+
		"\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0"+
		"\u01ce\3\2\2\2\u01d1\u01d2\7D\2\2\u01d2\u01d3\7q\2\2\u01d3\u01d4\7p\2"+
		"\2\u01d4\u01d5\7E\2\2\u01d5\u01d6\7q\2\2\u01d6\u01d9\7p\2\2\u01d7\u01d8"+
		"\7F\2\2\u01d8\u01da\7p\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01dc\7m\2\2\u01dc\37\3\2\2\2\u01dd\u01de\7G\2\2"+
		"\u01de\u01df\7q\2\2\u01df\u01e5\7l\2\2\u01e0\u01e1\5\60\31\2\u01e1\u01e2"+
		"\7p\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e0\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5"+
		"\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e5\3\2"+
		"\2\2\u01e8\u01e9\7m\2\2\u01e9!\3\2\2\2\u01ea\u01eb\7H\2\2\u01eb\u01ec"+
		"\7q\2\2\u01ec\u01f2\7l\2\2\u01ed\u01ee\5\60\31\2\u01ee\u01ef\7p\2\2\u01ef"+
		"\u01f1\3\2\2\2\u01f0\u01ed\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2"+
		"\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5"+
		"\u01f6\7m\2\2\u01f6#\3\2\2\2\u01f7\u01f8\7I\2\2\u01f8\u01f9\7q\2\2\u01f9"+
		"\u01ff\7l\2\2\u01fa\u01fb\5.\30\2\u01fb\u01fc\7p\2\2\u01fc\u01fe\3\2\2"+
		"\2\u01fd\u01fa\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200"+
		"\3\2\2\2\u0200\u0202\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0203\7m\2\2\u0203"+
		"%\3\2\2\2\u0204\u0205\7J\2\2\u0205\u020a\7l\2\2\u0206\u0207\7q\2\2\u0207"+
		"\u0209\7p\2\2\u0208\u0206\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2"+
		"\2\2\u020a\u020b\3\2\2\2\u020b\u020d\3\2\2\2\u020c\u020a\3\2\2\2\u020d"+
		"\u020e\7m\2\2\u020e\'\3\2\2\2\u020f\u0210\7K\2\2\u0210\u0211\7q\2\2\u0211"+
		"\u0212\7q\2\2\u0212\u0216\7l\2\2\u0213\u0215\5*\26\2\u0214\u0213\3\2\2"+
		"\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219"+
		"\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a\7m\2\2\u021a)\3\2\2\2\u021b\u021c"+
		"\7L\2\2\u021c\u021d\7l\2\2\u021d\u0222\7l\2\2\u021e\u021f\7q\2\2\u021f"+
		"\u0221\7p\2\2\u0220\u021e\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2"+
		"\2\2\u0222\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225"+
		"\u0226\7q\2\2\u0226\u0227\7m\2\2\u0227\u0228\7p\2\2\u0228\u0229\7m\2\2"+
		"\u0229+\3\2\2\2\u022a\u022b\7M\2\2\u022b\u022c\7q\2\2\u022c\u022d\7q\2"+
		"\2\u022d\u023c\7l\2\2\u022e\u022f\7N\2\2\u022f\u0230\7l\2\2\u0230\u0235"+
		"\7q\2\2\u0231\u0232\7q\2\2\u0232\u0234\7p\2\2\u0233\u0231\3\2\2\2\u0234"+
		"\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2"+
		"\2\2\u0237\u0235\3\2\2\2\u0238\u0239\7m\2\2\u0239\u023b\7p\2\2\u023a\u022e"+
		"\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u023f\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0240\7m\2\2\u0240-\3\2\2\2\u0241"+
		"\u0242\7l\2\2\u0242\u0243\7r\2\2\u0243\u0244\7p\2\2\u0244\u0245\7r\2\2"+
		"\u0245\u0246\7m\2\2\u0246/\3\2\2\2\u0247\u0248\7l\2\2\u0248\u0249\7r\2"+
		"\2\u0249\u024a\7p\2\2\u024a\u024b\7r\2\2\u024b\u024c\7p\2\2\u024c\u024d"+
		"\7r\2\2\u024d\u024e\7m\2\2\u024e\61\3\2\2\2\u024f\u0250\7l\2\2\u0250\u0251"+
		"\7r\2\2\u0251\u0252\7p\2\2\u0252\u0253\7r\2\2\u0253\u0254\7p\2\2\u0254"+
		"\u0255\7r\2\2\u0255\u0256\7p\2\2\u0256\u0257\7r\2\2\u0257\u0258\7m\2\2"+
		"\u0258\63\3\2\2\2\u0259\u025a\7O\2\2\u025a\u025d\7l\2\2\u025b\u025c\7"+
		"P\2\2\u025c\u025e\7p\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025f\u0260\7\67\2\2\u0260\u0261\7n\2\2\u0261\u0262\7;"+
		"\2\2\u0262\u0263\7r\2\2\u0263\u0264\7o\2\2\u0264\u026c\7p\2\2\u0265\u0266"+
		"\7\67\2\2\u0266\u0267\7n\2\2\u0267\u0268\7Q\2\2\u0268\u0269\5\60\31\2"+
		"\u0269\u026a\7o\2\2\u026a\u026b\7p\2\2\u026b\u026d\3\2\2\2\u026c\u0265"+
		"\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\7R\2\2\u026f"+
		"\u0270\7q\2\2\u0270\u0271\7p\2\2\u0271\u0272\7m\2\2\u0272\65\3\2\2\2\u0273"+
		"\u0274\7S\2\2\u0274\u0275\7s\2\2\u0275\u0276\7l\2\2\u0276\u0277\7T\2\2"+
		"\u0277\u0278\7q\2\2\u0278\u027c\7p\2\2\u0279\u027a\7U\2\2\u027a\u027b"+
		"\7q\2\2\u027b\u027d\7p\2\2\u027c\u0279\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u0280\3\2\2\2\u027e\u027f\7V\2\2\u027f\u0281\7p\2\2\u0280\u027e\3\2\2"+
		"\2\u0280\u0281\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0283\7W\2\2\u0283\u0285"+
		"\7p\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0288\3\2\2\2\u0286"+
		"\u0287\7X\2\2\u0287\u0289\7p\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2"+
		"\2\u0289\u028c\3\2\2\2\u028a\u028b\7Y\2\2\u028b\u028d\7p\2\2\u028c\u028a"+
		"\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u0290\3\2\2\2\u028e\u028f\7Z\2\2\u028f"+
		"\u0291\7p\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0297\3\2"+
		"\2\2\u0292\u0293\7[\2\2\u0293\u0294\7l\2\2\u0294\u0295\t\3\2\2\u0295\u0296"+
		"\7m\2\2\u0296\u0298\7p\2\2\u0297\u0292\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0299\u029a\7R\2\2\u029a\u029b\t\4\2\2\u029b\u029c\7p\2"+
		"\2\u029c\u029d\7]\2\2\u029d\u029e\t\5\2\2\u029e\u02b7\7p\2\2\u029f\u02a0"+
		"\7@\2\2\u02a0\u02a1\7q\2\2\u02a1\u02a4\7l\2\2\u02a2\u02a3\7^\2\2\u02a3"+
		"\u02a5\7p\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02b1\3\2"+
		"\2\2\u02a6\u02a7\7q\2\2\u02a7\u02a8\7=\2\2\u02a8\u02a9\5\60\31\2\u02a9"+
		"\u02aa\7p\2\2\u02aa\u02ab\7_\2\2\u02ab\u02ac\5\60\31\2\u02ac\u02ad\7p"+
		"\2\2\u02ad\u02ae\7`\2\2\u02ae\u02af\5\60\31\2\u02af\u02b0\7p\2\2\u02b0"+
		"\u02b2\3\2\2\2\u02b1\u02a6\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b1\3\2"+
		"\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\7m\2\2\u02b6"+
		"\u02b8\3\2\2\2\u02b7\u029f\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02d1\3\2"+
		"\2\2\u02b9\u02ba\7A\2\2\u02ba\u02bb\7q\2\2\u02bb\u02be\7l\2\2\u02bc\u02bd"+
		"\7^\2\2\u02bd\u02bf\7p\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf"+
		"\u02cb\3\2\2\2\u02c0\u02c1\7q\2\2\u02c1\u02c2\7=\2\2\u02c2\u02c3\5\62"+
		"\32\2\u02c3\u02c4\7p\2\2\u02c4\u02c5\7_\2\2\u02c5\u02c6\5\62\32\2\u02c6"+
		"\u02c7\7p\2\2\u02c7\u02c8\7`\2\2\u02c8\u02c9\5\62\32\2\u02c9\u02ca\7p"+
		"\2\2\u02ca\u02cc\3\2\2\2\u02cb\u02c0\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd"+
		"\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\7m"+
		"\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02b9\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"\u02d9\3\2\2\2\u02d3\u02d4\7B\2\2\u02d4\u02d5\7l\2\2\u02d5\u02d6\5\60"+
		"\31\2\u02d6\u02d7\7o\2\2\u02d7\u02d8\7m\2\2\u02d8\u02da\3\2\2\2\u02d9"+
		"\u02d3\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02e0\3\2\2\2\u02db\u02dc\7a"+
		"\2\2\u02dc\u02dd\7l\2\2\u02dd\u02de\7r\2\2\u02de\u02df\7o\2\2\u02df\u02e1"+
		"\7m\2\2\u02e0\u02db\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2"+
		"\u02e3\7m\2\2\u02e3\67\3\2\2\2\u02e4\u02e5\7b\2\2\u02e5\u02e6\7s\2\2\u02e6"+
		"\u02e7\7l\2\2\u02e7\u02e8\7T\2\2\u02e8\u02e9\7q\2\2\u02e9\u02ea\7p\2\2"+
		"\u02ea\u02eb\7U\2\2\u02eb\u02ec\7q\2\2\u02ec\u02ef\7p\2\2\u02ed\u02ee"+
		"\7V\2\2\u02ee\u02f0\7p\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0"+
		"\u02f3\3\2\2\2\u02f1\u02f2\7W\2\2\u02f2\u02f4\7p\2\2\u02f3\u02f1\3\2\2"+
		"\2\u02f3\u02f4\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f6\7X\2\2\u02f6\u02f8"+
		"\7p\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9"+
		"\u02fa\7Y\2\2\u02fa\u02fc\7p\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2"+
		"\2\u02fc\u02ff\3\2\2\2\u02fd\u02fe\7Z\2\2\u02fe\u0300\7p\2\2\u02ff\u02fd"+
		"\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0306\3\2\2\2\u0301\u0302\7[\2\2\u0302"+
		"\u0303\7l\2\2\u0303\u0304\t\3\2\2\u0304\u0305\7m\2\2\u0305\u0307\7p\2"+
		"\2\u0306\u0301\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0309"+
		"\t\6\2\2\u0309\u030a\7\67\2\2\u030a\u030b\7f\2\2\u030b\u030c\7r\2\2\u030c"+
		"\u030d\7p\2\2\u030d\u030e\7\67\2\2\u030e\u030f\7g\2\2\u030f\u0310\7r\2"+
		"\2\u0310\u0311\7p\2\2\u0311\u0312\7\67\2\2\u0312\u0313\7n\2\2\u0313\u0314"+
		"\7h\2\2\u0314\u0315\7r\2\2\u0315\u0316\7o\2\2\u0316\u0317\7p\2\2\u0317"+
		"\u0318\7\67\2\2\u0318\u0319\7n\2\2\u0319\u031a\7Q\2\2\u031a\u031b\5\60"+
		"\31\2\u031b\u031c\7o\2\2\u031c\u031d\7p\2\2\u031d\u031e\7\67\2\2\u031e"+
		"\u031f\7n\2\2\u031f\u0320\7i\2\2\u0320\u0321\7r\2\2\u0321\u0322\7o\2\2"+
		"\u0322\u0323\7p\2\2\u0323\u0324\7\67\2\2\u0324\u0325\7n\2\2\u0325\u0326"+
		"\7j\2\2\u0326\u0327\5\60\31\2\u0327\u0328\7r\2\2\u0328\u0329\7o\2\2\u0329"+
		"\u032a\7p\2\2\u032a\u032b\7n\2\2\u032b\u032c\7a\2\2\u032c\u032d\7r\2\2"+
		"\u032d\u032e\7o\2\2\u032e\u032f\7p\2\2\u032f\u0330\7n\2\2\u0330\u0331"+
		"\7@\2\2\u0331\u0332\5\60\31\2\u0332\u0333\7o\2\2\u0333\u0334\7p\2\2\u0334"+
		"\u0335\7n\2\2\u0335\u0336\7A\2\2\u0336\u0337\5\62\32\2\u0337\u0338\7o"+
		"\2\2\u0338\u0339\7p\2\2\u0339\u033a\7n\2\2\u033a\u033b\7B\2\2\u033b\u033c"+
		"\5\60\31\2\u033c\u033d\7o\2\2\u033d\u033e\7p\2\2\u033e\u033f\7m\2\2\u033f"+
		"9\3\2\2\2\u0340\u0341\7k\2\2\u0341\u0342\7q\2\2\u0342\u0346\7l\2\2\u0343"+
		"\u0344\5\60\31\2\u0344\u0345\7p\2\2\u0345\u0347\3\2\2\2\u0346\u0343\3"+
		"\2\2\2\u0347\u0348\3\2\2\2\u0348\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u034b\7m\2\2\u034b;\3\2\2\2`@EJPV\\`oty~\u0083\u0088"+
		"\u008d\u0092\u0097\u009c\u00a6\u00ac\u00b1\u00bb\u00c2\u00cc\u00d0\u00d5"+
		"\u00da\u00e0\u00e6\u00eb\u00f7\u0102\u010f\u0113\u0117\u0121\u012a\u012e"+
		"\u0132\u0137\u013c\u0147\u014b\u014f\u0153\u0157\u015b\u0164\u016b\u0170"+
		"\u0174\u0179\u017d\u0186\u018e\u0199\u01b2\u01b5\u01be\u01c4\u01c9\u01ce"+
		"\u01d9\u01e5\u01f2\u01ff\u020a\u0216\u0222\u0235\u023c\u025d\u026c\u027c"+
		"\u0280\u0284\u0288\u028c\u0290\u0297\u02a4\u02b3\u02b7\u02be\u02cd\u02d1"+
		"\u02d9\u02e0\u02ef\u02f3\u02f7\u02fb\u02ff\u0306\u0348";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}