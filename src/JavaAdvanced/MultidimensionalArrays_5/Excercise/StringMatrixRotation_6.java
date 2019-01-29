package JavaAdvanced.MultidimensionalArrays_5.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StringMatrixRotation_6 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] instructions = reader.readLine().split("[()]");
        int degrees = Integer.parseInt(instructions[1]) % 360;
        String input = reader.readLine();
        ArrayList<String> inputTxt = new ArrayList<>();

        while (!input.equals("END")) {
            inputTxt.add(input);
            input = reader.readLine();
        }

        String[] longestElement = {""};
        int[] maxLength = {Integer.MIN_VALUE};

        inputTxt
                .forEach(s -> {

                    if (s.length() > maxLength[0]) {
                        maxLength[0] = s.length();
                        longestElement[0] = s;
                    }
                });

        int rowsSize = inputTxt.size();
        int columnSize = longestElement[0].length();

        char[][] matrix = new char[rowsSize][columnSize];

        for (int r = 0; r < inputTxt.size(); r++) {
            for (int c = 0; c < maxLength[0]; c++) {
                if (c > inputTxt.get(r).length() - 1) {
                    matrix[r][c] = ' ';
                } else {
                    matrix[r][c] = inputTxt.get(r).charAt(c);
                }
            }
        }

        switch (degrees) {
            case 90:
                for (int c = 0; c < maxLength[0]; c++) {
                    for (int r = matrix.length - 1; r >= 0; r--) {
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int r = matrix.length - 1; r >= 0; r--) {
                    for (int c = maxLength[0] - 1; c >= 0; c--) {
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int c = maxLength[0] - 1; c >= 0; c--) {
                    for (int r = 0; r < matrix.length; r++) {
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;
            default:
                for (int r = 0; r < matrix.length; r++) {
                    for (int c = 0; c < matrix[r].length; c++) {
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;
        }
    }
}