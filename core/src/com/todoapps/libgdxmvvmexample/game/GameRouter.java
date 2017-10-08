package com.todoapps.libgdxmvvmexample.game;

import com.badlogic.gdx.Game;
import com.todoapps.libgdxmvvmexample.MVVM.Dependency;
import com.todoapps.libgdxmvvmexample.MVVM.Router;
import com.todoapps.libgdxmvvmexample.levelSelection.LevelSelectionBuilder;
import com.todoapps.libgdxmvvmexample.levelSelection.LevelSelectionRouter;

/**
 * Created by federicojordan on 8/10/17.
 */

public class GameRouter extends Router<GameRouterListener, GameViewModel> implements GameViewModelListener {

    public GameRouter(GameViewModel viewModel, Game game, Router parentRouter) {
        super(viewModel, game, parentRouter);
    }

    public void showGame() {
        game.setScreen(viewModel.getScreen());
        viewModel.getScreen().activateInput();
    }

    // GameViewModelListener
    @Override
    public void showLevelSelection() {
        parentRouter.dettachChild();
    }

}
