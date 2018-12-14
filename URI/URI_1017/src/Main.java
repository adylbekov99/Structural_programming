import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int spentTime = input.nextInt();
        int avgSpeed = input.nextInt();
        double litersNeeded = (spentTime * avgSpeed) / 12.0;
        System.out.printf("%.3f\n", litersNeeded);

    }
}