import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int code = input.nextInt();
        int quantity = input.nextInt();
        double price = 0;

        switch (code){
            case 1:
                price = 4.00;
                break;
            case 2:
                price = 4.50;
                break;
            case 3:
                price = 5.00;
                break;
            case 4:
                price = 2.00;
                break;
            case 5:
                price = 1.50;
                break;
        }
        double total = price * quantity;
        System.out.printf("Total: R$ %.2f\n", total);
    }
}
