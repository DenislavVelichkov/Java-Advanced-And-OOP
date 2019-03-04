package JavaOOP.Encapsulation_5.SalaryIncrease_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        ArrayList<Person> people = new ArrayList<>();

        while (n-- > 0) {
            String[] input = reader.readLine().split(" ");
            Person person = new Person(
                    input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]));
            people.add(person);
        }

        double bonus = Double.parseDouble(reader.readLine());

        people.forEach(person -> person.increaseSalary(bonus));
        people.forEach(System.out::println);
    }
}
