import com.sun.imageio.plugins.common.ImageUtil;
import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameCanvas extends JPanel {
    BackGround backGround;
    Player player;
    PlayerBullet playerBullets;


    public GameCanvas() {
        //this.setBackground(Color.BLUE);
        this.backGround = new BackGround();
        this.player = new Player();
        this.playerBullets = new PlayerBullet();
    }

        @Override
        public void paint (Graphics g){
           g.setColor(Color.WHITE);
           g.fillRect(0, 0, Settings.SCREEN_WIDTH, Settings.SCREEN_HEIGHT);
           g.drawImage(backGround.image, (int)backGround.position.x, (int) backGround.position.y, null);
           g.drawImage(player.image, (int) player.position.x, (int) player.position.y, null);
           g.drawImage(playerBullets.image, (int) playerBullets.position.x, (int) playerBullets.position.y, null);
        }

        public void runAll() {
        this.player.run();
        this.backGround.run();
        this.playerBullets.run();

        }

        public void renderAll() {
        this.repaint(); //~paint()
        }

        public void gameLoop() {
        long lastTimeRun = 0;
        while(true) {
            long currentTime = System.currentTimeMillis();
            if(currentTime - lastTimeRun > Settings.FPS) {
                runAll(); //logic game
                renderAll(); //hien thi game
                lastTimeRun = currentTime;
            }
          }
        }


}
