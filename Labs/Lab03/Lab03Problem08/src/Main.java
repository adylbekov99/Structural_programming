import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        if(a > b && b > c){
            System.out.printf("%d %d %d",c,b,a);
        }else if(b > a && a > c){
            System.out.printf("%d %d %d\n",c,a,b);
        }else if(c > b && b > a){
            System.out.printf("%d %d %d\n",a,b,c);
        }else if(b > c && c > a){
            System.out.printf("%d %d %d\n",a,c,b);
        }else if((c > a && a > b)){
            System.out.printf("%d %d %d\n",b,a,c);
        }else if(a > c && c > b){
            System.out.printf("%d %d %d\n",b,c,a);
        }
    }
}
