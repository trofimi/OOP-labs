package laboratory6;
import laboratory6.Var.*;
import java.util.ArrayList;
import java.util.Date;

public class Patient extends Person {
    public String id;
    public FullName name;
    public Gender gender;
    public int age;
    public Date accepted;
    public History history;
    public ArrayList<String> prescriptions= new ArrayList<>();
    public ArrayList<String> allergies = new ArrayList<>();
    public ArrayList<String> specialReqs = new ArrayList<>();

}
