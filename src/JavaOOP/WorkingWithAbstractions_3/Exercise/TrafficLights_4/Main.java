package JavaOOP.WorkingWithAbstractions_3.Exercise.TrafficLights_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] initStates = sc.nextLine().split("\\s+");

        int updateStates = Integer.parseInt(sc.nextLine());
        ArrayList<TrafficLight> trafficLights = new ArrayList<>();

        for (String initState : initStates) {
            TrafficLight trafficLight = new TrafficLight(LightStates.valueOf(initState));
            trafficLights.add(trafficLight);
        }

        while (updateStates-- > 0) {
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.update();
                System.out.print(trafficLight + " ");
            }

            System.out.println();
        }
    }
}
