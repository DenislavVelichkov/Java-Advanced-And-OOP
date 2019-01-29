package JavaAdvanced.MultidimensionalArrays_5.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MatrixShuffling_5 {

    public static void main(String[] args) throws IOException { //matrix template
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        int[] coordinates = Arrays.stream(scan.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sizeX = coordinates[0];
        int sizeY = coordinates[1];
        String[][] matrix = new String[sizeX][sizeY];

        for (int i = 0; i < matrix.length; i++) {
            String[] fillRows = scan.readLine().split("\\s+");
            matrix[i] = fillRows;
        }
        String line = scan.readLine();

        while (!line.equals("END")) {
            String[] command = line.split("\\s+");

            if (command.length != 5) {
                System.out.println("Invalid input!");
                line = scan.readLine();
                continue;
            }

            String cmd = command[0];
            int x = Integer.parseInt(command[1]);
            int y = Integer.parseInt(command[2]);
            int x1 = Integer.parseInt(command[3]);
            int y1 = Integer.parseInt(command[4]);

            if (cmd.equals("swap")) {
                if (!(x >= 0 && x < sizeX) ||
                        !(y >= 0 && y < sizeY) ||
                        !(x1 >= 0 && x1 < sizeX ||
                                !(y1 >= 0 && y1 < sizeY))) {
                    System.out.println("Invalid input!");
                    line = scan.readLine();
                    continue;
                }

                String tempSubstitute = matrix[x][y];
                matrix[x][y] = matrix[x1][y1];
                matrix[x1][y1] = tempSubstitute;

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            line = scan.readLine();
        }
    }
}
