//Example of String Builder Insert
package Com.mkpits.java.StringBufferAndStringBuilder;

public class StringBuilderInsertEx1
{
    public static void main(String[] args)
    {
        StringBuilder sb=new StringBuilder("hello");
        sb.insert(1,"java");
        System.out.println(sb);
    }
}
