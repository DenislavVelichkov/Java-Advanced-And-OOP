package JavaOOP.InterfacesAndAbstraction_9.CarShop_1;

public class Main {

    public static void main(String[] args) {
        Seat seat = new Seat(
                "Leon",
                "gray",
                110,
                "Spain",
                35000.0);

        Audi audi = new Audi(
                "A5",
                "green",
                111,
                "Germany",
                3,
                100.0);

        printCarInfo(seat);
        printCarInfo(audi);

        System.out.println(seat.toString());
        System.out.println(audi.toString());

    }

    private static void printCarInfo(Car seat) {
        System.out.println(String.format(
                "%s is %s color and have %s horse power",
                seat.getModel(),
                seat.getColor(),
                seat.getHorsePower()));
    }
}
