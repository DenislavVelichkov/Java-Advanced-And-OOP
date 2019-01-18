package JavaAdvanced.MultidimensionalArrays_5;

import java.util.Arrays;
import java.util.Scanner;

public class PositionOf_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] matrixSize = sc.nextLine().split("\\s+");

        int[][] matrix = new int[Integer.parseInt(matrixSize[0])][];

        for (int i = 0; i < matrix.length; i++) {
            int[] rowsInput = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = rowsInput;
        }

        int controlValue = Integer.parseInt(sc.nextLine());
        boolean isItFound = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == controlValue) {
                    System.out.println(i + " " + j);
                    isItFound = true;
                }
            }
        }

        if (!isItFound) {
            System.out.println("not found");
        }
    }
}
