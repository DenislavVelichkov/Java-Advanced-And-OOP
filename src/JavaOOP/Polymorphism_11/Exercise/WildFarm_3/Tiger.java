package JavaOOP.Polymorphism_11.Exercise.WildFarm_3;

import java.security.InvalidParameterException;

public class Tiger extends Felime {
    private String livingRegion;

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.livingRegion = super.getLivingRegion();
    }

    @Override
    public void eat(Food food) {
        if (!food.getClass().getSimpleName().equals("Meat")) {
            throw new InvalidParameterException("Tigers are not eating that type of food!");
        }

        super.setFoodEaten(super.getFoodEaten() + food.getQuantity());
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }
}
