package JavaAdvanced.Workshop_Algorithms_21.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TheMatrix_4 {
    public static char[][] matrix;
    public static char color;
    public static char toBeReplaced;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dimensions = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        matrix = new char[rows][cols];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = sc.nextLine().replaceAll("[\t ]+", "").toCharArray();
        }

        color = sc.nextLine().charAt(0);
        int[] indexes = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int startRow = indexes[0];
        int startCol = indexes[1];
        toBeReplaced = matrix[startRow][startCol];

        paintMatrix(startRow, startCol);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }

    }
        private static void paintMatrix (int r, int c) {//матрицата сме я изнесли в статично поле и вече не е нужно да я подаваме на метода
            if (!isInBounds(r, c) ||
                    matrix[r][c] == color ||
                    matrix[r][c] != toBeReplaced) {
                return;
            }

            matrix[r][c] = color;

            paintMatrix(r + 1, c);
            paintMatrix(r, c + 1);
            paintMatrix(r - 1, c);
            paintMatrix(r, c - 1);

        }

        private static boolean isInBounds ( int r, int c){
            return r >= 0
                    && r < matrix.length
                    && c >= 0
                    && c < matrix[r].length;
        }
}
