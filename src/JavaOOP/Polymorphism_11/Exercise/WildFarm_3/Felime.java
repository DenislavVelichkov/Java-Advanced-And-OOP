package JavaOOP.Polymorphism_11.Exercise.WildFarm_3;

public abstract class Felime extends Mammal {

    public Felime(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
        super.setLivingRegion(livingRegion);
    }
}
