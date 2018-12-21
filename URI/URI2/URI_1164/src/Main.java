import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for(int i = 0; i < times; i++){
            int num = sc.nextInt();
            int sum = 0;
            for (int j = 1; j <= num/2; j++) {
                if ((num % j) == 0) {
                    sum += j;
                }
            }
            if(sum == num){
                System.out.printf("%d eh perfeito%n", num);
            }
            else {
                System.out.printf("%d nao eh perfeito%n", num);
            }
        }
    }
}
