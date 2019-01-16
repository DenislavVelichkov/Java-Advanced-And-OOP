package JavaAdvanced.StacksAndQueues_3;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        ArrayDeque<String> browser = new ArrayDeque<>();
        ArrayDeque<String> forwards = new ArrayDeque<>();
        String current = "";

        while (!line.equals("Home")) {
            if (line.equals("back")) {
                if (!browser.isEmpty()) {
                    forwards.push(current);
                    current = browser.pop();
                } else {
                    System.out.println("no previous URLs");
                    line = sc.nextLine();
                    continue;
                }
            } else if (line.equals("forward")) {
                if (!forwards.isEmpty()) {
                    browser.push(current);
                    current = forwards.pop();
                } else {
                    System.out.println("no next URLs");
                    line = sc.nextLine();
                    continue;
                }
            } else {
                if (!current.equals("")) {
                    browser.push(current);
                    if (!forwards.isEmpty()) {
                        forwards.clear();
                    }
                }

                current = line;
            }

            System.out.println(current);
            line = sc.nextLine();
        }
    }
}
