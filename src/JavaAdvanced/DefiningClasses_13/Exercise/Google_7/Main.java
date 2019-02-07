package JavaAdvanced.DefiningClasses_13.Exercise.Google_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        ArrayList<Person> peopleList = new ArrayList<>();

        BiPredicate<ArrayList<Person>, String> isPersonUnique =
                (people, name) -> people
                        .stream()
                        .anyMatch(person -> person.name.equals(name));

        BiFunction<ArrayList<Person>, String, Person> getPerson =
                (people, name) -> people
                        .stream()
                        .filter(person -> person.name.equals(name))
                        .findAny()
                        .get();

        while (!line.equals("End")) {
            String[] data = line.split("\\s+");
            Person person = new Person();

            if (!isPersonUnique.test(peopleList, data[0])) {
                person.name = data[0];
            } else {
                person = getPerson.apply(peopleList, data[0]);
            }

            switch (data[1]) {
                case "company":
                    if (person.company == null) {
                        person.company = new Company(
                                data[2], data[3], Double.parseDouble(data[4]));
                    } else {
                        person.company.name = data[2];
                        person.company.department = data[3];
                        person.company.salary= Double.parseDouble(data[4]);
                    }
                    break;
                case "car":
                    if (person.car == null) {
                        person.car = new Car(data[2], Integer.parseInt(data[3]));
                    } else {
                        person.car.carModel = data[2];
                        person.car.carSpeed = Integer.parseInt(data[3]) ;
                    }
                    break;
                case "pokemon":
                    Pokemon pokemon = new Pokemon(data[2], data[3]);
                    person.pokemonCollection.add(pokemon);
                    break;
                case "parents":
                    Parent parent = new Parent(data[2], data[3]);
                    person.parents.add(parent);
                    break;
                case "children":
                    Child child = new Child(data[2], data[3]);
                    person.children.add(child);
                    break;
            }

            peopleList.add(person);
            line = reader.readLine();
        }

        String searchCriteria = reader.readLine();
        Person foundPerson = getPerson.apply(peopleList, searchCriteria);
        System.out.print(foundPerson);
    }
}