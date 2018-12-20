import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int i = 1;
        while(i <= y){
            for(int j = 0; j < x; j++){
                int k = j;
                if(++k == x){
                    System.out.println(i);
                }
                else {
                    System.out.print(i + " ");
                }
                i++;
            }
        }
    }
}
