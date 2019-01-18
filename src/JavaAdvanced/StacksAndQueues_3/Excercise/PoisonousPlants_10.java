package JavaAdvanced.StacksAndQueues_3.Excercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PoisonousPlants_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int plantsCount = Integer.parseInt(sc.nextLine());
        String[] inputPasticide = sc.nextLine().split("\\s+");
        ArrayDeque<Integer> plants = new ArrayDeque<>();
        plants.push(Integer.valueOf(inputPasticide[0]));
        int daysCounter = 0;
        for (int i = 1; i < plantsCount; i++) {

            if (Integer.parseInt(inputPasticide[i]) > plants.peek()) {
                plants.push(Integer.valueOf(inputPasticide[i]));
                daysCounter++;
                plants.pop();
            } else {
                plants.push(Integer.valueOf(inputPasticide[i]));
                daysCounter--;
            }
        }

        if (daysCounter == 0) {
            daysCounter = 1;
        }
        System.out.println(daysCounter);

    }
}
