package JavaAdvanced.IteratorsAndComperators_19.Exercise.StrategyPattern_6;

public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.join(" ", this.name, String.valueOf(this.age));
    }
}
