package JavaAdvanced.StacksAndQueues_3.Excercise;

import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Robotics_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] roboData = sc.nextLine().split(";");
        String[] robots = new String[roboData.length];
        int[] workingTime = new int[roboData.length];
        int[] processTime = new int[roboData.length];

        for (int i = 0; i < roboData.length; i++) {
            robots[i] = roboData[i].split("-")[0];
            workingTime[i] = Integer.parseInt(roboData[i].split("-")[1]);
        }

        String[] timeData = sc.nextLine().split(":");
        int hours = Integer.parseInt(timeData[0]);
        int minutes = Integer.parseInt(timeData[1]);
        int seconds = Integer.parseInt(timeData[2]);
        int startTime = hours * 3600 + minutes * 60 + seconds;
        int time = 0;
        Deque<String> products = new ArrayDeque<>();
        String item = sc.nextLine();

        while (!item.equals("End")) {
            products.offer(item);
            item = sc.nextLine();
        }

        while (!products.isEmpty()) {
            time++;
            String product = products.pollFirst();
            boolean isAssigned = false;

            for (int i = 0; i < robots.length; i++) {
                if (processTime[i] == 0 && !isAssigned) {
                    processTime[i] = workingTime[i];
                    printTask(robots[i],startTime + time, product);
                    isAssigned = true;
                }
                if (processTime[i] > 0) {
                    processTime[i]--;
                }
            }

            if (!isAssigned) {
                products.offer(product);
            }
        }
    }

    private static void printTask(String robot, int time, String product) {
        int hours = (time / 3600) % 24;
        int minutes = time % 3600 / 60;
        int seconds = time % 60;
        DecimalFormat format = new DecimalFormat("00");
        System.out.println(String.format("%s - %s [%s:%s:%s]", robot, product,
                format.format(hours), format.format(minutes), format.format(seconds)));
    }
    public static String convertSecondsToHHMMSS(int seconds){ //time

        int s = seconds % 60;
        int m = (seconds/ 60) % 60;
        int h = (seconds / (60 * 60)) % 24;

        return String.format("%02d:%02d:%02d",h,m,s);
    }
}
