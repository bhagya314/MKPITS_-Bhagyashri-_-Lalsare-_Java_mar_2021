//example of hiearchical inheritance vehical
package Com.mkpits.java.MethodOverriding;
class Vehicle
{
    void run()
    {
        System.out.println("vehicle is running");
    }
}
class bike extends Vehicle
{
    void run()
    {
    System.out.println("bike is running safely");
    }
}
public class MethodOverridingex4
{
    public static void main(String[] args)
    {
        bike b=new bike();
        b.run();
    }
}
