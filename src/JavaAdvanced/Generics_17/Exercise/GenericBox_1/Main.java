package JavaAdvanced.Generics_17.Exercise.GenericBox_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String line = sc.nextLine();
        Box box = new Box<>();

        while (n-- > 0) {
            box.add(line);

            line = sc.nextLine();
        }
        System.out.println(box);
    }

}
