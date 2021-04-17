//wap to accept 5 subject marks from the user and calculate total using while loop.

import java.util.*;
public class TotalOfFiveSubMarksByWhileLoop
{
    public static void main(String args[])
    {
        int subject;
        int total=0;
        int cnt = 1;
        Scanner sc=new Scanner(System.in);

        while(cnt<=5)
        {
            System.out.printf("enter number");
            subject=sc.nextInt();
            total=total+subject;
            cnt++;
        }
        System.out.printf("Total is"+total);
    }
}
