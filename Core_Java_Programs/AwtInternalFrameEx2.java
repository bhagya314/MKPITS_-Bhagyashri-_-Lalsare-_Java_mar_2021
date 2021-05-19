//program to create multiple internal frames
package Com.Mkpits.Java.AWT.AwtInternalFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AwtInternalFrameEx2 extends JFrame {
    //frame
    static JFrame f;

    //label to display text
    static JLabel l, l1;

    //main class
    public static void main(String args[]){

        // create a new frame
        f=new JFrame("Frame");

        // set layout of frame
        f.setLayout(new FlowLayout());

        // create a internal frame
        JInternalFrame in=new JInternalFrame("internal frame 1",true, true, true, true);

        // create a internal frame
        JInternalFrame in1=new JInternalFrame("internal frame 2",true, true, true, true);

        // create a Button
        JButton b=new JButton("Button");
        JButton b1=new JButton("Button1");

        // create a label to display text
        l=new JLabel("This is a JInternal Frame no 1");
        l1=new JLabel("This is a JInternal Frame no 2");

        // create a panel
        JPanel p=new JPanel();
        JPanel p1=new JPanel();

        // add label and button to panel
        p.add(l);
        p.add(b);
        p.add(l1);
        p.add(b1);

        // set visibility internal frame
        in.setVisible(true);
        in1.setVisible(true);

        // add panel to internal frame
        in.add(p);
        in1.add(p1);

        // add internal frame to frame
        f.add(in);
        f.add(in1);

        // set the size of frame
        f.setSize(300, 300);

        f.show();
    }
}
