//create a program to delete record from company.(accept the value from the user).
package com.mkpits.java.June8;
import java.sql.*;
import java.util.*;
public class DeleteRecordInCompanyTable {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        Scanner sc=new Scanner(System.in);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits","root","");
            stmt= con.createStatement();
            String str="delete from company where ID=1";
            stmt.executeUpdate(str);
            System.out.println("Record deleted successfully");
            con.close();
        }catch (Exception ee){
            System.out.println(ee);
        }
    }
}
