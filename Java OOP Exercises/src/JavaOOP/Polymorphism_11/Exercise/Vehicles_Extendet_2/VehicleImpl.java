package JavaOOP.Polymorphism_11.Exercise.Vehicles_Extendet_2;

import java.security.InvalidParameterException;
import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicle{
    private double fuelQuantity;
    private double fuelConsumption;
    private int tankCapacity;

    public VehicleImpl(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.setFuelConsumption(fuelConsumption);
        this.tankCapacity = tankCapacity;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String drive(double distance) {
        double fuelNeeded = distance * this.fuelConsumption;
        String result = "needs refueling";
        DecimalFormat df = new DecimalFormat("#.##");

        if (this.fuelQuantity >= fuelNeeded) {
            result = String.format("travelled %s km", df.format(distance));

            this.fuelQuantity -= fuelNeeded;
        }

        return result;
    }

    @Override
    public void refuel(double liters) {

        if (this.fuelQuantity + liters > this.tankCapacity) {
            throw new InvalidParameterException("Cannot fit fuel in tank");
        }
        if (liters <= 0) {
            throw new InvalidParameterException("Fuel must be a positive number");
        }

        this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + String.format(": %.2f", this.fuelQuantity);
    }
}