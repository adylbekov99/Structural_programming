import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1st number? ");
        int a = sc.nextInt();
        System.out.println("2nd number? ");
        int b = sc.nextInt();
        System.out.println("3rd number? ");
        int c = sc.nextInt();
        int greatest = Math.max(a, Math.max(b, c));
        System.out.printf("The value %d is the greatest one", greatest);
    }
}
