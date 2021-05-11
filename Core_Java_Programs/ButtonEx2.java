//Java AWT Button Example with ActionListener
package Com.Mkpits.Java.AWT.CheckBoxButtonLableTextArea;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEx2 {
    public static void main (String arg[]){
        Frame f=new Frame();

        final TextField tf=new TextField();
        tf.setBounds(50,50,150,20);

        Button b=new Button("click me");
        b.setBounds(50,100,60,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("WellCome to Javapoint");
            }
        });
            f.add(tf);f.add(b);
            f.setSize(300,300);
            f.setLayout(null);
            f.setVisible(true);
    }
}
