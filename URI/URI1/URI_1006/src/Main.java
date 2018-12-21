import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double weightA = A * 2;
        double weightB = B * 3;
        double weightC = C * 5;
        double total = weightA + weightB + weightC;
        double sum = total / 10.0;
        System.out.printf("MEDIA = %.1f\n", sum);

    }
}
