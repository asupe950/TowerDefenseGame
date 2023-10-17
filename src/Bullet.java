public class Bullet {
    private int x;
    private int y;
    private int speed;
    private int damage = 10;
    public Bullet (int x, int y, int speed){
        this.x = x;
        this.y = y;
        this.speed = speed;
    }
    public void move(int speedX, int speedY){
        x += speedX;
        y += speedY;
    }
}
