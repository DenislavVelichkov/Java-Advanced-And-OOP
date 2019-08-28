package JavaOOP.InterfacesAndAbstraction_9.Drawing_0;

public class Square extends Rectangle {
    public Square(int height) {
        super(height, height);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.3;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        System.out.println(this.getClass().getSimpleName());

        return "Square";
    }
}
