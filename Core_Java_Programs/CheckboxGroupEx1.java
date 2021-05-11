//Java AWT CheckboxGroup Example
package Com.Mkpits.Java.AWT.CheckBoxButtonLableTextArea;
import java.awt.*;
public class CheckboxGroupEx1 {
    CheckboxGroupEx1(){
        Frame f=new Frame("Check Box Group Example");
        CheckboxGroup cbg=new CheckboxGroup();
        Checkbox c1=new Checkbox("c++",cbg,false);
        c1.setBounds(50,50,100,100);

        Checkbox c2=new Checkbox("java",cbg,true);
        c2.setBounds(100,150,50,50);

        f.add(c1);f.add(c2);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String arg[]){
        new CheckboxGroupEx1();
    }
}
