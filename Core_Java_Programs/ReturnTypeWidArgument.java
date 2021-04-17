package com.mkpits.java.basicprogram;

public class ReturnTypeWidArgument
{
import java.util.*;
    public class Student {
        static void calculate(int m1,int m2,int m3)
        {
            int total=m1+m2+m3;
            System.out.println("total marks " +
                    total);
        }
        public static void main(String[] arg) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter 3 subject
                    marks");
            int marks1=scan.nextInt();
            int marks2=scan.nextInt();
            int marks3=scan.nextInt();
            calculate(marks1,marks2,marks3);

        }
}
