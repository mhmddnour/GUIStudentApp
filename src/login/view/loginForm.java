/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import login.controller.LoginHandler;
import login.controller.MyFunction;
import login.model.Login;

/**
 *
 * @author mohamed
 */
public class loginForm extends javax.swing.JFrame {

    /**
     * Creates new form loginForm
     */
    public loginForm() {
        initComponents();
        
        lbl_usr.setVisible(false);
        lbl_pass.setVisible(false);
        
        this.setLocationRelativeTo(null); //show in middle of the screen:
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_User = new javax.swing.JTextField();
        jPasswordField_Pass = new javax.swing.JPasswordField();
        Button_logIn = new javax.swing.JButton();
        Button_cansel = new javax.swing.JButton();
        lbl_usr = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        jCheckBox_showPass = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management System-SMS");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login Form");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Username:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Password:");

        jTextField_User.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPasswordField_Pass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Button_logIn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button_logIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images/login.png"))); // NOI18N
        Button_logIn.setText("LogIn");
        Button_logIn.setIconTextGap(8);
        Button_logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_logInActionPerformed(evt);
            }
        });

        Button_cansel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button_cansel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images/cansel.png"))); // NOI18N
        Button_cansel.setText("Cansel");
        Button_cansel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_canselActionPerformed(evt);
            }
        });

        lbl_usr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_usr.setForeground(new java.awt.Color(204, 102, 0));
        lbl_usr.setText("*");

        lbl_pass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_pass.setForeground(new java.awt.Color(204, 102, 0));
        lbl_pass.setText("*");

        jCheckBox_showPass.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jCheckBox_showPass.setText("Show");
        jCheckBox_showPass.setToolTipText("Show Password?");
        jCheckBox_showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_showPassActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("All Rights Reserved @MONO Technology");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(Button_cansel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(Button_logIn)))
                .addGap(108, 108, 108))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_User)
                    .addComponent(jPasswordField_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_usr)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_pass)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox_showPass)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_usr))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_pass)
                    .addComponent(jCheckBox_showPass))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_logIn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_cansel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel3))
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

    private void Button_logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_logInActionPerformed
        lbl_usr.setVisible(false);
        lbl_pass.setVisible(false);
        
        if(jTextField_User.getText().equals(""))
        {
            lbl_usr.setVisible(true);
        }
        if(String.valueOf(jPasswordField_Pass.getPassword()).equals("")) //String.valueOf >> to get the password txt
        {
            lbl_pass.setVisible(true);
        }
        else
        {
            // 1-get data from user and check it: //
            String _name = jTextField_User.getText().trim();
            String _paswrd = new String(jPasswordField_Pass.getPassword()); //String.valueOf(jPasswordField_Pass.getPassword()).trim;
            _paswrd = _paswrd.trim();
            
            if(_name.length() >0 && _paswrd.length() >0)
            {
                // 3- check account username & password: //
                LoginHandler hndlr = new LoginHandler();
                // get username and password: //
                Login obj = new Login(_name, _paswrd);
                Login user = hndlr.checkConnection(obj);
                
                //check on the enterd data != null
                if(user != null)
                {
                    //load MainForm window
                    MainForm mf = new MainForm();  //1
                    mf.setVisible(true); //2
                    mf.pack(); //3 make it sized
                    mf.setLocationRelativeTo(null); //4 get window in the middle of screen
                    mf.setExtendedState(JFrame.MAXIMIZED_BOTH); //5 maximize the screen
                    
                    //7 to get the logging name in the mainForm: //
                    MainForm.wlc_logginName.setText("Welcome <"+jTextField_User.getText()+">");
                    
                    //8 to get sum of...in MainForm from DB: //
                    //i will change it to calc student table :
                    MainForm.stdntCount_lbl1.setText(" Student Count "+Integer.toString(MyFunction.countData("student"))); //put it in Integer.toString >> to convert int to String
                    MainForm.coursCount_lbl.setText(" Course Count "+Integer.toString(MyFunction.countData("course")));
                    
                    this.dispose(); //6 close or end other windows
                }
                else
                {
                    //error message:
                    JOptionPane.showMessageDialog(null, "Invalid Username Or Password" , "Login Failed" , 2);
                }
            }
        }
    }//GEN-LAST:event_Button_logInActionPerformed

    private void Button_canselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_canselActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Button_canselActionPerformed

    private void jCheckBox_showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_showPassActionPerformed
       if(jCheckBox_showPass.isSelected()){
            jPasswordField_Pass.setEchoChar((char)0);
        }
        else{
            jPasswordField_Pass.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_jCheckBox_showPassActionPerformed

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_cansel;
    private javax.swing.JButton Button_logIn;
    private javax.swing.JCheckBox jCheckBox_showPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_Pass;
    private javax.swing.JTextField jTextField_User;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_usr;
    // End of variables declaration//GEN-END:variables
}
