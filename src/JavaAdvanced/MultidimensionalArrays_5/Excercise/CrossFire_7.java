package JavaAdvanced.MultidimensionalArrays_5.Excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CrossFire_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] dimensions = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Map<Integer, ArrayList<String>> rows = new TreeMap<>();
        int element = 1;

        for (int i = 0; i < dimensions[0]; i++) {
            rows.putIfAbsent(i, new ArrayList<>());

            for (int col = 0; col < dimensions[1]; col++) {
                String elementToAdd = "" + element++;
                rows.get(i).add(elementToAdd);
            }

        }

        String input = reader.readLine();
        Map<Integer, ArrayList<String>> rowsAfterCrossfire = new TreeMap<>();

        while (!input.equals("Nuke it from orbit")) {
            int[] coordinates = Arrays.stream(input.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int row = coordinates[0];
            int col = coordinates[1];
            int radius = coordinates[2];

            rowsAfterCrossfire = crossfire(rows, row, col, radius);

            input = reader.readLine();
        }

        StringBuilder matrix = new StringBuilder();

        for (int row = 0; row < rowsAfterCrossfire.size(); row++) {
            for (int col = 0; col < rowsAfterCrossfire.get(row).size(); col++) {
                if (col == rowsAfterCrossfire.get(row).size() - 1) {
                    matrix.append(rowsAfterCrossfire.get(row).get(col));
                } else {
                    matrix.append(rowsAfterCrossfire.get(row).get(col)).append(" ");
                }
            }
            System.out.println(matrix.toString());
            matrix = new StringBuilder();
        }
    }

    private static Map<Integer, ArrayList<String>>
    crossfire(Map<Integer, ArrayList<String>> rows,
              int row,
              int col,
              int radius) {

        Deque<String> queue = new ArrayDeque<>();

        for (int r = row - radius; r <= row + radius; r++) {
            if (matrixRange(rows, r, col)) {
                queue.push(rows.get(r).get(col));
            }
        }

        for (int c = col - radius; c <= col + radius; c++) {
            if (matrixRange(rows, row, c)) {
                queue.push(rows.get(row).get(c));

            }
        }

        while (!queue.isEmpty()) {
            String toPop = queue.pop();
            rows.values().forEach(element -> element.remove(toPop));
        }

        return rows;
    }

    private static boolean matrixRange(Map<Integer, ArrayList<String>> rows, int row, int col) {
        return row >= 0 && row < rows.size() && col >= 0 && col < rows.get(row).size();
    }
}