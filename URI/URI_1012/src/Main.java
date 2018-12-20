import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double RectTriangle = (1.0/2) * A * C;
        double radiusCircle = C * C * PI;
        double trapezium = (1.0/2) * (A + B) * C;
        double square = B * B;
        double rectangle = A * B;
        System.out.printf("TRIANGULO: %.3f\n", RectTriangle);
        System.out.printf("CIRCULO: %.3f\n", radiusCircle);
        System.out.printf("TRAPEZIO: %.3f\n", trapezium);
        System.out.printf("QUADRADO: %.3f\n", square);
        System.out.printf("RETANGULO: %.3f\n", rectangle);
    }
}