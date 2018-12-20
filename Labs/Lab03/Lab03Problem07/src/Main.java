import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter todays day: ");
        int day = scan.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = scan.nextInt();
        int future = (day + elapsed) % 7;
        String a = "";
        switch (day) {
            case 0:
                a = "Sunday";
                break;
            case 1:
                a = "Monday";
                break;
            case 2:
                a = ("Tuesday");
                break;
            case 3:
                a = ("Wednesday");
                break;
            case 4:
                a = ("Thursday");
                break;
            case 5:
                a = ("Friday");
                break;
            case 6:
                a = ("Saturday");

        }
        switch (future) {
            case 0:
                System.out.print("Today is " + a + " and the future day is Sunday.");
                break;
            case 1:
                System.out.print("Today is " + a + " and the future day is Monday.");
                break;
            case 2:
                System.out.print("Today is " + a + " and the future day is Tuesday.");
                break;
            case 3:
                System.out.print("Today is " + a + " and the future day is Wednesday.");
                break;
            case 4:
                System.out.print("Today is " + a + " and the future day is Thursday.");
                break;
            case 5:
                System.out.print("Today is " + a + " and the future day is Friday.");
                break;
            case 6:
                System.out.print("Today is " + a + " and the future day is Saturday.");


        }
    }
}
