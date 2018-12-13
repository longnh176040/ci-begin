package Game;

import Game.Player.Player;
import Game.enemy.Enemy;
import javafx.scene.layout.Background;

import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {

    public GameCanvas() {
        //GameObject.addGameObject(new BackGround());
        GameObject.createGameObject(BackGround.class);
        //this.player = new Player();
        //GameObject.addGameObject(new Player());
        GameObject.createGameObject(Player.class);
        //this.playerBullets = new ArrayList<>();
        //GameObject.addGameObject(new Enemy());
        GameObject.createGameObject(Enemy.class);
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
