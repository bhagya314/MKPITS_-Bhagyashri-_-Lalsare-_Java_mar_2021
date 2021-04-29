//Example of dynamic binding
package Com.mkpits.java.StaticDynamicBinding;
class Animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal
{
    void eat()
    {
        System.out.println("dog is eating");
    }
}
public class DynamicBindingEx1
{
    public static void main(String[] args)
    {
        Animal a =new Dog();
        a.eat();
    }
}
