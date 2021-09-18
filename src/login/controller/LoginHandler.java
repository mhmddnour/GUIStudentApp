/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.controller;

import db.DatabaseConnection;
import java.sql.*;
import login.model.Login;

/**
 *
 * @author mohamed
 */
public class LoginHandler {
    public Login checkConnection(Login user)
    {
        // to check the entered data within DB
        Login obj = null;
        
        // make connection wit DB: //
        DatabaseConnection dbconn = new DatabaseConnection();
        Connection conn = dbconn.getConn();
        PreparedStatement pStm = null;
        ResultSet rSet = null;
        
        try {
            // SQL command: //
            String sql = "select * from LOGIN "
                    + "where username = ? and password = ? ";
            
            pStm = conn.prepareStatement(sql);
            
            //fill SQL parameters from user: //
            pStm.setString(1, user.getUsername());
            pStm.setString(2, user.getPassword());
            
            // execute Query: //
            rSet = pStm.executeQuery();
            
            while(rSet.next())
            {
                //get data from DB then fill object: //
                obj = new Login();
                
                obj.setId(rSet.getInt("ID"));
                obj.setUsername(rSet.getString("USERNAME"));
                obj.setPassword(rSet.getString("PASSWORD"));
                
                //obj.setPrivilegeId(rSet.getInt("PRIVILEGE_ID"));
            }
            
        } catch (SQLException ex)
        {
            System.out.println("SQLException: " + ex.getMessage());
        }
        finally
        {
            try {
                rSet.close();
                pStm.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
            }
            
        }
        
        return obj;
    }
}
