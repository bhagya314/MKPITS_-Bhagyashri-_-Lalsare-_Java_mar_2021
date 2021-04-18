//create a class employee having fields empno,empname, designation, salary
//and method getemployeedata and displayemployeedata

import java.util.*;
public class EmployeeDetailsClass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        employee e1=new employee();

        e1.getemployeedata(14,"bhagya","manager",15000);
        e1.displayemployeedata();
    }
}
 class employee
{
    int empno;
    String empname;
    String designation;
    int salary;

    void getemployeedata(int eno,String en,String d , int s)
    {
        empno=eno;
        empname=en;
        designation=d;
        salary=s;
    }
    void displayemployeedata()
    {
        System.out.println("employee number is " +empno);
        System.out.println("employee name is " +empname);
        System.out.println("employee designation is " +designation);
        System.out.println("employee salary is " +salary);
    }
}