package gdx.menu;
import com.badlogic.gdx.Game;
import gdx.menu.Screens.ScrMenu;
//import gdx.menu.Screens.ScrPlay;
import gdx.menu.Screens.ScrGameover;
import gdx.menu.Screens.ScrAnimation;
import scratch.WalkingScratch;
import scratch.WalkingAnimationScrach;
import scratch.DiagonalAnimationScratch;



public class GamMenu extends Game {
    ScrMenu scrMenu;
    WalkingScratch scrScratch1;
    WalkingAnimationScrach scrScratch2;
    DiagonalAnimationScratch scrScratch3;
    ScrGameover scrGameover;
    ScrAnimation scrAnimation;
    int nScreen; // 0 for menu, 1 for play, 2 for gameover, 3 for options
    
    public void updateState(int _nScreen) {
        nScreen = _nScreen;
        if ( nScreen == 0) {
            setScreen(scrMenu);
        } else if (nScreen == 1) {
            setScreen(scrScratch1);
        } else if (nScreen ==2) {
            setScreen(scrGameover);
        } else if (nScreen == 3){
            setScreen(scrAnimation);
        } else if (nScreen == 4){
            setScreen(scrScratch2);
        } else if (nScreen == 5){
            setScreen(scrScratch3);
        }
    }

    @Override
    public void create() {
        nScreen = 0;
        // notice that "this" is passed to each screen. Each screen now has access to methods within the "game" master program
        scrMenu = new ScrMenu(this);
        scrGameover = new ScrGameover(this);
        scrAnimation = new ScrAnimation(this);
        scrScratch1 = new WalkingScratch(this);
        scrScratch2 = new WalkingAnimationScrach(this);
        scrScratch3 = new DiagonalAnimationScratch(this);
        updateState(0);
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}