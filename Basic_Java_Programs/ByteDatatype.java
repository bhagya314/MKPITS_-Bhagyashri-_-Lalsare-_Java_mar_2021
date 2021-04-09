//wap to accept number of byte datatype

import java.util.*;
public class ByteDatatype
{
    public static void main(String[] args)
    {
        byte b = 12;
        System.out.println("b ="+b);
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        b=sc.nextByte();
        System.out.println("number=" +b);
    }
}
