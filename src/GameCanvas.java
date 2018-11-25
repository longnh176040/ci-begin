import com.sun.imageio.plugins.common.ImageUtil;
import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameCanvas extends JPanel {
    BackGround backGround;
    Player player;


    public GameCanvas() {
        //this.setBackground(Color.BLUE);
        this.backGround = new BackGround();
        this.player = new Player();
    }

        @Override
        public void paint (Graphics g){
           g.drawImage(backGround.image, backGround.x, backGround.y, null);
           g.drawImage(player.image, player.x, player. y, null);
        }

}
