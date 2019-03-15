package JavaOOP.InterfacesAndAbstraction_9.Drawing_0;

public class Main {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4, 5);

        rect.draw();

        System.out.println(rect.toString());

        System.out.println();

        Square sq = new Square(5);
        System.out.println(sq.toString());
    }
}
