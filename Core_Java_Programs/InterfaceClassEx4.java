//ex Multiple inheritance in Java by interface
package Com.mkpits.java.InterfaceJava;
interface Printable4
{
    void print();
}
interface Showable4
{
    void show();
}
public class InterfaceClassEx4 implements Printable4,Showable4
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
        InterfaceClassEx4  i=new InterfaceClassEx4 ();
        i.print();
        i.show();
    }
}
