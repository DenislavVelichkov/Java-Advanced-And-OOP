package JavaAdvanced.Generics_17.Exercise.GenericBox_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String[] tokens = sc.nextLine().split("\\s+");
            Box box = new Box<Integer>();

            try {
                ArrayList temp = Arrays.stream(tokens).map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));
                box.add(temp);
                System.out.println(box);
            } catch (Exception e) {
                box = new Box<String>();
                ArrayList temp = Arrays.stream(tokens).collect(Collectors.toCollection(ArrayList::new));
                box.add(temp);
                System.out.println(box);
            }
        }

    }
}
