package JavaOOP.InterfacesAndAbstraction_9.MooD3_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //KoHaH | Demon | 100.0 | 100

        Scanner scanner = new Scanner(System.in);
        String[] inputParams = scanner.nextLine().split(" \\| ");

        String username = inputParams[0];
        String type = inputParams[1];
        Integer level = Integer.parseInt(inputParams[3]);

        Character hero;
        if (type.equals("Demon")) {
            hero = new Demon(
                    username,
                    level,
                    Double.parseDouble(inputParams[2])
                );
        } else {
            hero = new Archangel(
                    username,
                    level,
                    Integer.parseInt(inputParams[2])
            );
        }

        System.out.println(hero.toString());
    }
}
