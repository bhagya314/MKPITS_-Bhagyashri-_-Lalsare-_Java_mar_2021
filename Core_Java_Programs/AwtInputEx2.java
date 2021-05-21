//Java FileInputStream example 2: read all characters
package Com.Mkpits.Java.AWT.AwtInputOutput_13May;
import java.io.FileInputStream;
public class AwtInputEx2 {
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("D:\\testout.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
