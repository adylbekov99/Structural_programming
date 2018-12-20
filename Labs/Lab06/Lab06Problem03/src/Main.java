import processing.core.PApplet;


public class Main extends PApplet {
//    int r = 150;
//    int r1 = 50;
    public void settings(){
        fullScreen();

    }
    public void setup(){
        background(0);
        strokeWeight(5);
        stroke(0xFFFF0000);
        star(width/2,height/2,80,275);
        stroke(0xFFFFFF00);
        star(width/2 - 450,height/2 + 250,40,125);
        star(width/2 + 450,height/2 - 250,40,125);
        star(width/2 - 450,height/2 - 250,40,125);
        star(width/2 + 450,height/2 + 250,40,125);

    }
    public void star(float x, float y, float r,float r1) {
        float angle = 0;
        float deltaAngle = 360 / 8;

        rotate(radians(angle));
        angle += 1;


        float prevX = x + cos(radians(angle - deltaAngle)) * r;
        float prevY = y + sin(radians(angle - deltaAngle)) * r;

        for (int i = 0; i < 8; ++i, angle += deltaAngle) {
            float computedRadius = i % 2 == 0 ? r1 : r;

            float endX = x + cos(radians(angle)) * computedRadius;
            float endY = y + sin(radians(angle)) * computedRadius;


            line(x, y, endX, endY);
            line(endX, endY, prevX, prevY);

            prevX = endX;
            prevY = endY;


        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
