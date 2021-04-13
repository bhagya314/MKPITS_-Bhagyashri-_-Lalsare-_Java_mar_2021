package com.mkpits.java.basicprogram;
//-wap to accept 2 no. and operator like +,-
//and display the result

import java.util.*;
public class EnterOperatorNDisplayResult {
    public static void main(String[] args)
    {
        int num1,num2,res=0;
        char op;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        num1=sc.nextInt();
        System.out.println("enter number 2");
        num2=sc.nextInt();
        System.out.println("enter operator like + -");
        op=sc.next().charAt(0);

        if(op=='+')
        {
            res=num1+num2;
            System.out.println("Sum of 2 numbers is "+res);
        }
        else if (op=='-')
        {
            res=num1-num2;
            System.out.println("Subtraction of 2 numbers is "+res);
        }
        else
            {
            System.out.println("invalid character");
        }
    }
}
