import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N = ");
        int N = scan.nextInt();
        System.out.printf("Sum of digits: %d%n", sumDigits(N));
    }

    public static int sumDigits(long N) {

        long n3 = N % 10;
        long r = N / 10;
        long n1 = r / 10;
        long n2 = r % 10;
        long sum = n1 + n2 + n3;
        return (int) sum;
    }
}
