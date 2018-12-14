import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 9; i += 2){
            int j = 7;
            for(int k = 0; k < 3; k++){
                System.out.printf("I=%d J=%d%n", i, j);
                j--;
            }
        }
    }
}
