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
        
        BiPredicate<ArrayList<Person>, String> isPersonUnique = (people, name) ->
                people.stream().anyMatch(person -> person.name.equals(name));
        BiFunction<ArrayList<Person>, String, Person> getPerson = (people, name) ->
                people.stream().filter(person -> person.name.equals(name)).findFirst().get();
        
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
                    person.carSpeed = Integer.parseInt(data[3]);
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

        line = reader.readLine();

        Person searchPerson = getPerson.apply(peopleList, line);

        System.out.println(searchPerson.name);
        System.out.println("Company:");
        System.out.printf("%s %s %s%n", searchPerson.companyName, searchPerson.department, searchPerson.salary);
        System.out.println("Car:");
        System.out.print(searchPerson.carModel + " ");
        System.out.println(searchPerson.carSpeed);
        System.out.println("Pokemon:");
        searchPerson.pokemonCollection.forEach(pokemon -> System.out.printf(
                "%s %s%n", pokemon.getName(), pokemon.getType()));
        System.out.println("Parents:");
        searchPerson.parents.forEach(parent -> System.out.printf(
                "%s %s%n", parent.getName(), parent.getBirthday()));
        System.out.println("Children:");
        searchPerson.children.forEach(child -> System.out.printf(
                "%s %s%n", child.getName(), child.getBirthday()));
    }
}