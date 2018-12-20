import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double fixedSalary = input.nextDouble();
        double dollarsInSales = input.nextDouble();
        double totalSalary = dollarsInSales * 0.15 + fixedSalary;
        System.out.printf("TOTAL = R$ %.2f\n", totalSalary);
    }
}
