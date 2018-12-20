import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int workedHours = input.nextInt();
        double perHour = input.nextDouble();
        double salary = workedHours * perHour;
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);
    }
}