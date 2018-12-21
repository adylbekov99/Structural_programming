import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int startHour, endHour, startMinutes, endMinutes, hours, minutes;

        Scanner sc = new Scanner(System.in);

        startHour = sc.nextInt();
        startMinutes= sc.nextInt();
        endHour= sc.nextInt();
        endMinutes= sc.nextInt();

        hours = endHour - startHour;

        if (hours < 0)
        {
            hours = 24 + (endHour - startHour);
        }

        minutes = endMinutes - startMinutes;
        if (minutes < 0)

        {
            minutes = 60 + (endMinutes - startMinutes);
            hours--;
        }

        if (hours == endHour && startMinutes == endMinutes)

        {
            System.out.printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
        }
        else
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hours, minutes);

    }

}