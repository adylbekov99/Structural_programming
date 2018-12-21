import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for(int i = 0; i < times; i++){
            int one = sc.nextInt();
            int two = sc.nextInt();
            if(two == 0){
                System.out.println("divisao impossivel");
            }
            else {
                double twoD = two;
                double result = (double) one / twoD;
                System.out.println(result);
            }
        }
    }
}
