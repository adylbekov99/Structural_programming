import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i;
        while ((num = sc.nextInt()) != 0) {
            for (i = 1; i <= num; i++) {
                if (i == num) {
                    System.out.print(num+"%n");
                } else {
                    System.out.print(i+" ");
                }
            }
        }
    }
}




