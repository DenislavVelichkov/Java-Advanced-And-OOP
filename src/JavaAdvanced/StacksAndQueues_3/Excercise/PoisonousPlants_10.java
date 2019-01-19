package JavaAdvanced.StacksAndQueues_3.Excercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PoisonousPlants_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int plantsCount = Integer.parseInt(sc.nextLine());
        String[] inputPasticide = sc.nextLine().split("\\s+");
        ArrayDeque<Integer> plants = new ArrayDeque<>();
        ArrayDeque<Integer> plantAboutToDie = new ArrayDeque<>();
        ArrayDeque<Integer> cycleDeque = new ArrayDeque<>();
        plants.push(Integer.valueOf(inputPasticide[0]));

        int daysCounter = 0;
        for (int i = 1; i < plantsCount; i++) {
            if (Integer.parseInt(inputPasticide[i]) > plants.peek()) {
                plants.push(Integer.valueOf(inputPasticide[i]));
                plantAboutToDie.addFirst(Integer.valueOf(inputPasticide[i]));
            } else {
                plants.push(Integer.valueOf(inputPasticide[i]));
            }
        }

        do {
            int reShuffle = 0;
            for (Integer plant : plants) {

                if (plant.equals(plantAboutToDie.peek())) {
                    plantAboutToDie.remove();
                    plants.pop();
                } else if (!plantAboutToDie.isEmpty()) {
                    reShuffle = plants.pop();
                    if (cycleDeque.isEmpty()) {
                        cycleDeque.add(reShuffle);
                    } else if (reShuffle < cycleDeque.peek()) {
                        cycleDeque.addLast(reShuffle);
                        if (!plantAboutToDie.peek().equals(cycleDeque.peek())) {
                            plantAboutToDie.addLast(cycleDeque.peek());
                        }
                    } else {
                        cycleDeque.addFirst(reShuffle);
                    }
                } else {
                    plants.pop();
                }
            }
            if (plants.size() == 0) {
                plants = cycleDeque;
            }

            daysCounter++;
        } while (!plantAboutToDie.isEmpty());

        System.out.println(daysCounter);
    }
}
