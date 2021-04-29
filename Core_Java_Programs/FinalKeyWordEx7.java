//Example of static blank final variable
package Com.mkpits.java.FinalKeyword;
class A
{
    static final int data;//static blank final variable
    static {data=60;}
}
public class FinalKeyWordEx7
{
    public static void main(String[] args)
    {
        System.out.println(A.data);
    }
}
