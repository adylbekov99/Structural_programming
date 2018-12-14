import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("1st value? ");
        int a = scanner.nextInt();
        System.out.print("2nd value? ");
        int b = scanner.nextInt();

        System.out.printf("Before swapping: a = %d; b = %d;%n", a, b);

        // TODO: to do swap value of a to
        /*
            int temp = a;
            a = b;
            b = temp;
        */

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("After swapping: a = %d; b = %d;%n", a, b);

    }
}
