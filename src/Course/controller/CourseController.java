
package Course.controller;

import db.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CourseController {
    
    /**
     * insert + update + delete >> course
     * @param operation
     * @param id
     * @param label
     * @param hours 
     */
     public void insertUpdateDeleteCourse(char operation , Integer id , String label , Integer hours)
    {
        // open DB connection :
        DatabaseConnection dbconn = new  DatabaseConnection();
        Connection conn = dbconn.getConn();
        PreparedStatement pStm =null;
        // depend on parameter >> operation ? : //
        //insert
        if(operation == 'i')
        {
           try {
                String sql = "INSERT INTO COURSE(label , hours_number) "
                        + " VALUES(? , ?)";
                pStm = conn.prepareStatement(sql);
                
                //fill pStm with parameters then execute query: //
                pStm.setString(1, label);
                pStm.setInt(2, hours);
                
                if(pStm.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, "new course has been added");
                }
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
            }
        }
        
      //update
        if(operation == 'u')
        {
           try {
                String sql = "UPDATE COURSE set LABEL = ? ,  HOURS_NUMBER = ? "
                        + "where ID=?";
                pStm = conn.prepareStatement(sql);
                
                //fill pStm with parameters then execute query: //
                pStm.setString(1, label);
                pStm.setInt(2, hours);
                pStm.setInt(3, id);
                
                if(pStm.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, "course data has been updated");
                }
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
            }
        }
        
       //Delete
        if(operation == 'd')
        {
            try {
                String sql = "DELETE FROM COURSE WHERE ID = ?";
                pStm = conn.prepareStatement(sql);
                pStm.setInt(1, id);
                
                if(pStm.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, "course has been deleted");
                }
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
            }
        }
        
    }
     
////////////////////////////////////////////////////////////////////////////////////
     
     /**
      * Check on the exist course:
      * @param coursName
      * @return 
      */
     public boolean isCourseExist(String coursName)
     {
         boolean isExist = false;
        //open DB connection:
        DatabaseConnection dbconn = new DatabaseConnection();
        Connection conn = dbconn.getConn();
        PreparedStatement pStm = null;
        ResultSet rSet = null;
        
       try {
            String sql = "SELECT * FROM COURSE WHERE LABEL = ?";
            pStm = conn.prepareStatement(sql);
            //set with the target value:
            pStm.setString(1, coursName);
            
            //executeQuery:
            rSet = pStm.executeQuery();
            if(rSet.next())
            {
                isExist = true;
            }
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
        return isExist;
     }

     /**
      * Course Table:
      * @param table 
      */
      public void fillCourseJtable(JTable table)
    {
        //open DB connection:
        DatabaseConnection dbconn = new DatabaseConnection();
        Connection conn = dbconn.getConn();
        PreparedStatement pStm = null;
        ResultSet rSet = null;
        
       try {
            String sql = "SELECT * FROM COURSE  ORDER BY ID ASC ";
            pStm = conn.prepareStatement(sql);
            
            //executeQuery:
            rSet = pStm.executeQuery();
            //get model from jTable : then put it in the defaultTable:
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            //create an array to store info rows:
            //Object [] row;
            while(rSet.next())
            {
                Vector row = new Vector();
                row.addElement(rSet.getInt(1));
                row.addElement(rSet.getString(2));
                row.addElement(rSet.getInt(3));
                model.addRow(row);
//                row = new Object[3]; //number of db columns:7
//                row[0] = rSet.getInt(1);
//                row[1] = rSet.getString(2);
//                row[2] = rSet.getString(3);
//                //added to model:
//                model.addRow(row);
            }
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }
 /////////////////////////////////////////////////////////////////////////////////

     /**
      * 
      * @param CourseName
      * @return 
      */
     public int getCourseId(String CourseName)
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
    
 /////////////////////////////////////////////////  GradesController:  //////////////////////////////////////////////////
    /**
     * GradesController:
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
            String sql = "SELECT * FROM COURSE ORDER BY ID ASC ";
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
