package JavaOOP.Inheritance_7.Exercise.Person_1;

import java.security.InvalidParameterException;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.setName(name);
    }

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        if (name.length() < 3) {
            throw new InvalidParameterException("Name's length should not be less than 3 symbols!");
        }

        this.name = name;
    }

   protected void setAge(int age) {
        if (age < 0) {
            throw new InvalidParameterException("Age must be positive!");
        }

        this.age = age;
    }

    @Override
    public String toString() {
        return "JavaOOP.Inheritance_7.Exercise.Person_1.Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
