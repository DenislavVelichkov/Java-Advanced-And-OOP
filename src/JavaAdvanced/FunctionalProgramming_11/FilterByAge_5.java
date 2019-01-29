package JavaAdvanced.FunctionalProgramming_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class FilterByAge_5 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        String input = reader.readLine();
        Map<String, Integer> personData = new LinkedHashMap<>();


        while (n-- > 0) {
            String[] data = input.split(", ");
            personData.put(data[0], Integer.parseInt(data[1]));
            input = reader.readLine();
        }

        String criteria = input;
        int age = Integer.parseInt(reader.readLine());
        String[] sortType =reader.readLine().split(" ");

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        switch (criteria) {
            case "older":
                personData
                        .entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() >= age)
                        .forEach(entry -> {
                            sortedMap.put(entry.getKey(), entry.getValue());
                        });
                break;
            case "younger":
                personData
                        .entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() < age)
                        .forEach(entry -> {
                            sortedMap.put(entry.getKey(), entry.getValue());
                        });
                break;
        }


        if (sortType.length < 2) {

            if (sortType[0].equals("name")) {
                sortedMap
                        .entrySet()
                        .stream()
                        .sorted(Comparator.comparing(Map.Entry::getKey))
                        .forEach(el -> System.out.printf("%s%n", el.getKey()));
            } else {
                sortedMap
                        .entrySet()
                        .stream()
                        .sorted(Comparator.comparing(Map.Entry::getValue))
                        .forEach(el -> System.out.printf("%s%n", el.getValue()));
            }
        } else {
            sortedMap
                    .entrySet()
                    .stream()
                    .sorted((o1, o2) -> {
                        int result = o2.getKey().compareTo(o1.getKey());
                        return result == 0 ? result : o1.getValue().compareTo(o2.getValue());

                    })
                    .forEach(key -> System.out.printf("%s - %s%n", key.getKey(), key.getValue()));
        }

    }
}

