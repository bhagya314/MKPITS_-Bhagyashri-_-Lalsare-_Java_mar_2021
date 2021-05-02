//examplr of String Buffer
package Com.mkpits.java.StringBufferAndStringBuilder;

public class StringBufferEx2
{
    public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer("hello");//now orignal string changed
        sb.insert(1,"java");
        System.out.println(sb);

    }
}
