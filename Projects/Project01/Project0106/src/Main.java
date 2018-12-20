import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {
    static int num;
    float x,y,alpha = 0,beta;

    public void settings(){
        fullScreen();
    }
    public void setup(){
        x = width/2;
        y = height/12;
        frameRate(60);
        noStroke();

    }
    public void draw(){
        background(0,0,0,10);
        translate(width/2,height/2);
        rotate(alpha);
        alpha += 1;
        for (int i = 1; i <= num ; i++) {
            fill(255,0,0,40);

            ellipse(0,0,x,y);
            rotate(beta);
            beta = PI/num;

        }

    }

    public static void main(String[] args) {
        PApplet.main("Main");
        num = Integer.parseInt(JOptionPane.showInputDialog("N? "));
    }

}
