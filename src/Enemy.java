import processing.core.PApplet;
public class Enemy {

    private float x, y;
    private float width, height;
    private float xSpeed;
    private int health;

    public Enemy(float x, float y, int w, int h){
        this.x = x;
        this.y = y;
        this.width = w;
        this.height= h;
        this.xSpeed = 1;
        this.health = 30;
    }

    public void draw(PApplet window) {
        window.fill(255, 0, 0);
        window.ellipse(x, y, width, height);

    }

    public void updatePosition() {
        x += xSpeed;
    }


    // PART 2

    public boolean isAlive(){
        if (health <= 0) {
            return false;
        }
        return true;
    }
}
