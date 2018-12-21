import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int age;
        double counter = 0;
        while((age = sc.nextInt()) > 0) {
            sum += age;
            ++counter;
        }
        double average = sum / counter;
        System.out.printf("%.2f%n", average);
    }
}
