//Covarientreturntype.java
package Com.mkpits.java.SuperKeyWord;
class A
{
    A get()
    {
        return this;
    }
}
class B1 extends A
{
    B1 get()
    {
        return this;
    }
    void message()
    {
        System.out.println("welcome to covariant return type ");
    }
}
public class CovarientReturnType
{
    public static void main(String[] args)
    {
        new B1().get().message();
    }
}
