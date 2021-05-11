//AWT example,table
package Com.Mkpits.Java.AWT.AwtEx_5May;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class AwtEx5May_5 {
    AwtEx5May_5(){
        JFrame f=new JFrame("welcome");
        JLabel l1=new JLabel("enter number : ");
        l1.setBounds(10,50,100,30);
        f.add(l1);

        JTextField tf=new JTextField();
        tf.setBounds(110,50,100,30);
        f.add(tf);

        JTextArea t2=new JTextArea("Answer : ");
        t2.setBounds(50,150,100,200);
        f.add(t2);

        JButton b=new JButton("table");
        b.setBounds(50,100,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                int num=0,i,res=0;
                num=(Integer.parseInt(tf.getText()));
                for (i=1;i<=10;i++)
                {
                    res=num*i;
                    sb.append(num + "*" + i + "=" + res + "\n");
                }
                t2.setText(sb.toString());
            }
        });
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        AwtEx5May_5 a=new AwtEx5May_5();
    }
}
