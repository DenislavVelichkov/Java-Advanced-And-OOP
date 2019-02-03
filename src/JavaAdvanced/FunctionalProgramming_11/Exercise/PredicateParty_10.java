package JavaAdvanced.FunctionalProgramming_11.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class PredicateParty_10 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> guests = Arrays.stream(reader.readLine().split("\\s+"))
                .collect(Collectors.toList());

        String action = reader.readLine();
        BiPredicate<String, String> startsWith = String::startsWith;
        BiPredicate<String, String> endsWith = String::endsWith;
        BiPredicate<String, Integer> length = (name, value) -> name.length() == value;

        while (!action.equals("Party!")) {
            String[] tokens = action.split("\\s+");
            List<String> tempNameStorage = new ArrayList<>();

            try {
                switch (tokens[1]) {
                    case "StartsWith":
                        for (String guest : guests) {
                            if (startsWith.test(guest, tokens[2])) {
                                tempNameStorage.add(guest);
                            }
                        }

                        doubleOrRemove(guests, tempNameStorage, tokens[0]);
                        break;
                    case "Length":
                        for (String guest : guests) {
                            if (length.test(guest, Integer.parseInt(tokens[2]))) {
                                tempNameStorage.add(guest);
                            }
                        }

                        doubleOrRemove(guests, tempNameStorage, tokens[0]);
                        break;
                    case "EndsWith":
                        for (String guest : guests) {
                            if (endsWith.test(guest, tokens[2])) {
                                tempNameStorage.add(guest);
                            }
                        }

                        doubleOrRemove(guests, tempNameStorage, tokens[0]);
                        break;
                    default:
                        break;
                }
            } catch (ConcurrentModificationException e) { }

            action = reader.readLine();
        }

        guests.sort(String::compareTo);

        if (guests.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.println(String.join(", ", guests) + " are going to the party!");
        }
    }

    private static void doubleOrRemove(List<String> guests, List<String> people, String command) {
        ArrayDeque<String> nameToAdd = new ArrayDeque<>();

        BiFunction<List<String>, List<String>, List<String>> toDo = (guestList, listOfNames) -> {

            if (command.equals("Remove")) {
                guestList.removeAll(people);
            } else {
                guestList
                        .stream()
                        .filter(people::contains)
                        .forEach(nameToAdd::push);

                guestList.addAll(nameToAdd);
            }

            return guestList;
        };

        toDo.apply(guests, people);
    }
}
