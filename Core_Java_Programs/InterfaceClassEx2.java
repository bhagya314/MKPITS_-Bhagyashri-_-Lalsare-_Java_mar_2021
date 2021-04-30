//In this example, the Drawable interface has only one method. Its implementation is provided by
//Rectangle and Circle classes.
package Com.mkpits.java.InterfaceJava;
interface Drawable
{
    void draw();
}
class Rectangle implements Drawable
{
    public void draw()
    {
        System.out.println("drawing rectangle");
    }
}
class Circle implements Drawable
{
    public void draw()
    {
        System.out.println("drawing circle");
    }
}
public class InterfaceClassEx2
{
    public static void main(String[] args)
    {
        Drawable d = new Circle();
        d.draw();
    }
}
