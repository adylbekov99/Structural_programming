import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double a,b;
        a = scan.nextDouble();
        b = scan.nextDouble();
        if (a <=5 && b <= 5){
            System.out.printf("Point (%.1f, %.1f) is in the circle\n",a,b);
        }else{
            System.out.printf("Point (%.1f, %.1f) is not in the circle\n",a,b);

        }
    }
}
