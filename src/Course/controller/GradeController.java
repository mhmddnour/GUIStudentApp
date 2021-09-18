
package Course.controller;

import db.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class GradeController {
    
    public void insertUpdateDeleteCourse(char operation , Integer sid , Integer cid , Double sgr , String desc)
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
                String sql = "INSERT INTO SCORE (STUDENT_ID , COURSE_ID , STUDENT_GRADE , DESCRIPTION) "
                        + "  VALUES(? , ? , ? , ?)";
                pStm = conn.prepareStatement(sql);
                
                //fill pStm with parameters then execute query: //
                pStm.setInt(1, sid);
                pStm.setInt(2, cid);
                pStm.setDouble(3, sgr);
                pStm.setString(4, desc);
                
                if(pStm.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, "new grade has been added");
                }
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
            }
        }
        
      //update
        if(operation == 'u')
        {
           try {
                String sql = "UPDATE SCORE SET STUDENT_GRADE = ? , DESCRIPTION = ? "
                        + " WHERE STUDENT_ID = ? AND COURSE_ID = ?";
                pStm = conn.prepareStatement(sql);
                
                //fill pStm with parameters then execute query: //
                pStm.setDouble(1, sgr); //student_Grade
                pStm.setString(2, desc);
                pStm.setInt(3, sid);    //student_Id
                pStm.setInt(4, cid);    //Course_Id
                
                if(pStm.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, "Updated successfully");
                }
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
            }
        }
        
       //Delete
        if(operation == 'd')
        {
            try {
                String sql = "DELETE FROM SCORE WHERE STUDENT_ID = ? AND COURSE_ID = ? ";
                pStm = conn.prepareStatement(sql);
                pStm.setInt(1, sid);
                pStm.setInt(2, cid);
                
                if(pStm.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, "Deleted successfully");
                }
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
            }
        }
        
    }
     
////////////////////////////////////////////////////////////////////////////////////
    public boolean isCourseExist(int coursId)
     {
         boolean isExist = false;
        //open DB connection:
        DatabaseConnection dbconn = new DatabaseConnection();
        Connection conn = dbconn.getConn();
        PreparedStatement pStm = null;
        ResultSet rSet = null;
        
       try {
            String sql = "SELECT * FROM COURSE WHERE ID = ?";
            pStm = conn.prepareStatement(sql);
            //set with the target value:
            pStm.setInt(1, coursId);
            
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
    
    ////////////////////////////////////////////////////////////////////////////////////
    /**
     * to check if this student have a grade on that course:
     * get student ID 
     * @param studentId
     * @return 
     */
    public boolean isStudentGrade(int studentId)
     {
         boolean isExist = false;
        //open DB connection:
        DatabaseConnection dbconn = new DatabaseConnection();
        Connection conn = dbconn.getConn();
        PreparedStatement pStm = null;
        ResultSet rSet = null;
        
       try {
            String sql = "SELECT * FROM STUDENT WHERE ID = ?";
            pStm = conn.prepareStatement(sql);
            //set with the target value:
            pStm.setInt(1, studentId);
            
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
    
/////////////////////////////////////////////////////////////////////////////////////////
    //Grade Table:
    
    /**
     * fill grade table in the ManageGrad Form:
     * @param table 
     */
    public void fillStudentJtable(JTable table)
    {
        //open DB connection:
        DatabaseConnection dbconn = new DatabaseConnection();
        Connection conn = dbconn.getConn();
        PreparedStatement pStm = null;
        ResultSet rSet = null;
        
       try {
            String sql = "SELECT * FROM SCORE ORDER BY STUDENT_ID ASC";
            pStm = conn.prepareStatement(sql);
            
            //executeQuery:
            rSet = pStm.executeQuery();
            
            //get model from jTable : then put it in the defaultTable:
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            
            //create an array to store info rows:
            Object [] row;
            while(rSet.next())
            {
                row = new Object[8]; //number of db columns:7
                row[0] = rSet.getInt(1);
                row[1] = rSet.getInt(2);
                row[2] = rSet.getDouble(3);
                row[3] = rSet.getString(4);
                
                //added to model:
                model.addRow(row);
            }
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }
    
    
    
    
    
    /**
     * 
     * @param table
     * @param searchId 
     */
     public void fillStudentJtable(JTable table , int searchId)
    {
        //open DB connection:
        DatabaseConnection dbconn = new DatabaseConnection();
        Connection conn = dbconn.getConn();
        PreparedStatement pStm = null;
        ResultSet rSet = null;
        
       try {
            String sql = "SELECT * FROM SCORE WHERE CONCAT (STUDENT_ID , CONCAT(COURSE_ID , STUDENT_GRADE )) LIKE ? ORDER BY STUDENT_ID ASC ";
            pStm = conn.prepareStatement(sql);
            
            //target value:
            pStm.setInt(1, searchId);
            //executeQuery:
            rSet = pStm.executeQuery();
            
            //get model from jTable : then put it in the defaultTable:
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            
            //create an array to store info rows:
            Object [] row;
            while(rSet.next())
            {
                row = new Object[8]; //number of db columns:7
                row[0] = rSet.getInt(1);
                row[1] = rSet.getInt(2);
                row[2] = rSet.getDouble(3);
                row[3] = rSet.getString(4);
                
                //added to model:
                model.addRow(row);
            }
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }
     
//////////////////////////////////////////////////////////////////////////////////    
   
    /**
     * student Grade Table 
     * @param table 
     */
    public void showStudentGrade(JTable table)
    {
        //open DB connection:
        DatabaseConnection dbconn = new DatabaseConnection();
        Connection conn = dbconn.getConn();
        PreparedStatement pStm = null;
        ResultSet rSet = null;
        
       try {
            String sql = "SELECT SCTAB.STUDENT_ID , STAB.FIRST_NAME , STAB.LAST_NAME , "
                    + " CTAB.LABEL , SCTAB.STUDENT_GRADE , SCTAB.DESCRIPTION "
                    + " FROM STUDENT stab, SCORE sctab , COURSE ctab "
                    + "WHERE (STAB.ID = SCTAB.STUDENT_ID AND CTAB.ID = SCTAB.COURSE_ID) "
                    + "ORDER BY SCTAB.STUDENT_ID";
            pStm = conn.prepareStatement(sql);
            
            //executeQuery:
            rSet = pStm.executeQuery();
            
            //get model from jTable : then put it in the defaultTable:
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            
            //create an array to store info rows:
            Object [] row;
            while(rSet.next())
            {
                row = new Object[6]; //number of db columns:7
                row[0] = rSet.getInt(1);
                row[1] = rSet.getString(2);
                row[2] = rSet.getString(3);
                row[3] = rSet.getString(4);
                row[4] = rSet.getDouble(5);
                row[5] = rSet.getString(6);
                
                //added to model:
                model.addRow(row);
            }
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }
    //////////////////////////////////////////////////////////////////////////////////
    
    public void searchStudentJtable(JTable table , String condition)
    {
        //open DB connection:
        DatabaseConnection dbconn = new DatabaseConnection();
        Connection conn = dbconn.getConn();
        Statement stm = null;
        ResultSet rSet = null;
        
       try {
            String sql = "SELECT SCTAB.STUDENT_ID , STAB.FIRST_NAME , STAB.LAST_NAME , "
                    + " CTAB.LABEL , SCTAB.STUDENT_GRADE , SCTAB.DESCRIPTION "
                    + " FROM STUDENT stab, SCORE sctab , COURSE ctab "
                    + " WHERE STAB.ID = SCTAB.STUDENT_ID AND CTAB.ID = SCTAB.COURSE_ID "
                    + "  AND (" + condition + ") "
                    + " ORDER BY SCTAB.STUDENT_ID";
            stm = conn.createStatement();
            
            //executeQuery:
            rSet = stm.executeQuery(sql);
            //get model from jTable : then put it in the defaultTable:
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            //create an array to store info rows:
            Object [] row;
            while(rSet.next())
            {
                row = new Object[6]; //number of db columns:6
                row[0] = rSet.getInt(1);
                row[1] = rSet.getString(2);
                row[2] = rSet.getString(3);
                row[3] = rSet.getString(4);
                row[4] = rSet.getDouble(5);
                row[5] = rSet.getString(6);
                
                //added to model:
                model.addRow(row);
            }
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }
    
    
    
     public Vector searchStudentJtable(String condition)
    {
         Vector tableRows = new Vector();
        //open DB connection:
        DatabaseConnection dbconn = new DatabaseConnection();
        Connection conn = dbconn.getConn();
        Statement stm = null;
        ResultSet rSet = null;
        
       try {
            String sql = "SELECT SCTAB.STUDENT_ID , STAB.FIRST_NAME , STAB.LAST_NAME , "
                    + " CTAB.LABEL , SCTAB.STUDENT_GRADE , SCTAB.DESCRIPTION "
                    + " FROM STUDENT stab, SCORE sctab , COURSE ctab "
                    + " WHERE STAB.ID = SCTAB.STUDENT_ID AND CTAB.ID = SCTAB.COURSE_ID "
                    + "  AND (" + condition + ") "
                    + " ORDER BY SCTAB.STUDENT_ID";
            stm = conn.createStatement();
            //set with the target value:
            //pStm.setString(1, "%"+valueToSearch+"%");
            
            //executeQuery:
            rSet = stm.executeQuery(sql);
            
            while(rSet.next())
            {
                Vector row = new Vector();
                row.addElement(rSet.getInt(1));
                row.addElement(rSet.getString(2));
                row.addElement(rSet.getString(3));
                row.addElement(rSet.getString(4));
                row.addElement(rSet.getDouble(5));
                row.addElement(rSet.getString(6));
                
                tableRows.addElement(row);
            }
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
       return tableRows;
    }
     
}
