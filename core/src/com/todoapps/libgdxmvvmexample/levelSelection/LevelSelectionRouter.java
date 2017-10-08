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

    public LevelSelectionRouter(LevelSelectionScreen screen, LevelSelectionViewModel viewModel, Dependency dependency, Game game) {
        super(screen, viewModel, dependency, game);
    }

    public void showLevelSelection() {
        game.setScreen(screen);
    }

    // LevelSelectionViewModelListener
    @Override
    public void showGameWithLevel(int level) {
        // GameBuilder
    }
}
