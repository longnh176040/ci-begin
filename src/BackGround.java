import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class BackGround {
        BufferedImage image;
        int x, y;
        public BackGround(){
            this.image = SpriteUtils.loadImage("assets\\images\\background\\0.png");
            this.x = 0;
            this.y = 600 - this.image.getHeight();

        }

        public void run(){
            if (this.y <= 0)
                this.y++;
        }


}
