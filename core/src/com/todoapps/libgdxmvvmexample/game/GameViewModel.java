package com.todoapps.libgdxmvvmexample.game;

import com.badlogic.gdx.Gdx;
import com.todoapps.libgdxmvvmexample.MVVM.ViewModel;

/**
 * Created by federicojordan on 8/10/17.
 */

// Class to manage game logic
class GameViewModel extends ViewModel<GameViewModelListener, GameScreen> implements GameScreenListener {

    private static final String TAG = "GameViewModel";

    public GameViewModel(GameScreen screen) {
        super(screen);
    }

    @Override
    public void didSelectLevelSelection() {
        listener.showLevelSelection();
        Gdx.app.log(TAG, "didSelectLevelSelection");
    }
}
