package JavaAdvanced.FunctionalProgramming_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortEvenNumbers_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] input = scan.readLine().split(", ");
        Arrays.stream(input)
                .mapToInt(Integer::parseInt)
                .filter(x -> x % 2 == 0)
                .forEach(x -> {
                    String output = String.join("", String.valueOf(x));
                    System.out.print(output + ", ");
                });

        System.out.println();
        Arrays.stream(input)
                .sorted(String::compareTo)
                .forEach(num -> System.out.printf("%s, ", num));

    }
}
