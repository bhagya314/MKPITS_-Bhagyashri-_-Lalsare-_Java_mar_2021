//InstanceBlockEx2
package Com.mkpits.java.InstanceInitializerBlock;
class A3
{
    int n=0;
    A3()
    {
        System.out.println("parent class constructor invoked");
    }
}
class B3 extends A3
{
    B3()
    {
        super();
        System.out.println("child class constructor invoked");
        System.out.println("n = " +n);
    }
    B3(int a)
    {
        super();
        System.out.println("child class constructor invoked " + a);
        System.out.println("n = " +n);
    }
    {
        System.out.println("instance intializer block is invoked");
        n=n+1;
    }
}
public class InstanceBlockEx3
{
    public static void main(String[] args)
    {
        B3 b1=new B3();
        B3 b2=new B3(20);
    }
}
