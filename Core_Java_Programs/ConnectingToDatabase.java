//create a jdbc program to connect to mysql database.
package com.mkpits.java.June8;
import java.sql.*;
public class ConnectingToDatabase {
    public static void main(String args[]) {
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits","root","");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
}
