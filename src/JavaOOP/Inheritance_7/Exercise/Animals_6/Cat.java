package JavaOOP.Inheritance_7.Exercise.Animals_6;

public class Cat extends Animal {

    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }
@Override
    protected void setGender(String gender) {
        super.setGender(gender);
    }
    @Override
    protected String produceSound() {
        return "MiauMiau";
    }


}
