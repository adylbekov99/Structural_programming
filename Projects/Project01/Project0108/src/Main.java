import processing.core.PApplet;

public class Main extends PApplet {
    int eartOrbitAngle = 0;
    int moonOrbitAngle = 0;
    int planetOrbit = 0;
    public void settings() {
        fullScreen();

    }

    public void setup() {

    }

    public void draw() {
        background(0);
        noStroke();

        //SUN
        final int SUN_DIAMETER = 200;

        translate(width / 2, height / 2);
        fill(255, 180, 0);
        ellipse(0, 0, SUN_DIAMETER, SUN_DIAMETER);

        //Planet
        final int PLAN_DIAM = 45;

        rotate(radians(planetOrbit));
        translate(200, 0);
        fill(255, 0, 200);
        ellipse(0, 0, PLAN_DIAM, PLAN_DIAM);

        planetOrbit += 1;

        //Earth

        final int EARTH_DIAMETER = 50;

        rotate(radians(eartOrbitAngle));
        translate(250, 0);
        fill(0xff40abff);
        ellipse(0, 0, EARTH_DIAMETER, EARTH_DIAMETER);

        eartOrbitAngle += 1;

        //Moon

        final int MOON_DIAMETER = 15;

        rotate(radians(moonOrbitAngle));
        translate(0, 60);
        fill(180);
        ellipse(0, 0, MOON_DIAMETER, MOON_DIAMETER);

        moonOrbitAngle -= 10;
    }


    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
