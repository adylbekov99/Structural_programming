import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double rad = scanner.nextDouble();
        double length = scanner.nextDouble();
        double area = (rad * rad) * Math.PI;
        double volume = area * length;
        System.out.printf("The area is %.4f\n", area);
        System.out.printf("The volume is %.1f\n", volume);
    }
}
