import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        if(start % 2 == 0){
            ++start;
            for(int i = 0; i < 6; i++){
                System.out.println(start);
                start += 2;
            }
        } else {
            for(int i = 0; i < 6; i++){
                System.out.println(start);
                start += 2;
            }
        }
    }
}
