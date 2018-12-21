import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int greatest1 = (a+b+Math.abs(a-b)) / 2;
        int greatest = (greatest1+c+Math.abs(greatest1 - c)) / 2;
        System.out.println(greatest + " eh o maior");
    }
}
