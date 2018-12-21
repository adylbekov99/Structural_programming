import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for(int j = 0; j <= i; j++) {
            if(j % 2 != 0){
                System.out.println(j);
            }
        }
    }
}
