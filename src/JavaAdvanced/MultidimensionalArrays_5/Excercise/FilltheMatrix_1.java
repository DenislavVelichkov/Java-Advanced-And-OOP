package JavaAdvanced.MultidimensionalArrays_5.Excercise;

import java.util.Scanner;

public class FilltheMatrix_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cmd = sc.nextLine().split(", ");
        int[][] matrix = new int[Integer.parseInt(cmd[0])][Integer.parseInt(cmd[0])];

        switch (cmd[1]) {
            case "A":
                printMatrix(patternA(matrix));
                break;
            case "B":
                printMatrix(patternB(matrix));
                break;
            default:
                break;
        }

    }

    private static void printMatrix(int[][] pattern) {
        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] patternB(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

            }
        }
        return matrix;
    }

    private static int[][] patternA(int[][] matrix) {
        int numberCounter = 1;
        for (int i = 0, j = 0; i < matrix.length && j < matrix.length; i++) {
            matrix[i][j] = numberCounter++;
            if (i == matrix.length - 1) {
                j++;
                i = 0;
            }
        }

        return matrix;
    }
}
