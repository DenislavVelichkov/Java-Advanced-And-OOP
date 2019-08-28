package JavaAdvanced.MultidimensionalArrays_5;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dimensions = Arrays.stream(sc.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int i = 0; i < dimensions[0]; i++) {
            sum += Arrays.stream(sc.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .sum();

        }

        System.out.println(dimensions[0]);
        System.out.println(dimensions[1]);
        System.out.println(sum);
    }
}
