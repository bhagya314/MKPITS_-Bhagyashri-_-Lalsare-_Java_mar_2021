//Java final method
//If you make any method as final, you cannot override it.
package Com.mkpits.java.FinalKeyword;
class Bike4
{
    final void run()
    {
        System.out.println("running");
    }
}
class Honda extends Bike4
{
    //void run()
    {
        System.out.println("running safely with 100kmph");
    }
}
public class FinalKeyWordEx4
{
    public static void main(String[] args)
    {
        Honda h=new Honda();
        h.run();
    }
}
