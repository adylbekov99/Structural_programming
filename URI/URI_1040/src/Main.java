import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float N1 = sc.nextFloat();
        float N2 = sc.nextFloat();
        float N3 = sc.nextFloat();
        float N4 = sc.nextFloat();

        float average = ((N1*2) + (N2*3) + (N3*4) + (N4*1))/10;


        if(average >= 7.0) {

            System.out.printf("Media: %.1f\n", average);
            System.out.println("Aluno aprovado.");

        }

        else if(average >= 5.0 && average <= 6.9){

            System.out.printf("Media: %.1f\n", average);
            System.out.println("Aluno em exame.");
            float N5 = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n",N5);
            float newAverage = (N5 + average)/2;

            if(average >= 5.0) {
                System.out.println("Aluno aprovado.");
            }
            else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f\n", newAverage);

        }
        else if(average < 5.0){

            System.out.printf("Media: %.1f\n", average);
            System.out.println("Aluno reprovado.");

        }

    }
}
