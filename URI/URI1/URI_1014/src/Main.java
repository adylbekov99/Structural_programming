import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        double y = input.nextDouble();
        double average = x / y;
        System.out.printf("%.3f km/l\n", average);

    }
}