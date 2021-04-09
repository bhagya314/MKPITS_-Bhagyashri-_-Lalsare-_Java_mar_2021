//-wap to create a float array of 5 elements and
//accept the elements from the user.

import java.util.*;
public class FloatArrayOf5Element
{
    public static void main(String args[])
    {
        float num[]=new float[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;++i)
        {
            System.out.println("enter number");
            num[i]=sc.nextFloat();
        }
        for(int i=0;i<5;++i)
        {
            System.out.println("number is"+num[i]);
        }
    }
}
