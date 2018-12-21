import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for(int i = 0; i < times;i++){
            int PA = sc.nextInt();
            int PB = sc.nextInt();
            float G1 = sc.nextFloat();
            float G2 = sc.nextFloat();
            int counter = 0;
            while(PB > PA){
                PA = (int) (PA * G1);
                PB = (int) (PB * G2);
                counter++;
                if(counter > 100){
                    break;
                }
            }
            if(counter > 100){
                System.out.println("Mais de 1 seculo.");
            }
            else {
                System.out.printf("%d anos.%n", counter);
            }
        }
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula01_Aquecimento;

        import java.text.NumberFormat;
        import java.text.ParseException;
        import java.util.Locale;
        import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class _1160_Crescimento_Populacional {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(), anos;
        double g1, g2;
        int pa, pb;
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        for (int i = 0; i < t; i++) {
            anos = 101;
            pa = in.nextInt();
            pb = in.nextInt();
            g1 = format.parse(in.next()).doubleValue();
            g2 = format.parse(in.next()).doubleValue();
            for (int j = 0; j < 100; j++) {
                pa = (int) ((1 + (g1 / 100)) * pa);
                pb = (int) ((1 + (g2 / 100)) * pb);
                if (pa > pb) {
                    anos = (j + 1);
                    break;
                }
            }
            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anos + " anos.");
            }
        }
        in.close();
    }
}
