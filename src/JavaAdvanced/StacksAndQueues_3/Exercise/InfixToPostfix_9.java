package JavaAdvanced.StacksAndQueues_3.Exercise;

import java.util.*;

public class InfixToPostfix_9 {

    private enum Operator {
        ADD(1), SUBTRACT(2), MULTIPLY(3), DIVIDE(4);
        final int precedence;

        Operator(int p) {
            precedence = p;
        }
    }

    private static Map<String, Operator> ops = new HashMap<>() {{
        put("+", Operator.ADD);
        put("-", Operator.SUBTRACT);
        put("*", Operator.MULTIPLY);
        put("/", Operator.DIVIDE);
    }};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(postfix(input));
    }

    private static boolean isHigherPrecedence(String op, String sub) {
        return (ops.containsKey(sub) && ops.get(sub).precedence >= ops.get(op).precedence);
    }

    private static String postfix(String infix) {
        StringBuilder output = new StringBuilder();
        Deque<String> stack = new LinkedList<>();

        for (String token : infix.split("\\s+")) {
            // operator
            if (ops.containsKey(token)) {
                while (!stack.isEmpty() && isHigherPrecedence(token, stack.peek()))
                    output.append(stack.pop()).append(' ');
                stack.push(token);

                // left parenthesis
            } else if (token.equals("(")) {
                stack.push(token);

                // right parenthesis
            } else if (token.equals(")")) {
                while (!stack.peek().equals("("))
                    output.append(stack.pop()).append(' ');
                stack.pop();

                // digit
            } else {
                output.append(token).append(' ');
            }
        }

        while (!stack.isEmpty())
            output.append(stack.pop()).append(' ');

        return output.toString();
    }
}