package com.todoapps.libgdxmvvmexample.game;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.todoapps.libgdxmvvmexample.MVVM.ParentScreen;
import com.todoapps.libgdxmvvmexample.managers.GameScreenConfigurationManager;
import com.todoapps.libgdxmvvmexample.managers.SkinManager;

/**
 * Created by federicojordan on 8/10/17.
 */

// Class to manage game graphics and events from user. DON'T HANDLE ANY GAME LOGIC HERE

class GameScreen extends ParentScreen<GameScreenListener> {

    private SkinManager skinManager;

    public GameScreen(GameScreenConfigurationManager gameScreenConfigurationManager, SkinManager skinManager) {
        super(gameScreenConfigurationManager);
        this.skinManager = skinManager;
        setupInterface();
    }

    // Interface

    private void setupInterface() {
        setupLabel();
        setupLevelSelectionButton();
    }

    private void setupLabel() {
        Label yourGameUIHereLabel = new Label("Your game UI/graphics here!", skinManager.getSkin(), "default");
        yourGameUIHereLabel.setSize(gameScreenConfigurationManager.getViewportWidth(), 50);
        yourGameUIHereLabel.setPosition(0, 0);
        stage.addActor(yourGameUIHereLabel);
    }

    private void setupLevelSelectionButton() {
        TextButton levelSelectionButton = new TextButton("Go to Level selection", skinManager.getSkin(), "default");
        float buttonWidth = gameScreenConfigurationManager.getViewportWidth()/3;
        levelSelectionButton.setSize(buttonWidth, 50);
        levelSelectionButton.setPosition(gameScreenConfigurationManager.getViewportWidth()/2-buttonWidth/2, gameScreenConfigurationManager.getViewportHeight()/2);
        levelSelectionButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                listener.didSelectLevelSelection();
            }
        });
        stage.addActor(levelSelectionButton);
    }
}
