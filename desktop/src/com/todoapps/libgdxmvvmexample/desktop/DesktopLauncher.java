package com.todoapps.libgdxmvvmexample.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.todoapps.libgdxmvvmexample.LibgdxMVVMExampleGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new LibgdxMVVMExampleGame(), config);
	}
}
