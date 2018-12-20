import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Year? ");
        int year = scan.nextInt();
        System.out.print("Month? ");
        int month = scan.nextInt();
        int days;
        if (year % 4 != 0 && year % 400 != 0) {
            switch (month) {
                case 1:
                    days = 31;
                    System.out.println("Number of days " + days);

                    break;
                case 2:
                    days = 28;
                    System.out.println("Number of days " + days);

                    break;
                case 3:
                    days = 31;
                    System.out.println("Number of days " + days);

                    break;
                case 4:
                    days = 30;
                    System.out.println("Number of days " + days);

                    break;
                case 5:
                    days = 31;
                    System.out.println("Number of days " + days);

                    break;
                case 6:
                    days = 30;
                    System.out.println("Number of days " + days);

                    break;
                case 7:
                    days = 31;
                    System.out.println("Number of days " + days);

                    break;
                case 8:
                    days = 31;
                    System.out.println("Number of days " + days);

                    break;
                case 9:
                    days = 30;
                    System.out.println("Number of days " + days);

                    break;
                case 10:
                    days = 31;
                    System.out.println("Number of days " + days);

                    break;
                case 11:
                    days = 30;
                    System.out.println("Number of days " + days);

                    break;
                case 12:
                    days = 31;
                    System.out.println("Number of days " + days);

                    break;
            }
        } else {

            switch (month) {
                case 1:
                    days = 31;
                    System.out.println("Number of days " + days);

                    break;
                case 2:
                    days = 29;
                    System.out.println("Number of days " + days);

                    break;
                case 3:
                    days = 31;
                    System.out.println("Number of days " + days);

                    break;
                case 4:
                    days = 30;
                    System.out.println("Number of days " + days);

                    break;
                case 5:
                    days = 31;
                    System.out.println("Number of days " + days);

                    break;
                case 6:
                    days = 30;
                    System.out.println("Number of days " + days);

                    break;
                case 7:
                    days = 31;
                    System.out.println("Number of days " + days);

                    break;
                case 8:
                    days = 31;
                    System.out.println("Number of days " + days);

                    break;
                case 9:
                    days = 30;
                    System.out.println("Number of days " + days);

                    break;
                case 10:
                    days = 31;
                    System.out.println("Number of days " + days);

                    break;
                case 11:
                    days = 30;
                    System.out.println("Number of days " + days);

                    break;
                case 12:
                    days = 31;
                    System.out.println("Number of days " + days);

                    break;
            }
        }
    }
}
