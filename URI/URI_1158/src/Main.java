import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < num; ++i){
            sum = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = 0; j < y; ++j){
                if(x % 2 == 0){
                    ++x;
                }
                sum += x;
                x+=2;
            }
            System.out.println(sum);
        }
    }
}
