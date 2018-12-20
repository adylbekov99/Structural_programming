import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double salInput = sc.nextDouble();
        double newSalary = 0, moneyEarned = 0;
        int inPercentage = 0;

        if(salInput >= 0 && salInput <= 400.00) {
            newSalary = salInput * 1.15;
            moneyEarned = salInput * 0.15;
            inPercentage = 15;
        }
        else if(salInput >= 400.01 && salInput <= 800) {
            newSalary = salInput * 1.12;
            moneyEarned = salInput * 0.12;
            inPercentage = 12;
        }
        else if(salInput >= 800.01 && salInput <= 1200) {
            newSalary = salInput * 1.10;
            moneyEarned = salInput * 0.10;
            inPercentage = 10;
        }
        else if(salInput >= 1200.01 && salInput <= 2000){
            newSalary = salInput * 1.07;
            moneyEarned = salInput * 0.07;
            inPercentage = 7;
        }
        else if(salInput > 2000) {
            newSalary = salInput * 1.04;
            moneyEarned = salInput * 0.04;
            inPercentage = 4;
        }
        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", moneyEarned);
        System.out.printf("Em percentual: %d %%\n", inPercentage);
    }
}
