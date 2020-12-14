package laboratory8;

public class Cub implements GeometricBody {
    double side;

    public Cub(double side) {
        this.side = side;
    }

    public double getSurface() {
        return 6 * side * side;
    }

    public double getVolume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return "Cube with side " + side;
    }

}
