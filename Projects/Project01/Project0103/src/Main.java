import processing.core.PApplet;

public class Main extends PApplet {
    int R1 = 200;
    int R2 = 100;
    int x,y;
    int dx = 5;
    int dy = 5;

    public void settings(){
        fullScreen();
    }
    public void setup(){
        x = width/2;
        y = height/2;

    }
    public void draw(){
        background(0);

        for (int i = 1; i <= 700 ;i+=100) {
            ellipse(x+i, y, R2, R1+i);
            fill(255, 0, 0, 100);

        }
        for (int i = 600; i >= 0; i-=100) {
            ellipse(x-i, y, R2, R1+i);
            fill(255, 0, 0, 100);

        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
