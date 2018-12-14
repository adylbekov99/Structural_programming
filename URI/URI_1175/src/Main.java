    import java.util.*;

    public class Main {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[20];
            for(int i = 0; i < arr.length; i++){
                int num = sc.nextInt();
                arr[i] = num;
            }
            int j = arr.length - 1;
            int temp;
            for(int i = 0; i < arr.length / 2; i++){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
            for(int i = 0; i < arr.length; i++){
                System.out.printf("N[%d] = %d%n", i, arr[i]);
            }
        }
    }
