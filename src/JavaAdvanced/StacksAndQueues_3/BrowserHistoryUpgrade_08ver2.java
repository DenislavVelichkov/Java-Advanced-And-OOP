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

                    } else {
                        System.out.println("");
                    }
                    break;
                case "forward":
                    if (!forwards.isEmpty()) {

                    } else {
                        System.out.println("");
                    }
                    break;
                default:

                    break;
            }

            line = sc.nextLine();
        }
    }
}

