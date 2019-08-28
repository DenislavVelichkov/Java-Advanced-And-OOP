package JavaAdvanced.MultidimensionalArrays_5;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());

        int[][] matrix = new int[rows][];

        for (int i = 0; i < rows; i++) {
            int[] input = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = input;
        }

        String[] wrongValueCoordinates = sc.nextLine().split("\\s+");
        int x = Integer.parseInt(wrongValueCoordinates[0]);
        int y = Integer.parseInt(wrongValueCoordinates[1]);
        int wrongValue = matrix[x][y];

        int[][] correctMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == wrongValue) {
                    correctMatrix[i][j] = autoCorrect(matrix, i, j, wrongValue);
                    System.out.print(correctMatrix[i][j] + " ");
                } else {
                    correctMatrix[i][j] = matrix[i][j];
                    System.out.print(correctMatrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private static int autoCorrect(int[][] matrix, int i, int j, int wrongValue) {
        int left;
        try {
            left = matrix[i][j - 1];
        } catch (Exception e) {
            left = 0;
        }
        int right;
        try {
            right = matrix[i][j + 1];
        } catch (Exception e) {
            right = 0;
        }
        int up;
        try {
            up = matrix[i - 1][j];
        } catch (Exception e) {
            up = 0;
        }
        int down;
        try {
            down = matrix[i + 1][j];
        } catch (Exception e) {
            down = 0;
        }

        if (left == wrongValue) {
            left = 0;
        }
        if (right == wrongValue) {
            right = 0;

        }
        if (up == wrongValue) {
            up = 0;
        }
        if (down == wrongValue) {
            down = 0;
        }

        return up + left + right + down;
    }
}
