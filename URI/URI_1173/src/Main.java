import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[10];
        arr[0] = num;
        for(int i = 1; i < arr.length; i++){
            num *= 2;
            arr[i] = num;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.printf("N[%d] = %d%n", i, arr[i]);
        }
    }
}
