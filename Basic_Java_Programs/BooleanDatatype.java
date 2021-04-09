//Boolean data type


import java.util.*;
public class BooleanDatatype
{
    public static void main(String args[])
    {
        boolean b = true;
        System.out.println("b ="+b);
        System.out.println("enter value");
        Scanner s=new Scanner(System.in);
        b=s.nextBoolean();
        System.out.println(" value = " + b);
    }
}
