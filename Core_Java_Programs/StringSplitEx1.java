//example ofString Split
package Com.mkpits.java.StringBufferAndStringBuilder;

public class StringSplitEx1
{
    public static void main(String[] args)
    {
        String fname="nil,ashu,ravi";
        String[] arr=fname.split(",");
        for (String s:arr)
            System.out.println(s);

    }
}
