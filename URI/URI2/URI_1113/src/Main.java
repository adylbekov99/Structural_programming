import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int one, two;
        do {
            one = sc.nextInt();
            two = sc.nextInt();
            int max = Math.max(one, two);
            int min = Math.min(one, two);
            if(one == two){
                break;
            }
            else {
                if (max == one) {
                    System.out.println("Decrescente");
                } else {
                    System.out.println("Crescente");
                }
            }
        } while(one != two);
    }
}
