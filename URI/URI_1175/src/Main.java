    import java.util.*;

    public class Main {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[20];
            for(int i = 0; i < arr.length; i++){
                int num = sc.nextInt();
                arr[i] = num;
            }
            reverse(arr);
        }
        public static void reverse(int[] a){
            int j = a.length - 1;
            int temp;
            for(int i = 0; i < a.length / 2; i++){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j--;
            }
            for(int i = 0; i < a.length; i++){
                System.out.printf("N[%d] = %d%n", i, a[i]);
            }
        }
    }
