package JavaOOP.InterfacesAndAbstraction_9.SayHello_3;

public class Bulgarian extends BasePerson {
    Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
