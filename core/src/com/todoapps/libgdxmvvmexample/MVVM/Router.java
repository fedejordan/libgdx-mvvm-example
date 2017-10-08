package com.todoapps.libgdxmvvmexample.MVVM;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

import javafx.scene.Parent;

/**
 * Created by federicojordan on 8/10/17.
 */

public class Router<T extends RouterListener, S extends ParentScreen, V extends ViewModel> {
    protected final Game game;
    private Router childRouter;
    protected Router parentRouter;
    private V viewModel;
    protected S screen;
    protected T listener;

    public Router(S screen, V viewModel, Game game, Router parentRouter) {
        this.screen = screen;
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
        game.setScreen(screen);
        screen.activateInput();
    }
}
