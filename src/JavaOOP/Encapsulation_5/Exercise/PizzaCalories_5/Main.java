package JavaOOP.Encapsulation_5.Exercise.PizzaCalories_5;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");
        String pizzaName = input[1];
        int toppingsQuantity = Integer.parseInt(input[2]);
        Pizza pizza = null;

        try {
            pizza = new Pizza(pizzaName, toppingsQuantity);
        } catch (InvalidParameterException e) {
            System.out.println(e.getMessage());
            return;
        }

        String[] doughType = sc.nextLine().split("\\s+");
        String doughName = doughType[1];
        String bakingTechnique = doughType[2];
        int doughWeight = Integer.parseInt(doughType[3]);
        Dough dough = null;

        try {
            dough = new Dough(doughName, bakingTechnique, doughWeight);
            pizza.setDough(dough);

        } catch (InvalidParameterException e) {
            System.out.println(e.getMessage());
            return;
        }


        String toppingsInput = sc.nextLine();

            while (!toppingsInput.equals("END")) {
                String[] tokens = toppingsInput.split("\\s+");
                String toppingType = tokens[1];
                int toppingWeight = Integer.parseInt(tokens[2]);

                Topping topping = null;

                if (pizza.getToppings().size() == toppingsQuantity) {
                    break;
                }

                try {
                    topping = new Topping(toppingType, toppingWeight);
                    pizza.addTopping(topping);
                } catch (InvalidParameterException e) {
                    System.out.println(e.getMessage());
                    return;
                }

                toppingsInput = sc.nextLine();
            }


        System.out.println(pizza);
    }
}
