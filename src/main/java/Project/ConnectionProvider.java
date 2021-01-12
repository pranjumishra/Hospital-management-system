/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *
 * @author Pranju
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/project";
                String username = "root";
                String password = "pmisthebest";
                Connection con = DriverManager.getConnection(url, username, password);
            //var con = DriverManager.getConnection("jdbc:mysql://localhost:3306,project","root","pmisthebest");
            System.out.println("Connected to database !");
            return con;
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return null;
   
        
    }
    

        
    
    
}
