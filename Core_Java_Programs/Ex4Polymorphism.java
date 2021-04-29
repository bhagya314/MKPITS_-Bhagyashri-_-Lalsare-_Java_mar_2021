// Runtime Polymorphism Example: Bank

package Com.mkpits.java.Polymorphism;
class Bank
{
    float getrateofintrest()
    {
        return 0;
    }
}
class SBI extends Bank
{
    float getrateofintrest()
    {
        return 8.4f;
    }
}
class ICICI extends Bank
{
    float getrateofintrest()
    {
        return 7.3f;
    }
}
class Axis extends Bank
{
    float getrateofintrest()
    {
        return 9.7f;
    }
}
public class Ex4Polymorphism
{
    public static void main(String[] args)
    {
        Bank b;
        b=new SBI();
        System.out.println("SBI Bank rate of intrest is " + b.getrateofintrest());
        b=new ICICI();
        System.out.println("ICICI Bank rate of intrest is " + b.getrateofintrest());
        b=new Axis();
        System.out.println("Axis bank rate of intrest is " +b.getrateofintrest());
    }
}
