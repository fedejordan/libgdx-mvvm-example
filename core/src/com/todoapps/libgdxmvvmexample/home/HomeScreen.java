package com.todoapps.libgdxmvvmexample.home;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.todoapps.libgdxmvvmexample.MVVM.ParentScreen;
import com.todoapps.libgdxmvvmexample.MVVM.ScreenListener;
import com.todoapps.libgdxmvvmexample.managers.GameScreenConfigurationManager;
import com.todoapps.libgdxmvvmexample.managers.SkinManager;

/**
 * Created by federicojordan on 8/10/17.
 */

class HomeScreen extends ParentScreen<HomeScreenListener> {

    private SkinManager skinManager;

    public HomeScreen(GameScreenConfigurationManager gameScreenConfigurationManager, SkinManager skinManager) {
        super(gameScreenConfigurationManager);
        this.skinManager = skinManager;
        setupInterface();
    }

    // Interface

    private void setupInterface() {
        setupLevelSelectionButton();
    }

    private void setupLevelSelectionButton() {
        TextButton levelSelectionButton = new TextButton("Play", skinManager.getSkin(), "default");
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
