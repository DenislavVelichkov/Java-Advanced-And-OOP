package JavaOOP.WorkingWithAbstractions_3.Exercise.CardsWithPower_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line1 = sc.nextLine();
        String line2 = sc.nextLine();

        Deck[] cards = Deck.values();
        Rank[] cardPower = Rank.values();

        int power = Arrays.stream(
                cards).filter(card -> card.name().equals(line1)).findAny().get().getValue();
        int suitPower = Arrays.stream(
                cardPower).filter(card -> card.name().equals(line2)).findAny().get().getValue();

        String text = String.format("Card name: %s of %s; Card power: %d", line1, line2, power + suitPower);

        System.out.println(text);
    }
}
