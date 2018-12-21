import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Z, cont = 0, sum = 0;
        while((Z = sc.nextInt()) <= X){

        }
        for(int i = 0; sum < Z; i++){
            sum += X+i;
            cont++;
        }
        System.out.println(cont);
    }
}
