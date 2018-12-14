import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int durSeconds = input.nextInt();
        int hours = (durSeconds / 60)/60;
        int minutes = (durSeconds / 60)-(hours * 60);
        int seconds = durSeconds - ((hours * 60 * 60) + (minutes * 60));
        System.out.printf("%s:%s:%s\n", hours, minutes, seconds);
    }
}