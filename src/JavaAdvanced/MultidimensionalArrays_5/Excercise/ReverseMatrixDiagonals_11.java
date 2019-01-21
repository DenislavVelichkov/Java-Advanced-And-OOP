package JavaAdvanced.MultidimensionalArrays_5.Excercise;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; i++) {
            matrix[row] = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int row = rows - 1;
        int col = cols - 1;

        while (row != -1) {


        }
    }
}
