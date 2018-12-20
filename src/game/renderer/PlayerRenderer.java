package game.renderer;

import game.GameObject;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class PlayerRenderer extends Renderer {
    Renderer textRenderer;
    Renderer animation;

    public PlayerRenderer(String text, ArrayList<BufferedImage> image) {
        this.textRenderer = new TextRenderer(text);
        this.animation = new Animation(image);
    }

    @Override
    public void render(Graphics g, GameObject master) {
        //this.textRenderer.render(g, master);
        this.animation.render(g, master);
    }
}
