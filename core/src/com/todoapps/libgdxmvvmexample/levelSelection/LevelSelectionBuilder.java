package com.todoapps.libgdxmvvmexample.levelSelection;

import com.badlogic.gdx.Game;
import com.todoapps.libgdxmvvmexample.MVVM.Builder;
import com.todoapps.libgdxmvvmexample.MVVM.Dependency;
import com.todoapps.libgdxmvvmexample.MVVM.Router;
import com.todoapps.libgdxmvvmexample.game.GameBuilder;

/**
 * Created by federicojordan on 8/10/17.
 */

public class LevelSelectionBuilder extends Builder<LevelSelectionRouter> {

    @Override
    public LevelSelectionRouter build(Dependency dependency, Game game, Router parentRouter) {
        LevelSelectionScreen levelSelectionScreen = new LevelSelectionScreen(dependency.getGameScreenConfigurationManager(), dependency.getSkinManager());
        LevelSelectionViewModel levelSelectionViewModel = new LevelSelectionViewModel(levelSelectionScreen);
        levelSelectionScreen.setListener(levelSelectionViewModel);
        LevelSelectionRouter levelSelectionRouter = new LevelSelectionRouter(levelSelectionScreen, levelSelectionViewModel, dependency, game, parentRouter);
        levelSelectionViewModel.setListener(levelSelectionRouter);
        levelSelectionRouter.setGameBuilder(new GameBuilder());
        return levelSelectionRouter;
    }
}
