//wap to accept a no and print table of that number using for loop.

import java.util.*;
public class PrintTableByForLoop
{
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        int num;
        int res=1;
        System.out.println("enter number");
        num = s.nextInt();
        for(int i=1;i<=10;i++)
        {
            res=num * i;
            System.out.println(num + "*" + i + "=" + res);

        }

    }
}
