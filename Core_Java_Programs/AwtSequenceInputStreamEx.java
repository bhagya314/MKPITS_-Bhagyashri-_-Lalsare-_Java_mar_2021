//In this example, we are printing the data of two files testin.txt and testout.txt.
package Com.Mkpits.Java.AWT.AwtInputOutput_13May;
import java.io.*;
public class AwtSequenceInputStreamEx {
    public static void main(String args[])throws Exception{
        FileInputStream input1=new FileInputStream("D://bhagya//testin.txt");
        FileInputStream input2=new FileInputStream("D://bhagya//testout.txt");
        SequenceInputStream inst=new SequenceInputStream(input1, input2);
        int j;

        while((j=inst.read())!=-1){
            System.out.print((char)j);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}
