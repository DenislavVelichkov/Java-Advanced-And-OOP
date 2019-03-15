package JavaOOP.Inheritance_7.Exercise.Person_1;

import java.security.InvalidParameterException;

public class Child extends Person {

    public Child(String name, int age) {
        super(name);
        this.setAge(age);
    }

    @Override
    protected void setAge(int age) {
        if (age > 15) {
            throw new InvalidParameterException("Child's age must be lesser than 15!");
        }
        super.setAge(age);
    }
}
