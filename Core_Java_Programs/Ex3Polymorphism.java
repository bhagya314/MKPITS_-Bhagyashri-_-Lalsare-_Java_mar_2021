//Java Runtime Polymorphism Example: Animal

package Com.mkpits.java.Polymorphism;

class Animal
{
    void eat()
    {
        System.out.println("Eating..");
    }
}
class Dog extends Animal
{
    void eat()
    {
        System.out.println(" Eating bread");
    }
}
class Cat extends Animal
{
    void eat()
    {
        System.out.println(" Eating rat");
    }
}
class Lion extends Animal
{
    void eat()
    {
        System.out.println(" Eating meat");
    }
}
public class Ex3Polymorphism
{
    public static void main(String[] args)
    {
        Animal a;
        a=new Dog();
        a.eat();
        a=new Cat();
        a.eat();
        a=new Lion();
        a.eat();
    }
}
