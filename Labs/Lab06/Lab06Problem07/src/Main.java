import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        N = reverse(N);
        isPalindrome(N);


    }

    public static int reverse(int N) {

        int r3 = N % 10;
        int r2 = N / 10 % 10;
        int r1 = N / 100;
        System.out.print(r3);
        System.out.print(r2);
        System.out.println(r1);
        return N;
    }

    public static boolean isPalindrome(int N) {
        int r3 = N % 10;
        int r2 = N / 10 % 10;
        int r1 = N / 100;
        if (r1 != r3) {
            System.out.println("Not Palindrome");
        } else {
            System.out.println("Palindrome");

        }
        return true;
    }
}
