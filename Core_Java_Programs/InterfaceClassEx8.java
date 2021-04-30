//Java 8 Static Method in Interface

package Com.mkpits.java.InterfaceJava;
interface Drawable8
{
    void draw();
    static int cube(int x)
    {
        return x*x*x;
    }
}
class Rectangle8 implements Drawable8
{
    public void draw()
    {
        System.out.println("drawing rectangle");
    }
}
public class InterfaceClassEx8
{
    public static void main(String[] args)
    {
        Drawable8 d=new Rectangle8();
        d.draw();
        System.out.println(Drawable8.cube(5));
    }
}
