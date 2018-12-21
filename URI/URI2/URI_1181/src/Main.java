import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        float average = 0;
        int lineNum = sc.nextInt();
        String operation = sc.nextLine();

        float[][] num = new float[12][12];

        for(int i = 0; i <12; i++){
            for (int j = 0; j < 12; j++) {
                num[i][j] = sc.nextFloat();
            }
        }


        for (int b = 0; b < 12; b++){
            sum += num[lineNum][b];
        }
        average = sum / 12;

        if(operation.equals('S')){
            System.out.println(sum);
        }
        else if(operation.equals('M')){
            System.out.printf("%.1f", average);
        }
    }
}
