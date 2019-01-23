package JavaAdvanced.MultidimensionalArrays_5.Excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CrossFire_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        List<Integer> rows = new ArrayList<>();

        for (int i = 1; i <= dimensions[0] * dimensions[1]; i++) {
            rows.add(i);
        }

        String input = sc.nextLine();

        while (!input.equals("Nuke it from orbit")) {
            int[]coordinates = Arrays.stream(input.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int row = coordinates[0];
            int col = coordinates[1];
            int radius = coordinates[2];

            printMatrix(rows, row, col, radius, dimensions[0], dimensions[1]);
            input = sc.nextLine();
        }


    }

    private static void printMatrix(List<Integer> rows,
                                    int row,
                                    int col,
                                    int radius,
                                    int x,
                                    int y) {
        int[][] matrix = new int[x][y];
        int elementIndex = 0;

        while (true) {

        }

        for (int r = 0; r < x; r++) {
            for (int c = 0; c < y; c++) {
//                int positionOfElement = row * col;
                matrix[r][c] = rows.get(elementIndex++);
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
