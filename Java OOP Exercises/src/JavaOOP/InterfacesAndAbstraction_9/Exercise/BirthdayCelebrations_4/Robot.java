package JavaOOP.InterfacesAndAbstraction_9.Exercise.BirthdayCelebrations_4;

public class Robot implements Identifiable {
    private String model;
    private String id;

    public Robot(String name, String model) {
        this.id = name;
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
