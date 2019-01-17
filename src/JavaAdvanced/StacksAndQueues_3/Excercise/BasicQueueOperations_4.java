package JavaAdvanced.StacksAndQueues_3.Excercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");

        int elementsCountToPoll = Integer.parseInt(input[0]);
        int elementsCountToRemove = Integer.parseInt(input[1]);
        int elmIsPresent = Integer.parseInt(input[2]);
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        String[] inputNumbers = sc.nextLine().split("\\s+");
        for (int i = 0; i < elementsCountToPoll; i++) {
            queue.add(Integer.parseInt(inputNumbers[i]));
        }

        for (int i = 0; i < elementsCountToRemove; i++) {
            queue.remove();
        }

        if (queue.contains(elmIsPresent)) {
            System.out.println("true");
        } else {
            if (!queue.isEmpty()) {
                System.out.println(smallestPresent(queue));
            } else {
                System.out.println(queue.size());
            }
        }
    }

    private static int smallestPresent(ArrayDeque<Integer> queue) {
        int[] smallest = {queue.getFirst()};
        int[] result = {0};

        queue.forEach(el -> {
            if (smallest[0] <= el) {
                result[0] = smallest[0];
            }else {
                result[0] = el;
                smallest[0] = el;
            }
        });

        return result[0];
    }
}
