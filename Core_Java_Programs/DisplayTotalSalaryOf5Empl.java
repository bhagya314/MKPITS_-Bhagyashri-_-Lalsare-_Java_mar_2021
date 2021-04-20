//WAP TO ACCEPT SALARY OF 5 EMPLOYEES AND DISPLAY THE TOTAL SALARY USING DO WHILE LOOP.
package com.mkpits.java.clanguage;
import java.util.*;
public class DisplayTotalSalaryOf5Empl
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int sal,tsal=0,cnt=1;
        do {
            System.out.println("Enter salary of 5 employee");
            sal = sc.nextInt();
            tsal = tsal + sal;
            cnt++;
        }
        while (cnt <=5);
        {
            System.out.println("total salary = " + tsal);
        }
    }
}
