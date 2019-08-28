package JavaAdvanced.FunctionalProgramming_11.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Inferno_13 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numbers = Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

        String command = reader.readLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        List<Integer> numToRemove;

        while (!command.equals("Forge")) {
            String[] data = command.split(";");

            String cmd = data[0];
            String filterType = data[1];
            int filterParam = Integer.parseInt(data[2]);

            switch (cmd) {
                case "Exclude":
                    numToRemove = action(numbers, filterType, filterParam);
                    stack.addAll(numToRemove);
                    break;
                case "Reverse":
                    numToRemove = action(numbers, filterType, filterParam);
                    while (numToRemove.size() > 0) {
                         numToRemove.remove(stack.pop());
                    }
                    break;
                default:
                    break;
            }

            command = reader.readLine();
        }

        while (!stack.isEmpty()) {
            numbers.remove(stack.pop());
        }

        numbers.forEach(integer -> System.out.printf("%d ", integer));
    }

    private static List<Integer> action(ArrayList<Integer> numbers, String cmd, int filterParam) {
        List<Integer> temp = new ArrayList<>();

        switch (cmd) {
            case "Sum Left Right":
                numbers.forEach(el -> {
                    int leftN = 0;
                    int rightN = 0;
                    try {
                        int index = numbers.indexOf(el);
                        leftN = numbers.get(index - 1) < 0 ? 0 : numbers.get(index - 1);
                        rightN = numbers.get(index + 1) >= numbers.size() ? 0 : numbers.get(index + 1);
                    } catch (IndexOutOfBoundsException e) {}
                    int result = el + leftN + rightN;

                    if (result == filterParam) {
                        temp.add(el);
                    }
                });
                break;
            case "Sum Left":
                numbers.forEach(el -> {
                    int leftN = 0;
                    try {
                        int index = numbers.indexOf(el);
                        leftN = numbers.get(index - 1) < 0 ? 0 : numbers.get(index - 1);
                    } catch (IndexOutOfBoundsException e) {}
                    int result = el + leftN;

                    if (result == filterParam) {
                        temp.add(el);
                    }
                });
                break;
            case "Sum Right":
                numbers.forEach(el -> {
                    int rightN = 0;
                    try {
                        int index = numbers.indexOf(el);
                        rightN = numbers.get(index + 1) >= numbers.size() ? 0 : numbers.get(index + 1);
                    } catch (IndexOutOfBoundsException e) {}
                    int result = el + rightN;

                    if (result == filterParam) {
                        temp.add(el);
                    }
                });
                break;
        }

        return temp;
    }
}
