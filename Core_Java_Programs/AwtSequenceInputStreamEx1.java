//Example that reads the data from two files and writes into another file
//In this example, we are writing the data of two files testin1.txt and testin2.txt into another file named
//testout.txt.
package Com.Mkpits.Java.AWT.AwtInputOutput_13May;
import java.io.*;
public class AwtSequenceInputStreamEx1 {
    public static void main(String args[])throws Exception{

        FileInputStream fin1=new FileInputStream("D://bhagya//testin1.txt");
        FileInputStream fin2=new FileInputStream("D:bhagya//testin2.txt");
        FileOutputStream fout=new FileOutputStream("D://bhagya//testout.txt");
        SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
        int i;
        while((i=sis.read())!=-1)
        {
            fout.write(i);
        }
        sis.close();
        fout.close();
        fin1.close();
        fin2.close();
        System.out.println("Success..");
    }
}
