import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b;
        System.out.print("Enter a point with two coordinates: ");
        a = scan.nextDouble();
        b = scan.nextDouble();
        if(a<=5 && a>=-5 && b <=2.5 && b>= -2.5){
            System.out.printf("Point (%.1f, %.1f) is in the rectangle",a,b);
        }else{
            System.out.printf("Point (%.1f, %.1f) is not in the rectangle",a,b);

        }
    }
}
