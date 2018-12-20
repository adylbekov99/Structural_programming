import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of points? ");
        int points = sc.nextInt();
        String grade = "A";
        if (points <= 100 && points >= 0) {
            if (points >= 90 && points <= 100) {
                grade = "A";
            } else if (points >= 80 && points < 90) {
                grade = "B";
            } else if (points >= 70 && points < 80) {
                grade = "C";
            } else if (points >= 60 && points < 70) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("Grade " + grade);
        } else {
            System.out.printf("%d is not in the permitted range.", points);
        }
    }
}
