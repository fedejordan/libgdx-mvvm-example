package com.todoapps.libgdxmvvmexample.managers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

/**
 * Created by federicojordan on 8/10/17.
 */

public class SkinManager {

    private final Skin skin;

    public SkinManager() {
        skin = new Skin(Gdx.files.internal("uiskin.json"));
    }

    public Skin getSkin() {
        return skin;
    }
}
