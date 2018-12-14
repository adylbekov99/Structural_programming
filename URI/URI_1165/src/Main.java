import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            boolean result = false;
            int one = sc.nextInt();
            for(int j = 2; j <= one / 2; j++) {
                if (num % j == 0) {
                    result = false;
                }
                else {
                    result = true;
                }
            }
            if(result == false){
                System.out.printf("%d eh primo%n", one);
            }
            else {
                System.out.printf("%d nao eh primo%n", one);
            }
        }
    }
}
