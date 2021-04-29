//instance initializer block that is invoked after super()
package Com.mkpits.java.InstanceInitializerBlock;
class A1
{
    A1()
    {
        System.out.println("parent class constructor invoked ");
    }
}
class B2 extends A1{
    B2()
    {
        super();
        System.out.println("child class constructor invoked");

    }
    {
        System.out.println("instance intializer block is invoked");
    }
}
public class InstanceBlockEx4
{
    public static void main(String[] args)
    {
        B2 b=new B2();
    }
}
