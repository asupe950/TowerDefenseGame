import processing.core.PApplet;

public class Tower {
    private float x, y;
    private float width, height;

    public Tower(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(PApplet window) {
        window.fill(200, 185, 200);
        window.rect(x, y, width, height);
    }
}
