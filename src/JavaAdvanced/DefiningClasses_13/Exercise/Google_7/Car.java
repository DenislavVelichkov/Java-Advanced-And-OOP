package JavaAdvanced.DefiningClasses_13.Exercise.Google_7;

public class Car {
    public String carModel;
    public int carSpeed;

    public Car(String carModel, int carSpeed) {
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        return String.join(" ", this.carModel, String.valueOf(this.carSpeed));
    }
}
