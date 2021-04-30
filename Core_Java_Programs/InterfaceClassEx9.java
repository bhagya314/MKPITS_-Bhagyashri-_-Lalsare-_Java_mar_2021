//ex Difference between abstract class and interface

package Com.mkpits.java.InterfaceJava;
interface Printable9
{
    void print();
}
interface MessagePrintable
{
    void msg();
}
abstract class example implements Printable9,MessagePrintable
{
    public void print()
    {
        System.out.println("print");
    }
    public void msg()
    {
        System.out.println("msg");
    }
}
public class InterfaceClassEx9 extends example
{
    public static void main(String[] args)
    {
        example e = new InterfaceClassEx9();
        e.print();
        e.msg();
    }
}
