import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float result =  0;
        for(float i = 1; i <= 100; i++){
            result += (1 / i);
        }
        System.out.printf("%.2f%n", result);
    }
}
