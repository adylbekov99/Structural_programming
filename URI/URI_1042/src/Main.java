import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();

        int big = 0;
        int med = 0;
        int sml = 0;

        if(one > two && one > three) {
            big = one;
            if(two > three){
                med = two;
                sml = three;
            }
            else{
                med = three;
                sml = two;
            }
        }
        else if(two > one && two > three) {
            big = two;
            if(one > three){
                med = one;
                sml = three;
            }
            else{
                med = three;
                sml = one;
            }

        }
        else if(three > one && three > two){
            big = three;
            if(two > one){
                med = two;
                sml = one;
            }
            else{
                med = one;
                sml = two;
            }
        }
        System.out.println(sml);
        System.out.println(med);
        System.out.println(big);
        System.out.println();
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
