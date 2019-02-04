package JavaAdvanced.DefiningClasses_13.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OpinionPoll_1 {

    static class Person {
        private String name;
        private int age;

        Person(String name, int age) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return this.age;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String toString() {
            return String.format("%s - %d", this.getName(), this.getAge());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        ArrayList<Person> people = new ArrayList<>();

        while (n-- > 0) {
            String[] data = reader.readLine().split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            Person person = new Person(name, age);
            people.add(person);
        }

        people = people
                .stream()
                .filter(p -> p.getAge() > 30)
                .collect(Collectors.toCollection(ArrayList::new));

        people.stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(p -> System.out.println(p.toString()));
    }
}
