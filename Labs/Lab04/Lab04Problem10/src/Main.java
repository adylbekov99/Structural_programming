public class Main {

    public static void main(String[] args) {
        int ran = (int) (Math.random() * 12);
        int ran1 = (int) (Math.random() * 3);

        String a = " ";
        switch (ran) {
            case 11:
                a = ("Jack");
                break;

            case 12:
                a = ("Queen");
                break;
            case 0:
                a = "King";

                break;
            case 1:
                a = "Ace";
                break;
            case 2:
                a = "2";
                break;
            case 3:
                a = "3";
                break;
            case 4:
                a = "4";
                break;
            case 5:
                a = "5";
                break;
            case 6:
                a = "6";
                break;
            case 7:
                a = "7";
                break;
            case 8:
                a = "8";
                break;
            case 9:
                a = "9";
                break;
            case 10:
                a = "10";
                break;
        }
        switch (ran1) {
            case 0:

                System.out.println("The card you picked is " + a + " of Clubs");
                break;
            case 1:

                System.out.println("The card you picked is " + a + " of Diamonds");

                break;
            case 2:

                System.out.println("The card you picked is " + a + " of Hearts");

                break;
            case 3:

                System.out.println("The card you picked is " + a + " of Spades");

                break;
        }
    }


}