package JavaOOP.Polymorphism_11.Exercise.Vehicles_1;

public class Truck extends Vehicle{

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    protected void refuel(double fuel) {
        this.setFuelQuantity(this.getFuelQuantity() + fuel * 0.95);
    }

    @Override
    protected void drive(double distance) {
        double requiredFuel = distance * this.getFuelConsumption();
        if (requiredFuel > this.getFuelQuantity()) {
            throw new IllegalArgumentException("Truck needs refueling");
        }
        this.setFuelQuantity(this.getFuelQuantity() - requiredFuel);
    }

}
