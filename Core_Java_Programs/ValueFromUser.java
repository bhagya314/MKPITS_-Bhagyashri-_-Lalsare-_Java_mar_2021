//accept the value from the user

import java.util.*;
public class ValueFromUser
{
    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in);
        int num[] = new int[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("enter number");
            num[i]=s.nextInt();
        }
        for ( int n : num)
        {
            System.out.println("num = " + n);
        }
    }
}
