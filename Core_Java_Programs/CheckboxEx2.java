//Java AWT Checkbox Example with ItemListener
package Com.Mkpits.Java.AWT.CheckBoxButtonLableTextArea;
import java.awt.*;
import java.awt.event.*;
public class CheckboxEx2 {
    CheckboxEx2(){
        Frame f= new Frame("CheckBox Example");

        final Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
        f.add(label);

        Checkbox checkbox1 = new Checkbox("C++");
        checkbox1.setBounds(100,100, 50,50);
        f.add(checkbox1);

        Checkbox checkbox2 = new Checkbox("Java");
        checkbox2.setBounds(100,150, 50,50);
        f.add(checkbox2);

        checkbox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("C++ Checkbox: " + (e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        checkbox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("Java Checkbox: " + (e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new CheckboxEx2();
    }
}
