package JavaAdvanced.DefiningClasses_13.Exercise.CatLady_9;

import JavaAdvanced.DefiningClasses_13.Exercise.CatLady_9.Cat.Cat;

public class Siamese extends Cat {
    private double earSize;

    public Siamese(String name, double earSize) {
        super(name); //вика се конструктор от базов клас
        this.earSize = earSize;
    }

    @Override
    public  String toString() {
        return super.toString() + String.format(" %.2f", this.earSize);
    }
}
