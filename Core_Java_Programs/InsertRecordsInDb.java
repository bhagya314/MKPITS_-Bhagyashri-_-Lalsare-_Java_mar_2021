//program to insert records in our employee table created.
package com.mkpits.java.June8;
import java.sql.*;
import java.util.*;

public class InsertRecordsInDb {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter empid");
        int empid=sc.nextInt();
        System.out.println("enter empname");
        String empname=sc.next();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits","root","");
            System.out.println("connected successfully ");
            stmt =con.createStatement();
            String str="insert into employee(empid,empname) values("+empid+",'"+empname+"')";
            stmt.executeUpdate(str);
            System.out.println("record inserted successfully");
            con.close();
        }catch (Exception ee) {
            //code to connect java with mysql database
            System.out.println(ee.toString());
        }
    }

}

