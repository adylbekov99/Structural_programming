import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double money = input.nextDouble();
        int hundred = (int) money / 100;
        money -= hundred * 100;
        int fifty = (int) money / 50;
        money -= fifty * 50;
        int twenty = (int) money / 20;
        money -= twenty * 20;
        int ten = (int) money / 10;
        money -= ten * 10;
        int five = (int) money / 5;
        money -= five * 5;
        int two = (int) money / 2;
        money -= two * 2;

        int one = (int) (money * 1.00);
        money -= one * 1.00;
        int fiftyC = (int) (money / 0.50);
        money -= fiftyC * 0.50;
        int twentyFiveC = (int) (money / 0.25);
        money -= twentyFiveC * 0.25;
        int tenC = (int) (money / 0.10);
        money -= tenC * 0.10;
        int fiveC = (int) (money / 0.05);
        money -= fiveC * 0.05;
        int oneC = (int) (money / 0.01);




        System.out.println("NOTAS:");
        System.out.printf("%s nota(s) de R$ 100.00\n", hundred);
        System.out.printf("%s nota(s) de R$ 50.00\n", fifty);
        System.out.printf("%s nota(s) de R$ 20.00\n", twenty);
        System.out.printf("%s nota(s) de R$ 10.00\n", ten);
        System.out.printf("%s nota(s) de R$ 5.00\n", five);
        System.out.printf("%s nota(s) de R$ 2.00\n", two);
        System.out.println("MOEDAS:");
        System.out.printf("%s nota(s) de R$ 1.00\n", one);
        System.out.printf("%s nota(s) de R$ 0.50\n", fiftyC);
        System.out.printf("%s nota(s) de R$ 0.25\n", twentyFiveC);
        System.out.printf("%s nota(s) de R$ 0.10\n", tenC);
        System.out.printf("%s nota(s) de R$ 0.05\n", fiveC);
        System.out.printf("%s nota(s) de R$ 0.01\n", oneC);
    }
}
