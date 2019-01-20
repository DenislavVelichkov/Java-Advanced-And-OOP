package JavaAdvanced.MultidimensionalArrays_5.Excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StringMatrixRotation_6 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] instructions = reader.readLine().split("[()]");
        int degrees = Integer.parseInt(instructions[1]);
        String input = reader.readLine();
        ArrayList<String> rows = new ArrayList<>();

        while (!input.equals("END")) {
            rows.add(input);
            input = reader.readLine();
        }

        String[] longestElement = {""};
        int[] maxLength = {Integer.MIN_VALUE};

        rows
                .forEach(s -> {

                    if (s.length() > maxLength[0]) {
                        maxLength[0] = s.length();
                        longestElement[0] = s;
                    }
                });

        int rowsSize = rows.size();
        int columnSize = longestElement[0].length();

        String[][] matrix = new String[rowsSize][columnSize];
        for (int i = 0; i < matrix.length; i++) {
            String row = fixRows(rows.get(i).toCharArray(), columnSize);
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = String.valueOf(row.charAt(j));
            }
        }

        int sizeX;
        int sizeY;
        switch (degrees) {
            case 90:
                sizeX = longestElement[0].length();
                sizeY = rows.size();
                String[][] matrix90 = rotateMatrix90(matrix, sizeX, sizeY);
                printMatrix(matrix90);
                break;
            case 180:

                break;
            case 270:

                break;
            case 360:
                sizeY = longestElement[0].length();
                String[][] matrix360 = rotateMatrix360(matrix, rows, sizeY);
                printMatrix(matrix360);
                break;
            default:
                break;
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static String[][] rotateMatrix360(String[][] matrix, ArrayList<String> rows, int sizeY) {

        return matrix;
    }

    private static String[][] rotateMatrix90(String[][] matrix, int sizeX, int sizeY) {
      return matrix;
    }

    private static String fixRows(char[] arr, int y) {
        StringBuilder chars = new StringBuilder();
        int remainingLengthToFill = Math.abs(y - arr.length);
        String stringToRepeat = " ";
        chars.append(arr).append(stringToRepeat.repeat(remainingLengthToFill));
        return chars.toString();
    }
}

