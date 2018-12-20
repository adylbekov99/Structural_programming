import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, i, parCount = 0, imparCount = 0;
        int[] par = new int[5];
        int[] impar = new int[5];
        for(i = 0; i < 15; i++) {
            num = sc.nextInt();
            if(num % 2 == 0){
                if(parCount == 5){
                    parCount = 0;
                }
                par[parCount] = num;
                System.out.printf("par[%d] = %d%n", parCount, par[num]);
                parCount++;
            }
            else {
                if(imparCount == 5){
                    imparCount = 0;
                }
                impar[imparCount] = num;
                System.out.printf("impar[%d] = %d%n", imparCount, impar[num]);
                imparCount++;
            }
        }
    }
}
