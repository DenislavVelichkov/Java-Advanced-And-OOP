package JavaAdvanced.MultidimensionalArrays_5;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] size = Arrays.stream(sc.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = new int[size[0]][size[1]];

        for (int i = 0; i < size[0]; i++) {
            int[] fillRows = Arrays.stream(sc.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = fillRows;
        }

        int maxValue = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;

        for (int row = 0; row < size[0] - 1; row++) {
            for (int col = 0; col < size[1] - 1; col++) {
               int matrixSum = calcMatrixSum(matrix, row, col);
                if (matrixSum >= maxValue) {
                    maxValue = matrixSum;
                    maxRow = row;
                    maxCol = col;
                }
            }
        }

        System.out.printf("%d %d\n%d %d\n%d", matrix[maxRow][maxCol],
                matrix[maxRow][maxCol + 1],
                matrix[maxRow + 1][maxCol],
                matrix[maxRow + 1][maxCol + 1],
                maxValue);

    }

    private static int calcMatrixSum(int[][] matrix, int row, int col) {
            return matrix[row][col] +
                    matrix[row][col + 1] +
                    matrix[row + 1][col] +
                    matrix[row + 1][col + 1];

    }
}
