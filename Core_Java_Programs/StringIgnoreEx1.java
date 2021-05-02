//example of String Ignore
package Com.mkpits.java.StringBufferAndStringBuilder;

public class StringIgnoreEx1
{
    public static void main(String[] args)
    {
        String fname="Bhagya";
        String lname="Bhagya";
        //string equalsignorecase(string another)
        boolean s=lname.equalsIgnoreCase(fname);
        System.out.println(s);
    }
}
