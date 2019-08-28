package JavaAdvanced.FunctionalProgramming_11.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListOfPredicates_9 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        Set<Integer> numbers =
                Arrays.stream(reader.readLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toSet());

        BiPredicate<Integer, Set<Integer>> isDivisible = (x, set) -> {
            int counterOfDevisibleNumbers = 0;

            for (Integer number : set) {
                if (x % number == 0) {
                    counterOfDevisibleNumbers++;
                }
            }

            return counterOfDevisibleNumbers == numbers.size();
        };

        IntStream.range(1, n + 1)
                .filter(x -> isDivisible.test(x, numbers))
                .forEach(value -> System.out.print(value + " "));
    }
}
