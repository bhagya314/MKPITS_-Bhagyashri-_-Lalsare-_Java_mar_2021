package com.mkpits.java.basicprogram;
import java.util.*;

public class PrintSquareOfNumber {
    public static void main(String[] args)
    {
        int num,sq;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        num=sc.nextInt();
        sq=num*num;
        System.out.println("Square of the number is "+sq);
    }
}
