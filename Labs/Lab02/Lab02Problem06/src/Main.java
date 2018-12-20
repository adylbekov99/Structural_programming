import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double cels = scanner.nextDouble();
        double fahr = (9.0/5) * cels + 32;
        System.out.printf("%s Celsius is %.2f Fahrenheit", cels, fahr);
    }
}
