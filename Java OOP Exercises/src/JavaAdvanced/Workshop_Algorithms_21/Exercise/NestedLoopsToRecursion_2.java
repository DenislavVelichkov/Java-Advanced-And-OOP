package JavaAdvanced.Workshop_Algorithms_21.Exercise;

import java.util.Scanner;

public class NestedLoopsToRecursion_2 {

    private static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        arr = new int[n];

        printNestedLoops(n, 0);
    }

    private static void printNestedLoops(int n, int begin) {
        if (begin >= n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            arr[begin] = i;
            printNestedLoops(n, begin + 1);

        }
    }
}
