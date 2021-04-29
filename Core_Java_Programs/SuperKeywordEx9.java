////create a parent class account having fields accountno and balance. and constructor with 2 parameters
////create a subclass saving inherited from account class having fields interest
////and constructor with 3 parameters and from this call parent class constructor.
////and a display method, deposit method and withdrawl method.

package Com.mkpits.java.SuperKeyWord;
class account
{
    int bal=1000;
    int actno;
    int amt;
    account(int actno,int amt)
    {
        this.actno=actno;
        this.amt=amt;
    }
}
class saving extends account
{
    int interest=600;
    saving(int actno,int amt,int interest)
    {
        super(actno,amt);//reusing parent constructor
        this.interest=interest;
    }
    void display()
    {
        System.out.println(actno + " " + amt + " " + interest);
    }
    void deposit()
    {
        int interest=600;
        bal=bal+interest;
    }
    void withdrawl()
    {
        bal=bal-amt;
    }
}
public class SuperKeywordEx9
{
    public static void main(String[] args)
    {
        saving s=new saving(2,3000,900);
        s.display();
    }
}
