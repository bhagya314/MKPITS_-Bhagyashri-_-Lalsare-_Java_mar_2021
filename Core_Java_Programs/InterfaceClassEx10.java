//Example of abstract class and interface in Java
//Let's see a simple example where we are using interface and abstract class both.

package Com.mkpits.java.InterfaceJava;
interface A
{
    void a();
    void b();
    void c();
    void d();
}
abstract class B implements  A
{
    public void c()
    {
        System.out.println("I am C");
    }
}
class M extends B
{
    public void a(){System.out.println("I am A");}
    public void b(){System.out.println("I am B");}
    public void d(){System.out.println("I am D");}
}
public class InterfaceClassEx10
{
    public static void main(String[] args)
    {
        A a= new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
