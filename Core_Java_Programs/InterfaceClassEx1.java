//ex : create an interface shape having method declaration for draw method
package Com.mkpits.java.InterfaceJava;
interface Shape
{
    void draw();
}
class Circle1 implements Shape
{
    public void draw()
    {
        System.out.println("code to draw circle");
    }
}
public class InterfaceClassEx1
{
    public static void main(String[] args)
    {
        Shape s=new Circle1();
        s.draw();
    }
}
