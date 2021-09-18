
package db;

import static java.lang.Character.UnicodeBlock.forName;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author mohamed
 */
public class otherWay {
   
        static final private String URL = "jdbc:oracle:thin:@localhost:1521:XE";
        static final private String USER = "studentmgdb";
        static final private String PASSWORD = "student321";
    public static Connection getConnection()
    {
        Connection conn = null;
        
        try {
           // class.forName("oracle.jdbc.OracleDriver");
            
            // 2nd open connection: //
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch(Exception ex)
        {
            System.out.println("Exception " + ex.getMessage());
        }
        return conn;
    }
    
    
}
