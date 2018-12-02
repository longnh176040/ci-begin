public class Vecto2D {
    public float x, y;

    public Vecto2D() {
        this.x = 0;
        this.y = 0;
    }

    public Vecto2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vecto2D set(float x, float y) {
        this.x = x;
        this.y = y;
        return this;
    }

    public Vecto2D add(float x, float y) {
        return new Vecto2D(this.x +x, this.y +y);
    }

    public  Vecto2D addThis(float x, float y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public Vecto2D subtract(float x, float y) {
        return new Vecto2D(this.x -x, this.y - y);
    }

    public Vecto2D subtractThis (float x, float y) {
        this.x -= x;
        this.y -= y;
        return this;
    }

    public Vecto2D scale (float rate) {
        return new Vecto2D(this.x * rate, this.y * rate);
    }

    public Vecto2D scaleThis (float rate) {
        this.x *= rate;
        this.y *= rate;
        return this;
    }
}
