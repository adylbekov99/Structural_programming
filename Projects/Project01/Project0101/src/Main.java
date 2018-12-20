import processing.core.PApplet;

public class Main extends PApplet {

    float x;
    float x1;
    float y;
    float dbr = 0.05f;
    float dsr = 0.01f;
    float bigStarRad = 25;
    float smallStarRad = 10;
    float bigStarEnd = 150;
    float smallStarEnd = 44;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(100);
        strokeWeight(4);
    }


    public void draw() {
        background(0);



        bigStar(width/2,height/2);
        smallStar(width/2 - 300,height/2 - 300);
        smallStar(width/2 + 300,height/2 - 300);
        smallStar(width/2 + 300,height/2 + 300);
        smallStar(width/2 - 300,height/2 + 300);
        stroke(255,0,0);
        strokeWeight(2);

    }
    void smallStar(float x, float y){
        pushMatrix();
        translate(x,y);
        stroke(255,255,0);
        strokeWeight(4);
        line(0,0, bigStarRad,0); // line +
        line(0,0, smallStarRad, smallStarRad);
        line(bigStarRad,0, smallStarRad, smallStarRad);
        line(0, bigStarRad, smallStarRad, smallStarRad);
        bigStarRad += dbr;
        smallStarRad += dsr;
        if (bigStarRad > bigStarEnd){
            bigStarRad = bigStarEnd;
            dbr = - dbr;
            dsr = - dsr;
        }
        if (bigStarRad < bigStarEnd /5){
            bigStarRad = bigStarEnd /5;
            dbr = - dbr;
            dsr = - dsr;
        }
        rotate(PI/2);
        line(0,0, bigStarRad,0); // line +
        line(0,0, smallStarRad, smallStarRad);
        line(bigStarRad,0, smallStarRad, smallStarRad);
        line(0, bigStarRad, smallStarRad, smallStarRad);
        bigStarRad += dbr;
        smallStarRad += dsr;
        if (bigStarRad > bigStarEnd){
            bigStarRad = bigStarEnd;
            dbr = - dbr;
            dsr = - dsr;
        }
        if (bigStarRad < bigStarEnd /5){
            bigStarRad = bigStarEnd /5;
            dbr = - dbr;
            dsr = - dsr;
        }        rotate(PI/2);
        line(0,0, bigStarRad,0); // line +
        line(0,0, smallStarRad, smallStarRad);
        line(bigStarRad,0, smallStarRad, smallStarRad);
        line(0, bigStarRad, smallStarRad, smallStarRad);
        bigStarRad += dbr;
        smallStarRad += dsr;
        if (bigStarRad > bigStarEnd){
            bigStarRad = bigStarEnd;
            dbr = - dbr;
            dsr = - dsr;
        }
        if (bigStarRad < bigStarEnd /5){
            bigStarRad = bigStarEnd /5;
            dbr = - dbr;
            dsr = - dsr;
        }        rotate(PI/2);
        line(0,0, bigStarRad,0); // line +
        line(0,0, smallStarRad, smallStarRad);
        line(bigStarRad,0, smallStarRad, smallStarRad);
        line(0, bigStarRad, smallStarRad, smallStarRad);
        bigStarRad += dbr;
        smallStarRad += dsr;
        if (bigStarRad > bigStarEnd){
            bigStarRad = bigStarEnd;
            dbr = - dbr;
            dsr = - dsr;
        }
        if (bigStarRad < bigStarEnd /5){
            bigStarRad = bigStarEnd /5;
            dbr = - dbr;
            dsr = - dsr;
        }
        popMatrix();
    }
    void bigStar(float x , float y){

        pushMatrix();
        translate(x,y);
        stroke(255,0,0);
        strokeWeight(4);
        line(0,0,(bigStarEnd + bigStarEnd /6) - bigStarRad,0); // line +
        line(0,0, smallStarEnd - smallStarRad, smallStarEnd - smallStarRad);
        line((bigStarEnd + bigStarEnd /6) - bigStarRad,0, smallStarEnd - smallStarRad, smallStarEnd - smallStarRad);
        line(0,(bigStarEnd + bigStarEnd /6) - bigStarRad, smallStarEnd - smallStarRad, smallStarEnd - smallStarRad);
        bigStarRad += dbr;
        smallStarRad += dsr;
        if (bigStarRad > bigStarEnd){
            bigStarRad = bigStarEnd;
            dbr = - dbr;
            dsr = - dsr;
        }
        if (bigStarRad < bigStarEnd /5){
            bigStarRad = bigStarEnd /5;
            dbr = - dbr;
            dsr = - dsr;
        }


        rotate(PI/2);
        line(0,0,(bigStarEnd + bigStarEnd /6) - bigStarRad,0); // line +
        line(0,0, smallStarEnd - smallStarRad, smallStarEnd - smallStarRad);
        line((bigStarEnd + bigStarEnd /6) - bigStarRad,0, smallStarEnd - smallStarRad, smallStarEnd - smallStarRad);
        line(0,(bigStarEnd + bigStarEnd /6) - bigStarRad, smallStarEnd - smallStarRad, smallStarEnd - smallStarRad);
        bigStarRad += dbr;
        smallStarRad += dsr;
        if (bigStarRad > bigStarEnd){
            bigStarRad = bigStarEnd;
            dbr = - dbr;
            dsr = - dsr;
        }
        if (bigStarRad < bigStarEnd /5){
            bigStarRad = bigStarEnd /5;
            dbr = - dbr;
            dsr = - dsr;
        } rotate(PI/2);
        line(0,0,(bigStarEnd + bigStarEnd /6) - bigStarRad,0); // line +
        line(0,0, smallStarEnd - smallStarRad, smallStarEnd - smallStarRad);
        line((bigStarEnd + bigStarEnd /6) - bigStarRad,0, smallStarEnd - smallStarRad, smallStarEnd - smallStarRad);
        line(0,(bigStarEnd + bigStarEnd /6) - bigStarRad, smallStarEnd - smallStarRad, smallStarEnd - smallStarRad);
        bigStarRad += dbr;
        smallStarRad += dsr;
        if (bigStarRad > bigStarEnd){
            bigStarRad = bigStarEnd;
            dbr = - dbr;
            dsr = - dsr;
        }
        if (bigStarRad < bigStarEnd /5){
            bigStarRad = bigStarEnd /5;
            dbr = - dbr;
            dsr = - dsr;
        } rotate(PI/2);
        line(0,0,(bigStarEnd + bigStarEnd /6) - bigStarRad,0); // line +
        line(0,0, smallStarEnd - smallStarRad, smallStarEnd - smallStarRad);
        line((bigStarEnd + bigStarEnd /6) - bigStarRad,0, smallStarEnd - smallStarRad, smallStarEnd - smallStarRad);
        line(0,(bigStarEnd + bigStarEnd /6) - bigStarRad, smallStarEnd - smallStarRad, smallStarEnd - smallStarRad);
        bigStarRad += dbr;
        smallStarRad += dsr;
        if (bigStarRad > bigStarEnd){
            bigStarRad = bigStarEnd;
            dbr = - dbr;
            dsr = - dsr;
        }
        if (bigStarRad < bigStarEnd /5){
            bigStarRad = bigStarEnd /5;
            dbr = - dbr;
            dsr = - dsr;
        }
        popMatrix();

    }

    public static void main(String... args) {
        PApplet.main("Main");
    }
}
