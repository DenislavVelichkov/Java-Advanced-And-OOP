package JavaAdvanced.FunctionalProgramming_11.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateForNames_6 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int lengthCriteria = Integer.parseInt(reader.readLine());

        String[] names = reader.readLine().split("\\s+");

        Predicate<String> filter = name -> name.length() <= lengthCriteria;

        for (String name : names) {
            if (filter.test(name)) {
                System.out.println(name);
            }
        }
    }
}
