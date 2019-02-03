package JavaAdvanced.FunctionalProgramming_11.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class PredicateParty_10 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> guests = Arrays.stream(reader.readLine().split("\\s+"))
                .collect(Collectors.toList());

        String action = reader.readLine();

        while (!action.equals("Party!")) {
            String[] tokens = action.split("\\s+");

            switch (tokens[1]) {
                case "StartsWith":
                    guests
                            .stream()
                            .filter(name -> name.startsWith(tokens[2]))
                            .findFirst()
                            .ifPresent(name -> doubleOrRemove(guests, name, tokens[0]));
                    break;
                case "Length":
                    guests
                            .stream()
                            .filter(name -> name.length() == Integer.parseInt(tokens[2]))
                            .findFirst()
                            .ifPresent(name -> doubleOrRemove(guests, name, tokens[0]));
                    break;
                case "EndsWith":
                    guests
                            .stream()
                            .filter(name -> name.endsWith(tokens[2]))
                            .findFirst()
                            .ifPresent(name -> doubleOrRemove(guests, name, tokens[0]));
                    break;
                default:
                    break;
            }

            action = reader.readLine();
        }

        guests.sort(String::compareTo);

        if (guests.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.println(String.join(", ", guests) + " are going to the party!");
        }
    }

    private static void doubleOrRemove(List<String> guests, String str, String token) {
        BiFunction<List<String>, String, List<String>> toDo = (listOfGuests, name) -> {

            if (token.equals("Remove")) {
                listOfGuests.remove(name);
            } else {
                long duplicatesCount =
                        listOfGuests
                                .stream()
                                .filter(guest -> guest.equals(str))
                                .count();

                LongStream.range(0, duplicatesCount)
                        .forEach(duplicate -> listOfGuests.add(name));
            }

            return listOfGuests;
        };

        toDo.apply(guests, str);
    }
}
