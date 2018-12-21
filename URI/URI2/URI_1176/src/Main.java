import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int num;
        int fib[] = new int[61];

        fib[0] = 0;
        fib[1] = 1;

        for(int j = 2; j <= 60; j++){
            fib[j] = fib[j-2] + fib[j-1];
        }
        for(int i = 0; i < times; i++){
            num = sc.nextInt();
            System.out.printf("Fib(%d) = %d%n", num, fib[num]);
        }
    }
}



