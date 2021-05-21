//Example of BufferedOutputStream class:
package Com.Mkpits.Java.AWT.AwtInputOutput_13May;
import java.io.*;
public class AwtBufferedOutputStreamEx {
    public static void main(String args[])throws Exception{

        FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Welcome to mkpits.";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}
