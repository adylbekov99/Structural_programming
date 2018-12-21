import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int x = sc.nextInt();
        int y = sc.nextInt();
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        for(int i = min; i <= max; i++) {
            if(i % 13 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
