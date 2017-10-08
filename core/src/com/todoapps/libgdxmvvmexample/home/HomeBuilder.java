package com.todoapps.libgdxmvvmexample.home;

import com.badlogic.gdx.Game;
import com.todoapps.libgdxmvvmexample.LibgdxMVVMExampleGame;
import com.todoapps.libgdxmvvmexample.MVVM.Builder;
import com.todoapps.libgdxmvvmexample.MVVM.Dependency;
import com.todoapps.libgdxmvvmexample.levelSelection.LevelSelectionBuilder;

/**
 * Created by federicojordan on 8/10/17.
 */

public class HomeBuilder extends Builder<HomeRouter> {

    @Override
    public HomeRouter build(Dependency dependency, Game game) {
        HomeScreen homeScreen = new HomeScreen(dependency.getGameScreenConfigurationManager(), dependency.getSkinManager());
        HomeViewModel homeViewModel = new HomeViewModel(homeScreen);
        homeScreen.setListener(homeViewModel);
        HomeRouter homeRouter = new HomeRouter(homeScreen, homeViewModel, dependency, game);
        homeRouter.setLevelSelectionBuilder(new LevelSelectionBuilder());
        homeViewModel.setListener(homeRouter);
        return homeRouter;
    }
}
