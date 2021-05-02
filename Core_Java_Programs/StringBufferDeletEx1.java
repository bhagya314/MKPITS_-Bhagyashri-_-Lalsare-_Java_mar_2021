//Example String Buffer Delet
package Com.mkpits.java.StringBufferAndStringBuilder;

public class StringBufferDeletEx1
{
    public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer("hello");
        sb.delete(1,3);
        System.out.println(sb);
    }
}
