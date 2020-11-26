package laboratory5.abc;

public class A{
    protected String a = "a******";
    protected X x = new X("xa");
    A(){
        System.out.println(a);
    }
    public A(String a, X x){
        this.a = a;
        this.x = x;
        System.out.println(a);
        System.out.println(x.name);
    }
}
