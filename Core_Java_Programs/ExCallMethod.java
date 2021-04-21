//-example of this to call method
package Com.mkpits.java.This154;
class calculate1
{
    void caltotal(int a,int b,int c)
    {
        int tot=a+b+c;
        System.out.println("total"+tot);
        this.calaverage(tot);
    }
    void calaverage(int t)
    {
        float av=(float)t/3;
        System.out.println("average"+av);
    }
}
public class ExCallMethod
{
    public static void main(String args [])
    {
        calculate1 c=new calculate1();
        c.caltotal(1,2,3);
    }
}
