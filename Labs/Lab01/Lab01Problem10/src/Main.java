public class Main {
    public static void main(String[] args){
        double dayBirthRate = ((60/7.0) * 60) * 24;
        double dayDeathRate = (60/13.0 * 60) * 24;
        double dayImigRate = (60/45.0 * 60) * 24;
        double yearBirth = dayBirthRate * 365;
        double yearDeath = dayDeathRate * 365;
        double yearImig = dayImigRate * 365;
        double yearPop = (yearBirth + yearImig) - yearDeath;
        double year1 = 312032486 + yearPop;
        double year2 = year1 + yearPop;
        double year3 = year2 + yearPop;
        double year4 = year3 + yearPop;
        double year5 = year4 + yearPop;
        System.out.printf("After one year population is: %.2f\n", year1);
        System.out.printf("After two years population is: %.2f\n", year2);
        System.out.printf("After three years population is: %.2f\n", year3);
        System.out.printf("After four years population is: %.2f\n", year4);
        System.out.printf("After five years population is: %.2f\n", year5);
    }
}
