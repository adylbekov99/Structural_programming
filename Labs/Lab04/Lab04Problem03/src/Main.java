import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("month? ");
        int a = scan.nextInt();
        switch(a){
            case 1:
            case 2:
            case 12:
                System.out.println("winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;

            default:
                System.out.println("Invalid month number.");
                break;
        }
    }
}
