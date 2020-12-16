package laboratory9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Exception1 extends Exception {
}
class UniqueException extends Exception {
}

public class Main implements ActionListener{
    JTextField textField1,textField2,textField12, textField3;
    JButton button1;
    Main(){
        JFrame frame= new JFrame("Calculator");
        frame.getContentPane().setBackground(new Color(225, 250,225 ));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField1=new JTextField();
        textField1.setBounds(25,50,145,40);
        textField1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,25));
        textField2=new JTextField();
        textField2.setBounds(25,100,145,40);
        textField2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,25));
        textField12=new JTextField("/");
        textField12.setHorizontalAlignment(SwingConstants.CENTER);
        textField12.setBounds(195,75,20,40);
        textField12.setEditable(false);
        textField12.setBorder(null);
        textField3=new JTextField();
        textField3.setBounds(25,150,230,40);
        textField3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,25));
        textField3.setEditable(false);
        button1=new JButton("=");
        button1.setBounds(235,70,50,50);
        button1.setBackground(Color.lightGray);
        button1.addActionListener(this);
        frame.add(textField1);frame.add(textField2);frame.add(textField12);frame.add(textField3);frame.add(button1);
        frame.setSize(350,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event) {
        String s1=textField1.getText();
        String s2=textField2.getText();
        try {
            double a = Double.parseDouble(s1);
            double b = Double.parseDouble(s2);
            if ( b==0 ){
                throw new Exception1();
            }
            if ( b==13 ){
                throw new UniqueException();
            }
            double c = a / b;
            String result = String.valueOf(c);
            textField3.setText(result);
        }
        catch (ArithmeticException e1){
            String result = "Arithmetic exception";
            textField3.setText(result);
        }
        catch (NumberFormatException e2){
            String result = "Enter a number";
            textField3.setText(result);
        }
        catch (Exception1 exception1) {
            String result = "Divided by zero";
            textField3.setText(result);
        } catch (UniqueException e) {
            String result = "Unique exception";
            textField3.setText(result);
        }
    }

    public static void main(String[] args) {
        new Main();
    } }