package com.typedingames.pnproto1;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.typedingames.pnproto1.screens.GameScreen;

public class PNGame extends Game {

    private GameScreen gameScreen;
	@Override
	public void create () {
        Gdx.app.log("PNGame", "created");
		gameScreen = new GameScreen();
        setScreen(gameScreen);
	}
}
