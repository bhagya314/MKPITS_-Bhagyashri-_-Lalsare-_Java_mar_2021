package com.mkpits.java.basicprogram;
//Perform Operation + or - on float numbers

import java.util.*;
public class ByFloatNumberPerformOperation {
    public static void main(String[] args)
    {
        float num1,num2,res=0;
        char op;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number 1");
        num1=sc.nextFloat();
        System.out.println("enter number 2");
        num2=sc.nextFloat();
        System.out.println("enter operator + or -" );
        op=sc.next().charAt(0);

        if(op=='+')
        {
            res=num1+num2;
            System.out.println("Sum of 2 number is"  +res);
        }
        else if(op=='-')
        {
            res=num1-num2;
            System.out.println("Subtraction of 2 number is" +res);
        }
        else
        {
            System.out.println("Invalid Character enter");
        }

    }
}
