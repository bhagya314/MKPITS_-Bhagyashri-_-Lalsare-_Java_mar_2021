//example of String Buffer
package Com.mkpits.java.StringBufferAndStringBuilder;

public class StringBufferEx4
{
    public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer("Hello");
        sb.replace(1,3,"java");
        System.out.println(sb);
    }
}
