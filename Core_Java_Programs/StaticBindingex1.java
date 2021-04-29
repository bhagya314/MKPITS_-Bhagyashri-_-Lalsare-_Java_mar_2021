//Example of static binding
package Com.mkpits.java.StaticDynamicBinding;
class Dog1
{
    /* private */ void eat()
    {
        System.out.println("dog is eating...");
    }
}
public class StaticBindingex1
{
    public static void main(String[] args)
    {
        Dog1 d1=new Dog1();
        d1.eat();

    }
}
