//Java FileInputStream example 1: read single character
package Com.Mkpits.Java.AWT.AwtInputOutput_13May;
import java.io.FileInputStream;
public class AwtInputEx1 {
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("D:\\testout.txt");
            int i=fin.read();
            System.out.print((char)i);

            fin.close();
        }catch(Exception e){System.out.println(e);}

    }
}
