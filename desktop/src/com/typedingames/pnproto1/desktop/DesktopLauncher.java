package com.typedingames.pnproto1.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.typedingames.pnproto1.PNGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Nazi Puncher prototype";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new PNGame(), config);
	}
}
