package JavaAdvanced.SetsAndMaps_7.Excercise;

import java.util.*;
import java.util.stream.Collectors;

public class HandsOfCards_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        HashMap<String, Set<String>> playersDecks = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String[] tokens = input.split(": ");

            String name = tokens[0];
            Set<String> cards = Arrays.stream(tokens[1].split(", +"))
                    .collect(Collectors.toCollection(HashSet::new));

            if (!playersDecks.containsKey(name)) {
                playersDecks.put(name, cards);
            } else {
                playersDecks.get(name).addAll(cards);
            }

            input = sc.nextLine();
        }

    }
}
