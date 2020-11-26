package laboratory6.Var;

public class FullName {
    String givenName;
    String middleName;
    String familyName;

    public void setFullName(String givenName, String middleName, String familyName){
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
    }
    public void printFullName(){
        System.out.println(givenName + " "+ middleName +" "+ familyName);
    }
}
