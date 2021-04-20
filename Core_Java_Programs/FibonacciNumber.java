//27 Write a program in C to display the first n terms of Fibonacci series.
//        Input number of terms to display : 10

package com.mkpits.java.clanguage;
import java.util.*;
public class FibonacciNumber
{
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        int f1=0,f2=1,f3,num,cnt=0;
        System.out.println("Enter value of num");
        num= sc.nextInt();
        System.out.println("first fibonacci series is: " + num);
        System.out.println(+f1);
        System.out.println(+f2);
        while(cnt < num)
        {
            f3=f1+f2;
            cnt++;
            System.out.println(+f3);
            f1=f2;
            f2=f3;
        }
    }
}
