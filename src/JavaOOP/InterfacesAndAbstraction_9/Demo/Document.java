package JavaOOP.InterfacesAndAbstraction_9.Demo;

public class Document implements Printable, Readable {

    @Override
    public void print() {
        System.out.println("Hello Document");
    }

    @Override
    public void read() {
        System.out.println("Read Document");
    }

    @Override
    public int readBytes() {
        return 115;
    }
}
