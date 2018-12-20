import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Month? ");
            if (!scan.hasNext()){
                break;
            }
            int month = scan.nextInt();

            System.out.print("Year? ");
            if (!scan.hasNext()){
                break;
            }
            int year = scan.nextInt();

            int result = getDaysInMonth(year,month);

            if (result != -1){
                System.out.println("Days: " + result);

            } else {
                System.err.println("Invalid month number");
            }

        } while (true);

    }

    public static int getDaysInMonth(int year, int month) {
        int[] days = {
                31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
                // 0   1   2   3   4   5   6   7   8   9  10  11
        };
        int result;
        if (month == 2) {
            result = isLeapYear(year) ? 29 : 28;
        } else if (month >= 1 && month <= 12) {
            result = days[month - 1];
        } else {
            result = -1;
        }
        return result;

    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}