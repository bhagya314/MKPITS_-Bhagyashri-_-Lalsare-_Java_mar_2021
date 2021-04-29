//Q) Is final method inherited?
//Ans) Yes, final method is inherited but you cannot override it. For Example:
package Com.mkpits.java.FinalKeyword;
class Bike5
{
    final void run()
    {
        System.out.println("running...");
    }
}
class Honda1 extends Bike5
{
    void eat()
    {
        System.out.println("eating...");
    }
}
public class FinalKeyWordEx5
{
    public static void main(String[] args)
    {
        new Honda1().run();//super() do automatically
        // new Honda1().eat();
    }
}
