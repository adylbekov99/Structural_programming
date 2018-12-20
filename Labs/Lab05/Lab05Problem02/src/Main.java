import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Integer? ");
        int n = scan.nextInt();

        int sum = 0;

        while (n != 0){
            sum += Math.abs(n % 10);
            n /= 10;
        }
        System.out.printf("Sum of all digits is %d%n",sum);
    }
}
