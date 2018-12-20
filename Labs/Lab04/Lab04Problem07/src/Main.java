import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int random = (int) (Math.random() * 100) ;
        int random1 = (int) (Math.random() * 100);
        int random2 = (int) (Math.random() * 100);

        System.out.print("Enter 3 numbers: ");
        int a,b,c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        System.out.print("Lucky numbers: \n"+random+" ");
        System.out.print(random1+" ");
        System.out.println(random2);
        if(a==random && b == random1 && c == random2){
            System.out.println("Win 10000$");
        }else if(a == random || a == random1 || a==random2 && b==random||b==random1||b==random2 && c==random||
        c== random1||c==random2){
            System.out.println("Win 3000$");
        }else if((a == random) || (a == random1) || (a == random2) || (b == random) || (b == random1) || (b == random2)
                || (c == random) || (c == random1) ||
                (c==random2)){
            System.out.println("Win 1000$");
        }else{
            System.out.println("Win 0$");
        }

    }
}
