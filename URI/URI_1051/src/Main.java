import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float salary = sc.nextFloat();
        double tax = 0;
        if(salary >= 2000.01 && salary <= 3000.00){
            tax = (salary - 2000.0) * 0.08;
        }
        else if(salary >= 3000.01 && salary <= 4500.00){
            float tempTax = 80.00f;
            tax = (salary - 3000.00) * 0.18;
            tax += tempTax;
        }
        else if(salary > 4500.00){
            float tempTax1 = 350.00f;
            salary -= 4500.00;
            float tempTax2 = salary * 0.28f;
            tax = tempTax1 + tempTax2;
        }
        if(tax == 0){
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f\n", tax);
        }
    }
}
