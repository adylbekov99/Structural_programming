import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("some real number? ");
        double number = sc.nextDouble();
        if(number < 0){
            double Anumber = number * (-1);
            System.out.printf("| %.1f | = %.1f", number, Anumber);
        } else{
            System.out.printf("| %.1f | = %.1f", number, number);
        }
    }
}
