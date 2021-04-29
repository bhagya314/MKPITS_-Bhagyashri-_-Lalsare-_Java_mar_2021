//creating two classes Bike and Splendor. Splendor class extends Bike class
// and overrides its run() method.

package Com.mkpits.java.Polymorphism;

class Bike1
{
    void run()
    {
        System.out.println("bike is running ");
    }
}
class splendor extends Bike1
{
    void run()
    {
        System.out.println("splendor is ruuning 60 km");
    }
}
public class Ex6Polymorphism
{
    public static void main(String[] args)
    {
        Bike1 b;
        b=new splendor(); //upcasting
        b.run();
    }
}
