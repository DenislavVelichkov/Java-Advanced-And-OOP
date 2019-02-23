package JavaAdvanced.IteratorsAndComperators_19.Exercise.Froggy_4;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] stones = Arrays.stream(sc.nextLine().split("[,\\s]+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Lake lake = new Lake(stones);

        StringBuilder str = new StringBuilder();

        for (Integer integer : lake) {
            str.append(integer).append(", ");
        }

        System.out.println(str.toString()
                .substring(0, str.lastIndexOf(", ")));
    }
}
