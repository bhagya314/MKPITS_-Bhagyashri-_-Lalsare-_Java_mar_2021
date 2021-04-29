//Another example of super keyword where super() is provided by the compiler implicitly.
package Com.mkpits.java.SuperKeyWord;
class Animal7
{
    Animal7()
    {
        System.out.println("animal is created");
    }
}
class Dog5 extends Animal7
{
    Dog5()
    {
        System.out.println("dog is created");
    }
}
public class SuperKeywordEx7
{
    public static void main(String[] args)
    {
        Dog5 d=new Dog5();
    }
}
