package JavaOOP.Encapsulation_5.Exercise.PizzaCalories_5;

import java.security.InvalidParameterException;

public class Dough {
   private String flourType;
   private String bakingTechnique;
   private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (!validateFlour(flourType)) {
            throw new InvalidParameterException("Invalid type of dough.");
        }

        this.flourType = String.valueOf(DoughType.valueOf(flourType));
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!validateFlour(bakingTechnique)) {
            throw new InvalidParameterException("Invalid type of dough.");
        }

        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new InvalidParameterException("Dough weight should be in the range [1..200].");
        }

        this.weight = weight;
    }

    public double calculateCalories() {
        return (2 * this.weight)
                * DoughType.valueOf(this.flourType).getValue()
                * DoughType.valueOf(this.bakingTechnique).getValue();
    }

    private boolean validateFlour(String flourType) {
        boolean isPresent = false;

        for (DoughType value : DoughType.values()) {
            if (value.name().equals(flourType)) {
                isPresent = true;
                break;
            }
        }

        return isPresent;
    }
}
