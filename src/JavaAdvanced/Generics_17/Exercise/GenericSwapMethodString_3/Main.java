package JavaAdvanced.Generics_17.Exercise.GenericSwapMethodString_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Box box = new Box<>();

        while (n-- > 0) {
            String tokens = sc.nextLine();

            box.add(tokens);
        }

        String[] indexes = sc.nextLine().split("\\s+");
        int first = Integer.parseInt(indexes[0]);
        int second = Integer.parseInt(indexes[1]);

        box.swap(first, second);
        System.out.println(box);
    }
}
