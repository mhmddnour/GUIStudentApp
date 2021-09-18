
package grade.controller;

import db.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mohamed
 */
public class GrController {
    
    
    
 //////////////////////////////////////////////////////////////////////////////////   
    /**
     * 
     * @param CourseName
     * @return 
     */
    private int getCourseId(String CourseName)
     {
        int courseId = 0;
        DatabaseConnection dbconn = new DatabaseConnection();
        Connection conn = dbconn.getConn();
        PreparedStatement pStm = null;
        ResultSet rSet = null; 
        
         try {
            String sql = "SELECT * FROM COURSE WHERE LABEL = ?";
            pStm = conn.prepareStatement(sql);
            //set with the target value:
            pStm.setString(1, CourseName);
            
            //executeQuery:
            rSet = pStm.executeQuery();
            if(rSet.next())
            {
                courseId = rSet.getInt("Id");
            }
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
         
        return courseId;
     }
     
//////////////////////////////////////////////////////////////////////////////////
    /**
     * fill combobox with course List
     * @param combo 
     */
    public void fillCourseJcombo(JComboBox combo)
    {
        //open DB connection:
        DatabaseConnection dbconn = new DatabaseConnection();
        Connection conn = dbconn.getConn();
        PreparedStatement pStm = null;
        ResultSet rSet = null;
        
       try {
            String sql = "SELECT * FROM COURSE ";
            pStm = conn.prepareStatement(sql);
            
            //executeQuery:
            rSet = pStm.executeQuery();
            
            while(rSet.next())
            {
                combo.addItem(rSet.getString(2));
            }
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }
}
