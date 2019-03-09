package JavaOOP.Encapsulation_5.Exercise.PizzaCalories_5;

public enum  DoughType {
    White(1.5),
    Wholegrain(1.0),
    Crispy(0.9),
    Chewy(1.1),
    Homemade(1.0);

   private double value;

    DoughType(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }
}
