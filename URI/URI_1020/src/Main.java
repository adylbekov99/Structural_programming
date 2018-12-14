import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        int years = days / 365;
        int months = days % 365 / 30;
        int daysLeft = days % 365 % 30;


        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(daysLeft + " dia(s)");
    }
}
