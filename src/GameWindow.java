import javax.swing.*;

public class GameWindow extends JFrame {
    public GameWindow(){
        this.setVisible(true);
        this.setTitle("Penguin");
        this.setSize(800, 800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
    }

}
