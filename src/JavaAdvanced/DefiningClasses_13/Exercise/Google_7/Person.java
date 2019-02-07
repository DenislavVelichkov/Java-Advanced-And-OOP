package JavaAdvanced.DefiningClasses_13.Exercise.Google_7;

import java.util.ArrayList;

public class Person {
    public String name;
    public String carModel;
    public String carSpeed;
    public String companyName;
    public String department;
    public String salary;
    public ArrayList<Pokemon> pokemonCollection;
    public ArrayList<Parent> parents;
    public ArrayList<Child> children;

    public Person() {
       /*this.carModel = "";
       this.carSpeed = 0;
       this.companyName = "";
       this.department = "";
       this.salary = "";*/
        this.pokemonCollection = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();

    }

    public Person(String name) {
        this();
        this.name = name;
    }
}
