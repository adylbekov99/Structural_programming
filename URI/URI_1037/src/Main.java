import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        if(number > 100 || number < 0) {
            System.out.println("Fora de intervalo");
        } else {
            if(number <= 25){
                System.out.println("Intervalo [0,25]");
            }
            if(number > 25 && number <= 50){
                System.out.println("Intervalo (25,50]");
            }
            if(number > 50 && number <= 75) {
                System.out.println("Intervalo (50,75]");
            }
            if(number > 75) {
                System.out.println("Intervalo (75,100]");
            }
        }
    }
}
