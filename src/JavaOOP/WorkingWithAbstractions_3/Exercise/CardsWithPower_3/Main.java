package JavaOOP.WorkingWithAbstractions_3.Exercise.CardsWithPower_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cardName = sc.nextLine();
        String cardPower = sc.nextLine();

        Card card = new Card(Deck.valueOf(cardName), Rank.valueOf(cardPower));
        System.out.println(card.toString());
    }
}
