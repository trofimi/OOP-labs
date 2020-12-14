package laboratory8;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<GeometricBody> bodies = new ArrayList<>();
        bodies.add(new Cub(5));
        bodies.add(new Parallepiped(1000, 7, 8));
        bodies.add(new Sphere(15));
        bodies.add(new Cub(2));
        bodies.add(new Parallepiped(200, 20, 20));

        GeometricBodyController.biggestSurface(bodies);
        GeometricBodyController.biggestVolume(bodies);

    }
}
