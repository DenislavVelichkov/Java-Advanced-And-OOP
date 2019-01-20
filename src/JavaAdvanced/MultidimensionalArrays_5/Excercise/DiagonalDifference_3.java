package JavaAdvanced.MultidimensionalArrays_5.Excercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[size][];

        for (int i = 0; i < size; i++) {
            int[] rowsInput = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = rowsInput;
        }

        int diagonalDiff = Math.abs(sumDiagonals(matrix));
        System.out.println(diagonalDiff);
    }
        private static int sumDiagonals(int[][] matrix) {
            int diagonalA = 0;
            int diagonalB = 0;

            for (int i = 0, j = 0 ; i < matrix.length && j < matrix.length; i++, j++) {//down-righ
                diagonalA += matrix[i][j];
            }

            for (int i = matrix.length - 1, j = 0 ; i >= 0 && j < matrix.length; i--, j++) {//up-righ
                diagonalB += matrix[i][j];
            }

            return diagonalA - diagonalB;
        }
}
