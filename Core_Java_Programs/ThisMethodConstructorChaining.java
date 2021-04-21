//4- constructor chaining

package Com.mkpits.java.This154;
import javax.security.sasl.SaslServer;
class customer3
{
    int custno;
    String custname;
    int amount;
    public customer3(int custno)
    {
        this.custno=custno;
    }
    public customer3(int custno,String custname)
    {
        this(custno);
        this.custname=custname;
    }
    public customer3(int custno,String custname,int
            amount)
    {
        this(custno,custname);
        this.amount=amount;
    }
    void displaydata()
    { System.out.println(custno + " : " + custname + " : " + amount );
    }
}
public class ThisMethodConstructorChaining
{
    public static void main(String[] args) {

        customer3 c=new customer3(1);
        c.displaydata();
        customer3 c1=new customer3(12,"raj");
        c1.displaydata();
        customer3 c11=new customer3(12,"raj",888);
        c11.displaydata();
    }
}
