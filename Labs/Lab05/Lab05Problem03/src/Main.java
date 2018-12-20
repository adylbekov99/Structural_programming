import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 10;

        Scanner scan = new Scanner(System.in);

        System.out.print("Number of tests? ");
        int numcount = scan.nextInt();
        int correctcount = 0;
        int incorrectcount = 0;

        //int i = 0;
        //while (i < numcount) {
        // i++;

        for (int i = 0; i < numcount ; i++) {


            int num1 = (int) (MIN + Math.random() * (MAX + 1 - MIN));
            int num2 = (int) (MIN + Math.random() * (MAX + 1 - MIN));
            System.out.printf("%d + %d = ",num1,num2);

            int answer = scan.nextInt();
            if (num1 + num2 == answer){
                ++correctcount;
            } else {
                ++incorrectcount;
            }
        }
        System.out.println("Number of correct answers: " + correctcount);
        System.out.println("Number if incorrect answers: " + incorrectcount);
    }
}
