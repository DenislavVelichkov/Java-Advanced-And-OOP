package JavaAdvanced.StacksAndQueues_3;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        while (!line.equals("print")) {
            if (line.equals("cancel")) {
                if (printerQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printerQueue.poll());
                }
            } else {
                printerQueue.offer(line);
            }

            line = sc.nextLine();
        }

        while (!printerQueue.isEmpty()) {
            System.out.println(printerQueue.poll());
        }
    }
}
