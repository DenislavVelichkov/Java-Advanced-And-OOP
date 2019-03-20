package JavaOOP.Polymorphism_11.Exercise.WildFarm_3;

public abstract class  Animal {
    private String animalName;
    private String animalType;
    private Double animalWeight;
    private Integer foodEaten;

    public Animal(String animalName, Double animalWeight) {
        this.animalName = animalName;
        this.setAnimalType(animalType);
        this.animalWeight = animalWeight;
        this.foodEaten = 0;

    }

    public String getAnimalName() {
        return this.animalName;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return this.animalType;
    }

    public Double getAnimalWeight() {
        return this.animalWeight;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    public Integer getFoodEaten() {
        return this.foodEaten;
    }

    public abstract void makeSound();
    public abstract void eat(Food food);
}
