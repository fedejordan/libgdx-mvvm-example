package com.todoapps.libgdxmvvmexample;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.todoapps.libgdxmvvmexample.MVVM.Dependency;
import com.todoapps.libgdxmvvmexample.MVVM.Builder;
import com.todoapps.libgdxmvvmexample.home.HomeBuilder;
import com.todoapps.libgdxmvvmexample.home.HomeRouter;
import com.todoapps.libgdxmvvmexample.levelSelection.LevelSelectionBuilder;
import com.todoapps.libgdxmvvmexample.managers.GameScreenConfigurationManager;
import com.todoapps.libgdxmvvmexample.managers.SkinManager;

public class LibgdxMVVMExampleGame extends Game {

	private HomeRouter router;
	private Dependency rootDependency;

	@Override
	public void create() {
		// Game dependencies
		rootDependency = new Dependency(new GameScreenConfigurationManager(), new SkinManager());

		// Main router
		HomeBuilder homeBuilder = new HomeBuilder();
		router = homeBuilder.build(rootDependency, this);
		router.showHome();
	}
}
