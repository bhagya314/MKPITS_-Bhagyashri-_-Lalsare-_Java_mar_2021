//Java FileWriter Example , In this example, we are writing the data in the file
// testout.txt using Java FileWriter class.
package Com.Mkpits.Java.AWT.May17;
import java.io.FileWriter;
public class FileWriterEx {
    public static void main(String args[]){
        try{
            FileWriter fw=new FileWriter("D:\\testout.txt");
            fw.write("Welcome to mkpits.");
            fw.close();

        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }
}
