import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int one, two, max = 0, min = 0;
        do {
            int sum = 0;
            one = sc.nextInt();
            two = sc.nextInt();
            max = Math.max(one, two);
            min = Math.min(one, two);
            if(max <= 0 || min <= 0){
                break;
            } else {
                for (int j = min; j <= max; j++) {
                    System.out.print(j + " ");
                    sum += j;
                }
                System.out.printf("Sum=%d%n", sum);
            }
        } while(!(one <= 0 || two <= 0));
    }
}
