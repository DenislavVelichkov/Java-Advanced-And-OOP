package JavaAdvanced.DefiningClasses_13.Exercise.Google_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

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
                peopleList.add(person);
            } else {
                person = getPerson.apply(peopleList, data[0]);
            }

            switch (data[1]) {
                case "company":
                    person.companyName = data[2];
                    person.department = data[3];
                    person.salary = data[4];
                    break;
                case "car":
                    person.carModel = data[2];
                    person.carSpeed = data[3];
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
                default:
                    break;
            }

            line = reader.readLine();
        }

        String searchCriteria = reader.readLine();
        Person searchPerson = getPerson.apply(peopleList, searchCriteria);

        Function<String, String> printAttribute = attribute -> {
            if (attribute != null) {
                return attribute;
            }
            return "";
        };

        Consumer<String> print = string -> {
            if (string.endsWith(" ")) {
                int last = string.lastIndexOf(" ");
                string = string.substring(0, last);
            }

            if (string.startsWith(" ")) {
                string = string.replaceFirst(" ", "");
            }

            System.out.println(string);
        };

        String strResult;
        System.out.println(searchPerson.name);
        System.out.println("Company:");
        strResult = String.join(" ",
                printAttribute.apply(searchPerson.companyName),
                printAttribute.apply(searchPerson.department),
                printAttribute.apply(searchPerson.salary));
        print.accept(strResult);

        System.out.println("Car:");
        strResult = String.join(" ",
                printAttribute.apply(searchPerson.carModel),
                printAttribute.apply(searchPerson.carSpeed));
        print.accept(strResult);

        System.out.println("Pokemon:");
        searchPerson.pokemonCollection.forEach(pokemon -> {
            System.out.printf("%s %s%n",
                    printAttribute.apply(pokemon.getName()),
                    printAttribute.apply(pokemon.getType()));
        });

        System.out.println("Parents:");
        searchPerson.parents.forEach(parent -> {
            System.out.printf("%s %s%n",
                    printAttribute.apply(parent.getName()),
                    printAttribute.apply(parent.getBirthday()));
        });

        System.out.println("Children:");
        searchPerson.children.forEach(child -> {
            System.out.printf("%s %s%n",
                    printAttribute.apply(child.getName()),
                    printAttribute.apply(child.getBirthday()));
        });

    }
}