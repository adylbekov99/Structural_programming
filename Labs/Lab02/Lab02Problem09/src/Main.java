import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        long min = sc.nextInt();
        long hours = min / 60;
        long days = hours / 24;
        long years = days / 365;
        long daysLeft = days - (years * 365);
        System.out.printf("%d minutes is apporoximately %d years and %d days", min, years, daysLeft);
    }
}
