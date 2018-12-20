import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of points? ");
        int points = sc.nextInt();
        if(points >= 40){
            System.out.println("You passed \"Structural Programming!!!\"");
            System.out.println("You should take \"Object-Oriented Programming\" in the next semester");
        } else {
            System.out.println("You failed \"Structural Programming!!!\"");
            System.out.println("You can take it again in the fall of 2019.");
        }
    }
}
