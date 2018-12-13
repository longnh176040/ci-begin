package Game.enemy;

import Game.GameObject;
import Game.Renderer.Animation;
import Game.Settings;
import tklibs.SpriteUtils;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Enemy extends GameObject {

    public Enemy() {
        super();
        this.position.set(0, -30);
        this.createRenderer();
        this.velocity.set(3, -1);
    }

    public void createRenderer() {
        ArrayList<BufferedImage> images = new ArrayList<>();
        images.add(SpriteUtils.loadImage("assets/images/enemies/level0/pink/0.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/level0/pink/1.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/level0/pink/2.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/level0/pink/3.png"));

        this.renderer = new Animation(images);
    }

    @Override
    public void run() {
        super.run();
        if (this.position.x > Settings.BACKGROUND_WIDTH - Settings.ENEMY_PINK_WIDTH/2 && this.velocity.x > 0) {
            this.velocity.set(-3 , this.velocity.y);
        }
        if (this.position.x < Settings.ENEMY_PINK_WIDTH/2 && this.velocity.x < 0) {
            this.velocity.set(3, this.velocity.y);
        }
        if (this.position.y > Settings.SCREEN_HEIGHT - Settings.ENEMY_PINK_HEIGHT/2 && this.velocity.y > 0) {
            this.velocity.set(this.velocity.x, -1);
        }
        if (this.position.y < Settings.ENEMY_PINK_HEIGHT/2 && this.velocity.y < 0) {
            this.velocity.set(this.velocity.x, 1);
        }
    }

}
