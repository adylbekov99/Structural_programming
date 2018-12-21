import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        while((num = sc.nextInt()) != 0) {
            sum = 0;
            for(int i = 0; i < 5; ++i){
                if(num % 2 != 0){
                    num++;
                }
                sum += num;
                num += 2;
            }
            System.out.println(sum);
        }

    }
}
