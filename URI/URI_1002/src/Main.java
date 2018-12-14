import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;
        double radius = input.nextDouble();
        double area = radius * radius * pi;

        DecimalFormat df = new DecimalFormat("#.####");

        System.out.println("A="+df.format(area));
    }
}
