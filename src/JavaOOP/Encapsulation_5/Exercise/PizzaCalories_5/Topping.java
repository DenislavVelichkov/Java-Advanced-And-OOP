package JavaOOP.Encapsulation_5.Exercise.PizzaCalories_5;

import java.security.InvalidParameterException;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (!validateTopping(toppingType)) {
            throw new InvalidParameterException(
                    String.format(
                            "Cannot place %s on top of your pizza.", toppingType
                    ));
        }

        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new InvalidParameterException(
                    String.format(
                            "Topping %s weight should be in the range [1..50].", this.toppingType
                    ));
        }

        this.weight = weight;
    }

    public double calculateCalories() {
        return (2 * this.weight) * ToppingType.valueOf(this.toppingType).getValue();
    }

    private boolean validateTopping(String toppingType) {
        boolean isPresent = false;

        for (ToppingType value : ToppingType.values()) {
            if (value.name().equals(toppingType)) {
                isPresent = true;
                break;
            }
        }

        return isPresent;
    }
}
