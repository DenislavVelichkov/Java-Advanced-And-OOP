package JavaAdvanced.FunctionalProgramming_11.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CustomComparator_8 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numbers = Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
        Comparator<Integer> comparator = ((a, b) -> {
            if (a % 2 == 0 && b % 2 != 0) {// връща първо четно число
                return -1; // когато елементите върнат -1 , той отива отпред
            } else if (b % 2 == 0 && a % 2 != 0) {
                return 1;// елементите отиват отзад
            } else { // означава, че елементите връщат 0 ~ са равни
                return a.compareTo(b);
            }
        });

        numbers.stream().sorted(comparator).forEach(e -> System.out.print(e + " "));
    }
}
