import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature in degrees Fahrenheit? ");
        double fahr = scanner.nextDouble();
        double cels = (fahr - 32) * 5/9;
        System.out.printf("The temperature in degrees Celsius is %.2f\n", cels);
    }
}
