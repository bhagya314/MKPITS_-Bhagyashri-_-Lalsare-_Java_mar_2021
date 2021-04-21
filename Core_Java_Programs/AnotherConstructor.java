//example of calling another constructor using this keyword
package Com.mkpits.java.This154;
class student1
{
    public student1()
    {
        System.out.println("hello from default constructor");
    }
    public student1(int r)
    {
        this();
        System.out.println("rno = " + r);
    }
}
public class AnotherConstructor
{
    public static void main(String[] args)
    {
        student1 s=new student1(55);
    }
}
