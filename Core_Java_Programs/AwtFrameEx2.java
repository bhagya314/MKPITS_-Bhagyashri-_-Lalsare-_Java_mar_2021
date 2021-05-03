//Simple example of AWT by association

package Com.Mkpits.Java.AWT;
import java.awt.*;
class First2 {
    First2() {
        Frame f = new Frame();

        Button b = new Button("click me");
        b.setBounds(30, 50, 80, 30);

        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);

        f.setVisible(true);
    }
}
public class AwtFrameEx2 {
    public static void main(String args[]){
        First2 f=new First2();
}
}
