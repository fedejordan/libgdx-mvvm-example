package com.todoapps.libgdxmvvmexample.game;

import com.badlogic.gdx.Game;
import com.todoapps.libgdxmvvmexample.MVVM.Builder;
import com.todoapps.libgdxmvvmexample.MVVM.Dependency;
import com.todoapps.libgdxmvvmexample.MVVM.Router;
import com.todoapps.libgdxmvvmexample.levelSelection.LevelSelectionBuilder;

/**
 * Created by federicojordan on 8/10/17.
 */

public class GameBuilder extends Builder<GameRouter> {

    public GameBuilder(Dependency dependency) {
        super(dependency);
    }

    @Override
    public GameRouter build(Game game, Router parentRouter) {
        GameScreen gameScreen = new GameScreen(dependency.getGameScreenConfigurationManager(), dependency.getSkinManager());
        GameViewModel gameViewModel = new GameViewModel(gameScreen);
        gameScreen.setListener(gameViewModel);
        GameRouter gameRouter = new GameRouter(gameScreen, gameViewModel, game, parentRouter);
        gameViewModel.setListener(gameRouter);
        return gameRouter;
    }
}
