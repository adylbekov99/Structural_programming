import processing.core.PApplet;

public class Main extends PApplet {
    int R = 30;
    float x1 = width / 2;
    float y1 = height / 2;
    float dx1 = 7;
    float dy1 = 7;
    float x2 = x1 + 35;
    float y2 = y1 + 35;
    float dx2 = 7;
    float dy2 = 7;
    float x3 = x1 - 60;
    float y3 = y1 - 60;
    float dx3 = 7;
    float dy3 = 7;

    public void settings() {
        fullScreen();
    }

    public void setup() {

    }

    public void draw() {
        //1st Ball
        background(0);
        ellipse(x1, y1, R, R);
        fill(200, 0, 0);
        x1 += dx1;
        y1 += dy1;

        if (x1 > width - R) {
            x1 = width - R;
            dx1 = -dx1;
        }
        if (x1 < R) {
            x1 = R;
            dx1 = -dx1;
        }
        if (y1 > height - R) {
            y1 = height - R;
            dy1 = -dy1;
        }
        if (y1 < R) {
            y1 = R;
            dy1 = -dy1;
        }

        //2nd Ball
        ellipse(x2, y2, R, R);
        fill(0, 0, 200);
        x2 += dx2;
        y2 += dy2;
        if (x2 > width - R) {
            x2 = width - R;
            dx2 = -dx2;
        }
        if (x2 < R) {
            x2 = R;
            dx2 = -dx2;
        }
        if (y2 > height - R) {
            y2 = height - R;
            dy2 = -dy2;
        }
        if (y2 < R) {
            y2 = R;
            dy2 = -dy2;
        }
        //3d Ball
        ellipse(x3, y3, R, R);
        fill(0, 200, 0);
        x3 += dx3;
        y3 += dy3;
        if (x3 > width - R) {
            x3 = width - R;
            dx3 = -dx3;
        }
        if (x3 < R) {
            x3 = R;
            dx3 = -dx3;
        }
        if (y3 > height - R) {
            y3 = height - R;
            dy3 = -dy3;
        }
        if (y3 < R) {
            y3 = R;
            dy3 = -dy3;
        }

    }


    public static void main(String[] args) {
        PApplet.main("Main");
    }

}
