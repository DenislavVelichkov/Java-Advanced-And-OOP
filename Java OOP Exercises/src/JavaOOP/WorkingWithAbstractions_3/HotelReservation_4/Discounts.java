package JavaOOP.WorkingWithAbstractions_3.HotelReservation_4;

public enum Discounts {
    VIP(0.20),
    SecondVisit(0.10),
    None(0);

    private double value;
    Discounts(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }
}
