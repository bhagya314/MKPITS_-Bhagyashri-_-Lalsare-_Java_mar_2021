//Java AWT Toolkit Example: Change TitleBar Icon
package Com.Mkpits.Java.AWT.ListPanelMenuToolKit;
import java.awt.*;
public class AwtToolkitEx3 {
    AwtToolkitEx3(){
        Frame f=new Frame();
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\logo.png");
        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main(String args[]){
        new AwtToolkitEx3();
    }
}


