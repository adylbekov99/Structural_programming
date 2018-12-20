import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("complexety level? ");
        int a = scan.nextInt();
        switch (a){
            case 1:
                System.out.println("You are a beginner");
                break;

            case 2:
            case 3:
                System.out.println("You are an experienced gamer");
            break;

            case 4:
            case 5:
                System.out.println("You are a pro gamer");
                break;


            case 0:
                System.out.println("You are a total newbie");
                break;

             default:
                 System.out.println("Invalid number");
                 break;
        }
    }
}
