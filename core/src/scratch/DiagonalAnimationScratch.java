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



public class DiagonalAnimationScratch implements Screen {
    GamMenu game;
    SpriteBatch batch;
    Sprite sprguy, sprWleft, sprWright, sprWup, sprWdown, sprWLU, sprWRU, sprWLD, sprWRD;
    Texture Txstand, TxWdown, TxWright, TxWleft, TxWup, TxWLU, TxWRU, TxWLD, TxWRD;

    public DiagonalAnimationScratch(GamMenu _game) {
        game = _game;
        batch = new SpriteBatch();
        Txstand = new Texture("guystanding.png");
        TxWLU = new Texture("walkingLU.png");
        TxWRU = new Texture("walkingRU.png");
        TxWLD = new Texture("walkingLD.png");
        TxWRD = new Texture("walkingRD.png");
        sprguy = new Sprite(Txstand);
        sprWLU = new Sprite(TxWLU);
        sprWRU = new Sprite(TxWRU);
        sprWLD = new Sprite(TxWLD);
        sprWRD = new Sprite(TxWRD);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(sprguy, sprguy.getX(), sprguy.getY());
        batch.end();
        if (Gdx.input.isKeyPressed(Input.Keys.S)&&Gdx.input.isKeyPressed(Input.Keys.A)) {
            sprguy.setY(sprguy.getY() - 60 * Gdx.graphics.getDeltaTime());
            sprguy.setX(sprguy.getX() - 60 * Gdx.graphics.getDeltaTime());
            sprguy.setTexture(TxWLD);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)&&Gdx.input.isKeyPressed(Input.Keys.D)) {
            sprguy.setY(sprguy.getY() - 60 * Gdx.graphics.getDeltaTime());
            sprguy.setX(sprguy.getX() + 60 * Gdx.graphics.getDeltaTime());
            sprguy.setTexture(TxWRD);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.W)&&Gdx.input.isKeyPressed(Input.Keys.A)) {
            sprguy.setY(sprguy.getY() + 60 * Gdx.graphics.getDeltaTime());
            sprguy.setX(sprguy.getX() - 60 * Gdx.graphics.getDeltaTime());
            sprguy.setTexture(TxWLU);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.W)&&Gdx.input.isKeyPressed(Input.Keys.D)) {
            sprguy.setY(sprguy.getY() + 60 * Gdx.graphics.getDeltaTime());
            sprguy.setX(sprguy.getX() + 60 * Gdx.graphics.getDeltaTime());
            sprguy.setTexture(TxWRU);
        }
        if (!Gdx.input.isKeyPressed(Input.Keys.W)&&!Gdx.input.isKeyPressed(Input.Keys.A)&&!Gdx.input.isKeyPressed(Input.Keys.S)&&!Gdx.input.isKeyPressed(Input.Keys.D)) {
            sprguy.setTexture(Txstand);
        }   
    }

    @Override
    public void dispose() {
        batch.dispose();
        Txstand.dispose();
        TxWLD.dispose();
        TxWRD.dispose();
        TxWLU.dispose();
        TxWRU.dispose();
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
