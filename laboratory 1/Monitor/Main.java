class Monitor {
    String color;
    int dimensions;
    int resolution;

    public Monitor(String newColor, int newDimensions, int newResolution) {
        color = newColor;
        dimensions = newDimensions;
        resolution = newResolution;
    }
}

public class Main {
    public static void main(String[] args) {

        Monitor monitor1 = new Monitor("black", 27, 1080);
        Monitor monitor2 = new Monitor("white", 32, 1080);

        if (monitor1.color.equals(monitor2.color)) {
            System.out.println("Same color");
        } else {
            System.out.println("Different color");
        }

        if (monitor1.dimensions > monitor2.dimensions) {
            System.out.println("Monitor 1 dimensions are bigger");
        } else if(monitor1.dimensions == monitor2.dimensions){
            System.out.println("Monitor dimensions are equal");
        }else System.out.println("Monitor 2 dimensions are bigger");

        if (monitor1.resolution > monitor2.resolution) {
            System.out.println("Monitor 1 resolution is better");
        } else if(monitor1.resolution == monitor2.resolution){
            System.out.println("Monitor resolutions are equal");
        }else System.out.println("Monitor 2 resolution is better");
    }
}
