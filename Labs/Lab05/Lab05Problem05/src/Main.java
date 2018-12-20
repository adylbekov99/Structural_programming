import processing.core.PApplet;

public class Main extends PApplet {
    public void settings(){
        fullScreen();
    }
    public void setup(){
        background(0);
        noStroke();
        final int CIRCLE_COUNT = 20;

        int diameter = Math.min(width,height);
        int diamStep = diameter/CIRCLE_COUNT;

        int red = 0;
        int redStep = 255/CIRCLE_COUNT;

        int x = width/2;
        int y = height/2;

        for (int i = 0; i < CIRCLE_COUNT ; i++) {

            fill(red,0,0);
            ellipse(x,y,diameter,diameter);
            diameter -= diamStep;
            red += redStep;
        }

    }
    public void draw(){

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}
