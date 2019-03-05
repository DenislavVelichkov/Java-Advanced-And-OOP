package JavaOOP.WorkingWithAbstractions_3.HotelReservation_4;

public class CommandParser {
    private double pricePerDay;
    private int numberOfDays;
    private int seasonMultyplicator;
    private double discountType;

    public CommandParser(String[] input) {
        this.pricePerDay = Double.parseDouble(input[0]);
        this.numberOfDays = Integer.parseInt(input[1]);
        this.setSeasonMultiplicator(input[2]);
        this.setDiscountType(input[3]);
    }

    public double getPricePerDay() {
        return this.pricePerDay;
    }

    public int getNumberOfDays() {
        return this.numberOfDays;
    }

    public int getSeasonMultyplicator() {
        return this.seasonMultyplicator;
    }

    public double getDiscountType() {
        return this.discountType;
    }

    private void setDiscountType(String discountType) {
        Discounts discount = Discounts.valueOf(discountType);
        this.discountType = discount.getValue();
    }

    private void setSeasonMultiplicator(String season) {
        Season multiplicator = Season.valueOf(season);
        this.seasonMultyplicator = multiplicator.getValue();
    }

}
