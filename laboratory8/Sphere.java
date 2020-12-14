package laboratory8;

public class Sphere implements GeometricBody {
    double radius;
    double pi = 3.14;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getSurface() {
        return 4 * radius * radius * pi;
    }

    public double getVolume() {
        return (4 * pi * radius * radius * radius) / 3;
    }

    @Override
    public String toString() {
        return "Sphere with radius " + radius;
    }

}
