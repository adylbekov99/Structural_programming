import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            int num = sc.nextInt();
            if(num == 0 || num < 0){
                num = 1;
            }
            arr[i] = num;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.printf("X[%d] = %d%n", i, arr[i]);
        }

    }
}
