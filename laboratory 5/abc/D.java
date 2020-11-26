package laboratory5.abc;

public class D extends C {
    protected String d = "d";
    protected X x = new X("xd");

    public D() {
        System.out.println(d);
    }
    public D(String d, X x) {
        this.d = d;
        this.x = x;
        System.out.println(d);
        System.out.println(x.name);

    }
}