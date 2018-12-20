import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();
        double dayBirthRate = ((60/7.0) * 60) * 24;
        double dayDeathRate = (60/13.0 * 60) * 24;
        double dayImigRate = (60/45.0 * 60) * 24;
        double yearBirth = dayBirthRate * 365;
        double yearDeath = dayDeathRate * 365;
        double yearImig = dayImigRate * 365;
        double yearPop = (yearBirth + yearImig) - yearDeath;
        double year1 = 312032486 + yearPop;
        double pop = 0;
        for(int i = 0; i < years; ++i){
            pop = year1;
            year1 = year1 + yearPop;
        }
        System.out.printf("The population in %d years is %.0f", years, pop);
    }
}
