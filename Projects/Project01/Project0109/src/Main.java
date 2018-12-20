import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {
    int num;
    float R;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        num = Integer.parseInt(JOptionPane.showInputDialog("N? "));
        R = 500 / num;

    }

    public void draw() {

        background(0);
        translate(width / 4 + 100, height / 4);

        for (int i = 0; i < num * R; i += R) {
            for (int j = 0; j < num * R; j += R) {
                if (i % (R * 2) == 0 && (j + R) % (R * 2) == 0 ||
                        (i + R) % (2 * R) == 0 && j % (2 * R) == 0) {
                    fill(0, 0, 255);
                    rect(j, i, R, R);
                } else {
                    fill(255, 0, 0);
                    rect(j, i, R, R);
                }

            }

        }
    }


    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
