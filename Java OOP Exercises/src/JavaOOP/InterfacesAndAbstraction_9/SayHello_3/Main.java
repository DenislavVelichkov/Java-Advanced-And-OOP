package JavaOOP.InterfacesAndAbstraction_9.SayHello_3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Bulgarian bg = new Bulgarian("Bg");
        European eu = new European("Eu");
        Chinese ch = new Chinese("Ch");

        List<Person> people = new ArrayList<>();
        people.add(bg);
        people.add(eu);
        people.add(ch);

        for (Person person : people) {
            System.out.println(person.sayHello());
        }
    }
}
