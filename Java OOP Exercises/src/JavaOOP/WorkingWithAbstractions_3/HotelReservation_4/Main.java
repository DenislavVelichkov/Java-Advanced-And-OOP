package JavaOOP.WorkingWithAbstractions_3.HotelReservation_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");
        CommandParser commandParser = new CommandParser(input);

        System.out.printf("%.2f",PriceCalculator.calculatePrice(
                commandParser.getPricePerDay(), commandParser.getNumberOfDays()
                , commandParser.getSeasonMultyplicator(), commandParser.getDiscountType()
        ));

    }
}
