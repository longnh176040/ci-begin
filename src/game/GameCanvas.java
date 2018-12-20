package game;

import game.player.Player;
import game.enemy.Enemy;

import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {

    public GameCanvas() {
        //GameObject.addGameObject(new BackGround());
        GameObject.recycle(BackGround.class);
        //this.player = new player();
        //GameObject.addGameObject(new player());
        GameObject.recycle(Player.class);
        //this.playerBullets = new ArrayList<>();
        //GameObject.addGameObject(new Enemy());
        GameObject.recycle(Enemy.class);
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
