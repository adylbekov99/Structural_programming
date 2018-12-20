import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N? ");
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Enter %d element: ", i);
            a[i] = scan.nextInt();
        }

        printArray("Before sorting: ", a);

        selectionSort(a);

        printArray("After sorting: ", a);
    }

    static void printArray(String msg, int[] a) {
        System.out.println(msg);
        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < a.length; ++j) {
                if (a[j] < a[indexMin]) {
                    indexMin = j;
                }
            }
            int t = a[i];
            a[i] = a[indexMin];
            a[indexMin] = t;
        }
    }
}
