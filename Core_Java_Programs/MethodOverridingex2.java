//ex. of hiearchiechal inheritance in method overriding
package Com.mkpits.java.MethodOverriding;
class bank
{
    int getrateofintrest()
    {
        return 0;
    }
}
class Sbi extends bank
{
    int getrateofintrest()
    {
        return 8;
    }
}
class Icici extends bank
{
    int getrateofintrest()
    {
        return 7;
    }
}
class Axis extends bank
{
    int getrateofintrest()
    {
        return 9;
    }
}
public class MethodOverridingex2
{
    public static void main(String[] args)
    {
        Sbi s=new Sbi();
        Icici i=new Icici();
        Axis a=new Axis();

        System.out.println("SBI rate of intrest = " + s.getrateofintrest());
        System.out.println("ICICI rate of intrest = " + i.getrateofintrest());
        System.out.println("Axis rate of intrest = " + a.getrateofintrest());


        s.getrateofintrest();
        i.getrateofintrest();
        a.getrateofintrest();
    }
}
