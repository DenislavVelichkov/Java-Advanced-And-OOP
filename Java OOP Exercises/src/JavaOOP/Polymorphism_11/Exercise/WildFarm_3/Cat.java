package JavaOOP.Polymorphism_11.Exercise.WildFarm_3;

import java.text.DecimalFormat;

public class Cat extends Felime {
    String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        super.setLivingRegion(livingRegion);
        this.breed = breed;
    }

    @Override
    public void eat(Food food) {
        super.setFoodEaten(super.getFoodEaten() + food.getQuantity());
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    public String getBreed() {
        return this.breed;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.##");

        return this.getClass().getSimpleName() + "[" +
                this.getAnimalName() + ", " +
                this.getBreed() + ", " +
                decimalFormat.format(this.getAnimalWeight()) + ", " +
                this.getLivingRegion() + ", " +
                this.getFoodEaten() + "]";
    }
}
