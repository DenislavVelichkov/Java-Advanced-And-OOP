package JavaAdvanced.Workshop_Algorithms_21.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        printReversedArray(arr, arr.length - 1);
    }

    private static void printReversedArray(int[] arr, int index) {

        if (index < 0) {
            return;
        }
        System.out.print(arr[index] + " ");
        printReversedArray(arr, index - 1);

    }

}
