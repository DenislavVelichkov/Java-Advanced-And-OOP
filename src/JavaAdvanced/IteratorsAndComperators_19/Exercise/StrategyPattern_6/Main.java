package JavaAdvanced.IteratorsAndComperators_19.Exercise.StrategyPattern_6;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        TreeSet<Person> peopleByNames = new TreeSet<>(new ComparatorByName());
        TreeSet<Person> peopleByAge= new TreeSet<>(new ComparatorByAge());

        while (n-- > 0) {

            String[] tokens = sc.nextLine().split("\\s+");

            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]));
            peopleByNames.add(person);
            peopleByAge.add(person);
        }

        for (Person person : peopleByNames) {
            System.out.println(person);
        }

        for (Person person : peopleByAge) {
            System.out.println(person);
        }
    }
}
