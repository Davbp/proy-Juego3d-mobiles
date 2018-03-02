package modelo;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by dam203 on 01/03/2018.
 */

public class Texturas {
	public static Texture left_arrow;
	public static Texture right_arrow;

	public static void cargarTexturas() {
		FileHandle imageFileHandle = Gdx.files.internal("controles/leftarrow.png");
		left_arrow = new Texture(imageFileHandle);
		imageFileHandle = Gdx.files.internal("controles/rightarrow.png");
		right_arrow = new Texture(imageFileHandle);
	}

	public static void dispose(){

	}
}