import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        float sum = 0f;
        float average = 0;
        while(count != 2){
            float num = sc.nextFloat();
            if(num >= 0.0 && num <= 10.0){
                ++count;
                sum += num;
            } else {
                System.out.println("nota invalida");
            }
        }
        average = (float) sum / 2.0f;
        System.out.printf("media = %.2f%n", average);
    }
}
