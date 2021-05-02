//example of String Builder Delete
package Com.mkpits.java.StringBufferAndStringBuilder;

public class StringBuilderDeleteEx1
{
    public static void main(String[] args)
    {
        StringBuilder sb=new StringBuilder("hello");
        sb.delete(1,3);
        System.out.println(sb);
    }
}
