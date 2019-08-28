package JavaOOP.Polymorphism_11.Exercise.Vehicles_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] carInput = sc.nextLine().split("\\s+");
        String[] truckInput = sc.nextLine().split("\\s+");

        Car car = new Car(Double.parseDouble(carInput[1]), Double.parseDouble(carInput[2]));
        Truck truck = new Truck(Double.parseDouble(truckInput[1]), Double.parseDouble(truckInput[2]));

        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String[] commands = sc.nextLine().split("\\s+");
            double parameter;


            switch (commands[0]) {
                case "Drive":
                    parameter = Double.parseDouble(commands[2]);

                    if (commands[1].equals("Car")) {
                        System.out.println(car.drive(parameter));
                    } else {
                        System.out.println(truck.drive(parameter));
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


        System.out.println(car);
        System.out.println(truck);
    }
}