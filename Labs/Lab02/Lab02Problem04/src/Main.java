import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("A four-digit integer? ");
        int number = scanner.nextInt();

        // TODO: find the sum of all the number in integer
        int sum =
                number  % 10 +
                        number / 10 % 10 +
                        number / 100 % 10 +
                        number / 1000;


        System.out.println("The sum of all digits is " + sum);

    }
}