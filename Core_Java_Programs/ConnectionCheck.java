//jdbc with mysql
package com.mkpits.java.June7;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionCheck {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection
                    con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mkpits","root", "");

//here sonoo is database name, root is username andpassword
            System.out.println("conncect");
            con.close();
        }catch(Exception e){
            System.out.println(e);}
    }
}
