//1.Java AWT Toolkit Example
package Com.Mkpits.Java.AWT.ListPanelMenuToolKit;
import java.awt.*;
public class AwtToolkitEx1 {
    public static void main(String[] args) {
        Toolkit t = Toolkit.getDefaultToolkit();
        System.out.println("Screen resolution = " + t.getScreenResolution());
        Dimension d = t.getScreenSize();
        System.out.println("Screen width = " + d.width);
        System.out.println("Screen height = " + d.height);
    }
}
