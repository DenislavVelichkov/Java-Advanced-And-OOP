package JavaAdvanced.SetsAndMaps_7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountRealNumbers_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        LinkedHashMap<Double, Integer> occurrences = new LinkedHashMap();

        for (int i = 0; i < numbers.length; i++) {
            if (occurrences.containsKey(numbers[i])) {
                occurrences.put(numbers[i], occurrences.get(numbers[i]) + 1);
            } else {
                occurrences.put(numbers[i], 1);
            }
        }

        for (Double number : occurrences.keySet()) {
            System.out.printf("%.1f -> %d\n" , number, occurrences.get(number));
        }
    }
}
