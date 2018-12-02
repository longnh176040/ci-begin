import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class PlayerBullet {
    BufferedImage image;
    Vecto2D position;

    public PlayerBullet() {
        this.image = SpriteUtils.loadImage("assets/images/player-bullets/a/1.png");
        this.position = new Vecto2D(Settings.PLAYER_START_X, Settings.PLAYER_START_Y - this.image.getHeight());
    }
    public void run() {
        if (GameWindow.shootBullets) {
            this.position.addThis(0, -3);
        }
    }
}
