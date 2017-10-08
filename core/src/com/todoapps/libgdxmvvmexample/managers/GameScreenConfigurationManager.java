package com.todoapps.libgdxmvvmexample.managers;

import com.badlogic.gdx.Gdx;

/**
 * Created by federicojordan on 8/10/17.
 */

public class GameScreenConfigurationManager {

    private int viewportWidth = 540;

    public int getViewportWidth() {
        return viewportWidth;
    }

    public int getViewportHeight() {
        float realWidth = getScreenWidth();
        float realHeight = getScreenHeight();
        return (int) (viewportWidth * (realHeight/realWidth));
    }

    private float getScreenHeight() {
        return Gdx.graphics.getHeight();
    }

    private float getScreenWidth() {
        return Gdx.graphics.getWidth();
    }
}
