package JavaAdvanced.DefiningClasses_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class demo {

    static class Car {
        String make;
        String model;
        int horsePower;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Car car = new Car();
        car.make = "VW";
        car.model = "Golf ||";
        car.horsePower = 100;

        System.out.printf("Make: %s Model: %s HP: %d", car.make, car.model, car.horsePower);
    }
}
