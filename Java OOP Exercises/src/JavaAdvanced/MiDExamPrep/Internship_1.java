package JavaAdvanced.MiDExamPrep;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Internship_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> tasks = new ArrayDeque<>();
        ArrayDeque<String> candidates = new ArrayDeque<>();

        int problemsCount = Integer.parseInt(sc.nextLine());
        int candidatesCount = Integer.parseInt(sc.nextLine());


        for (int i = 0; i < problemsCount; i++) {
            String prob = sc.nextLine();
            tasks.push(prob);
        }

        for (int i = 0; i < candidatesCount; i++) {
            String candidate = sc.nextLine();
            if (candidate.matches("[A-Z][a-z]+\\s[A-Z][a-z]+")) {
                candidates.offer(candidate);
            }
        }

        while (!tasks.isEmpty()) {
            if (candidates.size() == 1) {
                System.out.printf("%s gets the job!", candidates.poll());
                return;
            }

            String candidateToReview = candidates.poll();
            String task = tasks.pop();


            if (validateTask(task, candidateToReview)) {
                candidates.offer(candidateToReview);
                System.out.printf("%s solved %s.%n", candidateToReview, task);
            } else {
                tasks.addLast(task);
                System.out.printf("%s failed %s.%n", candidateToReview, task);
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