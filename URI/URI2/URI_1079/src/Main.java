import java.util.*;

public class Main {
    public static void main(String[] args){
        float one, two, three, average;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            one = sc.nextFloat();
            two = sc.nextFloat();
            three = sc.nextFloat();
            average =  ((one * 2.0f) + (two * 3.0f) + (three * 5.0f)) / 10;
            System.out.printf("%.1f%n", average);
        }

    }
}
