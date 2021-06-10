//create a program to create table student .
package com.mkpits.java.June8;
import java.sql.*;
public class CreateTable {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits","root","");
            System.out.println("Connected Successfully");
            stmt=con.createStatement();
            String str="create table student(studid int primary key,studname varchar(50))";
            stmt.executeUpdate(str);
            System.out.println("table created successfully");
            con.close();
        }catch (Exception ee){
            System.out.println(ee.toString());
        }
    }
}
