package JavaAdvanced.StacksAndQueues_3.Excercise;

import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String parentheses = sc.nextLine();
        ArrayDeque<Character> openingBrackets = new ArrayDeque<>();
        boolean areBalanced = true;

        for (int i = 0; i < parentheses.length(); i++) {
            char current = parentheses.charAt(i);

            if (current == '{' ||
                    current == '[' ||
                    current == '(') {
                openingBrackets.push(current);
            } else {
                if (openingBrackets.isEmpty()) {
                    areBalanced = false;
                    break;
                }

                char opening = openingBrackets.pop();
                if (current == '}' && opening != '{') {
                    areBalanced = false;
                    break;
                } else if (current == ']' && opening != '[') {
                    areBalanced = false;
                    break;
                } else if (current == ')' && opening != '(') {
                    areBalanced = false;
                    break;
                }
            }
        }
        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
