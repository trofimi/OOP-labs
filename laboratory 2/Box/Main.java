class Box {
    public int height;
    public int width;
    public int depth;

    public Box(){
        height = 1;
        width = 1;
        depth = 1;
    }
    public Box(int value){
        height = value;
        width = value;
        depth = value;
    }
    public Box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public int area(){
        return 2*(height*width+height*depth+width*depth);
    }
    public int volume(){
        return height*width*depth;
    }
}

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(2);
        Box box3 = new Box(3,5,7);

        System.out.println("Area = " + box1.area());
        System.out.println("Area = " + box2.area());
        System.out.println("Area = " + box3.area());

        System.out.println("Volume = " + box1.volume());
        System.out.println("Volume = " + box2.volume());
        System.out.println("Volume = " + box3.volume());
    }
}
