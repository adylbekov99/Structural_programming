import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int sum = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            int max = Math.max(x, y);
            int min = Math.min(x, y);
            for(int j = ++min; j < max; ++j){
                if(j % 2 != 0) {
                    sum += j;
                }
            }
            System.out.println(sum);
        }

    }
}
