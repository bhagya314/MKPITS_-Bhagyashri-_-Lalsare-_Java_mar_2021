//Java AWT TextArea Example-AWT TextArea Class Declaration
package Com.Mkpits.Java.AWT.CheckBoxButtonLableTextArea;
import java.awt.*;
public class TextAreaEx3 {
    TextAreaEx3(){
        Frame f= new Frame();
        TextArea area=new TextArea("Welcome ");
        area.setBounds(10,30, 300,300);
        f.add(area);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new TextAreaEx3();
    }
}
