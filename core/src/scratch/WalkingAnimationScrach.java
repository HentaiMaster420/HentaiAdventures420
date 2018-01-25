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



public class WalkingAnimationScrach implements Screen {
    GamMenu game;
    SpriteBatch batch;
    Sprite sprguy, sprWleft, sprWright, sprWup, sprWdown;
    Texture Txstand, TxWdown, TxWright, TxWleft, TxWup;

    public WalkingAnimationScrach(GamMenu _game) {
        game = _game;
        batch = new SpriteBatch();
        Txstand = new Texture("guystanding.png");
        TxWdown = new Texture("walkingdown.png");
        TxWright = new Texture("walkingright.png");
        TxWleft = new Texture("walkingleft.png");
        TxWup = new Texture("walkingup.png");
        sprguy = new Sprite(Txstand);
        sprWleft = new Sprite(TxWleft);
        sprWright = new Sprite(TxWright);
        sprWup = new Sprite(TxWup);
        sprWdown = new Sprite(TxWdown);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(sprguy, sprguy.getX(), sprguy.getY());
        batch.end();
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            sprguy.setTexture(TxWleft);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            sprguy.setTexture(TxWright);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            sprguy.setTexture(TxWup);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            sprguy.setTexture(TxWdown);
        }
    }

    @Override
    public void dispose() {
        batch.dispose();
        Txstand.dispose();
        TxWleft.dispose();
        TxWright.dispose();
        TxWup.dispose();
        TxWdown.dispose();
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
