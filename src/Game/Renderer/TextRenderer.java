package Game.Renderer;

import Game.GameObject;

import java.awt.*;

public class TextRenderer extends  Renderer{
    String string = new String();

    public TextRenderer(String string) {
        this.string = string;
    }

    @Override
    public void render(Graphics g, GameObject master) {
        g.drawString(this.string, (int) master.position.x, (int) master.position.y);
    }
}
