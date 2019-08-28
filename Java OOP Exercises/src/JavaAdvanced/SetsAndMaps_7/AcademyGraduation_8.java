package JavaAdvanced.SetsAndMaps_7;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;


public class AcademyGraduation_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentsCount = Integer.parseInt(sc.nextLine());
        Map<String, ArrayList<Double>> listGrades = new TreeMap<>();

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
        DecimalFormat decimal = new DecimalFormat("#0.#####");
        decimal.setRoundingMode(RoundingMode.HALF_DOWN);
        listGrades
                .forEach((key, value) -> {
                    double avg =
                            value
                                    .stream()
                                    .mapToDouble(el -> el).sum() / value.size();
                    System.out.println(key + " is graduated with " + decimal.format(avg));
                });

    }
}
