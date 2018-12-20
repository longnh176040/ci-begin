package game;

public class Rectangle {
    Vector2D position; // vị trí hình chữ nhật (góc trên bên trái)
    int width; // chiều rộng hcn
    int height; // chiều cao hcn

    public Rectangle() {
        this(new Vector2D(), 1, 1);
    }

    public Rectangle(Vector2D position, int width, int height) {
        this.position = position;
        this.width = width;
        this.height = height;
    }

    public float top() {
        return this.position.y;
    }

    public float bot() {
        return this.top() + this.height;
    }


    public float left() {
        return this.position.x;
    }

    public float right() {
        return this.left() + this.width;
    }



    public boolean intersects(Rectangle other) {
        //if ( Math.abs((this.position.x + this.width/2) - (other.position.x + other.width/2)) < Math.abs((this.width + other.width)/2) && (Math.abs((this.position.y + this.height/2) - (other.position.y + other.height/2)) < Math.abs((this.height + other.height)/2))) {
            return this.bot() >= other.top()
                    && this.top() <= other.bot()
                    && this.left() <= other.right()
                    && this.right() >= other.left();

            }
            public static void main(String[] args) {
            Rectangle rect1 = new Rectangle(new Vector2D(5, 5), 3, 3);
            Rectangle rect2 = new Rectangle(new Vector2D(4, 4), 3, 3);
            Rectangle rect3 = new Rectangle(new Vector2D(10, 10), 3, 3);
            System.out.println(String.format("rect1 intersects rect2: %s (correct: true)", rect1.intersects(rect2)));
            System.out.println(String.format("rect2 intersects rect1: %s (correct: true)", rect2.intersects(rect1)));
            System.out.println(String.format("rect1 intersects rect3: %s (correct: false)", rect1.intersects(rect3)));
            System.out.println(String.format("rect3 intersects rect2: %s (correct: false)", rect3.intersects(rect2)));
        }
}
