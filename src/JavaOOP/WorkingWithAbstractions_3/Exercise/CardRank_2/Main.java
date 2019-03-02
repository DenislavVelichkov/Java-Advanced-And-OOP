package JavaOOP.WorkingWithAbstractions_3.Exercise.CardRank_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CardSuits[] values = CardSuits.values();

        System.out.println(sc.nextLine() + ":");
        for (CardSuits value : values) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s",
                    value.ordinal(), value.name()));
        }
    }
}
