package com.typedingames.pnproto1.gameworld;

import com.badlogic.gdx.Gdx;
import com.typedingames.pnproto1.gameobjects.Player;

/**
 * Created by meldroc on 9/30/2017.
 */

public class GameWorld {

    private Player player;

    public GameWorld() {
        player = new Player(400, 300, 64, 128);
    }

    public void update(float delta) {
        player.update(delta);
    }

}
