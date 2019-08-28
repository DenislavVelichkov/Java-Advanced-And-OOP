package JavaOOP.Inheritance_7.Exercise.Animals_6;

public class Tomcat extends Cat{

    public Tomcat(String name, int age, String gender) {
        super(name, age, gender);
        this.setGender(gender);
    }

    @Override
    protected void setGender(String gender) {
        super.setGender(gender);

    }

    @Override
    protected String produceSound() {

        return "Give me one million b***h";
    }
    /*o	Dog: “”
o	Cat: “”
o	Frog: “”
o	Kitten: “”
o	Tomcat: “”
o	Message from the Animal class: ""
*/
}
