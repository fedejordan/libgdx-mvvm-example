package com.todoapps.libgdxmvvmexample.home;

import com.badlogic.gdx.Gdx;
import com.todoapps.libgdxmvvmexample.MVVM.ViewModel;

/**
 * Created by federicojordan on 8/10/17.
 */

// Class to handle home logic. Do you want to show if sound is activated? Ask here and draw on HomeScreen
class HomeViewModel extends ViewModel<HomeViewModelListener, HomeScreen> implements HomeScreenListener {

    private static final String TAG = "HomeViewModel";

    public HomeViewModel(HomeScreen screen) {
        super(screen);
    }

    @Override
    public void didSelectLevelSelection() {
        listener.showLevelSelection();
        Gdx.app.log(TAG, "didSelectLevelSelection");
    }
}
