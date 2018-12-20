import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 1, c = 1;
        for(int i = 1; i <= n; i++){
            b = (int) Math.pow(i, 2);
            c = (int) Math.pow(i, 3);
            System.out.printf("%d %d %d%n", i, b, c);
            System.out.printf("%d %d %d%n", i, b+1, c+1);
        }
    }
}
