package com.todoapps.libgdxmvvmexample.levelSelection;

import com.badlogic.gdx.Game;
import com.todoapps.libgdxmvvmexample.MVVM.Builder;
import com.todoapps.libgdxmvvmexample.MVVM.Dependency;
import com.todoapps.libgdxmvvmexample.MVVM.Router;

/**
 * Created by federicojordan on 8/10/17.
 */

public class LevelSelectionBuilder extends Builder<LevelSelectionRouter> {

    @Override
    public LevelSelectionRouter build(Dependency dependency, Game game, Router parentRouter) {
        LevelSelectionScreen levelSelectionScreen = new LevelSelectionScreen(dependency.getGameScreenConfigurationManager(), dependency.getSkinManager());
        LevelSelectionViewModel homeViewModel = new LevelSelectionViewModel(levelSelectionScreen);
        levelSelectionScreen.setListener(homeViewModel);
        LevelSelectionRouter levelSelectionRouter = new LevelSelectionRouter(levelSelectionScreen, homeViewModel, dependency, game, parentRouter);
        homeViewModel.setListener(levelSelectionRouter);
        return levelSelectionRouter;
    }
}
