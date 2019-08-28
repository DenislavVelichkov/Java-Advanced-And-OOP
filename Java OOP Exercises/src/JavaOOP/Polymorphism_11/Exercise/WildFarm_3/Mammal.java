package JavaOOP.Polymorphism_11.Exercise.WildFarm_3;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return this.livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return this.getClass().getSimpleName() + "[" +
                super.getAnimalName() + ", " +
                decimalFormat.format(this.getAnimalWeight()) + ", " +
                this.getLivingRegion() + ", " +
                this.getFoodEaten() + "]";
    }
}
