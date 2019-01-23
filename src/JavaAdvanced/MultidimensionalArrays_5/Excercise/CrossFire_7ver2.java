package JavaAdvanced.MultidimensionalArrays_5.Excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CrossFire_7ver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] dimensions = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Map<Integer, ArrayList<String>> rows = new TreeMap<>();
        int element = 1;

        for (int i = 0; i < Math.abs(dimensions[0]) ; i++) {
            rows.putIfAbsent(i, new ArrayList<>());
            StringBuilder joinStr = new StringBuilder();

            while (rows.get(i).size() < Math.abs(dimensions[1])) {
//                String elementToAdd = "" + element++;
                joinStr.append(element);
                rows.get(i).add(joinStr.toString());
                element++;
                joinStr = new StringBuilder();
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

        for (int i = 0; i < rowsAfterCrossfire.size(); i++) {
            for (int j = 0; j < rowsAfterCrossfire.get(i).size(); j++) {
                matrix.append(rowsAfterCrossfire.get(i).get(j)).append(" ");
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
                    .forEach(strings -> strings.remove(toPop));
        }

        return rows;
    }
}