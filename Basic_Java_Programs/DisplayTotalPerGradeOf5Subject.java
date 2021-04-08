package com.mkpits.java.basicprogram;
//wap to accept 5 subject marks and display total ,
//per , grade

import java.util.*;
public class DisplayTotalPerGradeOf5Subject
{
    public static void main(String[] args)
    {
        float b1,b2,b3,b4,b5,total,per;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter subject 1 marks:");
        b1=sc.nextFloat();
        System.out.println("enter subject 2 marks:");
        b2=sc.nextFloat();
        System.out.println("enter subject 3 marks:");
        b3=sc.nextFloat();
        System.out.println("enter subject 4 marks:");
        b4=sc.nextFloat();
        System.out.println("enter subject 5 marks:");
        b5=sc.nextFloat();

        total=b1+b2+b3+b4+b5;
        per=(total/500)*100;

        System.out.println("Total =" +total);
        System.out.println("percentage =" +per);

        if(per>=75)
        {
            System.out.println("Grade:Distinction");
        }
        else if(per<75 && per>=60)
        {
            System.out.println("Grade:First Class");
        }
        else if(per<60 && per>=40)
        {
            System.out.println("Grade:Second Class");
        }
        else
        {
            System.out.println("You Are Failed");
        }
    }
}
