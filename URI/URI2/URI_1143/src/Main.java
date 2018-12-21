import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int one = 0, squared = 0, cubed = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= 3; j++){
                one = (int) Math.pow(i,1);
                squared = (int) Math.pow(i,2);
                cubed = (int) Math.pow(i,3);
            }
            System.out.printf("%d %d %d%n", one, squared, cubed);
        }
    }
}
