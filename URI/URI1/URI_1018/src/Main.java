import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        int hundreds = amount / 100;
        int fifties = (amount - (hundreds * 100))/50;
        int twenties = (amount - ((hundreds * 100)+(fifties*50)))/20;
        int tens = (amount - ((hundreds * 100)+(fifties*50)+(twenties*20)))/10;
        int fives = (amount - ((hundreds * 100)+(fifties*50)+(twenties*20)+(tens*10)))/5;
        int twos = (amount - ((hundreds * 100)+(fifties*50)+(twenties*20)+(tens*10)+(fives*5)))/2;
        int ones = (amount - ((hundreds * 100)+(fifties*50)+(twenties*20)+(tens*10)+(fives*5)+(twos*2)))/1;
        System.out.println(amount);
        System.out.printf("%s nota(s) de R$ 100,00\n", hundreds);
        System.out.printf("%s nota(s) de R$ 50,00\n", fifties);
        System.out.printf("%s nota(s) de R$ 20,00\n", twenties);
        System.out.printf("%s nota(s) de R$ 10,00\n", tens);
        System.out.printf("%s nota(s) de R$ 5,00\n", fives);
        System.out.printf("%s nota(s) de R$ 2,00\n", twos);
        System.out.printf("%s nota(s) de R$ 1,00\n", ones);
    }
}