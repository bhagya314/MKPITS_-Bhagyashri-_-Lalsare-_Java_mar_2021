//- create a class car having field color, make , brand and methods getdata(), showdata() and
//startenginge

import java.util.*;
public class CarEx
{
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        Car c1=new Car();
        System.out.println("enter car color,make year, and brand");
        String c=scan.next();
        long m=scan.nextLong();
        String b=scan.next();
        c1.getdata(c,m,b);

        c1.showdata();
        c1.startenginge();
    }
}
//creating a class car
class Car
{
    String color;
    long make;
    String brand;
    void getdata(String c,long m,String b)
    {
        color=c;
        make=m;
        brand=b;
    }
    void showdata()
    {
        System.out.println("car color :" + color);
        System.out.println("car make :" + make);
        System.out.println("car brand :" + brand);
    }
    void startenginge()
    {
        System.out.println("engine is staring ");
    }
}
