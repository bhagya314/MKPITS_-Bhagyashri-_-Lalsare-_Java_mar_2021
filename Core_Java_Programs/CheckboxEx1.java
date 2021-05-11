//Java AWT Checkbox Example

package Com.Mkpits.Java.AWT.CheckBoxButtonLableTextArea;
import java.awt.*;
public class CheckboxEx1 {
    CheckboxEx1(){
        Frame f= new Frame("Checkbox Example");

        Checkbox checkbox1 = new Checkbox("C++");
        checkbox1.setBounds(100,100, 50,50);
        f.add(checkbox1);

        Checkbox checkbox2 = new Checkbox("Java", true);
        checkbox2.setBounds(100,150, 50,50);
        f.add(checkbox2);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new CheckboxEx1();
    }
}
