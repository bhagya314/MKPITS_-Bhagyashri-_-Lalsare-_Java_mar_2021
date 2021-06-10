//create a program to insert records into company table.(accept the value from the user).
package com.mkpits.java.June8;
import java.sql.*;
import java.util.*;

public class InsertInCompanyDb {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Employee Name : ");
        String NAME=sc.next();
        System.out.println("Enter Employee Age : ");
        Integer AGE=sc.nextInt();
        System.out.println("Enter Employee Address : ");
        String ADDRESS=sc.next();
        System.out.println("Enter Employee Salary : ");
        Float SALARY=sc.nextFloat();
        System.out.println("Enter Employee Joining date dd/mm/yyyy : ");
        String JOIN_DATE=sc.next();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits","root","");
            stmt=con.createStatement();
            String str="insert into company() values ("+2+",'"+NAME+"',"+AGE+",'"+ADDRESS+"',"+SALARY+","+JOIN_DATE+")";
            stmt.executeUpdate(str);
            System.out.println("Record inserted successfully");
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
