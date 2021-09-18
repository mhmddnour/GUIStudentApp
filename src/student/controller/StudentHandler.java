/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.controller;

import db.DatabaseConnection;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mohamed
 */
public class StudentHandler {
    
    // new way to insert , update , delete student: pass  info that in model as parameters //
    public void insertUpdateDeleteStudent(char operation , Integer id , String fName , String lName ,
                                            String gender , String bdate , String phone , String address)
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
                String sql = "INSERT INTO STUDENT(first_name , last_name , gender , birthdate , phone , address) "
                        + " VALUES(? , ? , ? , ? , ? , ?)";
                pStm = conn.prepareStatement(sql);
                
                //fill pStm with parameters then execute query: //
                pStm.setString(1, fName);
                pStm.setString(2, lName);
                pStm.setString(3, gender);
                pStm.setString(4, bdate);
                pStm.setString(5, phone);
                pStm.setString(6, address);
                
                if(pStm.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, "new student has been added");
                }
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
            }
        }
        
      //update
        if(operation == 'u')
        {
           try {
                String sql = "UPDATE STUDENT set FIRST_NAME = ? ,  LAST_NAME = ? , GENDER = ? , "
                        + "BIRTHDATE = ? , PHONE = ? , ADDRESS = ? "
                        + "where ID=?";
                pStm = conn.prepareStatement(sql);
                
                //fill pStm with parameters then execute query: //
                pStm.setString(1, fName);
                pStm.setString(2, lName);
                pStm.setString(3, gender);
                pStm.setString(4, bdate);
                pStm.setString(5, phone);
                pStm.setString(6, address);
                pStm.setInt(7, id);
                
                if(pStm.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, "student has been updated");
                }
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
            }
        }
        
       //Delete
        if(operation == 'd')
        {
            try {
                String sql = "DELETE FROM STUDENT WHERE ID = ?";
                pStm = conn.prepareStatement(sql);
                pStm.setInt(1, id);
                
                if(pStm.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, "student has been deleted");
                }
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
            }
        }
        
    }
    
 //////////////////////////////////////////////     Table   /////////////////////////////////////////////////////   
    /**
     * by vector to get students from DB:
     * then put it in the DefaultTableModel:
     * @return 
     */
    public Vector getStudents()
    {
        Vector tableRows = new Vector();
        DatabaseConnection dbconn = new DatabaseConnection();
        Connection conn = dbconn.getConn();
        Statement stm = null;
        ResultSet rSet = null;
        
        
        try {
            String sql = "SELECT * FROM STUDENT";
            stm = conn.createStatement();
            rSet = stm.executeQuery(sql);
            
            while(rSet.next())
            {
                Vector row = new Vector();
                row.addElement(rSet.getInt(1));
                row.addElement(rSet.getString(2));
                row.addElement(rSet.getString(3));
                row.addElement(rSet.getString(4));
                row.addElement(rSet.getString(5));
                row.addElement(rSet.getString(6));
                row.addElement(rSet.getString(7));
                
                
                tableRows.addElement(row);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
         finally
        {
            try {
                conn.commit();
                rSet.close();
                stm.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());;
            }
        }
        
        return tableRows;
    }
    
    /**
     * by usin JTable as a parameter:
     * to get students from DB:
     * @param table
     * @param valueToSearch 
     */
    public void fillStudentJtable(JTable table , String valueToSearch)
    {
        //open DB connection:
        DatabaseConnection dbconn = new DatabaseConnection();
        Connection conn = dbconn.getConn();
        PreparedStatement pStm = null;
        ResultSet rSet = null;
        
       try {
            String sql = "SELECT * FROM STUDENT WHERE CONCAT (first_name ,CONCAT (last_name  , phone)) LIKE ?  ORDER BY ID ASC ";
            pStm = conn.prepareStatement(sql);
            //set with the target value:
            pStm.setString(1, "%"+valueToSearch+"%");
            
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
                row[1] = rSet.getString(2);
                row[2] = rSet.getString(3);
                row[3] = rSet.getString(4);
                row[4] = rSet.getString(5);
                row[5] = rSet.getString(6);
                row[6] = rSet.getString(7);
                row[7] = rSet.getString(8);
                
                //added to model:
                model.addRow(row);
            }
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }
    
  /////////////////////////////////// Search Form //////////////////////////////////////////////////////
    /**
     * 
     * @return tableRows
     */
    public Vector searchStudentJtable()
    {
         Vector tableRows = new Vector();
        //open DB connection:
        DatabaseConnection dbconn = new DatabaseConnection();
        Connection conn = dbconn.getConn();
        Statement stm = null;
        ResultSet rSet = null;
        
       try {
            String sql = "SELECT * FROM STUDENT ORDER By ID ASC";
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
                row.addElement(rSet.getString(5));
                row.addElement(rSet.getString(6));
                row.addElement(rSet.getString(7));
                row.addElement(rSet.getString(8));
                
                tableRows.addElement(row);
            }
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
       return tableRows;
    }
    
    
    
    
    /**
     * 
     * @param condition
     * @return 
     */
     public Vector searchStudentJtable(String condition)
    {
         Vector tableRows = new Vector();
        //open DB connection:
        DatabaseConnection dbconn = new DatabaseConnection();
        Connection conn = dbconn.getConn();
        Statement stm = null;
        ResultSet rSet = null;
        
       try {
            String sql = "SELECT * FROM STUDENT WHERE ( " + condition + ") "
                    + " ORDER By ID ASC";
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
                row.addElement(rSet.getString(5));
                row.addElement(rSet.getString(6));
                row.addElement(rSet.getString(7));
                row.addElement(rSet.getString(8));
                
                tableRows.addElement(row);
            }
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
       return tableRows;
    }
}
