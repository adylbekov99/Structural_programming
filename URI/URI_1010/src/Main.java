import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int product1, product2, numberUnits1, numberUnits2;
        double price1, price2, valueToPay;
        product1 = input.nextInt();
        numberUnits1 = input.nextInt();
        price1 = input.nextDouble();
        product2 = input.nextInt();
        numberUnits2 = input.nextInt();
        price2 = input.nextDouble();
        valueToPay = (numberUnits1 * price1) + (numberUnits2 * price2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valueToPay);
    }
}