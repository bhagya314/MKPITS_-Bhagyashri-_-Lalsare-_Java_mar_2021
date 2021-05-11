//Java AWT Button Example
package Com.Mkpits.Java.AWT.CheckBoxButtonLableTextArea;
import java.awt.*;
public class ButtonEx1 {
    public static void main(String arg []){
        Frame f=new Frame();
        Button b=new Button("click me");
        b.setBounds(50,100,80,30);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
