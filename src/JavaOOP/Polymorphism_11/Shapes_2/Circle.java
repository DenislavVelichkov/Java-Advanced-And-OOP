package JavaOOP.Polymorphism_11.Shapes_2;

public class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
        this.setRadius(radius);
        this.calculatePerimeter();
        this.calculateArea();

    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public final Double getRadius() {
        return this.radius;
    }

    @Override
    protected void calculatePerimeter() {

    }

    @Override
    public void calculateArea() {

    }
}
