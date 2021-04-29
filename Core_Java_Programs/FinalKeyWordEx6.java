//Q) What is blank or uninitialized final variable?
//A final variable that is not initialized at the time of declaration is known as blank final variable.
//Example of blank final variable
package Com.mkpits.java.FinalKeyword;
class Bike6
{
    final int speedlimit;// balnk final variable
    Bike6()
    {
        speedlimit=50;
        System.out.println(speedlimit);
    }
}
public class FinalKeyWordEx6
{
    public static void main(String[] args)
    {
        new Bike6();
    }
}
