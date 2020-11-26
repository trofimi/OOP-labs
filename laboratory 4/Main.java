import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.*;

public class Main {
    static boolean checkExpression(String str)
    {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++)
        { char x = str.charAt(i);
        if (x == '(' || x == '[' || x == '{')  stack.push(x);
        else if(x == ']' || x == '}' || x == ')') {
            if (stack.isEmpty()) return false;
            switch (x) {
                case ')': if (stack.pop() != '(') return false;
                break;
                case '}': if (stack.pop() != '{') return false;
                break;
                case ']': if (stack.pop() != '[') return false;
                break;
                }
            }
        }
        return (stack.isEmpty());
    }
    public static void main(String[] args) {
        System.out.println("Name of the file?");
        Scanner scan = new Scanner(System.in);
        String fileIn = scan.nextLine();
        try {
            Path path = FileSystems.getDefault().getPath(fileIn); //works in console
            File myObj = new File(String.valueOf(path)); //works in console
            //File myObj = new File("A:\\ASUS VivoBook\\IdeaProjects\\test\\src\\"+fileIn); //works in IDE
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (checkExpression(data)) System.out.println("Expression is correct");
                else System.out.println("Expression is not correct");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}