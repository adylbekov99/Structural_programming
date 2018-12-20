import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        int four = sc.nextInt();
        int five = sc.nextInt();
        int posCount = 0;
        int negCount = 0;
        int evenCount = 0;
        int oddCount = 0;
        if(one > 0){
            ++posCount;
        } else if(one < 0){
            ++negCount;
        }
        if(one % 2 == 0){
            ++evenCount;
        } else {
            ++oddCount;
        }
        if(two > 0){
            ++posCount;
        } else if(two < 0){
            ++negCount;
        }
        if(two % 2 == 0){
            ++evenCount;
        } else {
            ++oddCount;
        }
        if(three > 0){
            ++posCount;
        } else if(three < 0){
            ++negCount;
        }
        if(three % 2 == 0){
            ++evenCount;
        } else {
            ++oddCount;
        }
        if(four > 0){
            ++posCount;
        } else if(four < 0){
            ++negCount;
        }
        if(four % 2 == 0){
            ++evenCount;
        } else {
            ++oddCount;
        }
        if(five > 0){
            ++posCount;
        } else if(five < 0){
            ++negCount;
        }
        if(five % 2 == 0){
            ++evenCount;
        } else {
            ++oddCount;
        }
        System.out.println(evenCount + " valor(es) par(es)");
        System.out.println(oddCount + " valor(es) impar(es)");
        System.out.println(posCount + " valor(es) positivo(s)");
        System.out.println(negCount + " valor(es) negativo(s)");
    }
}
