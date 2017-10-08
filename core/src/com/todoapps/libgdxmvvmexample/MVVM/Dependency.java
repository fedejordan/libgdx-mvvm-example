package com.todoapps.libgdxmvvmexample.MVVM;

import com.todoapps.libgdxmvvmexample.managers.GameScreenConfigurationManager;
import com.todoapps.libgdxmvvmexample.managers.SkinManager;

/**
 * Created by federicojordan on 8/10/17.
 */

public class Dependency {
    private GameScreenConfigurationManager gameScreenConfigurationManager;
    private SkinManager skinManager;

    public Dependency(GameScreenConfigurationManager gameScreenConfigurationManager, SkinManager skinManager) {
        this.gameScreenConfigurationManager = gameScreenConfigurationManager;
        this.skinManager = skinManager;
    }

    public GameScreenConfigurationManager getGameScreenConfigurationManager() {
        return gameScreenConfigurationManager;
    }

    public SkinManager getSkinManager() {
        return skinManager;
    }
}
