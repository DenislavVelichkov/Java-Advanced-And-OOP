package JavaOOP.WorkingWithAbstractions_3.Exercise.CardSuit_1;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck(11);
        int n = deck.getValue();
        System.out.println(n);
    }
}
