import processing.core.PApplet;

public class Main extends PApplet {
    public void settings(){
        fullScreen();
    }

    public void setup(){
    }
    public void draw(){

        background(0);
        noStroke();

        final int CIRCLE_COUNT = 300;
        final int MIN_DIAM = 20;
        final int MAX_DIAM = 100;
        for (int i = 0; i < CIRCLE_COUNT; i++) {
            int x = (int)  random(width) ;
            int y = (int) random(height);
            int diameter = (int) random(MIN_DIAM,MAX_DIAM);

            int red = (int) random(256);
            int green = (int) random(256);
            int blue = (int) random(256);

            fill(red, green, blue);
            ellipse(x,y,diameter,diameter);
        }

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
