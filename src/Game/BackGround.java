package Game;

import Game.Renderer.SingleImageRenderer;
import tklibs.SpriteUtils;
import java.awt.image.BufferedImage;

public class BackGround extends GameObject{

    public BackGround() {
        super();
        BufferedImage image = SpriteUtils.loadImage("assets\\images\\background\\0.png");
        this.renderer = new SingleImageRenderer(image);
        this.position.set(0, Settings.SCREEN_HEIGHT - image.getHeight());
        //this.position = new Game.Vector2D(0, Game.Settings.SCREEN_HEIGHT - this.image.getHeight());
        //this.x = 0;
        //this.y = 600 - this.image.getHeight();
    }


    @Override
    public void run() {
        if (this.position.y < 0) {
            this.position.addThis(0, 5); //this.y += 10
        } else {
            this.position.set(this.position.x, 0); //this.y = 0
        }
    }

}
