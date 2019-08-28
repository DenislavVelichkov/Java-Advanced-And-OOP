package JavaOOP.WorkingWithAbstractions_3.Exercise.CardSuit_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deck[] values = Deck.values();

        System.out.println(sc.nextLine() + ":");
        for (Deck value : values) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s",
                    value.ordinal(), value.name()));
        }
    }
}
