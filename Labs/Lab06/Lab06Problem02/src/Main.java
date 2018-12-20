import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Year? ");
        int year = scan.nextInt();

        System.out.print("Month? ");
        int month = scan.nextInt();

        int numberOfDays = getNumberOfDays(year, month);
        if (numberOfDays == -1) {
            System.err.println("");
            System.exit(-1);
        }
        System.out.println("Number of days: " + numberOfDays);
    }

    public static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }

    public static int getNumberOfDays(int year, int month) {
        int days;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if (isLeap(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                return -1;

        }
        return days;
    }
}
