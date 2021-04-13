package com.mkpits.java.basicprogram;
//enter and print your name

import java.util.*;
public class PrintName {
    public static void main(String[] args)
    {
        String name;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        name=sc.next();

        System.out.println("Your name is "+name);

    }
}
