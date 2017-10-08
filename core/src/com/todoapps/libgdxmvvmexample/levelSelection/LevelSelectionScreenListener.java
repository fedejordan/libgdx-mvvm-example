package com.todoapps.libgdxmvvmexample.levelSelection;

import com.todoapps.libgdxmvvmexample.MVVM.ScreenListener;

/**
 * Created by federicojordan on 8/10/17.
 */

interface LevelSelectionScreenListener extends ScreenListener {
    void didSelectPlayLevel();
    void didSelectBack();
}
