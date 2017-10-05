package com.typedingames.pnproto1.gameobjects;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by meldroc on 10/4/2017.
 */

public class Player {
    private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;

    // Digressing from tutorial code. We're creating scaled vector members, to avoid using copy
    // methods inside the render loop, which would result in a lot of garbage collection & stutter.
    private Vector2 scaledVel;
    private Vector2 scaledAccel;

    private int width;
    private int height;

    public Player(float x, float y, int width, int height) {
        this.width = width;
        this.height = height;
        position = new Vector2(x, y);
        velocity = new Vector2(0, 0);
        acceleration = new Vector2(0, 0);
        scaledVel = new Vector2(0, 0);
        scaledAccel = new Vector2(0, 0);
    }

    public void update(float delta) {

    }

    public void onLeft() {

    }

    public void onRight() {

    }

    public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
