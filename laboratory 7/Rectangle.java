package laboratory7;

public class Rectangle extends Figure {
    double side1;
    double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    double getArea() {
        return side1 * side2;
    }

    double getPerimeter() {
        return 2 * (side1 + side2);
    }

    @Override
    public String toString() {
        return "Rectangle with sides " + side1 + ", " + side2;
    }
}
