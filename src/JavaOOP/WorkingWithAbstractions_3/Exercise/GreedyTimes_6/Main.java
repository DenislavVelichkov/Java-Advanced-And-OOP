package JavaOOP.WorkingWithAbstractions_3.Exercise.GreedyTimes_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long maxCapacity = Long.parseLong(reader.readLine());
        String[] input = reader.readLine().split("\\s+");
        Bag bag = new Bag(maxCapacity);

        for (int i = 0; i < input.length; i += 2) {
            String itemType = input[i];
            long amount = Long.parseLong(input[i + 1]);

            String item = "";

            if (itemType.length() == 3) {
                item = "Cash";
            } else if (itemType.toLowerCase().endsWith("gem")) {
                item = "Gem";
            } else if (itemType.toLowerCase().equals("gold")) {
                item = "Gold";
            }

            bag.addItem(item, amount);
        }

        System.out.println(bag.toString());
    }
}
