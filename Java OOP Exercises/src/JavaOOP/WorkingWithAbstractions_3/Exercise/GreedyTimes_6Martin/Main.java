package JavaOOP.WorkingWithAbstractions_3.Exercise.GreedyTimes_6Martin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long capacity = Long.parseLong(reader.readLine());
        Bag bag = new Bag(capacity);
        String[] input = reader.readLine().split("\\s+");

        for (int i = 0; i < input.length; i += 2) {
            String itemType = input[i];
            long weight = Long.parseLong(input[i + 1]);

            if (itemType.length() == 3) {
                bag.addCash(itemType, weight);
            } else if (itemType.toLowerCase().endsWith("gem")
                    && itemType.length() > 3) {
                bag.addGems(itemType, weight);
            } else if (itemType.toLowerCase().equals("gold")) {
                bag.addGold(weight);
            }

        }

        System.out.println(bag);
    }
}
