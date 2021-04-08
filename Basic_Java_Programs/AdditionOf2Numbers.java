//Addition of two numbers
package com.mkpits.java.basicprogram;

import java.util.*;
public class AdditionOf2Numbers {
    public static void main(String[] args)
    {
        int num1,num2,res;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number1");
        num1=sc.nextInt();
        System.out.println("enter number2");
        num2=sc.nextInt();
        res=num1+num2;
        System.out.println("Addition of 2 number is "+res);
    }
}
