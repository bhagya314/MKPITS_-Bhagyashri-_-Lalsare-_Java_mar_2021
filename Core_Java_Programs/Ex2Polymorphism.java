//we are creating two classes Bike and Splendor. Splendor class extends Bike class and
//overrides its run() method. We are calling the run method by the reference variable of Parent class.
//Since it refers to the subclass object and subclass method overrides the Parent class method, the
//subclass method is invoked at runtime.

package Com.mkpits.java.Polymorphism;

class Bike
{
    int speedlimit=90;
}
class Honda extends Bike
{
    int speedlimit = 150;
}
public class Ex2Polymorphism
{
    public static void main(String[] args)
    {
        Bike b=new Honda();
        System.out.println(b.speedlimit);
    }
}
