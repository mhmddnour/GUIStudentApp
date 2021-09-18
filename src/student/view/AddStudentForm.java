/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login.controller.MyFunction;
import login.view.MainForm;
import student.controller.StudentHandler;
import static student.view.ManageForm.jStuTable;

/**
 *
 * @author mohamed
 */
public class AddStudentForm extends javax.swing.JFrame {

    /**
     * Creates new form AddStudent
     */
    public AddStudentForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textField_fName = new javax.swing.JTextField();
        textField_lName = new javax.swing.JTextField();
        textField_phone = new javax.swing.JTextField();
        radio_male = new javax.swing.JRadioButton();
        radio_femele = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea_addrss = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        stageCombo = new javax.swing.JComboBox<>();
        jButton_addStudent = new javax.swing.JButton();
        jButton_addStudent1 = new javax.swing.JButton();
        jDateChooserBirthDate = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SMS");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("New Student");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("First Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Last Name:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gender:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Phone:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("BirthDate:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Address");

        textField_fName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textField_lName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textField_phone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textField_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_phoneActionPerformed(evt);
            }
        });
        textField_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField_phoneKeyTyped(evt);
            }
        });

        buttonGroup1.add(radio_male);
        radio_male.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radio_male.setText("Male");

        buttonGroup1.add(radio_femele);
        radio_femele.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radio_femele.setText("Femele");

        textArea_addrss.setColumns(20);
        textArea_addrss.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        textArea_addrss.setRows(5);
        jScrollPane1.setViewportView(textArea_addrss);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Stage");

        stageCombo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        stageCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton_addStudent.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jButton_addStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images/add35(2).png"))); // NOI18N
        jButton_addStudent.setText("Add");
        jButton_addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addStudentActionPerformed(evt);
            }
        });

        jButton_addStudent1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jButton_addStudent1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images/delete35.png"))); // NOI18N
        jButton_addStudent1.setText("Cansel");
        jButton_addStudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addStudent1ActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("All Rights Reserved @MONO Technology");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooserBirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(2, 2, 2)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(textField_fName, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                            .addComponent(textField_lName)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(radio_male)
                                                .addGap(18, 18, 18)
                                                .addComponent(radio_femele)))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton_addStudent1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton_addStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(stageCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1)))
                .addContainerGap(107, Short.MAX_VALUE))
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textField_fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textField_lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radio_male)
                    .addComponent(radio_femele))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jDateChooserBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_addStudent1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_addStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jLabel9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_addStudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addStudent1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton_addStudent1ActionPerformed

    private void textField_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_phoneActionPerformed

    private void textField_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_phoneKeyTyped
        // Allow numbers in phone field only:
        if(!Character.isDigit(evt.getKeyChar())) //not character >> consume
        {
            evt.consume();
        }
    }//GEN-LAST:event_textField_phoneKeyTyped

    // check on the student input field: //
    public boolean verifyText()
    {
        if(textField_fName.getText().equals("") || textField_lName.getText().equals("") 
                || textField_phone.getText().equals("") || textArea_addrss.getText().equals("")
                || buttonGroup1.getSelection() == null ||jDateChooserBirthDate.getDate() == null)
        {
            JOptionPane.showMessageDialog(null, "please, Complete The Empty Filleds First");
            return false;
        }
        //put a constrain on the date: to choose a date not higher then the current //
        else if(jDateChooserBirthDate.getDate().compareTo(new Date()) > 0)
        {
            JOptionPane.showMessageDialog(null, "Future Date Not Allowed");
            return false;
        }
        else //complete the added process:
        {
            return true;
        }
    }
    
    private void jButton_addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addStudentActionPerformed
       // get the input student data: //
       String fname = textField_fName.getText().trim();
       String lname = textField_lName.getText().trim();
       String phone = textField_phone.getText().trim();
       String addrss = textArea_addrss.getText().trim();
       String gender = "";
       if(radio_male.isSelected()){
           gender = "Male";
       } else if(radio_femele.isSelected()){
           gender = "Femele";
       }
       
       if(verifyText()) //call the constrained above methode: //
       {
            //get new data format : //
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            //get date from datechoser:
            String bdate = dateFormat.format(jDateChooserBirthDate.getDate()); //error getDate : //
            
            StudentHandler stHndlr = new StudentHandler();
            stHndlr.insertUpdateDeleteStudent('i', null, fname, lname, gender, bdate, phone, addrss);
            //after add:
            textField_fName.setText("");
            textField_lName.setText("");
            textField_phone.setText("");
            textArea_addrss.setText("");
            buttonGroup1.clearSelection();
            jDateChooserBirthDate.setDate(null); //to clear date field:
            
            //update main form after added new students
            MainForm.stdntCount_lbl1.setText(" Student Count "+Integer.toString(MyFunction.countData("student")));
            //to prevenent repetation of the target value: //error happend without try catch
            //ManageForm.jStuTable.setModel(new DefaultTableModel(null , new Object[]{"Id" , "fName" , "lName" , "Gender" , "Birthdate" , "Phone" , "Address"}));
            //stHndlr.fillStudentJtable(ManageForm.jStuTable, "");
            try{
                //ManageForm.jStuTable.setModel(new DefaultTableModel(null , new Object[]{"Id" , "First_Name" , "Last_Name" , "Gender" , "BirthDate" , "Phone" , "Address"}));
                 ManageForm.jStuTable.setModel(new DefaultTableModel(null , new Object[]{"Id" , "fName" , "lName" , "Gender" , "Birthdate" , "Phone" , "Address"}));
                 stHndlr.fillStudentJtable(ManageForm.jStuTable, "");
            }catch(Exception ex)
            {
                System.out.println("Student Added");
            }
       }
    }//GEN-LAST:event_jButton_addStudentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_addStudent;
    private javax.swing.JButton jButton_addStudent1;
    private com.toedter.calendar.JDateChooser jDateChooserBirthDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radio_femele;
    private javax.swing.JRadioButton radio_male;
    private javax.swing.JComboBox<String> stageCombo;
    private javax.swing.JTextArea textArea_addrss;
    private javax.swing.JTextField textField_fName;
    private javax.swing.JTextField textField_lName;
    private javax.swing.JTextField textField_phone;
    // End of variables declaration//GEN-END:variables
}