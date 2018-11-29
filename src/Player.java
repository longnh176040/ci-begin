import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class Player {
    BufferedImage image;
    int x, y;

    public Player() {
        this.image = SpriteUtils.loadImage("assets\\images\\players\\straight\\0.png");
        this.x = 200;
        this.y = 300;
    }

    public void run() {

            if (GameWindow.isUpPress && this.y >= 0) {
                this.y--;
            }
            if (GameWindow.isDownPress && this.y <= 530) {
                this.y++;
            }

            if (GameWindow.isLeftPress && this.x >= 0) {
                this.x--;
            }
            if (GameWindow.isRightPress && this.x <= (new BackGround().image.getWidth() - this.image.getWidth())) {
                this.x++;
            }

    }
}
