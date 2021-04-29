//Example of instance initializer block
package Com.mkpits.java.InstanceInitializerBlock;
class Bike
{
    int speed;
    Bike()
    {
        System.out.println("constructor is invoked ");
    }
    {
        System.out.println("instance intitalizer block invoked ");
    }
}
public class InstanceBlockEx1
{
    public static void main(String[] args)
    {
        Bike b=new Bike();
        Bike b1=new Bike();
    }
}
