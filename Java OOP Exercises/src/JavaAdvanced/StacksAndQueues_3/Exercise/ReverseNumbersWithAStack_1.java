package JavaAdvanced.StacksAndQueues_3.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithAStack_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numbersInput = sc.nextLine().split("\\s+");
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (String number : numbersInput) {
            int num = Integer.parseInt(number);
            numbers.push(num);
        }

        while (numbers.size() != 0) {
            System.out.print(numbers.pop() + " ");
        }
    }
}
