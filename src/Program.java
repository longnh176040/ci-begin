import javax.swing.*;

/**
 * Created by huynq on 7/4/17.
 */
public class Program {
    public static void main(String[] args) {
        GameCanvas gameCanvas = new GameCanvas();
        GameWindow gameWindow = new GameWindow();
        gameWindow.add(gameCanvas);
        gameWindow.setVisible(true);
        gameCanvas.gameLoop();

    }
}
