package scratch;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import gdx.menu.GamMenu;



public class WalkingScratch implements Screen {
    GamMenu game;
    SpriteBatch batch;
    Sprite sprguy;
    Texture Txstand;

    public WalkingScratch(GamMenu _game) {
        game = _game;
        batch = new SpriteBatch();
        Txstand = new Texture("guystanding.png");
        sprguy = new Sprite(Txstand);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(sprguy, sprguy.getX(), sprguy.getY());
        batch.end();
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            sprguy.setX(sprguy.getX() - 200 * Gdx.graphics.getDeltaTime());
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            sprguy.setX(sprguy.getX() + 200 * Gdx.graphics.getDeltaTime());
        }
        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            sprguy.setY(sprguy.getY() + 200 * Gdx.graphics.getDeltaTime());
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            sprguy.setY(sprguy.getY() - 200 * Gdx.graphics.getDeltaTime());
        }
  
    }

    @Override
    public void dispose() {
        batch.dispose();
        Txstand.dispose();
    }

    @Override
    public void show() {
        
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

    
}

