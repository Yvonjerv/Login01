/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YVON
 */
public class DBConnector {
   
     private static final String USERNAME="root";
    private static final String PASSWORD="mysql";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/loginpro";
    
    //jdbc:mysql://localhost:3306/loginpro
    public static Connection conDB() throws SQLException{
            Connection conn  = null;
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             
                  conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
  
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
         }
               return conn ;
    }
}

