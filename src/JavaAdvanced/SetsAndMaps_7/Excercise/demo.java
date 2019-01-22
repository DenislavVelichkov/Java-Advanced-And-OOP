package JavaAdvanced.SetsAndMaps_7.Excercise;

import java.util.HashSet;
import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        HashSet<String> parkingLot = new HashSet<>();
        while (!line.equals("END")) {
            String[] input = line.split(", ");

            switch (input[0]) {
                case "IN":
                    parkingLot.add(input[1]);
                    break;
                case "OUT":
                    parkingLot.remove(input[1]);
                    break;
                    default:
                        break;
            }

            line = sc.nextLine();
        }

        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            parkingLot.forEach(System.out::println);
        }
    }
}
