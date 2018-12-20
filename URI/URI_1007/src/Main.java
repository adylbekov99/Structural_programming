import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int A, B, C, D;
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();
        int difference = A * B - C * D;
        System.out.printf("DIFERENCA = %d\n", difference);
    }
}
