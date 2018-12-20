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
        if(one > 0){
            ++posCount;
        }
        if(two > 0){
            ++posCount;
        }
        if(three > 0){
            ++posCount;
        }
        if(four > 0){
            ++posCount;
        }
        if(five > 0){
            ++posCount;
        }
        if(six > 0){
            ++posCount;
        }
        System.out.printf("%d valores positivos\n", posCount);


    }
}
