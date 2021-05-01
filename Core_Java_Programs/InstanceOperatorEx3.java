//instance example with null value

package Com.mkpits.java.InstanceOperator;

class person
{
}
class customer extends person
{
    String name;
}
public class InstanceOperatorEx3
{
    public static void main(String[] args)
    {
        customer c=null;
        boolean b= c instanceof person;
        System.out.println(b);
        if(b==true)
        {
            System.out.println("code to be processed");
        }
    }
}
