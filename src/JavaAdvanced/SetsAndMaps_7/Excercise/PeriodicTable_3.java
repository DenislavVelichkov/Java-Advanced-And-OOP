package JavaAdvanced.SetsAndMaps_7.Excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PeriodicTable_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        Set<String>compounds = new HashSet<>();
        String input = reader.readLine();

        while (n-- > 0) {
            compounds.addAll(Arrays.stream(input.split("\\s+"))
                    .collect(Collectors.toSet()));
            input = reader.readLine();
        }
        compounds.stream().sorted(String::compareTo).forEach(el -> System.out.print(el + " "));
    }
}
