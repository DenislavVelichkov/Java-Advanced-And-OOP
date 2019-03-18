package JavaOOP.Polymorphism_11.Exercise.Vehicles_1;

public class Car extends Vehicle{

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    protected void refuel(double fuel) {
        this.setFuelQuantity(this.getFuelQuantity() + fuel);
    }

    @Override
    protected void drive(double distance) {
        double requiredFuel = distance * this.getFuelConsumption();
        if (requiredFuel > this.getFuelQuantity()) {
            throw new IllegalArgumentException("Car needs refueling");
        }

        this.setFuelQuantity(this.getFuelQuantity() - requiredFuel);
    }

}