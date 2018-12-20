import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        int counter = 0;
        float A = 0;
        do {
            N = scan.nextInt();
            counter++;
            A += N;
        } while (N != 0);
        counter--;
        if (counter == 0) {
            System.err.println("Nothing to calculate");
            System.exit(-1);
        }
            float mean = (float) A / (counter);
            System.out.printf("The arithmetic mean is %.1f\n", mean);
        }
    }

