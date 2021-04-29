package Com.mkpits.java.FinalKeyword;
class Bike2
{
    final int speedlimit;
    Bike2()
    {
        speedlimit =20;
    }
    void run()
    {
        System.out.println(speedlimit);
    }
}
public class FinalKeyWordEx2
{
    public static void main(String[] args)
    {
        Bike2 b =new Bike2();
        b.run();
    }
}
