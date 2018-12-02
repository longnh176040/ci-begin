import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class BackGround {
    BufferedImage image;
    Vecto2D position;

    public BackGround() {
        this.image = SpriteUtils.loadImage("assets\\images\\background\\0.png");
        //this.x = 0;
        //this.y = 600 - this.image.getHeight();
        this.position = new Vecto2D(0, Settings.SCREEN_HEIGHT - this.image.getHeight());

    }

    public void run() {
        if (this.position.y < 0) {
            this.position.addThis(0, 10); //this.y += 10
        } else {
            this.position.set(this.position.x, 0); //this.y = 0
        }


    }
}
