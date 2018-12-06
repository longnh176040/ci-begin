package Game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameCanvas extends JPanel {
    BackGround backGround;
    Player player;
    static ArrayList<PlayerBullet> playerBullets;


    public GameCanvas() {
        //this.setBackground(Color.BLUE);
        this.backGround = new BackGround();
        this.player = new Player();
        this.playerBullets = new ArrayList<>();
    }

        @Override
        public void paint (Graphics g){
           g.setColor(Color.WHITE);
           g.fillRect(0, 0, Settings.SCREEN_WIDTH, Settings.SCREEN_HEIGHT);
           this.backGround.render(g);
           this.player.render(g);
           for (int i = 0; i< this.playerBullets.size(); i++) {
               PlayerBullet bullets = this.playerBullets.get(i);
               bullets.render(g);
           }
        }

        public void runAll() {
        this.player.run();
        this.backGround.run();
        for (int i = 0; i< this.playerBullets.size(); i++) {
            PlayerBullet bullets = this.playerBullets.get(i);
            bullets.run();
        }

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
