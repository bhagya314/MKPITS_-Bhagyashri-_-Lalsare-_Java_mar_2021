//example of java interface which provides the implementation of Bank interface.
package Com.mkpits.java.InterfaceJava;
interface Bank
{
    float rateofintrest();
}
class SBI implements Bank
{
    public float rateofintrest()
    {
        return 9.15f;
    }
}
class PNB implements  Bank
{
    public float rateofintrest()
    {
        return 9.7f;
    }
}
public class InterfaceClassEx3
{
    public static void main(String[] args)
    {
        Bank b= new SBI();
        System.out.println("ROI : " +b.rateofintrest());
    }
}
