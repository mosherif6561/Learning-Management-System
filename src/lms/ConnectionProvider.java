/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;



/**
 *
 * @author A M A
 */
public class ConnectionProvider {
    public static Connection getCon ()
    {
        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Exam",  "root"  ,  "root");
           return con ;
        }
        catch (Exception e)
        {
            return null ;
        }
            
        
    }
            
    
}
