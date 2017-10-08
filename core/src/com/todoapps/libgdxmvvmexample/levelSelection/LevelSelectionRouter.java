package com.todoapps.libgdxmvvmexample.levelSelection;

import com.badlogic.gdx.Game;
import com.todoapps.libgdxmvvmexample.MVVM.Dependency;
import com.todoapps.libgdxmvvmexample.MVVM.Router;
import com.todoapps.libgdxmvvmexample.game.GameBuilder;
import com.todoapps.libgdxmvvmexample.game.GameRouter;

/**
 * Created by federicojordan on 8/10/17.
 */

public class LevelSelectionRouter extends Router<LevelSelectionRouterListener, LevelSelectionScreen, LevelSelectionViewModel> implements LevelSelectionViewModelListener {
    public GameBuilder gameBuilder;

    public LevelSelectionRouter(LevelSelectionScreen screen, LevelSelectionViewModel viewModel, Game game, Router parentRouter) {
        super(screen, viewModel, game, parentRouter);
    }

    // Setters
    public void setGameBuilder(GameBuilder gameBuilder) {
        this.gameBuilder = gameBuilder;
    }

    public void showLevelSelection() {
        game.setScreen(screen);
        screen.activateInput();
    }

    // LevelSelectionViewModelListener
    @Override
    public void showGameWithLevel(int level) {
        GameRouter gameRouter = gameBuilder.build(game, this);
        gameRouter.showGame();
        attachChild(gameRouter);
    }

    @Override
    public void showHome() {
        parentRouter.dettachChild();
    }

}
