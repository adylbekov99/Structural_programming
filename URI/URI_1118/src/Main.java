import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalValid = 0, X = 0;
        double score1, total = 0, average;
        while(X != 2){
            while(totalValid != 2){
                score1 = sc.nextDouble();
                if (score1 >=0.0 && score1 <= 10.0) {
                    total += score1;
                    totalValid += 1;

                }else {
                    System.out.printf("Nota invalida%n");
                }
            }
            if(totalValid == 2){
                average = total / 2;

                System.out.printf("media = %.2f%n",average);
            }
            X = sc.nextInt();
            if (X == 1) {
                System.out.println("novo calculo (1-sim 2-nao)%n");
            }
        }
    }
}


