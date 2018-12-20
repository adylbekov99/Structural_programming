import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("Before swapping a = %d, b = %d\n", a, b);
        a += b;
        b = a - b;
        a = a - b;
        System.out.printf("After swapping a = %d, b = %d\n", a , b);
    }
}
