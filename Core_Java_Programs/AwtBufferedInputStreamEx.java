//the simple example to read data of file using BufferedInputStream:
package Com.Mkpits.Java.AWT.AwtInputOutput_13May;
import java.io.*;
public class AwtBufferedInputStreamEx {
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("D:\\testout.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
