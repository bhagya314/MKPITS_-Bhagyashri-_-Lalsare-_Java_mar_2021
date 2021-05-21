//Example of CharArrayWriter Class:
package Com.Mkpits.Java.AWT.May17;
import java.io.CharArrayWriter;
import java.io.FileWriter;
public class CharArrayWriterEx {
    public static void main(String args[])throws Exception{
        CharArrayWriter out=new CharArrayWriter();
        out.write("Welcome to mkpits");
        FileWriter f1=new FileWriter("D://bhagya//a.txt");
        FileWriter f2=new FileWriter("D://bhagya//b.txt");
        FileWriter f3=new FileWriter("D://bhagya//c.txt");
        FileWriter f4=new FileWriter("D://bhagya//d.txt");
        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);
        out.writeTo(f4);
        f1.close();
        f2.close();
        f3.close();
        f4.close();
        System.out.println("Success...");
    }
}
