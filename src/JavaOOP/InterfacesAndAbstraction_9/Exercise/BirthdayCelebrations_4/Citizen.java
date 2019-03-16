package JavaOOP.InterfacesAndAbstraction_9.Exercise.BirthdayCelebrations_4;

public class Citizen implements Person, Identifiable, Birthable {
    private String name;
    private int age;
    private String id;
    private String birthDate;

    public Citizen(String name, int age, String id, String birthdate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthdate;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }


    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.getName() + "\\n" +
                this.getAge() + "\\n" +
                this.getId() + "\\n" +
                this.getBirthDate();
    }
}
