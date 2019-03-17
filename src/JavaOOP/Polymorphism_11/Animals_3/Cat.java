package JavaOOP.Polymorphism_11.Animals_3;

public class Cat extends Animal {

    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    protected String explainSelf() {
        return String.format("%s%nMEOW", super.explainSelf());
    }
}
