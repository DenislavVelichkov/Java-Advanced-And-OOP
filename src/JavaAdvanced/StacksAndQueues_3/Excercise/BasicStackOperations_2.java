package JavaAdvanced.StacksAndQueues_3.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] command = sc.nextLine().split("\\s+");
        int pushCount = Integer.parseInt(command[0]);
        int popCount = Integer.parseInt(command[1]);
        int elementIsPresent = Integer.parseInt(command[2]);
        ArrayDeque<Integer> elementsList = new ArrayDeque<>();
        String[] elementsLine = sc.nextLine().split("\\s+");
        int counter = 0;

        while (pushCount != 0) {
            elementsList.push((Integer.parseInt(elementsLine[counter])));
            counter++;
            pushCount--;
        }

        while (popCount != 0) {
            elementsList.pop();
            popCount--;
        }

        if (elementsList.contains(elementIsPresent)) {
            System.out.println("true");
        } else {
            if (!elementsList.isEmpty()) {
                int smallestEl = checkForSmallestEl(elementsList);
                System.out.println(smallestEl);
            } else {
                System.out.println(elementsList.size());
            }
        }


    }

    private static int checkForSmallestEl(ArrayDeque<Integer> elementsList) {
        int[] smallestNum = {elementsList.getFirst()};
        final int[] result = {0};

        elementsList.forEach(el -> {
            if (smallestNum[0] <= el) {
                result[0] = smallestNum[0];
            } else {
                smallestNum[0] = el;
            }
        });
        return result[0];
    }
}
