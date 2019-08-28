package JavaOOP.Encapsulation_5.Exercise.PizzaCalories_5;

public enum  ToppingType {
    Meat(1.2),
    Veggies(0.8),
    Cheese(1.1),
    Sauce(0.9);

    private double value;

    ToppingType(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }
}
