//ex calling parameterized constrctor from default constructor using this key word

package Com.mkpits.java.This154;
class student11
{
    public student11()
    {
        this(55);
        System.out.println("hello from default constructor");
    }
    public student11(int r)
    {
        System.out.println("rno = " + r);
    }
}
public class ParameterizedConstrctorFromDefaultConstructor
{
    public static void main(String[] args)
    {
        student11 s=new student11();
    }
}
