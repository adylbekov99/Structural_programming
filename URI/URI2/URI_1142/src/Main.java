import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 1;
        for(int i = 0; i < x; i++){
            for(int j = 1; j <= 4; j++){
                if(j == 4) {
                    System.out.println("PUM");
                }
                else {
                    System.out.print(count + " ");
                }
                count++;
            }
        }
    }
}
