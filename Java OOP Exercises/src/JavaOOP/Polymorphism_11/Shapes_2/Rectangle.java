package JavaOOP.Polymorphism_11.Shapes_2;

public class Rectangle extends Shape{
    private Double height;
    private Double width ;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
        this.calculateArea();
        this.calculatePerimeter();
    }

    public Double getHeight() {
        return this.height;
    }

    public Double getWidth() {
        return this.width;
    }

    @Override
    protected void calculatePerimeter() {
        setPerimeter(this.height * 2 + this.width * 2);
    }

    @Override
    public void calculateArea() {
        setArea(this.height * this.width);
    }
}
