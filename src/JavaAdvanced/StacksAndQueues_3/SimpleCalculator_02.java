package JavaAdvanced.StacksAndQueues_3;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split("\\s+");

        ArrayDeque<String> tokens = new ArrayDeque<>();
        Collections.addAll(tokens, parts);

        while (tokens.size() > 1) {
            int firstNumber = Integer.parseInt(tokens.pop());
            String operator = tokens.pop();
            int secondNumber = Integer.parseInt(tokens.pop());
            int result = 0;

            if (operator.equals("+")) {
                result = firstNumber + secondNumber;
            } else {
                result = firstNumber - secondNumber;
            }

            tokens.push(String.valueOf(result));
        }

        System.out.println(tokens.peek());
    }
}
