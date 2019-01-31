package JavaAdvanced.FunctionalProgramming_11.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerPrint_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        Consumer<String> printer = System.out::println;

        Arrays.stream(scan.readLine().split("\\s+")).forEach(printer);
    }
}
