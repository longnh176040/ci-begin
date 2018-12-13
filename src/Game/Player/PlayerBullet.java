package Game.Player;

import Game.GameObject;
import Game.Renderer.Animation;
import tklibs.SpriteUtils;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class PlayerBullet extends GameObject {


    public PlayerBullet() {
        super();
//        this.image = SpriteUtils.loadImage("assets/images/player-bullets/a/1.png");
        //this.position.set(Settings.PLAYER_START_X, Settings.PLAYER_START_Y - this.image.getHeight());
        this.createRenderer();
        this.velocity.set (0, -3);
    }

    private void createRenderer() {
        ArrayList<BufferedImage> images = new ArrayList<>();
        images.add(SpriteUtils.loadImage("assets/images/player-bullets/a/0.png"));
        images.add(SpriteUtils.loadImage("assets/images/player-bullets/a/1.png"));
        images.add(SpriteUtils.loadImage("assets/images/player-bullets/a/2.png"));
        images.add(SpriteUtils.loadImage("assets/images/player-bullets/a/3.png"));
        this.renderer = new Animation(images);
    }

    @Override
    public void run() {
        super.run();
    }
}
