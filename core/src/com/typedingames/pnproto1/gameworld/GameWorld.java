package com.typedingames.pnproto1.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by meldroc on 9/30/2017.
 */

public class GameWorld {

    private Rectangle rect = new Rectangle (0, 0, 17, 20);

    public void update(float delta) {
        Gdx.app.log("GameWorld", "update()");
        rect.x++;
        if (rect.x > 772) {
            rect.x = 0;
        }
    }

    public Rectangle getRect() {
        return rect;
    }
}
