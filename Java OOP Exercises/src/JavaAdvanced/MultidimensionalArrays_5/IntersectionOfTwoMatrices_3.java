package JavaAdvanced.MultidimensionalArrays_5;

import java.util.Scanner;

public class IntersectionOfTwoMatrices_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = Integer.parseInt(sc.nextLine());
        int columns = Integer.parseInt(sc.nextLine());

        char[][] matrixA = new char[rows][columns];
        char[][] matrixB = new char[rows][columns];


        for (int i = 0; i < rows; i++) {
            String[] fillRows = sc.nextLine().split("\\s+");
            for (int j = 0; j < columns; j++) {
                matrixA[i][j] = fillRows[j].charAt(0);
            }
        }

        for (int i = 0; i < rows; i++) {
            String[] fillRows = sc.nextLine().split("\\s+");
            for (int j = 0; j < columns; j++) {
                matrixB[i][j] = fillRows[j].charAt(0);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrixA[i][j] == matrixB[i][j]) {
                    System.out.print(matrixA[i][j] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
