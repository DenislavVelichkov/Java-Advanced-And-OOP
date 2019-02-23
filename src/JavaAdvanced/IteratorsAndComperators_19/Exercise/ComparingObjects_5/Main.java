package JavaAdvanced.IteratorsAndComperators_19.Exercise.ComparingObjects_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        ArrayList<Person> people = new ArrayList<>();

        while (!input.equals("END")) {

            String[] tokens = input.split("\\s+");

            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            people.add(person);
            input = sc.nextLine();
        }

        int n = Integer.parseInt(sc.nextLine());
        Person comparerPerson = people.get(n - 1);

        int equalPeopleCount = 0;

        equalPeopleCount = (int) people.stream()
                .filter(person -> person
                        .compareTo(comparerPerson) == 0)
                        .count();

        if (equalPeopleCount == 1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d",
                    equalPeopleCount,
                    people.size() - equalPeopleCount,
                    people.size());
        }
    }
}
