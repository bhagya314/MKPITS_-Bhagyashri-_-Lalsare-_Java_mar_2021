//As you can see in the above example, Printable and Showable interface have same methods
// but its implementation is provided by class TestTnterface1, so there is no ambiguity.
//A class implements an interface, but one interface extends another interface.
package Com.mkpits.java.InterfaceJava;
interface Printable6
{
    void print();
}
interface Showable6 extends Printable6
{
    void show();
}
public class InterfaceClassEx6 implements Printable6,Showable6
{
    public void print()
    {
        System.out.println("Hello");
    }
    public void show()
    {
        System.out.println("Welcome");
    }

    public static void main(String[] args)
    {
        InterfaceClassEx6 i=new InterfaceClassEx6();
        i.print();
        i.show();
    }
}
