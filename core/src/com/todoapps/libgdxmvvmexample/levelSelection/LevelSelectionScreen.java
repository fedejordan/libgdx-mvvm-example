package com.todoapps.libgdxmvvmexample.levelSelection;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.todoapps.libgdxmvvmexample.MVVM.ParentScreen;
import com.todoapps.libgdxmvvmexample.managers.GameScreenConfigurationManager;
import com.todoapps.libgdxmvvmexample.managers.SkinManager;

/**
 * Created by federicojordan on 8/10/17.
 */

class LevelSelectionScreen extends ParentScreen<LevelSelectionScreenListener> {

    private SkinManager skinManager;

    public LevelSelectionScreen(GameScreenConfigurationManager gameScreenConfigurationManager, SkinManager skinManager) {
        super(gameScreenConfigurationManager);
        this.skinManager = skinManager;
        setupInterface();
    }

    // Interface

    private void setupInterface() {
        setupLevelSelectionButton();
        setupBackButton();
    }

    private void setupBackButton() {
        TextButton backButton = new TextButton("back", skinManager.getSkin(), "default");
        float buttonWidth = gameScreenConfigurationManager.getViewportWidth()/6;
        float buttonHeight = 50;
        backButton.setSize(buttonWidth, buttonHeight);
        backButton.setPosition(0, gameScreenConfigurationManager.getViewportHeight()-buttonHeight);
        backButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                listener.didSelectBack();
            }
        });
        stage.addActor(backButton);
    }

    private void setupLevelSelectionButton() {
        TextButton levelSelectionButton = new TextButton("LEVEL 1", skinManager.getSkin(), "default");
        float buttonWidth = gameScreenConfigurationManager.getViewportWidth()/3;
        levelSelectionButton.setSize(buttonWidth, 50);
        levelSelectionButton.setPosition(gameScreenConfigurationManager.getViewportWidth()/2-buttonWidth/2, gameScreenConfigurationManager.getViewportHeight()/2);
        levelSelectionButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                listener.didSelectPlayLevel();
            }
        });
        stage.addActor(levelSelectionButton);
    }
}
