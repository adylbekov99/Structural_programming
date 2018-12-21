import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fibo = 0;
        int first = 0, second = 1;
        for(int i = 0; i < num; i++) {
            int j = i;
            if(i <= 1){
                fibo = i;
                if(++j == num){
                    System.out.println(fibo);
                }
                else {
                    System.out.print(fibo + " ");
                }
            }
            else {
                fibo = first + second;
                first = second;
                second = fibo;
                if(++j == num){
                    System.out.println(fibo);
                }
                else {
                    System.out.print(fibo + " ");
                }
            }
        }
    }
}
