package JavaAdvanced.DefiningClasses_13.Exercise.SpeedRacing_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");

            String model = tokens[0];
            double fuel = Double.parseDouble(tokens[1]);
            double consumption = Double.parseDouble(tokens[2]);

            Car car = new Car(model, fuel, consumption);
            cars.put(model, car);
        }

        String line = reader.readLine();
        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");

            String model = tokens[1];
            int distance = Integer.parseInt(tokens[2]);

            if (!cars.get(model).drive(distance)){
                System.out.println("Insufficient fuel for the drive");
            }

            line = reader.readLine();
        }
        for (String model : cars.keySet()) {
            System.out.println(cars.get(model).getInfo());
        }
    }
}
