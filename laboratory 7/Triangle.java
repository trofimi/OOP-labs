package laboratory7;

public class Triangle extends Figure {
    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double getArea() {
        double p = side1 + side2 + side3;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle with sides " + side1 + ", " + side2 + ", " + side3;
    }
}
