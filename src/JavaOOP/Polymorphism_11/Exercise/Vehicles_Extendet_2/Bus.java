package JavaOOP.Polymorphism_11.Exercise.Vehicles_Extendet_2;

public class Bus extends VehicleImpl {
    private boolean isEmpty = true;

    public Bus(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption) {
        if (this.isEmpty) {
            super.setFuelConsumption(fuelConsumption);
        } else {
            super.setFuelConsumption(fuelConsumption + 1.4);
        }
    }

    @Override
    public String drive(double distance) {

        return "Bus " + super.drive(distance);
    }

}
