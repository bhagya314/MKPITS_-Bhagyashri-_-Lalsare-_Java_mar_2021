//char array

import java.util.*;
public class CharArray
{
    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in);
        char num[] = new char[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("enter char");
            num[i]=s.next().charAt(0);
        }
        for ( char n : num)
        {
            System.out.println("char = " + n);

        }
    }
}
