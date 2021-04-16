//wap to print no. from 10 to 20 using while loop

import java.util.*;
public class Print10To20NumberByWhileLoop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=10;
        while (num<=20)
        {
            System.out.println("num=" +num);
            num++;
        }
    }
}
