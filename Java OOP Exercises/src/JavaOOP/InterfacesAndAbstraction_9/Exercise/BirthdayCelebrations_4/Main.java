package JavaOOP.InterfacesAndAbstraction_9.Exercise.BirthdayCelebrations_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Birthable> birthables = new ArrayList<>();

        while (true) {
            String[] input = sc.nextLine().split("\\s+");

            if (input[0].equals("End")) {
                break;
            }

            switch (input[0]) {
                case "Citizen":
                    String name = input[1];
                    int age = Integer.parseInt(input[2]);
                    String id = input[3];
                    String birthDate = input[4];

                    Birthable human = new Citizen(name, age, id, birthDate);
                    birthables.add(human);
                    break;
                case "Robot":
                    Robot robo = new Robot(input[1], input[2]);
                    break;
                case "Pet":
                    Birthable pet = new Pet(input[1], input[2]);
                    birthables.add(pet);
                    break;
                default:
                    break;
            }
        }

        int year = Integer.parseInt(sc.nextLine());

        for (Birthable birthable : birthables) {
            String yearToCheck = birthable.getBirthDate().substring(birthable.getBirthDate().lastIndexOf("/") + 1);
            int currentYear = Integer.parseInt(yearToCheck);

            if (currentYear == year) {
                System.out.println(String.format("%s", birthable.getBirthDate()));
            }
        }

    }
}
