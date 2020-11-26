package laboratory7;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Rectangle(5,6));
        figures.add(new Rectangle(5,7));
        figures.add(new Rectangle(8,9));
        figures.add(new Square(8));
        figures.add(new Triangle(3,4,5));

        FigureController.compareA(figures);
        FigureController.compareP(figures);

        Figure Circle = new Figure(){
            double radius=8;
            double pi = 3.14;
            double getArea() {
                return pi*radius*radius;
            }

            double getPerimeter() {
                return 2*pi*radius;
            }
            @Override
            public String toString(){
                return "Circle with radius " + radius;
            }
        };
        System.out.println(Circle.getArea());
        System.out.println(Circle.getPerimeter());

        figures.add(Circle);
        FigureController.compareA(figures);

    }
}
