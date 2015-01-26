package life.antisocial.crust.screens;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;
import com.badlogic.gdx.utils.Array;
import life.antisocial.crust.CrustGame;
import life.antisocial.crust.entities.Player;
import life.antisocial.crust.util.MapBodyBuilder;

public class PlayScreen implements Screen, InputProcessor {

    protected World world;
    protected CrustGame game;
    protected Player player;
    protected TiledMap map;
    protected OrthographicCamera camera;
    protected TiledMapRenderer mapRenderer;
    protected SpriteBatch batch;

    public PlayScreen(CrustGame _game) {
        game = _game;
        world = new World(new Vector2(0.0f, -98.0f), true);
        batch = new SpriteBatch();
        player = new Player(10, 350, world);

        float w = Gdx.graphics.getWidth();
        float h = Gdx.graphics.getHeight();

        camera = new OrthographicCamera();
        camera.setToOrtho(false, w, h);
        camera.update();

        map = new TmxMapLoader().load("core/assets/maps/testmap.tmx");

        Array<Body> shapes = MapBodyBuilder.buildShapes(map, 0, world);

        mapRenderer = new OrthogonalTiledMapRenderer(map);
        Gdx.input.setInputProcessor(this);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        world.step(delta, 6, 2);

        Body body = player.getBody();
        Sprite sprite = player.getSprite();
        sprite.setPosition(body.getPosition().x, body.getPosition().y);

        camera.update();
        mapRenderer.setView(camera);
        mapRenderer.render();

        batch.begin();
        batch.draw(sprite, sprite.getX(), sprite.getY());
        batch.end();
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

    @Override
    public boolean keyDown(int keycode) {
        if(keycode == Input.Keys.LEFT)
            camera.translate(-32,0);
        if(keycode == Input.Keys.RIGHT)
            camera.translate(32,0);
        if(keycode == Input.Keys.DOWN)
            camera.translate(0,-32);
        if(keycode == Input.Keys.UP)
            camera.translate(0,32);
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
