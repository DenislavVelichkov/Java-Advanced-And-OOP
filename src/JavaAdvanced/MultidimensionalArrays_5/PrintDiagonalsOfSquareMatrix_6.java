package JavaAdvanced.MultidimensionalArrays_5;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            int[] rowsInput = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = rowsInput;
        }

        printDiagonals(matrix);
    }

    private static void printDiagonals(int[][] matrix) {
        for (int i = 0, j = 0 ; i < matrix.length && j < matrix.length; i++, j++) {//down-righ
            System.out.print(matrix[i][j] + " ");
        }

        System.out.println();
        for (int i = matrix.length - 1, j = 0 ; i >= 0 && j < matrix.length; i--, j++) {//up-righ
            System.out.print(matrix[i][j] + " ");
        }
    }
}
