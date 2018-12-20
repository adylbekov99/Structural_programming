import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double one = sc.nextDouble();
        double two = sc.nextDouble();
        double three = sc.nextDouble();
        double four = sc.nextDouble();
        double five = sc.nextDouble();
        double six = sc.nextDouble();

        int posCount = 0;
        double posSum = 0;
        if(isPerfect(one)) {
            ++posCount;
            posSum += one;
        };
        if(isPerfect(two)) {
            ++posCount;
            posSum += two;
        };
        if(isPerfect(three)) {
            ++posCount;
            posSum += three;
        };
        if(isPerfect(four)) {
            ++posCount;
            posSum += four;
        };
        if(isPerfect(five)) {
            ++posCount;
            posSum += five;
        };
        if(isPerfect(six)) {
            ++posCount;
            posSum += six;
        };
        System.out.printf("%d valores positivos\n", posCount);
        double average = posSum / posCount;
        System.out.printf("%.1f\n", average);

    }
    public static boolean isPerfect(double n){
        if(n > 0){
            return true;
        }
        return false;
    }
}
