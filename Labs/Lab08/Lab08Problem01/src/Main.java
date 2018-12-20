import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 rows and 4 columns: ");
        int[][] nums = new int [3][4];

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 4; j++) {
                nums [i][j] = scan.nextInt();
            }
        }
        int sum = 0;
        for (int [] row: nums) {
            for (int number : row) {
                sum += number;
            }
        }
        System.out.println("Sum of all elements is "+sum);
    }
}
