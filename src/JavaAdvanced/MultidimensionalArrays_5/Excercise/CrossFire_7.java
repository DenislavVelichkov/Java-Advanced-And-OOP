package JavaAdvanced.MultidimensionalArrays_5.Excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class CrossFire_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int[] dimensions = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Map<Integer, ArrayList<String>> rows = new LinkedHashMap<>();
        int element = 1;

        for (int i = 0; i < dimensions[0]; i++) {
            rows.putIfAbsent(i, new ArrayList<>());
            while (rows.get(i).size() < dimensions[0]) {
                String toAdd = "" + element++;
                rows.get(i).add(toAdd);
            }
        }

        String input = reader.readLine();
        Map<Integer, ArrayList<String>> rowsAfterCrossfire = new LinkedHashMap<>();

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

        for (int i = 0; i < rowsAfterCrossfire.size(); i++) {
            for (int j = 0; j < rowsAfterCrossfire.get(i).size(); j++) {
                matrix.append(rowsAfterCrossfire.get(i).get(j)).append(" ");
            }
            System.out.println(matrix);
            matrix = new StringBuilder();
        }
    }

    private static Map<Integer, ArrayList<String>>
        crossfire(Map<Integer, ArrayList<String>> rows,
                                                int row,
                                                int col,
                                                int radius) {
        Deque<String> queue = new ArrayDeque<>();
        queue.push(rows.get(row).get(col));

        while (radius > 0) {
            try {
                queue.push(rows.get(row - radius).get(col));
                rows.get(row - radius).remove(col);
            } catch (Exception ignored) {
            }

            try {
                queue.push(rows.get(row + radius).get(col));
                rows.get(row + radius).remove(col);
            } catch (Exception ignored) {
            }

            try {
                queue.push(rows.get(row).get(col + radius));
            } catch (Exception ignored) {
            }

            try {
                queue.push(rows.get(row).get(col - radius));
            } catch (Exception ignored) {
            }

            radius--;
        }

        while (queue.size() != 0) {
            rows.get(row).remove(queue.pop());
        }

        return rows;
    }
}
