package JavaAdvanced.Generics_17.Exercise.GenericCountMethodString_5;

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

        String toCompare = sc.nextLine();
        box.compare(box.getParams(), toCompare);
    }
}
