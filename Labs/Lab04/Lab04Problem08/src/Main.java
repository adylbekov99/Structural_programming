import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Weight of the package? ");
        float weight = scan.nextFloat();
        double cost;
        if(weight>0.0 && weight<=1.0){
            cost = 3.5;
            double fcoast = weight * cost;
            System.out.println("The cost of shipping is " + fcoast);
        }else if(weight>1.0&&weight<=3.0){
            cost = 5.5;
            double fcoast = weight * cost;
            System.out.println("The cost of shipping is " + fcoast);

        }else if(weight > 3.0 && weight <= 10.0){
            cost = 8.5;
            double fcoast = weight * cost;
            System.out.println("The cost of shipping is " + fcoast);

        }else if (weight > 10.0 && weight<= 20.0){
            cost = 10.5;
            double fcoast = weight * cost;
            System.out.println("The cost of shipping is " + fcoast);

        }else if (weight > 50){
            System.out.println("The package cannot be shipped");
        }

    }
}
