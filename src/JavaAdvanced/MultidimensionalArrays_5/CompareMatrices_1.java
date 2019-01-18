package JavaAdvanced.MultidimensionalArrays_5;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dimnsionsOfFirst = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int firstMatrixRows = dimnsionsOfFirst[0];
        int firstMatrixCols = dimnsionsOfFirst[1];

        int[][] firstMatrix = new int[firstMatrixRows][firstMatrixCols];
        for (int i = 0; i < firstMatrixRows; i++) {
            int[] tempArr = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            firstMatrix[i] = tempArr;
        }

        int[] dimnsionsOfSecond = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int secondMatrixRows = dimnsionsOfSecond[0];
        int secondMatrixCols = dimnsionsOfSecond[1];

        int[][] secondMatrix = new int[secondMatrixRows][secondMatrixCols];
        for (int i = 0; i < secondMatrixRows; i++) {
            int[] tempArr = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            secondMatrix[i] = tempArr;
        }
        if (matricesAreEqual(firstMatrix, secondMatrix)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static boolean matricesAreEqual(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            if (firstMatrix[row].length != secondMatrix[row].length) {
                return false;
            }
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    return false;
                }
            }
        }

        return true;
    }
}
