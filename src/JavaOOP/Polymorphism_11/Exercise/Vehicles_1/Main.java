package JavaOOP.Polymorphism_11.Exercise.Vehicles_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] carInput = sc.nextLine().split("\\s+");
        String[] truckInput = sc.nextLine().split("\\s+");

        Car car = new Car(Double.parseDouble(carInput[1]), Double.parseDouble(carInput[2]) + 0.9);
        Truck truck = new Truck(Double.parseDouble(truckInput[1]), Double.parseDouble(truckInput[2]) + 1.6);

        int n = Integer.parseInt(sc.nextLine());
        DecimalFormat decimalFormat;

        while (n-- > 0) {
            String[] commands = sc.nextLine().split("\\s+");
            double parameter;


            switch (commands[0]) {
                case "Drive":
                    parameter = Double.parseDouble(commands[2]);
                    decimalFormat = new DecimalFormat("0.##");
                    ;
                    if (commands[1].equals("Car")) {
                        try {
                            car.drive(parameter);
                            System.out.println(String.format("Car travelled %s km", decimalFormat.format(parameter)));

                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }

                    } else {
                        try {
                            truck.drive(parameter);
                            System.out.println(String.format("Truck travelled %s km", decimalFormat.format(parameter)));

                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case "Refuel":
                    parameter = Double.parseDouble(commands[2]);

                    if (commands[1].equals("Car")) {
                        car.refuel(parameter);
                    } else {
                        truck.refuel(parameter);
                    }
                    break;

            }
        }

        decimalFormat = new DecimalFormat("0.00");
        double carFinalFuelCapacity = car.getFuelQuantity();
        double truckFinalFuelCapacity = truck.getFuelQuantity();

        System.out.printf("Car: %s%n", decimalFormat.format(carFinalFuelCapacity));
        System.out.printf("Truck: %s", decimalFormat.format(truckFinalFuelCapacity));
    }
}