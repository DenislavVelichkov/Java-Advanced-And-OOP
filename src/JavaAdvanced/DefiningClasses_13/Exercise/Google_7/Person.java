package JavaAdvanced.DefiningClasses_13.Exercise.Google_7;

import java.util.ArrayList;

public class Person {
    public String name;
    public Company company;
    public Car car;
    public ArrayList<Pokemon> pokemonCollection;
    public ArrayList<Parent> parents;
    public ArrayList<Child> children;

    public Person() {
        this.pokemonCollection = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();

    }

    public Person(String name) {
        this();
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder line = new StringBuilder();
        line.append(this.name)
                .append(System.getProperty("line.separator"))
                .append("Company:")
                .append(System.getProperty("line.separator"));

        if (this.company != null) {
            line.append(this.company.toString())
                    .append(System.getProperty("line.separator"));
        }

        line.append("Car:")
                .append(System.getProperty("line.separator"));
        if (this.car != null) {
            line.append(this.car.toString())
                    .append(System.getProperty("line.separator"));
        }

        line.append("Pokemon:")
                .append(System.getProperty("line.separator"));
        if (this.pokemonCollection.size() > 0) {
            this.pokemonCollection.forEach(pokemon ->
                    line
                    .append(pokemon.getName())
                    .append(" ")
                    .append(pokemon.getType())
                    .append(System.getProperty("line.separator")));
        }

        line.append("Parents:")
                .append(System.getProperty("line.separator"));
        if (this.parents.size() > 0) {
            this.parents.forEach(parent ->
                    line
                    .append(parent.getName())
                    .append(" ")
                    .append(parent.getBirthday())
                    .append(System.getProperty("line.separator")));
        }

        line.append("Children:")
                .append(System.getProperty("line.separator"));
        if (this.children.size() > 0) {
            this.children.forEach(child ->
                    line
                    .append(child.getName())
                    .append(" ")
                    .append(child.getBirthday())
                    .append(System.getProperty("line.separator")));
        }

        String result = line.toString();

        return result.trim();
    }
}
