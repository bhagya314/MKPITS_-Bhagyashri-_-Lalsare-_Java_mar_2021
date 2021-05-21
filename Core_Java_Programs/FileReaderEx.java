//Java FileReader Example
//In this example, we are reading the data from the text file testout.txt using Java FileReader class.
package Com.Mkpits.Java.AWT.May17;
import java.io.FileReader;
public class FileReaderEx {
    public static void main(String args[])throws Exception{
        FileReader fr=new FileReader("D://bhagya//testout.txt");
        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();

    }
}
