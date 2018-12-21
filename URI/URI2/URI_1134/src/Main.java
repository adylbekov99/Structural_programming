import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int alcCount = 0, gasCount = 0, dieCount = 0;
        do {
            num = sc.nextInt();
            switch(num) {
                case 1:
                    ++alcCount;
                    break;
                case 2:
                    ++gasCount;
                    break;
                case 3:
                    ++dieCount;
                    break;
                default:
                    break;
            }
        } while(num != 4);
        System.out.print("MUITO OBRIGADO\n");
        System.out.printf("Alcool: %d%n", alcCount);
        System.out.printf("Gasolina: %d%n", gasCount);
        System.out.printf("Diesel: %d%n", dieCount);
    }
}
