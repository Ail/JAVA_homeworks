/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication100;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alekarios
 */
public class JavaApplication100 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        
         Class.forName("com.mysql.jdbc.Driver");
 
 // Connect to a database
 Connection connection = DriverManager.getConnection
 ("jdbc:mysql://localhost/cataloge","root","12345");

 // Create a statement
 Statement statement = connection.createStatement();
 ResultSet resultSet = statement.executeQuery("SELECT * FROM members");
 
 // Iterate through the result and print the student names
 while (resultSet.next()){
     System.out.println(resultSet.getString(1));
     System.out.println(resultSet.getString(2));
     System.out.println(resultSet.getString(3));
     System.out.println(resultSet.getString(4));
     System.out.println(resultSet.getString(5));
     
 }
 
 

 // Close the connection
 connection.close();
        
    }
    
}
