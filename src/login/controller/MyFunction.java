
package login.controller;

import db.DatabaseConnection;
import java.sql.*;


public class MyFunction {
    
    public static int countData(String tableName)
    {
        int total = 0;
        DatabaseConnection dbconn = new DatabaseConnection();
        Connection conn = dbconn.getConn();
        Statement stm = null;
        ResultSet rSet = null;
        
        try {
            stm = conn.createStatement();
            String sql ="SELECT COUNT(*) AS \"total\" FROM " +tableName; //SELECT COUNT(*) AS \"total\" FROM LOGIN
            rSet = stm.executeQuery(sql);
            
            while(rSet.next())
            {
                total = rSet.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
        
        return total;
    }
}
