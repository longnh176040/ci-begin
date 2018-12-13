package Game.Player;

import Game.*;
import Game.Renderer.PlayerRenderer;
import tklibs.Mathx;
import tklibs.SpriteUtils;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Player extends GameObject {
    FrameCounter fireCounter;
    public Player() {
        super();
        this.position.set(Settings.PLAYER_START_X, Settings.PLAYER_START_Y);
        this.createRenderer();
        this.fireCounter = new FrameCounter(20);
    }


    private void createRenderer() {
        ArrayList<BufferedImage> images = new ArrayList<>();
        images.add(SpriteUtils.loadImage("assets/images/players/straight/0.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/straight/1.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/straight/2.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/straight/3.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/straight/4.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/straight/5.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/straight/6.png"));

        //this.renderer = new Animation(images);
        this.renderer = new PlayerRenderer("Player", images);
    }

    private void limitPlayerPosition() {
        int halfWidth = (int) (Settings.PLAYER_WIDTH * this.anchor.x);
        int halfHeight = (int) (Settings.PLAYER_HEIGHT * this.anchor.y);
        float x = (float) Mathx.clamp(this.position.x, halfWidth, Settings.BACKGROUND_WIDTH - halfWidth); //limit x
        float y = (float) Mathx.clamp(this.position.y, halfHeight, Settings.SCREEN_HEIGHT - halfHeight); //limit y
        this.position.set(x, y);
    }

    @Override
    public void run() {
        super.run();
        this.move();
        if (this.fireCounter.run()) {
            this.fire();
        }
        this.limitPlayerPosition();
    }


    private void fire() {
        if (GameWindow.isFirePress) {
            PlayerBullet bullets = new PlayerBullet();
            bullets.position.set(this.position.x, this.position.y);
            GameObject.addGameObject(bullets);
            this.fireCounter.reset();
        }
    }

    private void move() {
        int vx = 0;
        int vy = 0;
        if (GameWindow.isUpPress) {
            vy--;
        }
        if (GameWindow.isDownPress) {
            vy++;
        }

        if (GameWindow.isLeftPress) {
            vx--;
        }
        if (GameWindow.isRightPress) {
            vx++;
        }
        this.velocity.set(vx, vy);
        this.velocity.setLength(1);
    }

}

