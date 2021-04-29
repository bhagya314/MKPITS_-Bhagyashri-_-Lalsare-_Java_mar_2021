//3) super is used to invoke parent class constructor.
//The super keyword can also be used to invoke the parent class constructor. Let's see a simple example:
package Com.mkpits.java.SuperKeyWord;
class Animal4
{
    Animal4()
    {
        System.out.println("animal is created");
    }
}
class Dog4 extends Animal4
{
    Dog4()
    {
        super();
        System.out.println("dog is created");
    }
}
public class SuperKeywordEx5
{
    public static void main(String[] args)
    {
        Dog4 d=new Dog4();
    }
}
