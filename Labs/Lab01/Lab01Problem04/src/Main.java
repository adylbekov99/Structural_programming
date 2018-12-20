import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("1st int? ");
        int one = input.nextInt();
        System.out.print("2nd int? ");
        int two = input.nextInt();

        int add = one + two;
        int sub = one - two;
        int mul = one * two;
        int div = one / two;
        int rem = one % two;

        System.out.printf("%d + %d = %d%n", one, two, add);
        System.out.printf("%d - %d = %d%n", one, two, sub);
        System.out.printf("%d * %d = %d%n", one, two, mul);
        System.out.printf("%d / %d = %d%n", one, two, div);
        System.out.printf("%d %% %d = %d%n", one, two, rem);
    }
}
