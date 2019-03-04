package JavaOOP.Encapsulation_5.FirstAndReserveTeam_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        ArrayList<Person> people = new ArrayList<>();
        Team team = new Team("Minior");

        while (n-- > 0) {
            String[] input = reader.readLine().split(" ");
            Person person = new Person(
                    input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]));
        }

        double bonus = Double.parseDouble(reader.readLine());

        people.forEach(person -> person.increaseSalary(bonus));
        people.forEach(System.out::println);
    }
}
