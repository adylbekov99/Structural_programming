import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int N = sc.nextInt();
        int total = 0;
        for(int i = A, totalNumber = 0; totalNumber < N; i++){
            total += i;
            totalNumber += 1;
        }
        System.out.println(total);
    }
}
