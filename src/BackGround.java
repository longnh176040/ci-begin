import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class BackGround {
        BufferedImage image;
        int x, y;
        public BackGround(){
            this.image = SpriteUtils.loadImage("C:\\ci-begin-master\\assets\\images\\background\\0.png");
            this.x = 0;
            this.y = 0;

        }

}
