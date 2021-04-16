//wap to create an array of 3 element and display the array element using for each loop.


import java.util.*;
public class ArrayOf3ElementByForLoop
{
    public static void main(String[] arg)
    {

        int num[] = { 11,12,13};

        for ( int n : num)
        {
            System.out.println("num = " + n);
        }
    }
}
