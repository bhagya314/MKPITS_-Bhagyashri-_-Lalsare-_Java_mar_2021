//wap to accept a no. and print factorial of a number using while loop
import java.util.*;
public class FactorialOfNumberUsingWhileLoop
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num;
        int fact=1;
        System.out.println("enter number");
        num=s.nextInt();
        while(num>0)
        {
            fact=fact*num;
            num--;
        }
        System.out.println("factorial is"+fact);
    }
}
