import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();
        float per, area;

        if(A % 10 != 0 && B % 10 != 0 && C % 10 != 0){
            per = A + B + C;
            System.out.printf("Perimetro = %.1f\n", per);
        } else {
            area = ((A + B) / 2) * C;
            System.out.printf("Area = %.1f\n", area);
        }

    }
}
