import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class Player {
    BufferedImage image, image1;
    int x, y;
    public Player() {
        this.image = SpriteUtils.loadImage("C:\\ci-begin-master\\assets\\images\\players\\straight\\0.png");
        this.x = 300;
        this.y = 300;
    }

}
