package com.todoapps.libgdxmvvmexample.levelSelection;

import com.badlogic.gdx.Game;
import com.todoapps.libgdxmvvmexample.MVVM.Dependency;
import com.todoapps.libgdxmvvmexample.MVVM.Router;
import com.todoapps.libgdxmvvmexample.game.GameBuilder;

/**
 * Created by federicojordan on 8/10/17.
 */

public class LevelSelectionRouter extends Router<LevelSelectionRouterListener, LevelSelectionScreen, LevelSelectionViewModel> implements LevelSelectionViewModelListener {
    public GameBuilder levelSelectionBuilder;

    public LevelSelectionRouter(LevelSelectionScreen screen, LevelSelectionViewModel viewModel, Dependency dependency, Game game, Router parentRouter) {
        super(screen, viewModel, dependency, game, parentRouter);
    }

    public void showLevelSelection() {
        game.setScreen(screen);
        screen.activateInput();
    }

    // LevelSelectionViewModelListener
    @Override
    public void showGameWithLevel(int level) {
        // GameBuilder
    }

    @Override
    public void showHome() {
        parentRouter.dettachChild();
    }
}
