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

public class HomeRouter extends Router<HomeRouterListener, HomeViewModel> implements HomeViewModelListener {
    private LevelSelectionBuilder levelSelectionBuilder;

    public HomeRouter(HomeViewModel viewModel, Game game, Router parentRouter) {
        super(viewModel, game, parentRouter);
    }

    // Setters
    public void setLevelSelectionBuilder(LevelSelectionBuilder levelSelectionBuilder) {
        this.levelSelectionBuilder = levelSelectionBuilder;
    }

    public void showHome() {
        game.setScreen(viewModel.getScreen());
        viewModel.getScreen().activateInput();
    }

    // HomeViewModelListener
    @Override
    public void showLevelSelection() {
        LevelSelectionRouter levelSelectionRouter = levelSelectionBuilder.build(game, this);
        levelSelectionRouter.showLevelSelection();
        attachChild(levelSelectionRouter);
    }

}
