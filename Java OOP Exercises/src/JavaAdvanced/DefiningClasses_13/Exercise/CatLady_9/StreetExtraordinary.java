package JavaAdvanced.DefiningClasses_13.Exercise.CatLady_9;

import JavaAdvanced.DefiningClasses_13.Exercise.CatLady_9.Cat.Cat;

public class StreetExtraordinary extends Cat {
    private double decibelsOfMeows;

    public StreetExtraordinary(String name, double decibelsOfMeows) {
        super(name);
        this.decibelsOfMeows = decibelsOfMeows;
    }

    @Override
    public  String toString() {
        return super.toString() + String.format(" %.2f", this.decibelsOfMeows);
    }
}
