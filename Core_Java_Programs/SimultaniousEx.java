//simultanious writing and reading data from a file
package Com.Mkpits.Java.AWT.May17;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class SimultaniousEx {
    public static void main(String[] arg) {
        try {

            //Data to write in File using PrintWriter
            PrintWriter writer1 =null;
            writer1 = new PrintWriter(new File("d:\\testout.txt"));
            writer1.write("oracle microsoft java vc.");
            writer1.flush();
            writer1.close();

            // to read data
            FileReader fr=new FileReader("d:\\testout.txt");
            int i;
            while((i=fr.read())!=-1)
                System.out.print((char)i);
            fr.close();

        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }
}
