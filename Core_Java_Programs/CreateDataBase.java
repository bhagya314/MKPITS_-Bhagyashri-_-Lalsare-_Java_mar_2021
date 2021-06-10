//create a jdbc program to create table into the database.
package com.mkpits.java.June8;
import java.sql.*;
public class CreateDataBase {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits","root","");
            System.out.println("connected successfully ");
            stmt =con.createStatement();
            String str="create table employee(empid int primary key, empname varchar(50))";
            stmt.executeUpdate(str);
            System.out.println("table successfully created");
            con.close();
        }catch (Exception ee) {
            //code to connect java with mysql database
            System.out.println(ee.toString());
        }
    }

}
