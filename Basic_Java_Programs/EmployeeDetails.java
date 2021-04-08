package com.mkpits.java.basicprogram;
//wap to accept empno,basic_salary, empname,
//designation and then display emp details

import java.util.*;
public class EmployeeDetails
{
    public static void main(String[] args)
    {
        int empno,basic_salary;
        String empname;
        String designation;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter employee number");
        empno=sc.nextInt();
        System.out.println("enter employee name");
        empname=sc.next();
        System.out.println("enter employee designation");
        designation=sc.next();
        System.out.println("enter employee basic salary");
        basic_salary=sc.nextInt();

        System.out.println("employee number:" +empno);
        System.out.println("employee name:" +empname);
        System.out.println("employee designation:" +designation);
        System.out.println("employee basic salary:" +empname);
    }
}
