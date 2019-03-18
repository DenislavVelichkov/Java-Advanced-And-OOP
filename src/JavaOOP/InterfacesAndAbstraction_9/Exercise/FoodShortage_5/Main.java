package JavaOOP.InterfacesAndAbstraction_9.Exercise.FoodShortage_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());
        /*“<name> <age> <id> <birthdate>*/
        /*or “<name> <age><group>”*/

        while (n-- > 0) {
            String[] input = sc.nextLine().split("\\s+");

            if (people.stream().anyMatch(person -> person.getName().equals(input[0]))) {
                break;
            }
            if (input.length == 4) {
                Citizen citizen = new Citizen(input[0], Integer.parseInt(input[1]), input[2], input[3]);
                people.add(citizen);
            } else {
                Rebel rebel = new Rebel(input[0], Integer.parseInt(input[1]), input[2]);
                people.add(rebel);
            }
        }

        String names = sc.nextLine();
        int foodPurchased = 0;

        while (!names.equals("End")) {

            for (Person person : people) {
                if (person.getName().equals(names)) {
                    if (isCitizen(person)) {
                        ((Citizen) person).buyFood();
                        foodPurchased += 10;
                    } else {
                        ((Rebel) person).buyFood();
                        foodPurchased += 5;
                    }
                }
            }

            names = sc.nextLine();
        }

        System.out.println(foodPurchased);

    }

    private static boolean isCitizen(Person person) {
        return person.getClass().getSimpleName().equals("Citizen");
    }
}
