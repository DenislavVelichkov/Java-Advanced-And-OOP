package JavaAdvanced.SetsAndMaps_7.Excercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] data = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstSize = data[0];
        int secondSize = data[1];

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();

        while (firstSize-- > 0) {
            int number = Integer.parseInt(sc.nextLine());
            firstSet.add(number);
        }

        while (secondSize-- > 0) {
            int number = Integer.parseInt(sc.nextLine());
            secondSet.add(number);
        }

        firstSet.retainAll(secondSet);

        firstSet.forEach(integer -> System.out.print(integer + " "));
    }
}
