package de.frotty.mdlviewer;

import com.badlogic.gdx.Input.Buttons;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.math.Vector3;

// Big thx to peq
public class GoodCamControl implements InputProcessor{
	/** The button for rotating the camera. */
	public int moveCameraButton = Buttons.RIGHT;
	private boolean moveModeOn = false;
	/** The button for translating the camera along the up/right plane */
	/** The units to translate the camera when moved the full width or height of the screen. */
	public float translateUnits = 10f; // FIXME auto calculate this based on the target
	/** The button for translating the camera along the direction axis */
	public int forwardButton = Buttons.MIDDLE;
	/** The key which must be pressed to activate rotate, translate and forward or 0 to always activate. */
	public int rotateMode = Keys.CONTROL_LEFT;
	protected boolean rotateModeOn;
	/** The camera. */
	public Camera camera;
	/** The current (first) button being pressed. */
	protected int button = -1;
	
	
	private Vector3 target = Vector3.Zero;
	private float rotationAngle = 0;
	private float angleOfAttack = 304;
	private float distance = 100;
	
	private int startX;
	private int startY;
	
	public GoodCamControl(final Camera camera) {
		this.camera = camera;
	}

	public void update () {
		if (angleOfAttack <-180) {
			angleOfAttack += 360;
		} else if (angleOfAttack>180) {
			angleOfAttack -= 360;
		}
		
		camera.position.x = ppX(target.x, distance, rotationAngle, angleOfAttack);
		camera.position.y = ppY(target.y, distance, rotationAngle, angleOfAttack);
		camera.position.z = ppZ(0, distance, angleOfAttack);

		camera.direction.x = target.x - camera.position.x;
		camera.direction.y = target.y - camera.position.y;
		camera.direction.z = target.z - camera.position.z;
		camera.direction.nor();
		
		camera.up.x=-cos(rotationAngle)*sin(angleOfAttack);
		camera.up.y=-sin(rotationAngle)*sin(angleOfAttack);
		camera.up.z=cos(angleOfAttack);
		camera.update();
	}
	
	private static float cos(float aoa) {
		return (float) Math.cos(aoa*DEGTORAD);
	}

	private static float sin(float ang) {
		return (float) Math.sin(ang*DEGTORAD);
	}

	@Override
	public boolean touchDown (int screenX, int screenY, int pointer, int button) {
		if(button == moveCameraButton) {
			startX = screenX;
			startY = screenY;
			moveModeOn = true;
			update();
		}
		return false;
	}

	@Override
	public boolean touchUp (int screenX, int screenY, int pointer, int button) {
		if(button == moveCameraButton) {
			startX = screenX;
			startY = screenY;
			moveModeOn = false;
		}
		return false;
	}

	@Override
	public boolean touchDragged (int screenX, int screenY, int pointer) {
		if(moveModeOn) {
			final float deltaX = (screenX - startX);
			final float deltaY = (startY - screenY);
			startX = screenX;
			startY = screenY;
			if(rotateModeOn) {
		        angleOfAttack+=deltaY;
		        rotationAngle+=deltaX;
			}else{
				target.set(ppXx(target.x,-deltaX, rotationAngle+90), ppYy(target.y,deltaY, rotationAngle+90), 0);
			}
			update();
		}
		return false;
	}

	@Override
	public boolean scrolled (int amount) {
		return zoom(amount * translateUnits);
	}

	public boolean zoom (float amount) {
		distance+=amount;
		update();
		return true;
	}

	@Override
	public boolean keyDown (int keycode) {
		if(keycode == Keys.CONTROL_LEFT) {
			rotateModeOn = true;
		}
		return false;
	}

	@Override
	public boolean keyUp (int keycode) {
		if(keycode == Keys.CONTROL_LEFT) {
			rotateModeOn = false;
		}
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}
	
	/** Polar Projection for x Coordiante 
	 * @param aoa */
	static float ppX( float x, float dist, float ang, float aoa ){
		return (float) (x + dist * Math.cos(ang*DEGTORAD) * Math.cos(aoa*DEGTORAD));
	}
	
	static float ppXx( float x, float dist, float ang){
		return (float) (x + dist * Math.cos(ang*DEGTORAD));
	}

	/** Polar Projection for y Coordiante 
	 * @param aoa */
	static float ppY( float y, float dist, float ang, float aoa  ) {
		return (float) (y + dist * Math.sin(ang*DEGTORAD) * Math.cos(aoa*DEGTORAD));
	}
	
	static float ppYy( float y, float dist, float ang) {
		return (float) (y + dist * Math.sin(ang*DEGTORAD));
	}
	
	/** Polar Projection for z Coordiante */
	static float ppZ( float z, float dist, float ang ) {
		return (float) (z + dist * Math.sin(ang*DEGTORAD));
	}
	
	public static final float DEGTORAD  	=  0.017453293f;
}
