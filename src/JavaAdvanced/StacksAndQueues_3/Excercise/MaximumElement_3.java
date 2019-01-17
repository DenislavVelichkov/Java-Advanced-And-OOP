package JavaAdvanced.StacksAndQueues_3.Excercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cmdCount = Integer.parseInt(sc.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();


        while (cmdCount != 0) {
            String[] cmd = sc.nextLine().split("\\s+");
            int action = Integer.parseInt(cmd[0]);
            /*if (cmd.length > 1) {
                int action = Integer.parseInt(cmd[0]);
                int element = Integer.parseInt(cmd[1]);
            } else {
                int action = Integer.parseInt(cmd[0]);
            } */

            switch (action) {
                case 1: //push
                    stack.push(Integer.valueOf(cmd[1]));
                    break;
                case 2://delete
                    stack.pop();
                    break;
                case 3://print
                    int tempN = findMaxElement(stack);
                    System.out.println(tempN);
                    break;
                default:
                    break;
            }

            cmdCount--;
        }
    }

    private static int findMaxElement(ArrayDeque<Integer> stack) {
        int[] maxElement = {stack.getFirst()};
        int[] result = {0};

        stack.forEach(el -> {
            if (maxElement[0] >= el) {
                result[0] = maxElement[0];
            } else {
                maxElement[0] = el;
                result[0] = el;
            }
        });

        return result[0];
    }
}
