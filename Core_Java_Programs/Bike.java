//default constructor

public class Bike
{
    String color;

    public Bike()
    {
        color="red";
        System.out.println("bike created");
    }

    public static void main(String args [])
    {
        Bike b=new Bike();
        System.out.println("bike color is " + b.color);
    }
}
