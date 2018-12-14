import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int hours = 0;
        if(a==b){
            hours = 24 - a + b;
        }
        else if(a <= b){
            hours = b - a;
        }
        else {
            hours = 24 - a + b;
        }
        System.out.printf("O JOGO DUROU %s HORA(S)\n", hours);
    }
}
