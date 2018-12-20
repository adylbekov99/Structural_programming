import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        int four = sc.nextInt();
        int five = sc.nextInt();
        int evenCount = 0;
        if(isPrime(one)){
            ++evenCount;
        }
        if(isPrime(two)){
            ++evenCount;
        }
        if(isPrime(three)){
            ++evenCount;
        }
        if(isPrime(four)){
            ++evenCount;
        }
        if(isPrime(five)){
            ++evenCount;
        }
        System.out.println(evenCount + " valores pares");
    }
    public static Boolean isPrime(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
}
