package JavaAdvanced.MultidimensionalArrays_5.Excercise;

import java.util.*;

public class CrossFire_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        Map<Integer, ArrayList<Integer>> rows = new LinkedHashMap<>();
        int element = 1;

        for (int i = 0; i < dimensions[0] * dimensions[1]; i++) {
            rows.putIfAbsent(i, new ArrayList<>());
            rows.get(i).add(element++);
        }


        String input = sc.nextLine();

        while (!input.equals("Nuke it from orbit")) {
            int[]coordinates = Arrays.stream(input.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int row = coordinates[0];
            int col = coordinates[1];
            int radius = coordinates[2];

            printMatrix(rows, row, col, radius, dimensions[0], dimensions[1]);
            input = sc.nextLine();
        }


    }

    private static void printMatrix(Map<Integer, ArrayList<Integer>> rows,
                                    int row,
                                    int col,
                                    int radius,
                                    int x,
                                    int y) {
        int elementIndex = 0;



    }
}
