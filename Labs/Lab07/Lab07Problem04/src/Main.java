public class Main {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        for (int j = 0; j < deck.length; j++) {
            int index = (int) (Math.random() * deck.length);
            int temp = deck[j];
            deck[j] = deck[index];
            deck[index] = temp;
        }
        for (int j = 0; j < 4; j++) {
            String suit = suits[deck[j] / 13];
            String rank = ranks[deck[j] % 13];
            System.out.println("Card number " + deck[j] + ": "
                    + rank + " of " + suit);
        }
    }
}
