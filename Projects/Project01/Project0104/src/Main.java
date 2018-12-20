import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {
    static String word1, word2;
    int x, y, x1, y1;
    int dx = 7;
    int dx1 = 7;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width / 2;
        y = height / 2 - 175;
        x1 = width / -2;
        y1 = height / 2 + 175;

        word1 = JOptionPane.showInputDialog("First word: ");
        word2 = JOptionPane.showInputDialog("Second word: ");

    }

    public void draw() {
        background(0);
        textSize(200);
        textAlign(CENTER,CENTER);
        textWidth(word1);
        fill(255, 0, 0);
        text(word1, x, y);
        fill(0, 255, 0);
        text(word2, x1, y1);
        x += dx;
        x1 += dx1;
        if (x > width - textWidth(word1)/2) {
            x = (int) (width - textWidth(word1)/2);
            dx = -dx;
        }
        if (x < textWidth(word1)/2) {
            x = (int) (textWidth(word1)/2);
            dx = -dx;
        }
        if (x1 > width - textWidth(word2) / 2) {
            x1 = (int) (width - textWidth(word2)/2);
            dx1 = -dx1;
        }
        if (x1 < textWidth(word2)/2) {
            x1 = (int) (textWidth(word2)/2);
            dx1 = -dx1;
        }

    }


    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
