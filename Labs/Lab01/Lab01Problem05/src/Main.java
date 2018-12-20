import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("1st double? ");
        double firstOperand = input.nextDouble();
        System.out.print("2nd double? ");
        double secondOperand = input.nextDouble();

        double sum = firstOperand + secondOperand;
        double sub = firstOperand - secondOperand;
        double mul = firstOperand * secondOperand;
        double div = firstOperand / secondOperand;
        double rem = firstOperand % secondOperand;

        System.out.printf("%.2f + %.2f = %f%n", firstOperand, secondOperand, sum);
        System.out.printf("%.2f + %.2f = %f%n", firstOperand, secondOperand, sub);
        System.out.printf("%.2f + %.2f = %f%n", firstOperand, secondOperand, mul);
        System.out.printf("%.2f + %.2f = %f%n", firstOperand, secondOperand, div);
        System.out.printf("%.2f + %.2f = %f%n", firstOperand, secondOperand, rem);



    }
}
