
package db;

import java.sql.*;
import java.util.*;
/**
 *
 * @author mohamed
 */
public class DatabaseConnection {
    
    private Connection conn;
    static final private String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    static final private String USER = "studentmgdb";
    static final private String PASSWORD = "student321";
    
    public DatabaseConnection()
    {
        try{
            // 1st register Oracle Driver: //
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            
            // 2nd open connection: //
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }

    public Connection getConn() {
        return conn;
    }
    
    
}
