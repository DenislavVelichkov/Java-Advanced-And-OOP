package JavaOOP.Polymorphism_11.Exercise.WildFarm_3;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalName, Double animalWeight) {
        super(animalName, animalWeight);
    }

    public Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalWeight);
        super.setAnimalType(animalType);
        this.livingRegion = livingRegion;
    }

    public void setAnimalType(String animalType) {
        super.setAnimalType(animalType);
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return this.livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        return this.getClass().getSimpleName() + "[" +
                super.getAnimalName() + ", " +
                decimalFormat.format(this.getAnimalWeight()) + ", " +
                this.getLivingRegion() + ", " +
                this.getFoodEaten() + "]";
    }
}
