//Write a program in C to find the prime numbers within a range of numbers.
//        Input starting number of range: 1
//        Input ending number of range : 50
package com.mkpits.java.clanguage;
import java.util.*;
public class FinfPrimeNoWithinRange
{
    public static void main(String[] arg)
    {
        //Scanner sc=new Scanner(System.in);
        int i, j;
        for(i=2;i<50;i++)
        {
            for(j=2;j<=i;j++)
            {
                if(i==j)
                    System.out.println( + i );
                else if( i % j ==0)
                    break;

            }
        }
    }
}
