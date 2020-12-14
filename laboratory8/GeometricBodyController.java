package laboratory8;

import java.util.ArrayList;

public class GeometricBodyController {

    static void biggestSurface(ArrayList<GeometricBody> body) {
        GeometricBody biggest = body.get(0);
        for (int x = 0; x < body.size(); x++) {
            if (biggest.getSurface() < body.get(x).getSurface())
                biggest = body.get(x);
        }
        System.out.println("The shape with the biggest surface area: " + biggest);
    }

    static void biggestVolume(ArrayList<GeometricBody> body) {
        GeometricBody biggest = body.get(0);
        for (int x = 0; x < body.size(); x++) {
            if (biggest.getVolume() < body.get(x).getVolume())
                biggest = body.get(x);
        }
        System.out.println("The shape with the biggest volume: " + biggest);
    }

}
