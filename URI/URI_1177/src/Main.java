import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num--;
        int[] arr = new int[1000];
        int start = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = start;
            if(start >= num){
                start = 0;
            }
            else {
                start++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.printf("N[%d] = %d%n", i, arr[i]);
        }
    }
}
