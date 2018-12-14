import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        while((num = sc.nextInt()) != 0) {
            for (int i = 1; i < num; i++) {
                    System.out.print(i + " ");
            }
            System.out.println(num);
            }
        }
    }

