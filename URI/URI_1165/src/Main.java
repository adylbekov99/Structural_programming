import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        int times, num, j;
        Scanner input = new Scanner(System.in);
        times = input.nextInt();
        for (int i = 1; i <= times; i++) {
            num = input.nextInt();
            boolean isPrime = true;
            for (j = 2; j < num; j++) {
                if (num % j == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println(num +" eh primo");
            }else {
                System.out.println(num +" nao eh primo");
            }

        }

    }

}
