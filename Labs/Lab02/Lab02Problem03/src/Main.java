import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        final double INCHES_IN_CM = 2.54;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length in inches? ");
        double lengthInInches = scanner.nextInt();
        double lengthInCentimeters = lengthInInches * INCHES_IN_CM;


        System.out.printf("%.2f in. = %.2f cm.%n", lengthInInches, lengthInCentimeters);

    }
}
