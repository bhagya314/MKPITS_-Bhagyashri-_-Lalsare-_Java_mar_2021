package com.mkpits.java.basicprogram;
//wap to accept 3 no. and display the greater no.


import java.util.*;
public class Greater3Numbers
{
    public static void main(String[] args)
    {
        int a1,a2,a3;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter First number");
        a1=sc.nextInt();
        System.out.println("enter secound number");
        a2=sc.nextInt();
        System.out.println("enter third number");
        a3=sc.nextInt();

        if(a1>a2 && a1>a3)
        {
            System.out.println("a1 is greater than a2 and a3");
        }
        else if(a2>a1 && a2>a3)
        {
            System.out.println("a2 is greater than a1 and a3");
        }
        else if(a3>a1 && a3>a2)
        {
            System.out.println("a3 is greater than a1 and a2");
        }
    }
}
