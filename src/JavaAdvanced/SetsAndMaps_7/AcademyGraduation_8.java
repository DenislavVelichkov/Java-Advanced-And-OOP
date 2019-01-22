package JavaAdvanced.SetsAndMaps_7;

import java.util.*;

public class AcademyGraduation_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentsCount = Integer.parseInt(sc.nextLine());
        Map<String, ArrayList<Double>> listGrades = new LinkedHashMap<>();

        for (int i = 0; i < studentsCount; i++) {
            String studentName = sc.nextLine();
            double[] grades = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            listGrades.putIfAbsent(studentName, new ArrayList<>());
            for (double grade : grades) {
                listGrades.get(studentName).add(grade);
            }
        }

        listGrades
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(entry -> {
                    Double sum =
                            entry
                                    .getValue()
                                    .stream()
                                    .mapToDouble(value -> value).sum();
                    System.out.printf("%s is graduated with %f\n",
                            entry.getKey(), sum / entry.getValue().size());
                });

    }
}
