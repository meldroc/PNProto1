package com.typedingames.pnproto1.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.typedingames.pnproto1.gameworld.GameRenderer;
import com.typedingames.pnproto1.gameworld.GameWorld;

/**
 * Created by meldroc on 9/27/2017.
 */

public class GameScreen implements Screen {

    private GameWorld world;
    private GameRenderer renderer;

    public GameScreen () {
        Gdx.app.log("GameScreen", "Attached");
        world = new GameWorld(); // initialize world
        renderer = new GameRenderer(world); // initialize its renderer.
    }

    @Override
    public void render(float delta) {
        world.update(delta);
        renderer.render();
    }

    @Override
    public void show() {
        Gdx.app.log("GameScreen", "show()");
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log("GameScreen", "resize()");
    }

    @Override
    public void pause() {
        Gdx.app.log("GameScreen", "pause()");
    }

    @Override
    public void resume() {
        Gdx.app.log("GameScreen", "resume()");
    }

    @Override
    public void hide() {
        Gdx.app.log("GameScreen", "hide()");
    }

    @Override
    public void dispose() {
        //Blank for now...
    }
}
