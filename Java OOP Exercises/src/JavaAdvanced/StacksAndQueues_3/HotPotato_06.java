package JavaAdvanced.StacksAndQueues_3;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(sc.nextLine());
        ArrayDeque<String> children = new ArrayDeque<>();
        Collections.addAll(children, names);

        while (children.size() > 1) {
            for (int i = 0; i < n - 1; i++) {
                String currentChild = children.poll();
                children.offer(currentChild);
            }

            String child = children.poll();
            System.out.printf("Removed %s%n", child);
        }
        String lastChild = children.poll();
        System.out.printf("Last is %s%n", lastChild);
    }
}
