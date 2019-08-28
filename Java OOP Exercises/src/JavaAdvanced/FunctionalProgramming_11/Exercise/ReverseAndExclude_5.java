package JavaAdvanced.FunctionalProgramming_11.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ReverseAndExclude_5 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numbers = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        int n = Integer.parseInt(reader.readLine());

        BiFunction<ArrayList<Integer>, Integer, ArrayList<Integer>> reverseAndExclude =
                ((arr, num) -> {
                    Collections.reverse(arr);
                    return arr.stream().filter(e -> e % num != 0)
                            .collect(Collectors.toCollection(ArrayList::new));

                });
        Consumer<ArrayList<Integer>> printer = e -> e.forEach(v -> System.out.print(v + " "));
        printer.accept(reverseAndExclude.apply(numbers, n));
    }
}
