package laboratory7;
import java.util.ArrayList;

public class FigureController {

    static void compareA(ArrayList<Figure> figures) {
        Figure biggest = figures.get(0);
        for (int x = 1; x < figures.size(); x++) {
            if (figures.get(x).getArea() < figures.get(x - 1).getArea())
                biggest = figures.get(x - 1);
            else biggest = figures.get(x);
        }
        System.out.println("The figure with biggest area: " + biggest);
    }

    static void compareP(ArrayList<Figure> figures) {
        Figure biggest = figures.get(0);
        for (int x = 1; x < figures.size(); x++) {
            if (figures.get(x).getPerimeter() < figures.get(x - 1).getPerimeter())
                biggest = figures.get(x - 1);
            else biggest = figures.get(x);
        }
        System.out.println("The figure with biggest perimeter: " + biggest);
    }

}
