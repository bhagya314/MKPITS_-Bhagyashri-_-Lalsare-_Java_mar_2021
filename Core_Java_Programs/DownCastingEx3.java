//6 downcasting example with accepting actype from the user

package Com.mkpits.java.DownCasting;
import java.util.*;
interface Account1
{
    void deposit(int amt);
}
class saving1 implements Account1
{
    public void deposit(int amt)
    {
        System.out.println("deposit of saving");
    }
}
class current1 implements Account1
{
    public void deposit(int amt)
    {
        System.out.println("deposit of current");
    }
}
class Call1
{
    void invoke(Account1 act)
    {//upcasting
        if(act instanceof saving)
        {
            saving s=(saving)act;//Downcasting
            s.deposit(200);
        }
        if(act instanceof current)
        {
            current c=(current) act;//Downcasting
            c.deposit(200);
        }
    }
}//end of Call class
public class DownCastingEx3
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        Account ac=null;
        System.out.println("enter account type saving or current");
        String at=scan.next();
        if(at.equals("saving"))
        {
            ac=new saving();
        }
        else if(at.equals("current"))
        {
            ac=new current();
        }
        Call c=new Call();
        c.invoke(ac);
    }
}
