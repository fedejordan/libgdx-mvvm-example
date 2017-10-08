package com.todoapps.libgdxmvvmexample.levelSelection;

import com.todoapps.libgdxmvvmexample.MVVM.ViewModelListener;

/**
 * Created by federicojordan on 8/10/17.
 */

public interface LevelSelectionViewModelListener extends ViewModelListener {
    void showGameWithLevel(int level);
    void showHome();
}
