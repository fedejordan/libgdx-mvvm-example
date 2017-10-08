package com.todoapps.libgdxmvvmexample.MVVM;

import com.sun.glass.ui.View;
import com.todoapps.libgdxmvvmexample.home.HomeRouter;

/**
 * Created by federicojordan on 8/10/17.
 */

public class ViewModel<T extends ViewModelListener, S extends ParentScreen> {
    private final S screen;
    protected T listener;

    public ViewModel(S screen) {
        this.screen = screen;
    }

    public void setListener(T listener) {
        this.listener = listener;
    }

    public S getScreen() {
        return screen;
    }
}
