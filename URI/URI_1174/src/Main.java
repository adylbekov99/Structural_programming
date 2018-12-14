import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float[] arr = new float[100];
        for(int i = 0; i < arr.length; i++){
            float num = sc.nextFloat();
            arr[i] = num;
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= 10){
                System.out.printf("A[%d] = %.1f%n", i, arr[i]);
            }
        }
    }
}
