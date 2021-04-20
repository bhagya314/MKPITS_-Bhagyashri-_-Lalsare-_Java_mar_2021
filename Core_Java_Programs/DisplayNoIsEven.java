//wap to accept a number and display the message  "number is even"
// if remainder of a number is 0 if divided by 2

import java.util.*;
public class DisplayNoIsEven
{
    public static void main(String args [])
    {
        int num;
        int rem=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        num =sc.nextInt();
        rem=num%2;
        if(rem==0)
            System.out.println("number is even");
    }
}
