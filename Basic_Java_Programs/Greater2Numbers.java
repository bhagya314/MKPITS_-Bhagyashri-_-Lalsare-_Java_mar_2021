package com.mkpits.java.basicprogram;
//wap to accept 2 no. and display the greater no.

import java.util.*;
public class Greater2Numbers {
    public static void main(String[] args)
    {
        int num1,num2;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number 1");
        num1=sc.nextInt();
        System.out.println("enter number 2");
        num2=sc.nextInt();

        if(num1>num2)
        {
            System.out.println("Num1 is grater than num2");
        }
        else if(num2>num1)
        {
            System.out.println("Num2 is greater than num1");
        }
    }
}
