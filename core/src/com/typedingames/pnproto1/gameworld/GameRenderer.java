package com.typedingames.pnproto1.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;


/**
 * Created by meldroc on 9/30/2017.
 */

public class GameRenderer {

    private GameWorld myWorld;
    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;

    public GameRenderer(GameWorld world) {
        myWorld = world;
        cam = new OrthographicCamera();
        cam.setToOrtho(true, 800, 480);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
    }

    public void render() {
        Gdx.app.log("GameRenderer", "render()");

        // 1. Draw black background.
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //2. Draw filled rectangle.

        shapeRenderer.begin(ShapeType.Filled);

        shapeRenderer.setColor(87/255.0f, 109/255.0f, 120/255.0f, 1);

        shapeRenderer.rect(
                myWorld.getRect().x,
                myWorld.getRect().y,
                myWorld.getRect().width,
                myWorld.getRect().height);

        shapeRenderer.end();

        shapeRenderer.begin(ShapeType.Line);

        shapeRenderer.setColor(255/255.0f, 109/255.0f, 120/255.0f, 1);

        shapeRenderer.rect(
                myWorld.getRect().x,
                myWorld.getRect().y,
                myWorld.getRect().width,
                myWorld.getRect().height);

        shapeRenderer.end();
    }

}
