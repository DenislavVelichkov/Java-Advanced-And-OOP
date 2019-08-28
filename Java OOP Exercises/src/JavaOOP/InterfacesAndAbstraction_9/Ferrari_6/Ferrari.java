package JavaOOP.InterfacesAndAbstraction_9.Ferrari_6;

public class Ferrari implements Car {
    private String driverName;
    private String model;

    public Ferrari(String model) {
        this.model = model;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "Zadu6avam sA!";
    }
/*<model>/<brakes>/<gas pedal>/<driver's name>*/
    @Override
    public String toString() {
        return this.model +
                "/" +
                this.brakes() +
                "/" +
                this.gas() +
                "/" +
                this.driverName;
    }
}
