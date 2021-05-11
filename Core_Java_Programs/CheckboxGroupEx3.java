//Java AWT CheckboxGroup Example with ItemListener

package Com.Mkpits.Java.AWT.CheckBoxButtonLableTextArea;
import java.awt.*;
import java.awt.event.*;
public class CheckboxGroupEx3 {
    CheckboxGroupEx3(){
        Frame f= new Frame("CheckboxGroup Example");

        final Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
        f.add(label);

        CheckboxGroup cbg = new CheckboxGroup();

        Checkbox checkBox1 = new Checkbox("C++", cbg, false);
        checkBox1.setBounds(100,100, 50,50);
        f.add(checkBox1);

        Checkbox checkBox2 = new Checkbox("Java", cbg, false);
        checkBox2.setBounds(100,150, 50,50);
        f.add(checkBox2);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        checkBox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("C++ checkbox: Checked");
            }
        });
        checkBox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("Java checkbox: Checked");
            }
        });
    }
    public static void main(String args[])
    {
        new CheckboxGroupEx3();
    }
}
