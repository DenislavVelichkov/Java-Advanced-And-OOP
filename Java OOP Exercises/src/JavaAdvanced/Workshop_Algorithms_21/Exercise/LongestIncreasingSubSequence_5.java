package JavaAdvanced.Workshop_Algorithms_21.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubSequence_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sequence = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] length = new int[sequence.length];
        int[] prev = new int[sequence.length];
        int maxLength = 0;
        int maxIndex = 0;

        for (int i = 0; i < sequence.length; i++) {
            int bestLength = 1;
            int index = -1;
            int element = sequence[i];

            for (int j = 0; j < i; j++) {
                if (element > sequence[j]
                        && bestLength < length[j] + 1) {
                    bestLength = length[j] + 1;
                    index = j;
                }
            }

            length[i] = bestLength;
            prev[i] = index;

            if (maxLength < bestLength) {
                maxLength = bestLength;
                maxIndex = i;
            }
        }

        int[] result = new int[maxLength];
        int index = maxLength - 1;

        while (maxIndex != -1) {
            result[index--] = sequence[maxIndex];
            maxIndex = prev[maxIndex];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
