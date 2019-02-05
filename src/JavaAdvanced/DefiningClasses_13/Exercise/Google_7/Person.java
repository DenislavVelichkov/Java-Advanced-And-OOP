package JavaAdvanced.DefiningClasses_13.Exercise.Google_7;

import java.util.ArrayList;

public class Person {
    public String name;
    public String carModel;
    public int carSpeed;
    public String companyName;
    public String department;
    public double salary;
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
}
