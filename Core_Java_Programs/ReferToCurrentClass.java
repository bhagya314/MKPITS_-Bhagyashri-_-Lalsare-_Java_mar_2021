//2- to refer to current class method
package Com.mkpits.java.This154;
class customer1
{
    int custno;
    String custname;
    void getdata(int custno,String custname)
    {
        this.custno=custno;
        this.custname=custname;
        this.displaydata();
    }
    void displaydata()
    {
        System.out.println(custno + " : " + custname);
    }

}
public class ReferToCurrentClass
{
    public static void main(String[] args)
    {
        customer1 c=new customer1();
        c.getdata(111,"raju");
    }
}
