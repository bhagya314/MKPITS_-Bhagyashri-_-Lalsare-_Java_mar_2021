//final parameter
//If you declare any parameter as final, you cannot change the value of it.

package Com.mkpits.java.FinalKeyword;
class Bike
{
    int cube(final int n)
    {
        //n = n + 2; //can't be changed as n is final
        return n * n * n;
    }
}
public class FinalKeyWordEx1
{
    public static void main(String[] args)
    {
        Bike b = new Bike();
        System.out.println(b.cube(5));
    }
}
