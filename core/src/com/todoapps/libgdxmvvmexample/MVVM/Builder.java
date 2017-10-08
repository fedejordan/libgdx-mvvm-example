package com.todoapps.libgdxmvvmexample.MVVM;


import com.badlogic.gdx.Game;

/**
 * Created by federicojordan on 8/10/17.
 */

public abstract class Builder<T extends Router> {

    public abstract T build(Dependency dependency, Game game);
}
