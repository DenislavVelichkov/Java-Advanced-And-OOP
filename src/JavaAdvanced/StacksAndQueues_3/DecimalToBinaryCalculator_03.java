package JavaAdvanced.StacksAndQueues_3;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryCalculator_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        ArrayDeque<Integer> bits = new ArrayDeque();

        if (number == 0) {
            System.out.println(0);
            return;
        }

        while (number > 0) {
            int leftover = number % 2;
            bits.push(leftover);

            number = number / 2;
        }

        while (!bits.isEmpty()) {
            System.out.print(bits.pop());
        }
    }
}
