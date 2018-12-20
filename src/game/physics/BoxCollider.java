package game.physics;
import game.Vector2D;

public class BoxCollider {
    Vector2D position;// vị trí hình chữ nhật (góc trên bên trái)
    Vector2D anchor;
    int width; // chiều rộng hcn
    int height; // chiều cao hcn

    public BoxCollider() {
        this(new Vector2D(), new Vector2D(), 1, 1);
    }

    public BoxCollider(Vector2D position, Vector2D anchor, int width, int height) {
        this.position = position;
        this.anchor = anchor;
        this.width = width;
        this.height = height;

    }

    public float top() {
        return this.position.y - this.anchor.y * this.height;
    }

    public float bot() {
        return this.top() + this.height;
    }


    public float left() {
        return this.position.x - this.anchor.x * this.width;
    }

    public float right() {
        return this.left() + this.width;
    }



    public boolean intersects(BoxCollider other) {
        //if ( Math.abs((this.position.x + this.width/2) - (other.position.x + other.width/2)) < Math.abs((this.width + other.width)/2) && (Math.abs((this.position.y + this.height/2) - (other.position.y + other.height/2)) < Math.abs((this.height + other.height)/2))) {
        return this.bot() >= other.top()
                && this.top() <= other.bot()
                && this.left() <= other.right()
                && this.right() >= other.left();

    }
}
