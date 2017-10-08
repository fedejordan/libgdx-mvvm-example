package com.todoapps.libgdxmvvmexample.home;

import com.badlogic.gdx.Game;
import com.todoapps.libgdxmvvmexample.LibgdxMVVMExampleGame;
import com.todoapps.libgdxmvvmexample.MVVM.Builder;
import com.todoapps.libgdxmvvmexample.MVVM.Dependency;
import com.todoapps.libgdxmvvmexample.MVVM.Router;
import com.todoapps.libgdxmvvmexample.levelSelection.LevelSelectionBuilder;

/**
 * Created by federicojordan on 8/10/17.
 */

public class HomeBuilder extends Builder<HomeRouter> {

    public HomeBuilder(Dependency dependency) {
        super(dependency);
    }

    @Override
    public HomeRouter build(Game game, Router parentRouter) {
        HomeScreen homeScreen = new HomeScreen(dependency.getGameScreenConfigurationManager(), dependency.getSkinManager());
        HomeViewModel homeViewModel = new HomeViewModel(homeScreen);
        homeScreen.setListener(homeViewModel);
        HomeRouter homeRouter = new HomeRouter(homeScreen, homeViewModel, game, parentRouter);
        homeRouter.setLevelSelectionBuilder(new LevelSelectionBuilder(dependency));
        homeViewModel.setListener(homeRouter);
        return homeRouter;
    }
}
