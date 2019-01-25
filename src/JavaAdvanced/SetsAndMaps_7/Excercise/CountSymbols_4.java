package JavaAdvanced.SetsAndMaps_7.Excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CountSymbols_4 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        Map<Character, Integer> occurences = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            occurences.putIfAbsent(input.charAt(i), 0);
            occurences.put(input.charAt(i), occurences.get(input.charAt(i)) + 1);
        }

        occurences.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(el -> System.out.println(el.getKey() + ": " + el.getValue() + " time/s"));
    }
}
