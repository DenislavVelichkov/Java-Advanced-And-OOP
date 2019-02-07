package JavaAdvanced.DefiningClasses_13.Exercise.Google_7;

public class Car {
    public String carModel;
    public String carSpeed;

    public Car(String carModel, String carSpeed) {
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        return String.join(" ", this.carModel, this.carSpeed);
    }
}
