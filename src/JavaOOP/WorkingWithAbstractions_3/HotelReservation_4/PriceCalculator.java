package JavaOOP.WorkingWithAbstractions_3.HotelReservation_4;

public class PriceCalculator {

    public static double calculatePrice(double pricePerDay,
                                 int daysToStay,
                                 int seasonMultyplicator,
                                 double discount) {
        double price = pricePerDay * daysToStay * seasonMultyplicator;
        double discountToBeSet = price * discount;

        return price - discountToBeSet;

    }
}
