//example of instance block
package Com.mkpits.java.InstanceInitializerBlock;
class A5
{
    A5()
    {
        System.out.println("parent class constructor invoked");
    }
}
class B5 extends A5
{
    B5()
    {
        System.out.println("child class constructor invoked");
    }
    B5(int a)
    {
        super();
        System.out.println("child class constructor invoked " + a);
    }
    {
        System.out.println("instance intializer block invoked ");
    }
}
public class InstanceBlockEx5
{
    public static void main(String[] args)
    {
        B5 b1=new B5();
        B5 b2=new B5(10);
    }
}
