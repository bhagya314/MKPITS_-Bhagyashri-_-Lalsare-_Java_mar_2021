//downcasting with instance of operator

package Com.mkpits.java.DownCasting;

class person { }
class customer extends person
{
    static void downmethod(person p)
    {
        if(p instanceof customer)
        {
            customer cc = (customer) p;
            System.out.println("downcasting performed");
        }
        else
        {
            System.out.println( "downcasting not possible");

        }
    }
}
public class DownCastingEx1
{
    public static void main(String[] args)
    {
        person p=new customer();
        customer.downmethod(p);
    }
}
