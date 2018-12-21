import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double[] arr = new double[100];
        for(int i = 0; i < arr.length; i++){
            arr[i] = num;
            num /= 2;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("N[%d] = %.4f%n", i, arr[i]);
        }
    }
}
