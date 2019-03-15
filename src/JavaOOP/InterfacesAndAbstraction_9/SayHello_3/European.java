package JavaOOP.InterfacesAndAbstraction_9.SayHello_3;

public class European extends BasePerson {
    public European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
