//Java 8 Default Method in Interface

package Com.mkpits.java.InterfaceJava;
interface  Drawable7
{
    void draw();
    default void msg()
    {
        System.out.println("default method");
    }
}
class Rectangle1 implements Drawable7
{
    public void draw()
    {
        System.out.println("drawing rectangle");
    }
}
public class InterfaceClassEx7
{
    public static void main(String[] args)
    {
        Drawable7 d=new Rectangle1();
        d.draw();
        d.msg();
    }
}
