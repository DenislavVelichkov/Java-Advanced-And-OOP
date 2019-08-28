package JavaOOP.Polymorphism_11.Exercise.Vehicles_Extendet_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] carInput = sc.nextLine().split("\\s+");
        String[] truckInput = sc.nextLine().split("\\s+");
        String[] busInput = sc.nextLine().split("\\s+");

        Car car = new Car(Double.parseDouble(carInput[1]), Double.parseDouble(carInput[2]), Integer.parseInt(carInput[3]));
        Truck truck = new Truck(Double.parseDouble(truckInput[1]), Double.parseDouble(truckInput[2]), Integer.parseInt(truckInput[3]));
        Bus bus = new Bus(Double.parseDouble(busInput[1]), Double.parseDouble(busInput[2]), Integer.parseInt(busInput[3]));

        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String[] commands = sc.nextLine().split("\\s+");
            double parameter;


                switch (commands[0]) {

                    case "Drive":
                        parameter = Double.parseDouble(commands[2]);
                        try {

                        if (commands[1].equals("Car")) {
                            System.out.println(car.drive(parameter));
                        } else if (commands[1].equals("Bus")) {
                            System.out.println(bus.drive(parameter));
                        } else {
                            System.out.println(truck.drive(parameter));
                        }

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                        break;
                    case "Refuel":
                        parameter = Double.parseDouble(commands[2]);

                        try {
                            if (commands[1].equals("Car")) {
                                car.refuel(parameter);
                            } else if (commands[1].equals("Bus")) {
                                bus.refuel(parameter);
                            } else {
                                truck.refuel(parameter);
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                        break;
                    case "DriveEmpty":
                        parameter = Double.parseDouble(commands[2]);
                        bus.setIsEmpty(true);

                        try {
                            System.out.println(bus.drive(parameter));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                        break;
                }

        }


        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }
}