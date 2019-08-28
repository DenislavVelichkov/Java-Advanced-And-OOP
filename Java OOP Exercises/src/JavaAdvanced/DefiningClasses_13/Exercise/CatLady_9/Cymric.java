package JavaAdvanced.DefiningClasses_13.Exercise.CatLady_9;

import JavaAdvanced.DefiningClasses_13.Exercise.CatLady_9.Cat.Cat;

public class Cymric extends Cat {
    private double furLength;

    public Cymric(String name, double furLength) {
        super(name);
        this.furLength = furLength;
    }

    @Override
    public  String toString() {
        return String.join(" ", super.toString(), String.format("%.2f", this.furLength)) ;
    }
}
