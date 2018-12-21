import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float result =  1;
        float j = 2, i;
        for(i = 3; i <= 39; i+=2, j*=2){
            result += (i / j);
        }
        System.out.printf("%.2f%n", result);
    }
}
