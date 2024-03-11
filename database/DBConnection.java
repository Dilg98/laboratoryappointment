/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.*;
/**
 *
 * @author ACER
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    private static DBConnection dbconnection;
    private Connection connection;
    private String className;
    private String url;
    
    // Private constructor to prevent instantiation from outside
    private DBConnection() throws ClassNotFoundException, SQLException {
        // Initialize database connection properties
        className = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/abc laboratories";
        
        // Load the MySQL JDBC driver class
        Class.forName(className);
        
        // Establish connection to the database
        connection = DriverManager.getConnection(url, "root", "root123");
    }
    
    // Public method to get the singleton instance

    /**
     *
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException 
    {    // Create the instance 
//       if (dbconnection == null) 
//       {
//           dbconnection = new DBConnection();
//       }
//       return dbconnection;
        return dbconnection== null? (dbconnection= new DBConnection()):dbconnection;
    
    }
      
    public Connection getconnection()
    {
           return connection;
    }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
