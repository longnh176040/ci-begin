package Game.Player;

import Game.GameCanvas;
import Game.GameObject;
import Game.GameWindow;
import Game.Renderer.PlayerRenderer;
import Game.Settings;
import tklibs.Mathx;
import tklibs.SpriteUtils;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Player extends GameObject {

    public Player() {
        super();
        this.position.set(Settings.PLAYER_START_X, Settings.PLAYER_START_Y);
        this.createRenderer();
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

    int count = 0; //TODO: will be fixed

    @Override
    public void run() {
        this.move();
        count++;
        if (count > 15) {
            this.fire();
        }
        this.limitPlayerPosition();
    }


    private void fire() {
        if (GameWindow.isFirePress) {
            PlayerBullet bullets = new PlayerBullet();
            bullets.position.set(this.position.x, this.position.y);
            GameObject.addGameObject(bullets);
            count = 0;
        }
    }

    private void move() {
        if (GameWindow.isUpPress) {
            //this.y--;
            this.position.addThis(0, -1);
        }
        if (GameWindow.isDownPress) {
            //this.y++;
            this.position.addThis(0, 1);
        }

        if (GameWindow.isLeftPress) {
            //this.x--;
            this.position.addThis(-1, 0);
        }
        if (GameWindow.isRightPress) {
            //this.x++;
            this.position.addThis(1, 0);
        }
    }

}

