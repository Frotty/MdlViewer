// Generated from C:\Users\Frotty\Documents\GitHub\MdlViewer\core\parserspec\MdlGrammar.g4 by ANTLR 4.5
package de.frotty.mdlviewer.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MdlGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MdlGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#mdlfile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMdlfile(MdlGrammarParser.MdlfileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#versionNote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersionNote(MdlGrammarParser.VersionNoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#modelStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelStructure(MdlGrammarParser.ModelStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#sequencesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequencesBlock(MdlGrammarParser.SequencesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#animationBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimationBlock(MdlGrammarParser.AnimationBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#globalSequenceBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalSequenceBlock(MdlGrammarParser.GlobalSequenceBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#textureBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextureBlock(MdlGrammarParser.TextureBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#bitmapDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitmapDef(MdlGrammarParser.BitmapDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#materialBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialBlock(MdlGrammarParser.MaterialBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#materialDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialDef(MdlGrammarParser.MaterialDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#layerDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayerDef(MdlGrammarParser.LayerDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#alphaDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphaDef(MdlGrammarParser.AlphaDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#textureAnimBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextureAnimBlock(MdlGrammarParser.TextureAnimBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#tvertexAnimDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTvertexAnimDef(MdlGrammarParser.TvertexAnimDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#geosetBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeosetBlock(MdlGrammarParser.GeosetBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#verticesDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerticesDef(MdlGrammarParser.VerticesDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#normalsDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalsDef(MdlGrammarParser.NormalsDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#tverticesDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTverticesDef(MdlGrammarParser.TverticesDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#vertexGroupDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertexGroupDef(MdlGrammarParser.VertexGroupDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#facesDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacesDef(MdlGrammarParser.FacesDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#trianglesDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrianglesDef(MdlGrammarParser.TrianglesDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#groupsDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupsDef(MdlGrammarParser.GroupsDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#twoFTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoFTuple(MdlGrammarParser.TwoFTupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#threeFTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreeFTuple(MdlGrammarParser.ThreeFTupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#fourFTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFourFTuple(MdlGrammarParser.FourFTupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#geosetAnim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeosetAnim(MdlGrammarParser.GeosetAnimContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#boneDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoneDef(MdlGrammarParser.BoneDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#lightDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLightDef(MdlGrammarParser.LightDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlGrammarParser#pivotDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotDef(MdlGrammarParser.PivotDefContext ctx);
}