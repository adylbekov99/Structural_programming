import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double deter = Math.pow(B, 2) - 4*A*C;
        if(deter < 0 || A == 0) {
            System.out.println("Impossivel calcular");
        } else {
            deter = Math.sqrt(deter);
            double one = ((-B) + deter) / (2 * A);
            double two = ((-B) - deter) / (2 * A);
            System.out.printf("R1 = %.5f\n", one);
            System.out.printf("R2 = %.5f\n", two);
        }
    }
}
