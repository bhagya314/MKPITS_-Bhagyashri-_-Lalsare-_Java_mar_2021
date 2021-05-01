//5- example of realtime downcasting example

package Com.mkpits.java.DownCasting;

interface Account
{
    void deposit(int amt);
}
class saving implements Account
{
    public void deposit(int amt)
    {
        System.out.println("deposit of saving");
    }
}
class current implements Account
{
    public void deposit(int amt)
    {
        System.out.println("deposit of current");
    }
}
class Call
{
    void invoke(Account act)
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
public class DownCastingEx2
{
    public static void main(String args[])
    {
        Account ac=new current();
        Call c=new Call();

        c.invoke(ac);
    }
}
