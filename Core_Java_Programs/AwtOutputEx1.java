//Java FileOutputStream Example 1: write byte
package Com.Mkpits.Java.AWT.AwtInputOutput_13May;
import java.io.FileOutputStream;
public class AwtOutputEx1 {
        public static void main(String arg[]){
            try {
                FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
                fout.write(65);
                fout.close();
                System.out.println("success...");
            }catch(Exception e){System.out.println(e);}
        }
}
