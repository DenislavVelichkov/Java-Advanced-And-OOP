package JavaAdvanced.PreviousExams.JavaAdvancedExam_10June2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Internship_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        ArrayDeque<String> tasks = new ArrayDeque<>();
        ArrayDeque<String> candidates = new ArrayDeque<>();

        int problemsCount = Integer.parseInt(reader.readLine());
        int candidatesCount = Integer.parseInt(reader.readLine());

        while (problemsCount-- > 0) {
            String prob = reader.readLine();
            tasks.push(prob);
        }

        while (candidatesCount-- > 0) {
            String candidate = reader.readLine();
            candidates.offer(candidate);
        }

        while (!tasks.isEmpty() && !candidates.isEmpty()) {
            if (candidates.size() == 1) {
                System.out.printf("%s gets the job!", candidates.poll());
                return;
            }

            String candidateToReview = candidates.poll();
            String task = tasks.pop();

            if (candidateToReview.matches("[A-Z][a-z]+\\s[A-Z][a-z]+")) {

                if (validateTask(task, candidateToReview)) {
                    candidates.offer(candidateToReview);
                    System.out.printf("%s solved %s.%n", candidateToReview, task);
                } else {
                    tasks.addLast(task);
                    System.out.printf("%s failed %s.%n", candidateToReview, task);
                }

            }
        }

        System.out.println(String.join(", ", candidates));
    }

    private static boolean validateTask(String task, String candidateToReview) {
        int sumOfTaskChars = 0;
        int sumOfTNameChars = 0;

        for (int i = 0; i < task.length(); i++) {
            sumOfTaskChars += task.charAt(i);
        }

        for (int i = 0; i < candidateToReview.length(); i++) {
            sumOfTNameChars += candidateToReview.charAt(i);
        }

        return sumOfTNameChars > sumOfTaskChars;
    }

}
