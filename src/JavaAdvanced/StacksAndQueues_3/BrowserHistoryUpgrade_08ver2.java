package JavaAdvanced.StacksAndQueues_3;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade_08ver2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        ArrayDeque<String> browser = new ArrayDeque<>();
        ArrayDeque<String> forwards = new ArrayDeque<>();
        String current = "";

        while (!line.equals("Home")) {

            switch (line) {
                case "back":
                    if (!browser.isEmpty()) {
                        forwards.push(current);
                        current = browser.pop();
                    } else {
                        System.out.println("no previous URLs");
                        line = sc.nextLine();
                        continue;
                    }
                    break;
                case "forward":
                    if (!forwards.isEmpty()) {
                        browser.push(current);
                        current = forwards.pop();
                    } else {
                        System.out.println("no next URLs");
                        line = sc.nextLine();
                        continue;
                    }
                    break;
                default:
                    if (!current.equals("")) {
                        browser.push(current);
                        if (!forwards.isEmpty()) {
                            forwards.clear();
                        }
                    }

                    current = line;
                    break;
            }
            System.out.println(current);
            line = sc.nextLine();
        }
    }
}

