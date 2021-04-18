//create a class dog having fields breed , height and color and methods getdata and showdata and
//bark.

import java.util.*;
public class ExDogDetails
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Dog d1=new Dog();
        System.out.println("enter dog breed,height,color");
        String b=sc.next();
        int h=sc.nextInt();
        String c=sc.next();
        d1.getdogdata(b,h,c);
        d1.showdogdata();
    }
}
class Dog
{
    String breed;
    int height;
    String color;

    void getdogdata(String b,int h,String c)
    {
        breed=b;
        height=h;
        color=c;
    }
    void showdogdata()
    {
        System.out.println("Dog Breed "+breed);
        System.out.println("Dog Height "+height);
        System.out.println("Dog color " +color);
    }
}
