package laboratory8;

public class Parallepiped implements GeometricBody {
    double side1;
    double side2;
    double side3;

    public Parallepiped(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSurface() {
        return 2 * (side1 * side2 + side1 * side3 + side2 * side3);
    }

    public double getVolume() {
        return side1 * side2 * side3;
    }

    @Override
    public String toString() {
        return "Parallepiped with sides: " + side1 + ", " + side2 + ", " + side3 + ".";
    }
}
