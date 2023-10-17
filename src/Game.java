import processing.core.PApplet;

import java.util.ArrayList;

public class Game extends PApplet {
    private ArrayList<Tower> towers;
    private ArrayList<Enemy> enemies;
    private int enemySpawnInterval = 80;
    private int enemySpawnTimer = enemySpawnInterval ;

    public void settings() {
        size(800, 800);

    }

    public void setup() {
        towers = new ArrayList<> ();
        enemies = new ArrayList<>();
        initEnemies(60);


        initTowers(5);
    }

    private void initTowers(int num) {
        for (int i = 0; i < num; i++){
            int spacing = width / num;
            Tower t1 = new Tower(i * spacing + 100, 250, 50, 50);
            Tower t2 = new Tower(i * spacing + 100, 500, 50, 50);
            towers.add(t1);
            towers.add(t2);
        }
    }

    private void initEnemies(int num){
        for(int i = 0; i < num; i++){
            float x = 100;
            float y = 400;
        }
    }

    public void draw() {
        background(255);
        enemySpawnTimer--;

        if (enemySpawnTimer <= 0){
            Enemy e = new Enemy(-30, height/2, 50, 50);
            enemies.add(e);
            enemySpawnTimer = enemySpawnInterval;
        }

        fill(0,255,0);

        rect(0, height/2 - 100, width, 200 );

        for (Enemy e: enemies){
            e.updatePosition();
        }

        for(Enemy e : enemies){
            e.draw(this);
        }

        for(Tower t : towers){
            t.draw(this);
        }

    }

    public static void main(String[] args) {
        PApplet.main("Game");
    }
}
