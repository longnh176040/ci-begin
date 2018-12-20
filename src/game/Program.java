package game;

import java.awt.*;

/**
 * Created by huynq on 7/4/17.
 */
public class Program {
    public static void main(String[] args) {
        GameCanvas gameCanvas = new GameCanvas();
        GameWindow gameWindow = new GameWindow();
        gameCanvas.setPreferredSize(new Dimension(Settings.SCREEN_WIDTH, Settings.SCREEN_HEIGHT));
        gameWindow.add(gameCanvas);
        gameWindow.pack();
        gameWindow.setVisible(true);
        gameCanvas.gameLoop();



    }
}
