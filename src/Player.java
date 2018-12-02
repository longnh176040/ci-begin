import tklibs.Mathx;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;
import java.util.Set;

public class Player {
    BufferedImage image;
    Vecto2D position;

    public Player() {
        this.image = SpriteUtils.loadImage("assets\\images\\players\\straight\\0.png");
        //this.x = 200;
        //this.y = 300;
        this.position = new Vecto2D(Settings.PLAYER_START_X, Settings.PLAYER_START_Y);
    }

    private void limitPlayerPosition() {
        float x = (float)Mathx.clamp(this.position.x, 0, Settings.BACKGROUND_WIDTH - Settings.PLAYER_WIDTH); //limit x
        float y = (float)Mathx.clamp(this.position.y, 0, Settings.SCREEN_HEIGHT - Settings.PLAYER_HEIGHT); //limit y
        this.position.set(x, y);
    }

    public void run() {
        this.limitPlayerPosition();
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

//tao class playerbullet gom anh hiển thị giống như background, xác định dùng phím nào để bắn, triển khai class playerbullet, hàm run 1 dòng là this.position.addthis (0,-3)
// vào run của player check ấn phím thì tạo mới new player bullet
//btvn chủ yếu là settings./
