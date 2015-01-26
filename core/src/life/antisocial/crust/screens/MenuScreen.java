package life.antisocial.crust.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import life.antisocial.crust.CrustGame;

public class MenuScreen implements Screen {

    CrustGame game;

    public MenuScreen(CrustGame _game) {
        game = _game;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        if (Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
            game.setScreen(game.playScreen);
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
