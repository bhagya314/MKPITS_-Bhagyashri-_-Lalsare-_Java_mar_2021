/*  7 - wap to println output like given below using nested for loop.
        *
        *	*
        *	*	*
 */

package com.mkpits.java.clanguage;
import java.util.*;
public class AsterikPatternTwo
{
    public static void main(String[] args)
    {
        for (int rowcount=1;rowcount<=3;rowcount++)
        {
            for (int colcount = 1; colcount <= rowcount; colcount++)
            {
                System.out.print("* \t");
            }
            System.out.println();
        }
    }
}
