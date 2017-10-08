package com.todoapps.libgdxmvvmexample.home;

import com.badlogic.gdx.Game;
import com.todoapps.libgdxmvvmexample.MVVM.Dependency;
import com.todoapps.libgdxmvvmexample.MVVM.ParentScreen;
import com.todoapps.libgdxmvvmexample.MVVM.Router;
import com.todoapps.libgdxmvvmexample.MVVM.ScreenListener;
import com.todoapps.libgdxmvvmexample.MVVM.ViewModel;
import com.todoapps.libgdxmvvmexample.MVVM.ViewModelListener;
import com.todoapps.libgdxmvvmexample.levelSelection.LevelSelectionBuilder;
import com.todoapps.libgdxmvvmexample.levelSelection.LevelSelectionRouter;

/**
 * Created by federicojordan on 8/10/17.
 */

public class HomeRouter extends Router<HomeRouterListener, HomeScreen, HomeViewModel> implements HomeViewModelListener {
    private LevelSelectionBuilder levelSelectionBuilder;

    public HomeRouter(HomeScreen screen, HomeViewModel viewModel, Dependency dependency, Game game, Router parentRouter) {
        super(screen, viewModel, dependency, game, parentRouter);
    }

    // Setters
    public void setLevelSelectionBuilder(LevelSelectionBuilder levelSelectionBuilder) {
        this.levelSelectionBuilder = levelSelectionBuilder;
    }

    public void showHome() {
        game.setScreen(screen);
        screen.activateInput();
    }

    // HomeViewModelListener
    @Override
    public void showLevelSelection() {
        LevelSelectionRouter levelSelectionRouter = levelSelectionBuilder.build(dependency, game, this);
        levelSelectionRouter.showLevelSelection();
        attachChild(levelSelectionRouter);
    }

}
