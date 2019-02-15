package JavaAdvanced.IteratorsAndComperators_19.Exercise.ListyIterator_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cmd = sc.nextLine();

        while (!cmd.equals("END")) {
            String[] tokens =
                    Arrays.stream(cmd.split("\\s+"))
                            .skip(1)
                            .toArray(String[]::new);

            ListyIterator listyIterator = new ListyIterator(Arrays.asList(tokens));



            cmd = sc.nextLine();
        }
    }

}
