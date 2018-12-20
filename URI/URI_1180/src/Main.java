import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min = 1000;
        int[] myArray = new int[N];
        for(int i = 0; i < myArray.length; i++){
            int num = sc.nextInt();
            myArray[i] = num;
        }

        for(int j = 0; j < myArray.length; j++){
            if(myArray[j] < min){
                min = myArray[j];
            }
        }

        System.out.println("Menor valor: " + min);
        System.out.println("Posicao: " + getIndexOfMin(myArray));
    }
    public static int getIndexOfMin(int[] a){
        int min = 1000;
        int pos = 0;

        for(int j = 0; j < a.length; j++){
            if(a[j] < min){
                min = a[j];
                pos = j;
            }
        }
        return pos;
    }
}
