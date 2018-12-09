package Game;

import Game.Player.Player;
import Game.Player.PlayerBullet;
import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {

    public GameCanvas() {
        //this.setBackground(Color.BLUE);
        GameObject.addGameObject(new BackGround());
        //this.player = new Player();
        GameObject.addGameObject(new Player());
        //this.playerBullets = new ArrayList<>();
        GameObject.addGameObject(new Enemy());
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, Settings.SCREEN_WIDTH, Settings.SCREEN_HEIGHT);
        GameObject.renderAll(g);
    }

    public void runAll() {
        GameObject.runAll();
    }

    public void renderAll() {
        this.repaint(); //~paint()
    }

    public void gameLoop() {
        long lastTimeRun = 0;
        while (true) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastTimeRun > Settings.FPS) {
                runAll(); //logic game
                renderAll(); //hien thi game
                lastTimeRun = currentTime;
            }
        }
    }


}
