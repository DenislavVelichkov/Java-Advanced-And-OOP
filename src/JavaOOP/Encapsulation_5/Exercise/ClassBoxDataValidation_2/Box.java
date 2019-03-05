package JavaOOP.Encapsulation_5.Exercise.ClassBoxDataValidation_2;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getLength() {
        return this.length;
    }

    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException(
                    "Length cannot be zero or negative."
            );
        }
    }

    public double getWidth() {
        return this.width;
    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException(
                    "Width cannot be zero or negative."
            );
        }
    }

    public double getHeight() {
        return this.height;
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException(
                    "Height cannot be zero or negative."
            );
        }
    }

    public double calculateSurfaceArea() {
        return (2 * (this.length * this.width))
                + (2 * (this.length * this.height))
                + (2 * (this.width * this.height));
    }

    public double calculateLateralSurfaceArea() {
        return (2 * (this.length * this.height))
                + (2 * (this.width * this.height));
    }

    public double calculateVolume() {
        return this.length
                * this.width
                * this.height;
    }

}