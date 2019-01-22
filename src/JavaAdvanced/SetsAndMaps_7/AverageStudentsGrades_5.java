package JavaAdvanced.SetsAndMaps_7;

import java.util.*;

public class AverageStudentsGrades_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int studentsCount = Integer.parseInt(sc.nextLine());
        Map<String, ArrayList<Double>> listGrades = new LinkedHashMap<>();

        for (int i = 0; i < studentsCount; i++) {
            String[] input = sc.nextLine().split("\\s+");
            String studentName = input[0];
            double grade = Double.parseDouble(input[1]);

            listGrades.putIfAbsent(studentName, new ArrayList<>());
            listGrades.get(studentName).add(grade);
        }

        listGrades
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(entry -> {
                    double sum =
                            entry
                                    .getValue()
                                    .stream()
                                    .mapToDouble(value -> value).sum();
                    System.out.printf("%s -> ", entry.getKey());

                    entry.getValue()
                            .forEach(grades -> {
                                System.out.printf("%.2f ",
                                        grades);
                            });

                    System.out.printf("(avg: %.2f)%n", sum / entry.getValue().size());
                });

    }
}

