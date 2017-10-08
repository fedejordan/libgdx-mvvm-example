package com.todoapps.libgdxmvvmexample.game;

import com.badlogic.gdx.Game;
import com.todoapps.libgdxmvvmexample.MVVM.Dependency;
import com.todoapps.libgdxmvvmexample.MVVM.Router;
import com.todoapps.libgdxmvvmexample.levelSelection.LevelSelectionBuilder;
import com.todoapps.libgdxmvvmexample.levelSelection.LevelSelectionRouter;

/**
 * Created by federicojordan on 8/10/17.
 */

public class GameRouter extends Router<GameRouterListener, GameScreen, GameViewModel> implements GameViewModelListener {

    public GameRouter(GameScreen screen, GameViewModel viewModel, Dependency dependency, Game game, Router parentRouter) {
        super(screen, viewModel, dependency, game, parentRouter);
    }

    public void showGame() {
        game.setScreen(screen);
        screen.activateInput();
    }

    // GameViewModelListener
    @Override
    public void showLevelSelection() {
        parentRouter.dettachChild();
    }

}
