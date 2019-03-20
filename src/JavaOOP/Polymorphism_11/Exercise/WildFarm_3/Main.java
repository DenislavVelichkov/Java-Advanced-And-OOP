package JavaOOP.Polymorphism_11.Exercise.WildFarm_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Food> foods = new ArrayList<>();

        while (true) {
            String input = sc.nextLine();
            if (input.equals("End")) {
                break;
            }

            String[] tokens = input.split("\\s+");

            String animalType = tokens[0];
            String animalName = tokens[1];
            double animalWeight = Double.parseDouble(tokens[2]);
            String animalRegion = tokens[3];

            if (animalType.equals("Cat")) {
                String breed = tokens[4];
                Cat cat = new Cat(animalName, animalType, animalWeight, animalRegion, breed);
                animals.add(cat);
            } else {
                Animal animal = createAnimal(animalType, animalName, animalWeight, animalRegion);
                animals.add(animal);
            }

            input = sc.nextLine();
            tokens = input.split("\\s+");

            String foodType = tokens[0];
            int foodQuantity = Integer.parseInt(tokens[1]);
            Food food;

            if (foodType.equals("Meat")) {
                food = new Meat(foodQuantity);
            } else {
                food = new Vegetable(foodQuantity);
            }

            foods.add(food);
        }

        for (int i = 0; i < foods.size(); i++) {
            animals.get(i).makeSound();

            try {
                animals.get(i).eat(foods.get(i));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        animals.forEach(System.out::println);
    }

    private static Animal createAnimal(String animalType, String animalName, double animalWeight, String animalRegion) {
        switch (animalType) {
            case "Tiger":
                return new Tiger(animalName, animalType, animalWeight, animalRegion);
            case "Mouse":
                return new Mouse(animalName, animalType, animalWeight, animalRegion);
            case "Zebra":
                return new Zebra(animalName, animalType, animalWeight, animalRegion);
        }

        return null;
    }
}
