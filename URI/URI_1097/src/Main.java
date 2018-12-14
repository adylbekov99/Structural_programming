import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 9; i += 2){
            int j = 7;
            for(int k = 0; k < 3; k++){
                if(i == 3 && k == 0){
                    j = 9;
                }
                else if(i == 5 && k == 0){
                    j = 11;
                }
                else if(i == 7 && k == 0){
                    j = 13;
                }
                else if(i == 9 && k == 0){
                    j = 15;
                }
                System.out.printf("I=%d J=%d%n", i, j);
                j--;

            }

        }
    }
}
