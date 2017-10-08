package com.todoapps.libgdxmvvmexample.levelSelection;

import com.badlogic.gdx.Gdx;
import com.todoapps.libgdxmvvmexample.MVVM.ViewModel;

/**
 * Created by federicojordan on 8/10/17.
 */

class LevelSelectionViewModel extends ViewModel<LevelSelectionViewModelListener, LevelSelectionScreen> implements LevelSelectionScreenListener {

    private static final String TAG = "HomeViewModel";

    public LevelSelectionViewModel(LevelSelectionScreen screen) {
        super(screen);
    }

    // LevelSelectionScreenListener
    @Override
    public void didSelectPlayLevel() {
        int level = 1;
        listener.showGameWithLevel(level);
    }

    @Override
    public void didSelectBack() {
        listener.showHome();
    }
}
