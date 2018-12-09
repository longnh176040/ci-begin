package Game;

import Game.Renderer.Animation;
import Game.Renderer.SingleImageRenderer;
import tklibs.SpriteUtils;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Enemy extends GameObject {

    public Enemy() {
        super();
        BufferedImage image = (SpriteUtils.loadImage("assets/images/enemies/level0/black/0.png"));
        this.renderer = new SingleImageRenderer(image);
        this.position.set(0, 0);
        this.anchor.set(0, 0);
        //this.createAnimation();
    }

    /*public void createAnimation() {
        ArrayList<BufferedImage> images = new ArrayList<>();
        images.add(SpriteUtils.loadImage("assets/images/enemies/level0/black/0.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/level0/black/1.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/level0/black/2.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/level0/black/3.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/level0/black/4.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/level0/black/5.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/level0/black/6.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/level0/black/7.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/level0/black/8.png"));

        this.renderer = new Animation(images);
    }*/

    @Override
    public void run() {
        if (this.position.x < Settings.BACKGROUND_WIDTH - Settings.ENEMY_BLACK_WIDTH) {
            this.position.addThis(1, 0);

            /*if (this.position.x == Settings.BACKGROUND_WIDTH - Settings.ENEMY_BLACK_WIDTH) {
                this.position.addThis(-20, 1);*/
            }
        }
    }
}
