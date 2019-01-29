package JavaAdvanced.MultidimensionalArrays_5.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] rc = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int x = rc[0];
        int y = rc[1];
        String[][] matrix = new String[x][y];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = fillRows(i, j);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static String fillRows(int i, int j) {
        char firstAndLast = (char) (97 + i);
        char middleLetter = (char) (97 + i + j);
        StringBuilder letters = new StringBuilder();

        letters.append(firstAndLast)
                .append(middleLetter)
                .append(firstAndLast);
        return letters.toString();
    }
}
