//Java FileOutputStream example 2: write string
package Com.Mkpits.Java.AWT.AwtInputOutput_13May;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class AwtOutputEx2 {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
            String s = "welcome to mkpits";
            byte b[] = s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
