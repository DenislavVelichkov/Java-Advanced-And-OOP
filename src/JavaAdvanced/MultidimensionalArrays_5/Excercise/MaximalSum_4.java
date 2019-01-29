package JavaAdvanced.MultidimensionalArrays_5.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] size = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[][] matrix = new int[size[0]][size[1]];
        int[][] newMatrix;
        int[][] maxMatrix = new int[3][3];

        for (int i = 0; i < size[0]; i++) {
            int[] fillRows = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = fillRows;
        }

        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < size[0]; row++) {
            for (int col = 0; col < size[1]; col++) {

                newMatrix = findMaxMatrix(matrix, row, col);
                if (newMatrix != null) {
                    int matrixSum = calcMatrixSum(newMatrix);

                    if (matrixSum > maxSum) {
                        maxSum = matrixSum;
                        maxMatrix = newMatrix;
                    }
                }
            }
        }

        System.out.printf("Sum = %d\n", maxSum);
        printMaxMatrix(maxMatrix);
    }

    private static int[][] findMaxMatrix(int[][] matrix, int row, int col) {
        int[][] tempMatrix = new int[3][3];
        int masterCol = col;
        try {
            for (int i = 0; i < tempMatrix.length; i++, row++) {
                for (int j = 0; j < tempMatrix[i].length; j++, masterCol++) {
                    tempMatrix[i][j] = matrix[row][masterCol];
                }
                masterCol = col;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
        return tempMatrix;
    }

    private static int calcMatrixSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    private static void printMaxMatrix(int[][] maxMatrix) {
        for (int i = 0; i < maxMatrix.length; i++) {
            for (int j = 0; j < maxMatrix[i].length; j++) {
                System.out.print(maxMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}