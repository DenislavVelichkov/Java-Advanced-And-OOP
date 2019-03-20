package JavaOOP.Polymorphism_11.Exercise.WildFarm_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int linesCounter = 0;
        int index = 0;

        while (!input.equals("End")) {
            String[]tokens = input.split("\\s+");

            if (linesCounter % 2 == 0) {
                String animalType = tokens[0];
                String animalName = tokens[1];
                double animalWeight = Double.parseDouble(tokens[2]);
                String animalRegion = tokens[3];

                if (animalType.equals("Cat")) {
                    String breed = tokens[4];
                    Cat cat = new Cat(animalName, animalWeight, animalRegion, breed);
                    animals.add(cat);
                } else {
                    Animal animal = createAnimal(animalType, animalName, animalWeight, animalRegion);
                    animals.add(animal);
                }
            } else {
                String foodType = tokens[0];
                int foodQuantity = Integer.parseInt(tokens[1]);
                Food food;

                if (foodType.equals("Meat")) {
                    food = new Meat(foodQuantity);
                } else {
                    food = new Vegetable(foodQuantity);
                }

                animals.get(index).makeSound();
                try {
                    animals.get(index).eat(food);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                System.out.println(animals.get(index++).toString());
            }


            input = sc.nextLine();
            linesCounter++;
        }
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
