package JavaAdvanced.FunctionalProgramming_11.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArythmetic_4 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = reader.readLine();
        Function<int[], int[]> add = array -> Arrays.stream(array).map(x -> x + 1).toArray();
        Function<int[], int[]> subtract = array -> Arrays.stream(array).map(x -> x - 1).toArray();
        Function<int[], int[]> multiply = array -> Arrays.stream(array).map(x -> x * 2).toArray();
        Consumer<int[]> printer = arr -> Arrays.stream(arr).forEach(e -> System.out.print(e + " "));

        while (!input.equals("end")) {
            switch (input) {
                case "add":
                    numbers = add.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                default:
                    System.out.println();
                    printer.accept(numbers);

            }
            input = reader.readLine();
        }
    }
}
