package JavaOOP.InterfacesAndAbstraction_9.CarShop_1;

public interface Rentable extends Car {
    Integer getMinRentDay();
    Double getPricePerDay();

    static double priceForDays(int days) {
        return days;
    }
}
