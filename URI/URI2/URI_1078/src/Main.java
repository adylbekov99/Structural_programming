import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int N;
        Scanner input=new Scanner(System.in);
        N =input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" x "+N+" = "+(i*N)+"\n");
        }

    }

}