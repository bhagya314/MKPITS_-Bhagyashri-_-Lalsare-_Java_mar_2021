//Java PrintWriter Example,Let's see the simple example of writing the data on a console and
// in a text file testout.txt using Java PrintWriter class.
package Com.Mkpits.Java.AWT.May17;
import java.io.File;
import java.io.PrintWriter;
public class PrintWriterEx {
    public static void main(String[] args) throws Exception {

    //Data to write on Console using PrintWriter
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("mkpits provides tutorials of all technology.");
        writer.flush();
        writer.close();

    //Data to write in File using PrintWriter
        PrintWriter writer1 =null;
        writer1 = new PrintWriter(new File("D://bhagya//testout.txt"));
        writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");
        writer1.flush();
        writer1.close();
    }
}
