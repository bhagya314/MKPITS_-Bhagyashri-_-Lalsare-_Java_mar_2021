//In this example, if you create the instance of Rectangle class, draw() method of Rectangle
// class will be invoked.

package Com.mkpits.java.AbstractClass;
abstract class Shape
{
    abstract void draw();
}
class rectangle extends Shape
{
    void draw()
    {
        System.out.println("drawing rectangle");
    }
}
class circle extends Shape
{
    void draw()
    {
        System.out.println("drawing circle");
    }
}
public class AbstractEx3
{
    public static void main(String[] args)
    {
        Shape s=new circle();
        s.draw();
    }
}
