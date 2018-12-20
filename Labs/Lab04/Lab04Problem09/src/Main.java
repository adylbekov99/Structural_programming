
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float A, B, C;
        A = scan.nextFloat();
        B = scan.nextFloat();
        C = scan.nextFloat();
        if ((A > 0) && (B > 0) && (C > 0)) {
            if (A >= B + C || B >= A + C || C >= A + B) {
                System.out.println("Triangle is invalid");
            }else{
                double res = A + B + C;
                System.out.printf("Perimeter is %.2f\n",res);
            }

        }
    }
}