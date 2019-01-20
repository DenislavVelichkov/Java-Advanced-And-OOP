package JavaAdvanced.MultidimensionalArrays_5.Excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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

        int sizeX = rows.size();
        int sizeY = longestElement[0].length();
        String[][] matrix = new String[sizeX][sizeY];
        StringBuilder chars = new StringBuilder();

        for (int i = 0; i < matrix.length; i++) {
            char[] row = rows.get(i).toCharArray();
            int remainingLengthToFill = sizeY - row.length;
            String stringToRepeat = " ";
            chars.append(row).append(stringToRepeat.repeat(remainingLengthToFill));
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = String.valueOf(chars.charAt(j));
            }

            chars = new StringBuilder();
        }

        switch (degrees) {
            case 90:
                 sizeX = longestElement[0].length();
                 sizeY = rows.size();

                break;
            case 180:
                break;
            case 270:
                break;
            case 360:
                break;
            default:
                break;
        }
    }
}
