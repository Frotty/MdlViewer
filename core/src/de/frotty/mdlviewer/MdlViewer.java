package de.frotty.mdlviewer;

import java.util.ArrayList;

import org.antlr.v4.runtime.Token;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.attributes.BlendingAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.FloatAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.IntAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute;
import com.badlogic.gdx.graphics.g3d.environment.DirectionalLight;
import com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder;
import com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder.VertexInfo;
import com.badlogic.gdx.graphics.g3d.utils.ModelBuilder;
import com.badlogic.gdx.graphics.Texture.TextureWrap;
import com.badlogic.gdx.graphics.VertexAttributes.Usage;

import de.frotty.mdlviewer.antlr.MdlGrammarParser.BitmapDefContext;
import de.frotty.mdlviewer.antlr.MdlGrammarParser.GeosetBlockContext;
import de.frotty.mdlviewer.antlr.MdlGrammarParser.MaterialBlockContext;
import de.frotty.mdlviewer.antlr.MdlGrammarParser.MaterialDefContext;
import de.frotty.mdlviewer.antlr.MdlGrammarParser.MdlfileContext;
import de.frotty.mdlviewer.antlr.MdlGrammarParser.ThreeFTupleContext;
import de.frotty.mdlviewer.antlr.MdlGrammarParser.TwoFTupleContext;
 
public class MdlViewer implements ApplicationListener{
 
	PerspectiveCamera cam;
	Mesh mesh1;	
	ModelInstance instance;
	ModelBatch mbatch;

	private Environment environment;

	private GoodCamControl camController;
	
	
	
	@Override
	public void create() {
		// Enviroment Lighting
		environment = new Environment();
        environment.set(new ColorAttribute(ColorAttribute.AmbientLight, 0.4f, 0.4f, 0.4f, 1f));
        environment.add(new DirectionalLight().set(0.8f, 0.8f, 0.8f, -1f, -0.8f, -0.2f));
        
        // Parse Mdl
		MdlfileContext mdl = null;
		mdl = MdlLoader.parseMdl(Gdx.files.internal("PalmTree.mdl").reader());
		
		// Load Textures
        ArrayList<Material> materials = getMaterials(mdl);
        
        // Build Model from Geosets
        ModelBuilder mob = new ModelBuilder();
        mob.begin();
		for(GeosetBlockContext gblock : mdl.geosetBlock()) {
			int materialId = Integer.parseInt(gblock.materialId.getText());
			MeshPartBuilder builder = mob.part("model", GL20.GL_TRIANGLES, 
									Usage.Position | Usage.Normal | Usage.TextureCoordinates, 
									materials.get(materialId));
			gblock.facesDef().triangle.tris.add(gblock.facesDef().triangle.lastTri);
			VertexInfo[] vs = new VertexInfo[3];
			int count = 0;
			for(Token tri : gblock.facesDef().triangle.tris) {
				ThreeFTupleContext vert = gblock.verticesDef().vertexPos.get(Integer.parseInt(tri.getText()));
				ThreeFTupleContext normal = gblock.normalsDef().normals.get(Integer.parseInt(tri.getText()));
				TwoFTupleContext UV = gblock.tverticesDef().textureCoords.get(Integer.parseInt(tri.getText()));
				System.out.println("UV: " + Float.parseFloat(UV.x.getText()) + ", " + Float.parseFloat(UV.y.getText()));
				vs[count] = new VertexInfo().setPos(Float.parseFloat(vert.x.getText()), Float.parseFloat(vert.y.getText()), Float.parseFloat(vert.z.getText()))
						.setNor(Float.parseFloat(normal.x.getText()), Float.parseFloat(normal.y.getText()), Float.parseFloat(normal.z.getText()))
						.setUV(Float.parseFloat(UV.x.getText()), Float.parseFloat(UV.y.getText()));
				count++;
				if(count >= 3) {
					count = 0;
					builder.triangle(vs[0], vs[1], vs[2]);
				}
			}
				
			
		}
		mbatch = new ModelBatch();
		
	    Model mod = mob.end();
	    instance = new ModelInstance(mod);
		cam = new PerspectiveCamera(74, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        cam.near = 1f;
        cam.far = 1300f;
        cam.update(true);
        camController = new GoodCamControl(cam);
        Gdx.input.setInputProcessor(camController);
	}
 
	private ArrayList<Material> getMaterials(MdlfileContext mdl) {
		ArrayList<Material> mats = new ArrayList<Material>();
		ArrayList<Texture> tex = getTextures(mdl);
		for(MaterialDefContext matDef : mdl.materialBlock().materials) {
			int texId = Integer.parseInt(matDef.layers.get(0).textureId.getText());
			Material m = new Material(TextureAttribute.createDiffuse(tex.get(texId)));
			m.set(new IntAttribute(IntAttribute.CullFace));
			m.set(new FloatAttribute(FloatAttribute.AlphaTest, 0.45f));
			m.set(new BlendingAttribute(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA, 1f));
			mats.add(m);
		}
		return mats;
	}

	private ArrayList<Texture> getTextures(MdlfileContext mdl) {
		ArrayList<Texture> list = new ArrayList<Texture>();
		for(BitmapDefContext bitmap : mdl.textureBlock().bitmaps) {
			String texturePath = bitmap.imagePath.getText().replace(".blp", ".png").replaceAll("\"", "");
			Texture tex = new Texture(Gdx.files.internal(texturePath));
			if(bitmap.wrapHeight.getText().length() > 0) {
				tex.setWrap(TextureWrap.Repeat, TextureWrap.Repeat);
			}
			list.add(tex);
		}
		return list;
	}

	@Override
	public void resize(int width, int height) {
	}
 
	@Override
	public void render() {
		Gdx.gl.glViewport(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
		mbatch.begin(cam);
		mbatch.render(instance, environment);
		mbatch.end();
		//this will push the triangles into the batch
		
		//this will render the triangles to GL
	}
	
	
	@Override
	public void pause() {
		
	}
 
	@Override
	public void resume() {
		
	}
 
	@Override
	public void dispose() {
	}
 
}