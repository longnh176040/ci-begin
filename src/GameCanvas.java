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
           g.setColor(Color.WHITE);
           g.fillRect(0, 0, 800, 600);
           g.drawImage(backGround.image, backGround.x, backGround.y, null);
           g.drawImage(player.image, player.x, player. y, null);
        }

        public void runAll() {
        this.player.run();
        this.backGround.run();

        }

        public void renderAll() {
        this.repaint(); //~paint()
        }

        public void gameLoop() {
        long lastTimeRun = 0;
        while(true) {
            long currentTime = System.currentTimeMillis();
            if(currentTime - lastTimeRun > 1000 / 60) {
                runAll(); //logic game
                renderAll(); //hien thi game
                lastTimeRun = currentTime;
            }
          }
        }

}
