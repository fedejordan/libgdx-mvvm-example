package com.todoapps.libgdxmvvmexample.MVVM;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.todoapps.libgdxmvvmexample.managers.GameScreenConfigurationManager;

/**
 * Created by federicojordan on 8/10/17.
 */

public class ParentScreen<T extends ScreenListener> extends ScreenAdapter {

    protected final Stage stage;
    protected final GameScreenConfigurationManager gameScreenConfigurationManager;
    protected T listener;

    public ParentScreen(GameScreenConfigurationManager gameScreenConfigurationManager) {
        Camera camera = new OrthographicCamera(gameScreenConfigurationManager.getViewportWidth(), gameScreenConfigurationManager.getViewportHeight());
        this.stage = new Stage(new ExtendViewport(gameScreenConfigurationManager.getViewportWidth(), gameScreenConfigurationManager.getViewportHeight(), camera));
        this.gameScreenConfigurationManager = gameScreenConfigurationManager;
        Gdx.input.setInputProcessor(stage);
    }

    // Screen lifecycle
    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }

    @Override
    public void dispose() {
        stage.dispose();
    }

    public void setListener(T listener) {
        this.listener = listener;
    }
}
