package laboratory7;

public class Square extends Figure {
    double side;

    public Square(double side) {
        this.side = side;
    }

    double getArea() {
        return side * side;
    }

    double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square with side " + side;
    }
}
