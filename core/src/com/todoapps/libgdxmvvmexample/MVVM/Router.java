package com.todoapps.libgdxmvvmexample.MVVM;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

import javafx.scene.Parent;

/**
 * Created by federicojordan on 8/10/17.
 */

public class Router<T extends RouterListener, V extends ViewModel> {
    protected final Game game;
    private Router childRouter;
    protected Router parentRouter;
    protected V viewModel;
    protected T listener;

    public Router(V viewModel, Game game, Router parentRouter) {
        this.viewModel = viewModel;
        this.game = game;
        this.parentRouter = parentRouter;
    }

    public void setListener(T listener) {
        this.listener = listener;
    }

    public void attachChild(Router childRouter) {
        this.childRouter = childRouter;
    }

    public void dettachChild() {
        this.childRouter = null;
        game.setScreen(viewModel.getScreen());
        viewModel.getScreen().activateInput();
    }
}
