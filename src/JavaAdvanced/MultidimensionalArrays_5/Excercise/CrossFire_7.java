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

        for (int i = 0; i < Math.abs(dimensions[0]) ; i++) {
            rows.putIfAbsent(i, new ArrayList<>());

            while (rows.get(i).size() < Math.abs(dimensions[1])) {
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

            int row = Math.abs(coordinates[0]);
            int col = Math.abs(coordinates[1]);
            int radius = Math.abs(coordinates[2]);

            rowsAfterCrossfire = crossfire(rows, row, col, radius);

            input = reader.readLine();
        }

        StringBuilder matrix = new StringBuilder();

        for (int row = 0; row < rowsAfterCrossfire.size(); row++) {
            for (int col = 0; col < rowsAfterCrossfire.get(row).size(); col++) {
                matrix.append(rowsAfterCrossfire.get(row).get(col)).append(" ");
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

        while (radius > 0) {
            try {
                queue.push(rows.get(row - radius).get(col));
            } catch (Exception ignored) { }

            try {
                queue.push(rows.get(row + radius).get(col));
            } catch (Exception ignored) { }

            try {
                queue.push(rows.get(row).get(col + radius));
            } catch (Exception ignored) { }

            try {
                queue.push(rows.get(row).get(col - radius));
            } catch (Exception ignored) { }

            radius--;
        }
        try {
            queue.push(rows.get(row).get(col));
        } catch (Exception ignored) { }

        while (!queue.isEmpty()) {
            String toPop = queue.pop();
            rows.values()
                    .forEach(element -> element.remove(toPop));
        }

        return rows;
    }
}
