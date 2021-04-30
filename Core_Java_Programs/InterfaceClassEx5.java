//Q) Multiple inheritance is not supported through class in java,
// but it is possible by an interface, why?

package Com.mkpits.java.InterfaceJava;
interface Printable5
{
    void print();
}
interface Showable5
{
    void print();
}
public class InterfaceClassEx5 implements Printable5,Showable5
{
    public void print()
    {
        System.out.println("Hello");
    }
    public static void main(String[] args)
    {
        InterfaceClassEx5 i = new InterfaceClassEx5();
        i.print();
    }
}
