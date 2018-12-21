import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double volume = (4.0/3.0) * PI * (radius * radius * radius);
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
