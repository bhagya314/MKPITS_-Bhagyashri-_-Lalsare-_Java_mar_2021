//example of String Builder Replace
package Com.mkpits.java.StringBufferAndStringBuilder;

public class StringBuilderReplaceEx2
{
    public static void main(String[] args)
    {
        StringBuilder sb=new StringBuilder("hello");
        sb.replace(1,3,"java");
        System.out.println(sb);
    }
}
