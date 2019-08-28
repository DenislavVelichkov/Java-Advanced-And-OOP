package JavaAdvanced.StacksAndQueues_3;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(sc.nextLine());
        ArrayDeque<String> children = new ArrayDeque<>();
        Collections.addAll(children, names);
        int round = 1;

        while (children.size() > 1) {
            for (int i = 0; i < n - 1; i++) {
                String currentChild = children.poll();
                children.offer(currentChild);
            }

            if (isPrime(round)) {
                String child = children.peek();
                System.out.printf("Prime %s%n", child);
            } else {
                String child = children.poll();
                System.out.printf("Removed %s%n", child);
            }

            round++;
        }

        String lastChild = children.poll();
        System.out.printf("Last is %s%n", lastChild);
    }

    private static boolean isPrime(int round) { // check is prime
        if (round == 1) {
            return false;
        }

        for (int i = 2; i < round; i++) {
            if (round % i == 0) {
                return false;
            }
        }
            return true;
    }
}
