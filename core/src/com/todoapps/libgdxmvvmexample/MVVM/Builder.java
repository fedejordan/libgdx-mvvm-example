package com.todoapps.libgdxmvvmexample.MVVM;


import com.badlogic.gdx.Game;

/**
 * Created by federicojordan on 8/10/17.
 */

public abstract class Builder<T extends Router> {

    protected final Dependency dependency;

    public Builder(Dependency dependency) {
        this.dependency = dependency;
    }

    public abstract T build(Game game, Router parentRouter);
}
